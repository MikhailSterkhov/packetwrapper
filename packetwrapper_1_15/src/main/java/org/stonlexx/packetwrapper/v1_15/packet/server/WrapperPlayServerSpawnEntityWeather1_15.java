package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSpawnEntityWeather;

import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerSpawnEntityWeather1_15 
        extends MinecraftPacket
        implements WrapperPlayServerSpawnEntityWeather {

	public WrapperPlayServerSpawnEntityWeather1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSpawnEntityWeather1_15(PacketContainer packet) {
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
	 * Retrieve Type.
	 * <p>
	 * Notes: the global entity type, currently always 1 for thunderbolt.
	 * 
	 * @return The current Type
	 */
	public int getType() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Type.
	 * 
	 * @param value - new value.
	 */
	public void setType(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve the x position of the object.
	 * <p>
	 * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
	 * 
	 * @return The current X
	 */
	public double getX() {
		return container.getDoubles().read(0);
	}

	/**
	 * Set the x position of the object.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		container.getDoubles().write(0, value);
	}

	/**
	 * Retrieve the y position of the object.
	 * <p>
	 * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
	 * 
	 * @return The current y
	 */
	public double getY() {
		return container.getDoubles().read(1);
	}

	/**
	 * Set the y position of the object.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		container.getDoubles().write(1, value);
	}

	/**
	 * Retrieve the z position of the object.
	 * <p>
	 * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
	 * 
	 * @return The current z
	 */
	public double getZ() {
		return container.getDoubles().read(2);
	}

	/**
	 * Set the z position of the object.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		container.getDoubles().write(2, value);
	}
}
