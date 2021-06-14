package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntityVelocity;

import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerEntityVelocity1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntityVelocity {

	public WrapperPlayServerEntityVelocity1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerEntityVelocity1_15(PacketContainer packet) {
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
	 * Retrieve the velocity in the x axis.
	 * 
	 * @return The current velocity X
	 */
	public double getVelocityX() {
		return container.getIntegers().read(1) / 8000.0D;
	}

	/**
	 * Set the velocity in the x axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityX(double value) {
		container.getIntegers().write(1, (int) (value * 8000.0D));
	}

	/**
	 * Retrieve the velocity in the y axis.
	 * 
	 * @return The current velocity y
	 */
	public double getVelocityY() {
		return container.getIntegers().read(2) / 8000.0D;
	}

	/**
	 * Set the velocity in the y axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityY(double value) {
		container.getIntegers().write(2, (int) (value * 8000.0D));
	}

	/**
	 * Retrieve the velocity in the z axis.
	 * 
	 * @return The current velocity z
	 */
	public double getVelocityZ() {
		return container.getIntegers().read(3) / 8000.0D;
	}

	/**
	 * Set the velocity in the z axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityZ(double value) {
		container.getIntegers().write(3, (int) (value * 8000.0D));
	}
}
