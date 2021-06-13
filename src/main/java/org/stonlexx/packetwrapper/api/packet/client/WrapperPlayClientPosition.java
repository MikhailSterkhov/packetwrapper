package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientPosition extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.POSITION;


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
     * Retrieve FeetY.
     * <p>
     * Notes: absolute feet position, normally HeadY - 1.62. Used to modify the
     * players bounding box when going up stairs, crouching, etc…
     *
     * @return The current FeetY
     */
    double getY();

    /**
     * Set FeetY.
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
