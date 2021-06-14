package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntityTeleport;

import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerEntityTeleport1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntityTeleport {

	public WrapperPlayServerEntityTeleport1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerEntityTeleport1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve entity ID.
	 * 
	 * @return The current EID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity.
	 * 
	 * @param world - the current world of the entity.
	 * @return The entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity.
	 * 
	 * @param event - the packet event.
	 * @return The entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	public double getX() {
		return container.getDoubles().read(0);
	}

	public void setX(double value) {
		container.getDoubles().write(0, value);
	}

	public double getY() {
		return container.getDoubles().read(1);
	}

	public void setY(double value) {
		container.getDoubles().write(1, value);
	}

	public double getZ() {
		return container.getDoubles().read(2);
	}

	public void setZ(double value) {
		container.getDoubles().write(2, value);
	}

	/**
	 * Retrieve the yaw of the current entity.
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return (container.getBytes().read(0) * 360.F) / 256.0F;
	}

	/**
	 * Set the yaw of the current entity.
	 * 
	 * @param value - new yaw.
	 */
	public void setYaw(float value) {
		container.getBytes().write(0, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the pitch of the current entity.
	 * 
	 * @return The current pitch
	 */
	public float getPitch() {
		return (container.getBytes().read(1) * 360.F) / 256.0F;
	}

	/**
	 * Set the pitch of the current entity.
	 * 
	 * @param value - new pitch.
	 */
	public void setPitch(float value) {
		container.getBytes().write(1, (byte) (value * 256.0F / 360.0F));
	}

	public boolean getOnGround() {
		return container.getBooleans().read(0);
	}

	public void setOnGround(boolean value) {
		container.getBooleans().write(0, value);
	}
}
