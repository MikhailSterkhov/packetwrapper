package org.stonlexx.packetwrapper.v1_15.packet.client;

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSetCreativeSlot;


public class WrapperPlayClientSetCreativeSlot1_15 
        extends MinecraftPacket
        implements WrapperPlayClientSetCreativeSlot {

	public WrapperPlayClientSetCreativeSlot1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientSetCreativeSlot1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Slot.
	 * <p>
	 * Notes: inventory slot
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Clicked item.
	 * 
	 * @return The current Clicked item
	 */
	public ItemStack getClickedItem() {
		return container.getItemModifier().read(0);
	}

	/**
	 * Set Clicked item.
	 * 
	 * @param value - new value.
	 */
	public void setClickedItem(ItemStack value) {
		container.getItemModifier().write(0, value);
	}

}
