package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerScoreboardDisplayObjective extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.SCOREBOARD_DISPLAY_OBJECTIVE;


    /**
     * Retrieve Position.
     * <p>
     * Notes: the position of the scoreboard. 0 = list, 1 = sidebar, 2 =
     * belowName.
     *
     * @return The current Position
     */
    int getPosition();

    /**
     * Set Position.
     *
     * @param value - new value.
     */
    void setPosition(int value);

    /**
     * Retrieve Score Name.
     * <p>
     * Notes: the unique name for the scoreboard to be displayed.
     *
     * @return The current Score Name
     */
    String getScoreName();

    /**
     * Set Score Name.
     *
     * @param value - new value.
     */
    void setScoreName(String value);

}
