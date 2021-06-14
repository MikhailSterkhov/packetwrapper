package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerBlockBreakAnimation;

import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerBlockBreakAnimation1_15 
        extends MinecraftPacket
        implements WrapperPlayServerBlockBreakAnimation {

	public WrapperPlayServerBlockBreakAnimation1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerBlockBreakAnimation1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: block Position
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
	 * Retrieve Destroy Stage.
	 * <p>
	 * Notes: 0 - 9
	 * 
	 * @return The current Destroy Stage
	 */
	public int getDestroyStage() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Destroy Stage.
	 * 
	 * @param value - new value.
	 */
	public void setDestroyStage(int value) {
		container.getIntegers().write(1, value);
	}

}
