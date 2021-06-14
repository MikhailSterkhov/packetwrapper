package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTileEntityData;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.nbt.NbtBase;

public class WrapperPlayServerTileEntityData1_15 
        extends MinecraftPacket
        implements WrapperPlayServerTileEntityData {

	public WrapperPlayServerTileEntityData1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerTileEntityData1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Location.
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
	 * Retrieve Action.
	 * <p>
	 * Notes: the type of update to perform
	 * 
	 * @return The current Action
	 */
	public int getAction() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Action.
	 * 
	 * @param value - new value.
	 */
	public void setAction(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve NBT Data.
	 * <p>
	 * Notes: if not present then its TAG_END (0)
	 * 
	 * @return The current NBT Data
	 */
	public NbtBase<?> getNbtData() {
		return container.getNbtModifier().read(0);
	}

	/**
	 * Set NBT Data.
	 * 
	 * @param value - new value.
	 */
	public void setNbtData(NbtBase<?> value) {
		container.getNbtModifier().write(0, value);
	}

}
