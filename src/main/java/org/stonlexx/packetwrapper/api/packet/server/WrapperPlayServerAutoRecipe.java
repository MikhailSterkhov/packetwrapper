package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerAutoRecipe extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.AUTO_RECIPE;


    /**
     * Retrieve Window ID.
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
    
