package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.ItemSlot;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntityEquipment;

public class WrapperPlayServerEntityEquipment1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntityEquipment {

	public WrapperPlayServerEntityEquipment1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerEntityEquipment1_15(PacketContainer packet) {
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

	public ItemSlot getSlot() {
		return container.getItemSlots().read(0);
	}

	public void setSlot(ItemSlot value) {
		container.getItemSlots().write(0, value);
	}

	/**
	 * Retrieve Item.
	 * <p>
	 * Notes: item in slot format
	 * 
	 * @return The current Item
	 */
	public ItemStack getItem() {
		return container.getItemModifier().read(0);
	}

	/**
	 * Set Item.
	 * 
	 * @param value - new value.
	 */
	public void setItem(ItemStack value) {
		container.getItemModifier().write(0, value);
	}
}
