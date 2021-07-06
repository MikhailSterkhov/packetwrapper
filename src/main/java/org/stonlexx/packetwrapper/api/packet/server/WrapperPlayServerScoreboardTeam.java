package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.reflect.IntEnum;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.ChatColor;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerScoreboardTeam extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.SCOREBOARD_TEAM;

    /**
     * Retrieve Team Name.
     * <p>
     * Notes: a unique name for the team. (Shared with scoreboard).
     *
     * @return The current Team Name
     */
    String getName();

    /**
     * Set Team Name.
     *
     * @param value - new value.
     */
    void setName(String value);

    /**
     * Retrieve Team Display Name.
     * <p>
     * Notes: only if Mode = 0 or 2.
     *
     * @return The current Team Display Name
     */
    String getDisplayName();

    /**
     * Set Team Display Name.
     *
     * @param value - new value.
     */
    void setDisplayName(String value);

    /**
     * Retrieve Team Prefix.
     * <p>
     * Notes: only if Mode = 0 or 2. Displayed before the players' name that are
     * part of this team.
     *
     * @return The current Team Prefix
     */
    WrappedChatComponent getPrefix();

    /**
     * Set Team Prefix.
     *
     * @param value - new value.
     */
    void setPrefix(WrappedChatComponent value);

    /**
     * Retrieve Team Suffix.
     * <p>
     * Notes: only if Mode = 0 or 2. Displayed after the players' name that are
     * part of this team.
     *
     * @return The current Team Suffix
     */
    WrappedChatComponent getSuffix();

    /**
     * Set Team Suffix.
     *
     * @param value - new value.
     */
    void setSuffix(WrappedChatComponent value);

    /**
     * Retrieve Name Tag Visibility.
     * <p>
     * Notes: only if Mode = 0 or 2. always, hideForOtherTeams, hideForOwnTeam,
     * never.
     *
     * @return The current Name Tag Visibility
     */
    String getNameTagVisibility();

    /**
     * Set Name Tag Visibility.
     *
     * @param value - new value.
     */
    void setNameTagVisibility(String value);

    /**
     * Retrieve Color.
     * <p>
     * Notes: only if Mode = 0 or 2. Same as Chat colors.
     *
     * @return The current Color
     */
    ChatColor getColor();

    /**
     * Set Color.
     *
     * @param value - new value.
     */
    void setColor(ChatColor value);

    /**
     * Get the collision rule.
     * Notes: only if Mode = 0 or 2. always, pushOtherTeams, pushOwnTeam, never.
     *
     * @return The current collision rule
     */
    String getCollisionRule();

    /**
     * Sets the collision rule.
     *
     * @param value - new value.
     */
    void setCollisionRule(String value);

    /**
     * Retrieve Players.
     * <p>
     * Notes: only if Mode = 0 or 3 or 4. Players to be added/remove from the
     * team. Max 40 characters so may be uuid's later
     *
     * @return The current Players
     */
    List<String> getPlayers();

    /**
     * Set Players.
     *
     * @param value - new value.
     */
    void setPlayers(List<String> value);

    /**
     * Retrieve Mode.
     * <p>
     * Notes: if 0 then the team is created. If 1 then the team is removed. If 2
     * the team team information is updated. If 3 then new players are added to
     * the team. If 4 then players are removed from the team.
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

    /**
     * Retrieve pack option data. Pack data is calculated as follows:
     *
     * <pre>
     * <code>
     * int data = 0;
     * if (team.allowFriendlyFire());
     * if (team.canSeeFriendlyInvisibles());
     * </code>
     * </pre>
     *
     * @return The current pack option data
     */
    int getPackOptionData();

    /**
     * Set pack option data.
     *
     * @param value - new value
     * @see #getPackOptionData()
     */
    void setPackOptionData(int value);

    /**
     * Enum containing all known modes.
     *
     * @author dmulloy2
     */
    class Mode extends IntEnum {
        public static final int TEAM_CREATED = 0;
        public static final int TEAM_REMOVED = 1;
        public static final int TEAM_UPDATED = 2;
        public static final int PLAYERS_ADDED = 3;
        public static final int PLAYERS_REMOVED = 4;

        private static Mode INSTANCE = new Mode();

        public static Mode getInstance() {
            return INSTANCE;
        }
    }
}
