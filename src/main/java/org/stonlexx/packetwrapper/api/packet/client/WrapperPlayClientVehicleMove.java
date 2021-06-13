package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientVehicleMove extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.VEHICLE_MOVE;


    /**
     * Retrieve X.
     * <p>
     * Notes: absolute position (X coordinate)
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
     * Retrieve Y.
     * <p>
     * Notes: absolute position (Y coordinate)
     *
     * @return The current Y
     */
    double getY();

    /**
     * Set Y.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve Z.
     * <p>
     * Notes: absolute position (Z coordinate)
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
     * Notes: absolute rotation on the vertical axis, in degrees
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
     * Notes: absolute rotation on the horizontal axis, in degrees
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

}
