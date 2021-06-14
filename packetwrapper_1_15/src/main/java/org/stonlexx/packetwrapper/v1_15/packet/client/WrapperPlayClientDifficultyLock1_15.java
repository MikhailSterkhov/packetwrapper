package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientDifficultyLock;


public class WrapperPlayClientDifficultyLock1_15 
        extends MinecraftPacket
        implements WrapperPlayClientDifficultyLock {

    public WrapperPlayClientDifficultyLock1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientDifficultyLock1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Locked.
     * @return The current Locked
     */
    public boolean getLocked() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Locked.
     * @param value - new value.
     */
    public void setLocked(boolean value) {
        container.getBooleans().write(0, value);
    }
    
}
