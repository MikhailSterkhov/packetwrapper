package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerMultiBlockChange;

import com.comphenix.protocol.wrappers.ChunkCoordIntPair;
import com.comphenix.protocol.wrappers.MultiBlockChangeInfo;

public class WrapperPlayServerMultiBlockChange1_15 
        extends MinecraftPacket
        implements WrapperPlayServerMultiBlockChange {

	public WrapperPlayServerMultiBlockChange1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerMultiBlockChange1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve the chunk that has been altered.
	 * 
	 * @return The current chunk
	 */
	public ChunkCoordIntPair getChunk() {
		return container.getChunkCoordIntPairs().read(0);
	}

	/**
	 * Set the chunk that has been altered.
	 * 
	 * @param value - new value
	 */
	public void setChunk(ChunkCoordIntPair value) {
		container.getChunkCoordIntPairs().write(0, value);
	}

	/**
	 * Retrieve a copy of the record data as a block change array.
	 * 
	 * @return The copied block change array.
	 */
	public MultiBlockChangeInfo[] getRecords() {
		return container.getMultiBlockChangeInfoArrays().read(0);
	}

	/**
	 * Set the record data using the given helper array.
	 * 
	 * @param value - new value
	 */
	public void setRecords(MultiBlockChangeInfo[] value) {
		container.getMultiBlockChangeInfoArrays().write(0, value);
	}
}
