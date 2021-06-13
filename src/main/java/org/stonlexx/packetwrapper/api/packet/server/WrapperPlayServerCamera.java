package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCamera extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.CAMERA;


    /**
     * Retrieve Camera ID.
     *
     * @return The current Camera ID
     */
    int getCameraId();

    /**
     * Set Camera ID.
     *
     * @param value - new value.
     */
    void setCameraId(int value);

}
