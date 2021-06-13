package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientItemName extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.ITEM_NAME;
    
    
    /**
     * Retrieve Item name.
     * <p>
     * Notes: the new name of the item
     * @return The current Item name
     */
    String getItemName();
    
    /**
     * Set Item name.
     * @param value - new value.
     */
    void setItemName(String value);
    
}
