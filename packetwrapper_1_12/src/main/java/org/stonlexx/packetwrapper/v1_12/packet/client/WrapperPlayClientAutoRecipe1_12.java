package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientAutoRecipe;

public class WrapperPlayClientAutoRecipe1_12 
        extends MinecraftPacket
        implements WrapperPlayClientAutoRecipe {

    public WrapperPlayClientAutoRecipe1_12() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAutoRecipe1_12(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the window id.
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

    // Modifier for recipe can be created upon request

    public boolean isMakeAll() {
        return container.getBooleans().read(0);
    }

    public void setMakeAll(boolean value) {
        container.getBooleans().write(0, value);
    }
}
