package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientTileNbtQuery extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.TILE_NBT_QUERY;


    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: an incremental ID so that the client can verify that the response matches.
     *
     * @return The current Transaction ID
     */
    int getTransactionId();

    /**
     * Set Transaction ID.
     *
     * @param value - new value.
     */
    void setTransactionId(int value);

    /**
     * Retrieve Location.
     * <p>
     * Notes: the location of the block to check.
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

}
