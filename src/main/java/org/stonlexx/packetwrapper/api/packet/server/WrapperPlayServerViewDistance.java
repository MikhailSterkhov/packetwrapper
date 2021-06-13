package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerViewDistance extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.VIEW_DISTANCE;


    /**
     * Retrieve View Distance.
     * <p>
     * Notes: render distance (2-32)
     *
     * @return The current View Distance
     */
    int getViewDistance();

    /**
     * Set View Distance.
     *
     * @param value - new value.
     */
    void setViewDistance(int value);

}
