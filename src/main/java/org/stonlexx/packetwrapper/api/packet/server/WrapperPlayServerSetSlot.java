package org.stonlexx.packetwrapper.api.packet.server;

import org.bukkit.inventory.ItemStack;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerSetSlot extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.SET_SLOT;


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
 int getWindowId();

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
 void setWindowId(int value);

	/**
	 * Retrieve Slot.
	 * <p>
	 * Notes: the slot that should be updated
	 * 
	 * @return The current Slot
	 */
 int getSlot();

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
 void setSlot(int value);

	/**
	 * Retrieve Slot data.
	 * 
	 * @return The current Slot data
	 */
 ItemStack getSlotData();

	/**
	 * Set Slot data.
	 * 
	 * @param value - new value.
	 */
 void setSlotData(ItemStack value);

}
