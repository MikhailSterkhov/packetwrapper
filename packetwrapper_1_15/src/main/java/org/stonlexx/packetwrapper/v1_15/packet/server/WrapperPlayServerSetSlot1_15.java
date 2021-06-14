package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSetSlot;


public class WrapperPlayServerSetSlot1_15 
        extends MinecraftPacket
        implements WrapperPlayServerSetSlot {

	public WrapperPlayServerSetSlot1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSetSlot1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the window which is being updated. 0 for player inventory. Note
	 * that all known window types include the player inventory. This packet
	 * will only be sent for the currently opened window while the player is
	 * performing actions, even if it affects the player inventory. After the
	 * window is closed, a number of these packets are sent to update the
	 * player's inventory window (0).
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
	 * Retrieve Slot.
	 * <p>
	 * Notes: the slot that should be updated
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Slot data.
	 * 
	 * @return The current Slot data
	 */
	public ItemStack getSlotData() {
		return container.getItemModifier().read(0);
	}

	/**
	 * Set Slot data.
	 * 
	 * @param value - new value.
	 */
	public void setSlotData(ItemStack value) {
		container.getItemModifier().write(0, value);
	}

}
