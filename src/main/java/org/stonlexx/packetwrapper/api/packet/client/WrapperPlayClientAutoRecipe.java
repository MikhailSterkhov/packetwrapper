package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientAutoRecipe extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.AUTO_RECIPE;


    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the window id.
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

    boolean isMakeAll();

    void setMakeAll(boolean value);
}
