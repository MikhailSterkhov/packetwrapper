package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerKeepAlive extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.KEEP_ALIVE;


    /**
     * Retrieve Keep Alive ID.
     *
     * @return The current Keep Alive ID
     */
    long getKeepAliveId();

    /**
     * Set Keep Alive ID.
     *
     * @param value - new value.
     */
    void setKeepAliveId(long value);

}
