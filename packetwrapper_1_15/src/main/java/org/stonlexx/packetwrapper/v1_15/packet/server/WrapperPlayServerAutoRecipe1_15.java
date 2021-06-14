package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerAutoRecipe;


public class WrapperPlayServerAutoRecipe1_15 
        extends MinecraftPacket
        implements WrapperPlayServerAutoRecipe {

    public WrapperPlayServerAutoRecipe1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAutoRecipe1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID.
     * @return The current Window ID
     */
    public int getWindowId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Window ID.
     * @param value - new value.
     */
    public void setWindowId(int value) {
        container.getIntegers().write(0, value);
    }
    
    // Wrapper for recipe can be created upon request
}
