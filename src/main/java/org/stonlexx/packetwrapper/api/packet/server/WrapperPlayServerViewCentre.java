package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerViewCentre extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.VIEW_CENTRE;


    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: chunk X coordinate of the player's position
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
     * Notes: chunk Z coordinate of the player's position
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
