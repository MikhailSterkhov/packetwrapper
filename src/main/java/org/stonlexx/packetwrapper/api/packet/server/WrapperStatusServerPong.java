package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperStatusServerPong extends WrapperPacket {
    PacketType TYPE = PacketType.Status.Server.PONG;


    /**
     * Retrieve Time.
     * <p>
     * Notes: should be the same as sent by the client
     *
     * @return The current Time
     */
    long getTime();

    /**
     * Set Time.
     *
     * @param value - new value.
     */
    void setTime(long value);

}
