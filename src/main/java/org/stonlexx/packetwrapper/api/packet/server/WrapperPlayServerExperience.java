package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerExperience extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.EXPERIENCE;


    /**
     * Retrieve Experience bar.
     * <p>
     * Notes: between 0 and 1
     *
     * @return The current Experience bar
     */
    float getExperienceBar();

    /**
     * Set Experience bar.
     *
     * @param value - new value.
     */
    void setExperienceBar(float value);

    /**
     * Retrieve Level.
     *
     * @return The current Level
     */
    int getLevel();

    /**
     * Set Level.
     *
     * @param value - new value.
     */
    void setLevel(int value);

    /**
     * Retrieve Total Experience.
     *
     * @return The current Total Experience
     */
    int getTotalExperience();

    /**
     * Set Total Experience.
     *
     * @param value - new value.
     */
    void setTotalExperience(int value);

}
