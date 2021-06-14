package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerUnloadChunk;

public class WrapperPlayServerUnloadChunk1_12 
        extends MinecraftPacket
        implements WrapperPlayServerUnloadChunk {


	public WrapperPlayServerUnloadChunk1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerUnloadChunk1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Chunk X.
	 * <p>
	 * Notes: block coordinate divided by 16, rounded down
	 * 
	 * @return The current Chunk X
	 */
	public int getChunkX() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Chunk X.
	 * 
	 * @param value - new value.
	 */
	public void setChunkX(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Chunk Z.
	 * <p>
	 * Notes: block coordinate divided by 16, rounded down
	 * 
	 * @return The current Chunk Z
	 */
	public int getChunkZ() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Chunk Z.
	 * 
	 * @param value - new value.
	 */
	public void setChunkZ(int value) {
		container.getIntegers().write(1, value);
	}

}
