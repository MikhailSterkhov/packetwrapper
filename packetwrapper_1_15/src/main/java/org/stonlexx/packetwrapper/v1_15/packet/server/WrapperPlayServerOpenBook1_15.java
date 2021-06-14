package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerOpenBook;

import com.comphenix.protocol.wrappers.EnumWrappers.Hand;

public class WrapperPlayServerOpenBook1_15 
        extends MinecraftPacket
        implements WrapperPlayServerOpenBook {

    public WrapperPlayServerOpenBook1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerOpenBook1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Hand.
     * <p>
     * Notes: 0: Main hand, 1: Off hand
     * @return The current Hand
     */
    public Hand getHand() {
        return container.getHands().read(0);
    }
    
    /**
     * Set Hand.
     * @param value - new value.
     */
    public void setHand(Hand value) {
        container.getHands().write(0, value);
    }
    
}
