package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.Location;
import org.bukkit.World;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerBlockChange;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedBlockData;

public class WrapperPlayServerBlockChange1_15 
        extends MinecraftPacket
        implements WrapperPlayServerBlockChange {

	public WrapperPlayServerBlockChange1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerBlockChange1_15(PacketContainer packet) {
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
	 * Retrieve the Bukkit Location.
	 * 
	 * @param world World for the location
	 * @return Bukkit Location
	 */
	public Location getBukkitLocation(World world) {
		return getLocation().toVector().toLocation(world);
	}

	/**
	 * Retrieve Block Data.
	 * 
	 * @return The current Block Data
	 */
	public WrappedBlockData getBlockData() {
		return container.getBlockData().read(0);
	}

	/**
	 * Set Block Data.
	 * 
	 * @param value - new value.
	 */
	public void setBlockData(WrappedBlockData value) {
		container.getBlockData().write(0, value);
	}
}
