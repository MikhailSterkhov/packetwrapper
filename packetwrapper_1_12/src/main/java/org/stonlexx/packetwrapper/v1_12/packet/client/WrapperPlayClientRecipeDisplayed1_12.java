package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientRecipeDisplayed;

public class WrapperPlayClientRecipeDisplayed1_12 
        extends MinecraftPacket
        implements WrapperPlayClientRecipeDisplayed {

    public WrapperPlayClientRecipeDisplayed1_12() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientRecipeDisplayed1_12(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Status getStatus() {
        return container.getEnumModifier(Status.class, 0).readSafely(0);
    }

    public void setStatus(Status value) {
        container.getEnumModifier(Status.class, 0).writeSafely(0, value);
    }

    // Modifier for recipe can be created upon request

    public boolean isBookOpen() {
        return container.getBooleans().read(0);
    }

    public void setBookOpen(boolean value) {
        container.getBooleans().write(0, value);
    }

    public boolean isFilterActive() {
        return container.getBooleans().read(1);
    }

    public void setFilterActive(boolean value) {
        container.getBooleans().write(1, value);
    }

}
