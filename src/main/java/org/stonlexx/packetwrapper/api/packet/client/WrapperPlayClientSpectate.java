package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.UUID;

public interface WrapperPlayClientSpectate extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.SPECTATE;


    /**
     * Retrieve Target Player.
     *
     * @return The current Target Player
     */
    UUID getTargetPlayer();

    /**
     * Set Target Player.
     *
     * @param value - new value.
     */
    void setTargetPlayer(UUID value);

}
