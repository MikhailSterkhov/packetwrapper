package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientUpdateSign extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.UPDATE_SIGN;


    /**
     * Retrieve Location.
     * <p>
     * Notes: block Coordinates
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
     * Retrieve this sign's lines of text.
     *
     * @return The current lines
     */
    String[] getLines();

    /**
     * Set this sign's lines of text.
     *
     * @param value - Lines, must be 4 elements long
     */
    void setLines(String[] value);
}
