package org.stonlexx.packetwrapper.v1_15;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.stonlexx.packetwrapper.api.type.ChunkPacketProcessor;

/**
 * Used to process a chunk.
 * 
 * @author Kristian
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ChunkPacketProcessor1_15 implements ChunkPacketProcessor {

	private int chunkX;
	private int chunkZ;
	private int chunkMask;
	private int extraMask;
	private int chunkSectionNumber;
	private int extraSectionNumber;
	private boolean hasContinuous = true;

	private int startIndex;
	private int size;

	private byte[] data;
	private World world;

	/**
	 * Construct a chunk packet processor from a given MAP_CHUNK packet.
	 * 
	 * @param packet - the map chunk packet.
	 * @return The chunk packet processor.
	 */
	public static ChunkPacketProcessor1_15 fromMapPacket(PacketContainer packet,
			World world) {
		if (!packet.getType().equals(PacketType.Play.Server.MAP_CHUNK))
			throw new IllegalArgumentException(packet
					+ " must be a MAP_CHUNK packet.");

		StructureModifier<Integer> ints = packet.getIntegers();
		StructureModifier<byte[]> byteArray = packet.getByteArrays();

		// Create an info objects
		ChunkPacketProcessor1_15 processor = new ChunkPacketProcessor1_15();
		processor.world = world;
		processor.chunkX = ints.read(0); 	 // packet.a;
		processor.chunkZ = ints.read(1); 	 // packet.b;
		processor.chunkMask = ints.read(2);  // packet.c;
		processor.extraMask = ints.read(3);  // packet.d;
		processor.data = byteArray.read(1);  // packet.inflatedBuffer;
		processor.startIndex = 0;

		if (packet.getBooleans().size() > 0) {
			processor.hasContinuous = packet.getBooleans().read(0);
		}
		return processor;
	}

	/**
	 * Begin processing the current chunk with the provided processor.
	 * 
	 * @param processor - the processor that will process the chunk.
	 */
	public void process(ChunkletProcessor processor) {
		// Compute chunk number
		for (int i = 0; i < CHUNK_SEGMENTS; i++) {
			if ((chunkMask & (1 << i)) > 0) {
				chunkSectionNumber++;
			}
			if ((extraMask & (1 << i)) > 0) {
				extraSectionNumber++;
			}
		}

		int skylightCount = getSkylightCount();

		// The total size of a chunk is the number of blocks sent (depends on the number of sections) multiplied by the
		// amount of bytes per block. This last figure can be calculated by adding together all the data parts:
		//   For any block:
		//    * Block ID          -   8 bits per block (byte)
		//    * Block metadata    -   4 bits per block (nibble)
		//    * Block light array -   4 bits per block
		//   If 'worldProvider.skylight' is TRUE
		//    * Sky light array   -   4 bits per block
		//   If the segment has extra data:
		//    * Add array         -   4 bits per block
		//   Biome array - only if the entire chunk (has continous) is sent:
		//    * Biome array       -   256 bytes
		//
		// A section has 16 * 16 * 16 = 4096 blocks.
		size =
				BYTES_PER_NIBBLE_PART
						* ((NIBBLES_REQUIRED + skylightCount)
								* chunkSectionNumber + extraSectionNumber)
						+ (hasContinuous ? BIOME_ARRAY_LENGTH : 0);

		if ((getOffset(2) - startIndex) > data.length) {
			return;
		}

		// Make sure the chunk is loaded
		if (isChunkLoaded(world, chunkX, chunkZ)) {
			translate(processor);
		}
	}

	/**
	 * Retrieve the number of 2048 byte segments per chunklet.
	 * <p<
	 * This is usually one for The Overworld, and zero for both The End and The
	 * Nether.
	 * 
	 * @return Number of skylight byte segments.
	 */
	public int getSkylightCount() {
		// There's no sun/moon in the end or in the nether, so Minecraft doesn't sent any skylight information
		// This optimization was added in 1.4.6. Note that ideally you should get this from the "f" (skylight) field.
		return world.getEnvironment() == Environment.NORMAL ? 1 : 0;
	}

	public int getOffset(int nibbles) {
		return startIndex
				+ (nibbles * chunkSectionNumber * ChunkPacketProcessor.BYTES_PER_NIBBLE_PART);
	}

	public void translate(ChunkletProcessor processor) {
		// Loop over 16x16x16 chunks in the 16x256x16 column
		int current = 4;
		ChunkOffsets offsets =
				new ChunkOffsets(getOffset(0), getOffset(2), getOffset(3),
						getSkylightCount() > 0 ? getOffset(current++) : -1,
						extraSectionNumber > 0 ? getOffset(current++) : -1);

		for (int i = 0; i < 16; i++) {
			// If the bitmask indicates this chunk is sent
			if ((chunkMask & 1 << i) > 0) {
				// The lowest block (in x, y, z) in this chunklet
				Location origin =
						new Location(world, chunkX << 4, i * 16, chunkZ << 4);

				processor.processChunklet(origin, data, offsets);
				offsets.incrementIdIndex();
			}
			if ((extraMask & 1 << i) > 0) {
				offsets.incrementExtraIndex();
			}
		}

		if (hasContinuous) {
			processor.processBiomeArray(new Location(world, chunkX << 4, 0,
					chunkZ << 4), data, startIndex + size - BIOME_ARRAY_LENGTH);
		}
	}

	public boolean isChunkLoaded(World world, int x, int z) {
		return world.isChunkLoaded(x, z);
	}
}
