package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientSteerVehicle extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.STEER_VEHICLE;


    /**
     * Retrieve Sideways.
     * <p>
     * Notes: positive to the left of the player
     *
     * @return The current Sideways
     */
    float getSideways();

    /**
     * Set Sideways.
     *
     * @param value - new value.
     */
    void setSideways(float value);

    /**
     * Retrieve Forward.
     * <p>
     * Notes: positive forward
     *
     * @return The current Forward
     */
    float getForward();

    /**
     * Set Forward.
     *
     * @param value - new value.
     */
    void setForward(float value);

    boolean isJump();

    void setJump(boolean value);

    boolean isUnmount();

    void setUnmount(boolean value);

}
