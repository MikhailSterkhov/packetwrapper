package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientDifficultyChange extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.DIFFICULTY_CHANGE;
    
    
    /**
     * Retrieve New difficulty.
     * <p>
     * Notes: 0: peaceful, 1: easy, 2: normal, 3: hard
     * @return The current New difficulty
     */
    Difficulty getNewDifficulty();
    
    /**
     * Set New difficulty.
     * @param value - new value.
     */
    void setNewDifficulty(Difficulty value);
    
}
