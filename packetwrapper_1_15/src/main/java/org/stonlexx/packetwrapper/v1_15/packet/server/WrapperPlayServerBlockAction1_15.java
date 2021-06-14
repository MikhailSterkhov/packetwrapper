package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.Material;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerBlockAction;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerBlockAction1_15 
        extends MinecraftPacket
        implements WrapperPlayServerBlockAction {

	public WrapperPlayServerBlockAction1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerBlockAction1_15(PacketContainer packet) {
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
	 * Retrieve Byte 1.
	 * <p>
	 * Notes: varies depending on block - see Block_Actions
	 * 
	 * @return The current Byte 1
	 */
	public int getByte1() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Byte 1.
	 * 
	 * @param value - new value.
	 */
	public void setByte1(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Byte 2.
	 * <p>
	 * Notes: varies depending on block - see Block_Actions
	 * 
	 * @return The current Byte 2
	 */
	public int getByte2() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Byte 2.
	 * 
	 * @param value - new value.
	 */
	public void setByte2(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Block Type.
	 * <p>
	 * Notes: the block type for the block
	 * 
	 * @return The current Block Type
	 */
	public Material getBlockType() {
		return container.getBlocks().read(0);
	}

	/**
	 * Set Block Type.
	 * 
	 * @param value - new value.
	 */
	public void setBlockType(Material value) {
		container.getBlocks().write(0, value);
	}

}
