package org.stonlexx.packetwrapper.v1_15.packet.server;

import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerUpdateAttributes;

import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedAttribute;

public class WrapperPlayServerUpdateAttributes1_15 
        extends MinecraftPacket
        implements WrapperPlayServerUpdateAttributes {

	public WrapperPlayServerUpdateAttributes1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerUpdateAttributes1_15(PacketContainer packet) {
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
	 * Retrieve the collection of attributes associated with the entity.
	 * 
	 * @return The current attributes.
	 */
	public List<WrappedAttribute> getAttributes() {
		return container.getAttributeCollectionModifier().read(0);
	}

	/**
	 * Set the new or updated attributes associated with the entity.
	 * 
	 * @param value - new/updated attributes.
	 */
	public void setAttributes(List<WrappedAttribute> value) {
		container.getAttributeCollectionModifier().write(0, value);
	}
}
