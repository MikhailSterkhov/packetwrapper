package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientLook extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.LOOK;


    /**
     * Retrieve Yaw.
     * <p>
     * Notes: absolute rotation on the X Axis, in degrees
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set Yaw.
     *
     * @param value - new value.
     */
    void setYaw(float value);

    /**
     * Retrieve Pitch.
     * <p>
     * Notes: absolute rotation on the Y Axis, in degrees
     *
     * @return The current Pitch
     */
    float getPitch();

    /**
     * Set Pitch.
     *
     * @param value - new value.
     */
    void setPitch(float value);

    /**
     * Retrieve On Ground.
     * <p>
     * Notes: true if the client is on the ground, False otherwise
     *
     * @return The current On Ground
     */
    boolean getOnGround();

    /**
     * Set On Ground.
     *
     * @param value - new value.
     */
    void setOnGround(boolean value);

}
