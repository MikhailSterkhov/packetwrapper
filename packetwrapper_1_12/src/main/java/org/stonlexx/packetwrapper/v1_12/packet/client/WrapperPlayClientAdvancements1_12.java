package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientAdvancements;

public class WrapperPlayClientAdvancements1_12 
        extends MinecraftPacket
        implements WrapperPlayClientAdvancements {

    public WrapperPlayClientAdvancements1_12() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAdvancements1_12(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Action.
     * <p>
     * Notes: 0: Opened tab, 1: Closed screen
     * @return The current Action
     */
    public Status getAction() {
        return container.getEnumModifier(Status.class, 0).readSafely(0);
    }
    
    /**
     * Set Action.
     * @param value - new value.
     */
    public void setAction(Status value) {
        container.getEnumModifier(Status.class, 0).writeSafely(0, value);
    }
    /**
     * Retrieve Tab ID.
     * <p>
     * Notes: only present if action is Opened tab
     * @return The current Tab ID
     */
    public MinecraftKey getTabId() {
        return container.getMinecraftKeys().readSafely(0);
    }
    
    /**
     * Set Tab ID.
     * @param value - new value.
     */
    public void setTabId(MinecraftKey value) {
        container.getMinecraftKeys().writeSafely(0, value);
    }
}
