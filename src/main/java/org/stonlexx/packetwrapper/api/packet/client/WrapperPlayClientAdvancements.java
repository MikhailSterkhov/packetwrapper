package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientAdvancements extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.ADVANCEMENTS;
    
    
    /**
     * Retrieve Action.
     * <p>
     * Notes: 0: Opened tab, 1: Closed screen
     * @return The current Action
     */
    Status getAction();
    
    /**
     * Set Action.
     * @param value - new value.
     */
    void setAction(Status value);
    /**
     * Retrieve Tab ID.
     * <p>
     * Notes: only present if action is Opened tab
     * @return The current Tab ID
     */
    MinecraftKey getTabId();
    
    /**
     * Set Tab ID.
     * @param value - new value.
     */
    void setTabId(MinecraftKey value);

    enum Status {

        OPENED_TAB,
        CLOSED_SCREEN
    }
}
