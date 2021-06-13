package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginServerSetCompression extends WrapperPacket {
    PacketType TYPE =
            PacketType.Login.Server.SET_COMPRESSION;


    /**
     * Retrieve Threshold.
     * <p>
     * Notes: threshold is the max size of a packet before its compressed
     *
     * @return The current Threshold
     */
    int getThreshold();

    /**
     * Set Threshold.
     *
     * @param value - new value.
     */
    void setThreshold(int value);

}
