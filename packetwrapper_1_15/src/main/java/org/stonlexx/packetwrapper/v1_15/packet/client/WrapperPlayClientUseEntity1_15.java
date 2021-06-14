package org.stonlexx.packetwrapper.v1_15.packet.client;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientUseEntity;

import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.EntityUseAction;

public class WrapperPlayClientUseEntity1_15 
        extends MinecraftPacket
        implements WrapperPlayClientUseEntity {

	public WrapperPlayClientUseEntity1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientUseEntity1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve entity ID of the target.
	 * 
	 * @return The current entity ID
	 */
	public int getTargetID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Retrieve the entity that was targeted.
	 * 
	 * @param world - the current world of the entity.
	 * @return The targeted entity.
	 */
	public Entity getTarget(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity that was targeted.
	 * 
	 * @param event - the packet event.
	 * @return The targeted entity.
	 */
	public Entity getTarget(PacketEvent event) {
		return getTarget(event.getPlayer().getWorld());
	}

	/**
	 * Set entity ID of the target.
	 * 
	 * @param value - new value.
	 */
	public void setTargetID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Type.
	 * 
	 * @return The current Type
	 */
	public EntityUseAction getType() {
		return container.getEntityUseActions().read(0);
	}

	/**
	 * Set Type.
	 * 
	 * @param value - new value.
	 */
	public void setType(EntityUseAction value) {
		container.getEntityUseActions().write(0, value);
	}

	/**
	 * Retrieve the target vector.
	 * <p>
	 * Notes: Only if {@link #getType()} is {@link EntityUseAction#INTERACT_AT}.
	 * 
	 * @return The target vector or null
	 */
	public Vector getTargetVector() {
		return container.getVectors().read(0);
	}

	/**
	 * Set the target vector.
	 * 
	 * @param value - new value.
	 */
	public void setTargetVector(Vector value) {
		container.getVectors().write(0, value);
	}
}
