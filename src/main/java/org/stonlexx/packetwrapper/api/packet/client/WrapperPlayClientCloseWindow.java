package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientCloseWindow extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.CLOSE_WINDOW;


    /**
     * Retrieve Window id.
     * <p>
     * Notes: this is the id of the window that was closed. 0 for inventory.
     *
     * @return The current Window id
     */
    int getWindowId();

    /**
     * Set Window id.
     *
     * @param value - new value.
     */
    void setWindowId(int value);

}
