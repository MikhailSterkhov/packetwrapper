package org.stonlexx.packetwrapper.v1_15.packet.server;

import java.util.List;

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWindowItems;


public class WrapperPlayServerWindowItems1_15 
        extends MinecraftPacket
        implements WrapperPlayServerWindowItems {

	public WrapperPlayServerWindowItems1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWindowItems1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of window which items are being sent for. 0 for player
	 * inventory.
	 * 
	 * @return The current Window ID
	 */
	public int getWindowId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Slot data.
	 * 
	 * @return The current Slot data
	 */
	public List<ItemStack> getSlotData() {
		return container.getItemListModifier().read(0);
	}

	/**
	 * Set Slot data.
	 * 
	 * @param value - new value.
	 */
	public void setSlotData(List<ItemStack> value) {
		container.getItemListModifier().write(0, value);
	}

}
