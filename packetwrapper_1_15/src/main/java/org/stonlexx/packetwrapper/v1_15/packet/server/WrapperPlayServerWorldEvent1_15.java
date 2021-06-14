package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWorldEvent;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerWorldEvent1_15 
        extends MinecraftPacket
        implements WrapperPlayServerWorldEvent {

	public WrapperPlayServerWorldEvent1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWorldEvent1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Effect ID.
	 * <p>
	 * Notes: the ID of the effect, see below.
	 * 
	 * @return The current Effect ID
	 */
	public int getEffectId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Effect ID.
	 * 
	 * @param value - new value.
	 */
	public void setEffectId(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: the location of the effect
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
	 * Retrieve Data.
	 * <p>
	 * Notes: extra data for certain effects, see below.
	 * 
	 * @return The current Data
	 */
	public int getData() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Data.
	 * 
	 * @param value - new value.
	 */
	public void setData(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Disable relative volume.
	 * <p>
	 * Notes: see above
	 * 
	 * @return The current Disable relative volume
	 */
	public boolean getDisableRelativeVolume() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Disable relative volume.
	 * 
	 * @param value - new value.
	 */
	public void setDisableRelativeVolume(boolean value) {
		container.getBooleans().write(0, value);
	}

}
