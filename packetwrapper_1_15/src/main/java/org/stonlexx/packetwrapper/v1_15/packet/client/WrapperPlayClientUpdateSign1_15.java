package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientUpdateSign;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayClientUpdateSign1_15 
        extends MinecraftPacket
        implements WrapperPlayClientUpdateSign {

	public WrapperPlayClientUpdateSign1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientUpdateSign1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: block Coordinates
	 * 
	 * @return The current Location
	 */
	public BlockPosition getLocation() {
		return container.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Location.
	 * 
	 * @param value - new value.
	 */
	public void setLocation(BlockPosition value) {
		container.getBlockPositionModifier().write(0, value);
	}

	/**
	 * Retrieve this sign's lines of text.
	 * 
	 * @return The current lines
	 */
	public String[] getLines() {
		return container.getStringArrays().read(0);
	}

	/**
	 * Set this sign's lines of text.
	 * 
	 * @param value - Lines, must be 4 elements long
	 */
	public void setLines(String[] value) {
		if (value == null)
			throw new IllegalArgumentException("value cannot be null!");
		if (value.length != 4)
			throw new IllegalArgumentException("value must have 4 elements!");

		container.getStringArrays().write(0, value);
	}
}
