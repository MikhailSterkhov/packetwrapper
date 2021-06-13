package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerWindowItems extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.WINDOW_ITEMS;


    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of window which items are being sent for. 0 for player
     * inventory.
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
     * Retrieve Slot data.
     *
     * @return The current Slot data
     */
    List<ItemStack> getSlotData();

    /**
     * Set Slot data.
     *
     * @param value - new value.
     */
    void setSlotData(List<ItemStack> value);

}
