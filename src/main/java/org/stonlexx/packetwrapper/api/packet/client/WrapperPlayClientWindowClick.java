package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientWindowClick extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.WINDOW_CLICK;


    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of the window which was clicked. 0 for player inventory.
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
     * Notes: the clicked slot. See below.
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
     * Retrieve Button.
     * <p>
     * Notes: the button used in the click. See below.
     *
     * @return The current Button
     */
    int getButton();

    /**
     * Set Button.
     *
     * @param value - new value.
     */
    void setButton(int value);

    /**
     * Retrieve Action number.
     * <p>
     * Notes: a unique number for the action, used for transaction handling (See
     * the Transaction packet).
     *
     * @return The current Action number
     */
    short getActionNumber();

    /**
     * Set Action number.
     *
     * @param value - new value.
     */
    void setActionNumber(short value);

    /**
     * Retrieve Clicked item.
     *
     * @return The current Clicked item
     */
    ItemStack getClickedItem();

    /**
     * Set Clicked item.
     *
     * @param value - new value.
     */
    void setClickedItem(ItemStack value);

    InventoryClickType getShift();

    void setShift(InventoryClickType value);

    enum InventoryClickType {
		PICKUP, QUICK_MOVE, SWAP, CLONE, THROW, QUICK_CRAFT, PICKUP_ALL
	}
}
