package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;
import com.comphenix.protocol.wrappers.WrappedBlockData;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerBlockBreak extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.BLOCK_BREAK;


    /**
     * Retrieve Location.
     * <p>
     * Notes: position where the digging was happening
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
     * Retrieve Block.
     * <p>
     * Notes: block state ID of the block that should be at that position now.
     *
     * @return The current Block
     */
    WrappedBlockData getBlock();

    /**
     * Set Block.
     *
     * @param value - new value.
     */
    void setBlock(WrappedBlockData value);

    /**
     * Retrieve Status.
     * <p>
     * Notes: same as Player Digging. Only Started digging (0), Cancelled digging (1), and Finished digging (2) are used.
     *
     * @return The current Status
     */
    PlayerDigType getStatus();

    /**
     * Set Status.
     *
     * @param value - new value.
     */
    void setStatus(PlayerDigType value);

    /**
     * Retrieve Successful.
     * <p>
     * Notes: true if the digging succeeded; false if the client should undo any changes it made locally. (How does this work?)
     *
     * @return The current Successful
     */
    boolean getSuccessful();

    /**
     * Set Successful.
     *
     * @param value - new value.
     */
    void setSuccessful(boolean value);

}
