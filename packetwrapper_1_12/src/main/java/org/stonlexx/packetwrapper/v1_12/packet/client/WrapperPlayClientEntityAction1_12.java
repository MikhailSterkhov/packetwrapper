package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerAction;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientEntityAction;

public class WrapperPlayClientEntityAction1_12 
        extends MinecraftPacket
        implements WrapperPlayClientEntityAction {

	public WrapperPlayClientEntityAction1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientEntityAction1_12(PacketContainer packet) {
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
	 * Retrieve Action ID.
	 * <p>
	 * Notes: the ID of the action, see below.
	 * 
	 * @return The current Action ID
	 */
	public PlayerAction getAction() {
		return container.getPlayerActions().read(0);
	}

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
	public void setAction(PlayerAction value) {
		container.getPlayerActions().write(0, value);
	}

	/**
	 * Retrieve Jump Boost.
	 * <p>
	 * Notes: horse jump boost. Ranged from 0 -> 100.
	 * 
	 * @return The current Jump Boost
	 */
	public int getJumpBoost() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Jump Boost.
	 * 
	 * @param value - new value.
	 */
	public void setJumpBoost(int value) {
		container.getIntegers().write(1, value);
	}

}
