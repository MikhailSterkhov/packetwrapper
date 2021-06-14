package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientPickItem;


public class WrapperPlayClientPickItem1_15 
        extends MinecraftPacket
        implements WrapperPlayClientPickItem {

    public WrapperPlayClientPickItem1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientPickItem1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Slot to use.
     * <p>
     * Notes: see Inventory
     * @return The current Slot to use
     */
    public int getSlotToUse() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Slot to use.
     * @param value - new value.
     */
    public void setSlotToUse(int value) {
        container.getIntegers().write(0, value);
    }
    
}
