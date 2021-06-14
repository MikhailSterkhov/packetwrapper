package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBlockDig;

import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBlockDig;

public class WrapperPlayClientBlockDig1_15
		extends MinecraftPacket
		implements WrapperPlayClientBlockDig {

	public WrapperPlayClientBlockDig1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientBlockDig1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: block position
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

	public Direction getDirection() {
		return container.getDirections().read(0);
	}

	public void setDirection(Direction value) {
		container.getDirections().write(0, value);
	}

	/**
	 * Retrieve Status.
	 * <p>
	 * Notes: the action the player is taking against the block (see below)
	 * 
	 * @return The current Status
	 */
	public PlayerDigType getStatus() {
		return container.getPlayerDigTypes().read(0);
	}

	/**
	 * Set Status.
	 * 
	 * @param value - new value.
	 */
	public void setStatus(PlayerDigType value) {
		container.getPlayerDigTypes().write(0, value);
	}
}
