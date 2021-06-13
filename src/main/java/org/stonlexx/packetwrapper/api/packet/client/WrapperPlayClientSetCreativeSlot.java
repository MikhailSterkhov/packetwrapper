package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientSetCreativeSlot extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Client.SET_CREATIVE_SLOT;


    /**
     * Retrieve Slot.
     * <p>
     * Notes: inventory slot
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

}
