package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientPickItem extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.PICK_ITEM;
    
    
    /**
     * Retrieve Slot to use.
     * <p>
     * Notes: see Inventory
     * @return The current Slot to use
     */
    int getSlotToUse();
    
    /**
     * Set Slot to use.
     * @param value - new value.
     */
    void setSlotToUse(int value);
    
}
