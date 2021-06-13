package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public interface WrapperPlayServerOpenBook extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.OPEN_BOOK;
    
    
    /**
     * Retrieve Hand.
     * <p>
     * Notes: 0: Main hand, 1: Off hand
     * @return The current Hand
     */
    Hand getHand();
    
    /**
     * Set Hand.
     * @param value - new value.
     */
    void setHand(Hand value);
    
}
