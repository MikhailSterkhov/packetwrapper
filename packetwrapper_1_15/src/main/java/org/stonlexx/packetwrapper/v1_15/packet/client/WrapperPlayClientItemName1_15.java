package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientItemName;


public class WrapperPlayClientItemName1_15 
        extends MinecraftPacket
        implements WrapperPlayClientItemName {

    public WrapperPlayClientItemName1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientItemName1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Item name.
     * <p>
     * Notes: the new name of the item
     * @return The current Item name
     */
    public String getItemName() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Item name.
     * @param value - new value.
     */
    public void setItemName(String value) {
        container.getStrings().write(0, value);
    }
    
}
