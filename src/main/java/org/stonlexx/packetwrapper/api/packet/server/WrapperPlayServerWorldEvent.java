package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerWorldEvent extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.WORLD_EVENT;


    /**
     * Retrieve Effect ID.
     * <p>
     * Notes: the ID of the effect, see below.
     *
     * @return The current Effect ID
     */
    int getEffectId();

    /**
     * Set Effect ID.
     *
     * @param value - new value.
     */
    void setEffectId(int value);

    /**
     * Retrieve Location.
     * <p>
     * Notes: the location of the effect
     *
     * @return The current Location
     */
    BlockPosition getLocation();

    /**
     * Set Location.
     *
     * @param value - new value.
     */
    void setLocation(BlockPosition value);

    /**
     * Retrieve Data.
     * <p>
     * Notes: extra data for certain effects, see below.
     *
     * @return The current Data
     */
    int getData();

    /**
     * Set Data.
     *
     * @param value - new value.
     */
    void setData(int value);

    /**
     * Retrieve Disable relative volume.
     * <p>
     * Notes: see above
     *
     * @return The current Disable relative volume
     */
    boolean getDisableRelativeVolume();

    /**
     * Set Disable relative volume.
     *
     * @param value - new value.
     */
    void setDisableRelativeVolume(boolean value);

}
