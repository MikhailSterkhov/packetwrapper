package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientDifficultyLock extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.DIFFICULTY_LOCK;
    
    
    /**
     * Retrieve Locked.
     * @return The current Locked
     */
    boolean getLocked();
    
    /**
     * Set Locked.
     * @param value - new value.
     */
    void setLocked(boolean value);
    
}
