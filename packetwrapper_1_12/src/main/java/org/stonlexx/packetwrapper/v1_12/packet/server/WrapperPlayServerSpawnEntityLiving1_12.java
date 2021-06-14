package org.stonlexx.packetwrapper.v1_12.packet.server;

import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSpawnEntityLiving;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.injector.PacketConstructor;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;

public class WrapperPlayServerSpawnEntityLiving1_12 
        extends MinecraftPacket
        implements WrapperPlayServerSpawnEntityLiving {

	private static PacketConstructor entityConstructor;

	public WrapperPlayServerSpawnEntityLiving1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSpawnEntityLiving1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	public WrapperPlayServerSpawnEntityLiving1_12(Entity entity) {
		super(fromEntity(entity), TYPE);
	}

	// Useful constructor
	private static PacketContainer fromEntity(Entity entity) {
		if (entityConstructor == null)
			entityConstructor =
					ProtocolLibrary.getProtocolManager()
							.createPacketConstructor(TYPE, entity);
		return entityConstructor.createPacket(entity);
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
	 * Retrieve the entity that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	public UUID getUniqueId() {
		return container.getUUIDs().read(0);
	}

	public void setUniqueId(UUID value) {
		container.getUUIDs().write(0, value);
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
	 * Retrieve the type of mob.
	 * 
	 * @return The current Type
	 */
	@SuppressWarnings("deprecation")
	public EntityType getType() {
		return EntityType.fromId(container.getIntegers().read(1));
	}

	/**
	 * Set the type of mob.
	 * 
	 * @param value - new value.
	 */
	@SuppressWarnings("deprecation")
	public void setType(EntityType value) {
		container.getIntegers().write(1, (int) value.getTypeId());
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

	/**
	 * Retrieve the yaw.
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return (container.getBytes().read(0) * 360.F) / 256.0F;
	}

	/**
	 * Set the yaw of the spawned mob.
	 * 
	 * @param value - new yaw.
	 */
	public void setYaw(float value) {
		container.getBytes().write(0, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the pitch.
	 * 
	 * @return The current pitch
	 */
	public float getPitch() {
		return (container.getBytes().read(1) * 360.F) / 256.0F;
	}

	/**
	 * Set the pitch of the spawned mob.
	 * 
	 * @param value - new pitch.
	 */
	public void setPitch(float value) {
		container.getBytes().write(1, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the yaw of the mob's head.
	 * 
	 * @return The current yaw.
	 */
	public float getHeadPitch() {
		return (container.getBytes().read(2) * 360.F) / 256.0F;
	}

	/**
	 * Set the yaw of the mob's head.
	 * 
	 * @param value - new yaw.
	 */
	public void setHeadPitch(float value) {
		container.getBytes().write(2, (byte) (value * 256.0F / 360.0F));
	}

	/**
	 * Retrieve the velocity in the x axis.
	 * 
	 * @return The current velocity X
	 */
	public double getVelocityX() {
		return container.getIntegers().read(2) / 8000.0D;
	}

	/**
	 * Set the velocity in the x axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityX(double value) {
		container.getIntegers().write(2, (int) (value * 8000.0D));
	}

	/**
	 * Retrieve the velocity in the y axis.
	 * 
	 * @return The current velocity y
	 */
	public double getVelocityY() {
		return container.getIntegers().read(3) / 8000.0D;
	}

	/**
	 * Set the velocity in the y axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityY(double value) {
		container.getIntegers().write(3, (int) (value * 8000.0D));
	}

	/**
	 * Retrieve the velocity in the z axis.
	 * 
	 * @return The current velocity z
	 */
	public double getVelocityZ() {
		return container.getIntegers().read(4) / 8000.0D;
	}

	/**
	 * Set the velocity in the z axis.
	 * 
	 * @param value - new value.
	 */
	public void setVelocityZ(double value) {
		container.getIntegers().write(4, (int) (value * 8000.0D));
	}

	/**
	 * Retrieve the data watcher.
	 * <p>
	 * Content varies by mob, see Entities.
	 * 
	 * @return The current Metadata
	 */
	public WrappedDataWatcher getMetadata() {
		return container.getDataWatcherModifier().read(0);
	}

	/**
	 * Set the data watcher.
	 * 
	 * @param value - new value.
	 */
	public void setMetadata(WrappedDataWatcher value) {
		container.getDataWatcherModifier().write(0, value);
	}
}
