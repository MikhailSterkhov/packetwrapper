package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedGameProfile;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginServerSuccess extends WrapperPacket {
    PacketType TYPE = PacketType.Login.Server.SUCCESS;


    /**
     * Retrieve the UUID and player name of the connected client.
     *
     * @return The current client profile.
     */
    WrappedGameProfile getProfile();

    /**
     * Set the UUID and player name of the connected client as a game profile.
     *
     * @param value - new profile.
     */
    void setProfile(WrappedGameProfile value);
}
