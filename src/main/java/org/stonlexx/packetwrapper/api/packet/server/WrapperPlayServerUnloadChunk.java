package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerUnloadChunk extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.UNLOAD_CHUNK;


    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: block coordinate divided by 16, rounded down
     *
     * @return The current Chunk X
     */
    int getChunkX();

    /**
     * Set Chunk X.
     *
     * @param value - new value.
     */
    void setChunkX(int value);

    /**
     * Retrieve Chunk Z.
     * <p>
     * Notes: block coordinate divided by 16, rounded down
     *
     * @return The current Chunk Z
     */
    int getChunkZ();

    /**
     * Set Chunk Z.
     *
     * @param value - new value.
     */
    void setChunkZ(int value);

}
