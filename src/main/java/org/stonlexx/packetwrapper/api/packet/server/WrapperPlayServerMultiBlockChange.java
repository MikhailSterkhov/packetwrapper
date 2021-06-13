package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.ChunkCoordIntPair;
import com.comphenix.protocol.wrappers.MultiBlockChangeInfo;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerMultiBlockChange extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.MULTI_BLOCK_CHANGE;


    /**
     * Retrieve the chunk that has been altered.
     *
     * @return The current chunk
     */
    ChunkCoordIntPair getChunk();

    /**
     * Set the chunk that has been altered.
     *
     * @param value - new value
     */
    void setChunk(ChunkCoordIntPair value);

    /**
     * Retrieve a copy of the record data as a block change array.
     *
     * @return The copied block change array.
     */
    MultiBlockChangeInfo[] getRecords();

    /**
     * Set the record data using the given helper array.
     *
     * @param value - new value
     */
    void setRecords(MultiBlockChangeInfo[] value);
}
