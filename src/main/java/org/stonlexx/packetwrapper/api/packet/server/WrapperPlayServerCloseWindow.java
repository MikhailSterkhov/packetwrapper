package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCloseWindow extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.CLOSE_WINDOW;


    /**
     * Retrieve Window ID.
     * <p>
     * Notes: this is the id of the window that was closed. 0 for inventory.
     *
     * @return The current Window ID
     */
    int getWindowId();

    /**
     * Set Window ID.
     *
     * @param value - new value.
     */
    void setWindowId(int value);

}
