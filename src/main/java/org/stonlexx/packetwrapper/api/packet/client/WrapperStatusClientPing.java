package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperStatusClientPing extends WrapperPacket {
    PacketType TYPE = PacketType.Status.Client.PING;


    /**
     * Retrieve Time.
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
