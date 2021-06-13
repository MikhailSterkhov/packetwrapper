package org.stonlexx.packetwrapper.api.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.ItemSlot;

public interface WrapperPlayServerEntityEquipment extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.ENTITY_EQUIPMENT;


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

 ItemSlot getSlot();

 void setSlot(ItemSlot value);

	/**
	 * Retrieve Item.
	 * <p>
	 * Notes: item in slot format
	 * 
	 * @return The current Item
	 */
 ItemStack getItem();

	/**
	 * Set Item.
	 * 
	 * @param value - new value.
	 */
 void setItem(ItemStack value);
}
