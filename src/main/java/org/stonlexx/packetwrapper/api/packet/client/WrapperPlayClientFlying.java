package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientFlying extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.FLYING;


    /**
     * Retrieve On Ground.
     * <p>
     * Notes: true if the client is on the ground, False otherwise
     *
     * @return The current On Ground
     */
    boolean getOnGround();

    /**
     * Set On Ground.
     *
     * @param value - new value.
     */
    void setOnGround(boolean value);

}
