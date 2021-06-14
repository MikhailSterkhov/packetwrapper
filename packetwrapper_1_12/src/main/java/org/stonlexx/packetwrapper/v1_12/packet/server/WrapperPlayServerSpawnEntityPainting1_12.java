package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSpawnEntityPainting;

public class WrapperPlayServerSpawnEntityPainting1_12 
        extends MinecraftPacket
        implements WrapperPlayServerSpawnEntityPainting {

	public WrapperPlayServerSpawnEntityPainting1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSpawnEntityPainting1_12(PacketContainer packet) {
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
	 * Retrieve Title.
	 * <p>
	 * Notes: name of the painting. Max length 13
	 * 
	 * @return The current Title
	 */
	public String getTitle() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Title.
	 * 
	 * @param value - new value.
	 */
	public void setTitle(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: center coordinates
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
}
