package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientDifficultyChange;

import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;

public class WrapperPlayClientDifficultyChange1_15 
        extends MinecraftPacket
        implements WrapperPlayClientDifficultyChange {

    public WrapperPlayClientDifficultyChange1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientDifficultyChange1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve New difficulty.
     * <p>
     * Notes: 0: peaceful, 1: easy, 2: normal, 3: hard
     * @return The current New difficulty
     */
    public Difficulty getNewDifficulty() {
        return container.getDifficulties().read(0);
    }
    
    /**
     * Set New difficulty.
     * @param value - new value.
     */
    public void setNewDifficulty(Difficulty value) {
        container.getDifficulties().write(0, value);
    }
    
}
