package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerGameStateChange extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.GAME_STATE_CHANGE;


    /**
     * Retrieve Reason.
     *
     * @return The current Reason
     */
    int getReason();

    /**
     * Set Reason.
     *
     * @param value - new value.
     */
    void setReason(int value);

    /**
     * Retrieve Value.
     * <p>
     * Notes: depends on reason
     *
     * @return The current Value
     */
    float getValue();

    /**
     * Set Value.
     *
     * @param value - new value.
     */
    void setValue(float value);

}
