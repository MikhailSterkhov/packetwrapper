package org.stonlexx.packetwrapper.v1_12.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerAnimation;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerAnimation1_12 
        extends MinecraftPacket
        implements WrapperPlayServerAnimation {

	public WrapperPlayServerAnimation1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerAnimation1_12(PacketContainer packet) {
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
	 * Retrieve Animation.
	 * <p>
	 * Notes: animation ID
	 * 
	 * @return The current Animation
	 */
	public int getAnimation() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Animation.
	 * 
	 * @param value - new value.
	 */
	public void setAnimation(int value) {
		container.getIntegers().write(1, value);
	}

}
