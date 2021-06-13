package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerExplosion extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.EXPLOSION;


    /**
     * Retrieve X.
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
     * Retrieve Radius.
     * <p>
     * Notes: currently unused in the client
     *
     * @return The current Radius
     */
    float getRadius();

    /**
     * Set Radius.
     *
     * @param value - new value.
     */
    void setRadius(float value);

    /**
     * Retrieve Record count.
     * <p>
     * Notes: this is the count, not the size. The size is 3 times this value.
     *
     * @return The current Record count
     */
    List<BlockPosition> getRecords();

    /**
     * Set Record count.
     *
     * @param value - new value.
     */
    void setRecords(List<BlockPosition> value);

    /**
     * Retrieve Record count.
     * <p>
     * Notes: this is the count, not the size. The size is 3 times this value.
     *
     * @return The current Record count
     * @see #getRecords()
     * @deprecated Misspelled.
     */
    @Deprecated
    List<BlockPosition> getRecors();

    float getPlayerVelocityX();

    void setPlayerVelocityX(float value);

    float getPlayerVelocityY();

    void setPlayerVelocityY(float value);

    float getPlayerVelocityZ();

    void setPlayerVelocityZ(float value);

}
