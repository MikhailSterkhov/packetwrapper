package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientRecipeDisplayed extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.RECIPE_DISPLAYED;
    
    
    Status getStatus();

    void setStatus(Status value);

    boolean isBookOpen();

    void setBookOpen(boolean value);

    boolean isFilterActive();

    void setFilterActive(boolean value);

    enum Status {

        SHOWN,
        SETTINGS;
    }
}
