package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerUpdateHealth extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.UPDATE_HEALTH;


    /**
     * Retrieve Health.
     * <p>
     * Notes: 0 or less = dead, 20 = full HP
     *
     * @return The current Health
     */
    float getHealth();

    /**
     * Set Health.
     *
     * @param value - new value.
     */
    void setHealth(float value);

    /**
     * Retrieve Food.
     * <p>
     * Notes: 0 - 20
     *
     * @return The current Food
     */
    int getFood();

    /**
     * Set Food.
     *
     * @param value - new value.
     */
    void setFood(int value);

    /**
     * Retrieve Food Saturation.
     * <p>
     * Notes: seems to vary from 0.0 to 5.0 in integer increments
     *
     * @return The current Food Saturation
     */
    float getFoodSaturation();

    /**
     * Set Food Saturation.
     *
     * @param value - new value.
     */
    void setFoodSaturation(float value);

}
