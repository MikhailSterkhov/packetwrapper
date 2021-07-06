package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.reflect.IntEnum;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerScoreboardObjective extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.SCOREBOARD_OBJECTIVE;

    /**
     * Retrieve Objective name.
     * <p>
     * Notes: an unique name for the objective
     *
     * @return The current Objective name
     */
    String getName();

    /**
     * Set Objective name.
     *
     * @param value - new value.
     */
    void setName(String value);

    /**
     * Retrieve Objective DisplayName.
     * <p>
     * Notes: only if mode is 0 or 2. The text to be displayed for the score.
     *
     * @return The current Objective value
     */
    String getDisplayName();

    /**
     * Set Objective DisplayName.
     *
     * @param value - new value.
     */
    void setDisplayName(String value);

    /**
     * Retrieve health display.
     * <p>
     * Notes: Can be either INTEGER or HEARTS
     *
     * @return the current health display value
     */
    HealthDisplay getHealthDisplay();

    /**
     * Set health display.
     *
     * @param value - value
     * @see #getHealthDisplay()
     */
    void setHealthDisplay(HealthDisplay value);

    /**
     * Retrieve Mode.
     * <p>
     * Notes: 0 to create the scoreboard. 1 to remove the scoreboard. 2 to
     * update the display text.
     *
     * @return The current Mode
     */
    int getMode();

    /**
     * Set Mode.
     *
     * @param value - new value.
     */
    void setMode(int value);

    enum HealthDisplay {
        INTEGER, HEARTS
    }

    /**
     * Enum containing all known packet modes.
     *
     * @author dmulloy2
     */
    class Mode extends IntEnum {

        private static Mode INSTANCE = new Mode();

        int ADD_OBJECTIVE = 0;
        int REMOVE_OBJECTIVE = 1;
        int UPDATE_VALUE = 2;

        public static Mode getInstance() {
        	return INSTANCE;
		}
    }
}
