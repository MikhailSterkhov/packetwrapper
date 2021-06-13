package org.stonlexx.packetwrapper.api.packet.client;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerAction;

public interface WrapperPlayClientEntityAction extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.ENTITY_ACTION;


	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
 int getEntityID();

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
 void setEntityID(int value);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
 Entity getEntity(World world);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
 Entity getEntity(PacketEvent event);

	/**
	 * Retrieve Action ID.
	 * <p>
	 * Notes: the ID of the action, see below.
	 * 
	 * @return The current Action ID
	 */
 PlayerAction getAction();

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
 void setAction(PlayerAction value);

	/**
	 * Retrieve Jump Boost.
	 * <p>
	 * Notes: horse jump boost. Ranged from 0 -> 100.
	 * 
	 * @return The current Jump Boost
	 */
 int getJumpBoost();

	/**
	 * Set Jump Boost.
	 * 
	 * @param value - new value.
	 */
 void setJumpBoost(int value);

}
