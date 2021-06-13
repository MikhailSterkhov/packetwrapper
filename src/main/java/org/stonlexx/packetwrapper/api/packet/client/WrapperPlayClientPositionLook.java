package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientPositionLook extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.POSITION_LOOK;


    /**
     * Retrieve X.
     * <p>
     * Notes: absolute position
     *
     * @return The current X
     */
    double getX();

    /**
     * Set X.
     *
     * @param value - new value.
     */
    void setX(double value);

    /**
     * Retrieve Feet Y.
     * <p>
     * Notes: absolute feet position. Is normally HeadY - 1.62. Used to modify
     * the players bounding box when going up stairs, crouching, etc…
     *
     * @return The current FeetY
     */
    double getY();

    /**
     * Set Feet Y.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve Z.
     * <p>
     * Notes: absolute position
     *
     * @return The current Z
     */
    double getZ();

    /**
     * Set Z.
     *
     * @param value - new value.
     */
    void setZ(double value);

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
