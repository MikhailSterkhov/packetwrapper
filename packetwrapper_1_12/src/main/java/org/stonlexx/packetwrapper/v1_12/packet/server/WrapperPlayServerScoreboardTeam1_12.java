package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.ChatColor;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerScoreboardTeam;

import java.util.Collection;
import java.util.List;

public class WrapperPlayServerScoreboardTeam1_12 
        extends MinecraftPacket
        implements WrapperPlayServerScoreboardTeam {

	public WrapperPlayServerScoreboardTeam1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerScoreboardTeam1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Team Name.
	 * <p>
	 * Notes: a unique name for the team. (Shared with scoreboard).
	 * 
	 * @return The current Team Name
	 */
	public String getName() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Team Name.
	 * 
	 * @param value - new value.
	 */
	public void setName(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Team Display Name.
	 * <p>
	 * Notes: only if Mode = 0 or 2.
	 * 
	 * @return The current Team Display Name
	 */
	public WrappedChatComponent getDisplayName() {
		return WrappedChatComponent.fromText(container.getStrings().read(1));
	}

	/**
	 * Set Team Display Name.
	 * 
	 * @param value - new value.
	 */
	public void setDisplayName(WrappedChatComponent value) {
		container.getStrings().write(1, value.toString());
	}

	/**
	 * Retrieve Team Prefix.
	 * <p>
	 * Notes: only if Mode = 0 or 2. Displayed before the players' name that are
	 * part of this team.
	 * 
	 * @return The current Team Prefix
	 */
	public WrappedChatComponent getPrefix() {
		return WrappedChatComponent.fromText(container.getStrings().read(2));
	}

	/**
	 * Set Team Prefix.
	 * 
	 * @param value - new value.
	 */
	public void setPrefix(WrappedChatComponent value) {
		container.getStrings().write(2, value.toString());
	}

	/**
	 * Retrieve Team Suffix.
	 * <p>
	 * Notes: only if Mode = 0 or 2. Displayed after the players' name that are
	 * part of this team.
	 * 
	 * @return The current Team Suffix
	 */
	public WrappedChatComponent getSuffix() {
		return WrappedChatComponent.fromText(container.getStrings().read(3));
	}

	/**
	 * Set Team Suffix.
	 * 
	 * @param value - new value.
	 */
	public void setSuffix(WrappedChatComponent value) {
		container.getStrings().write(3, value.toString());
	}

	/**
	 * Retrieve Name Tag Visibility.
	 * <p>
	 * Notes: only if Mode = 0 or 2. always, hideForOtherTeams, hideForOwnTeam,
	 * never.
	 * 
	 * @return The current Name Tag Visibility
	 */
	public String getNameTagVisibility() {
		return container.getStrings().read(4);
	}

	/**
	 * Set Name Tag Visibility.
	 * 
	 * @param value - new value.
	 */
	public void setNameTagVisibility(String value) {
		container.getStrings().write(4, value);
	}

	/**
	 * Retrieve Color.
	 * <p>
	 * Notes: only if Mode = 0 or 2. Same as Chat colors.
	 * 
	 * @return The current Color
	 */
	public ChatColor getColor() {
		return ChatColor.values()[container.getIntegers().read(0)];
	}

	/**
	 * Set Color.
	 * 
	 * @param chatColor - new value.
	 */
	public void setColor(ChatColor chatColor) {
		container.getIntegers().write(0, chatColor.ordinal());
	}

	/**
	 * Get the collision rule.
	 * Notes: only if Mode = 0 or 2. always, pushOtherTeams, pushOwnTeam, never.
	 * @return The current collision rule
	 */
	public String getCollisionRule() {
		return container.getStrings().read(5);
	}

	/**
	 * Sets the collision rule.
	 * @param value - new value.
	 */
	public void setCollisionRule(String value) {
		container.getStrings().write(5, value);
	}

	/**
	 * Retrieve Players.
	 * <p>
	 * Notes: only if Mode = 0 or 3 or 4. Players to be added/remove from the
	 * team. Max 40 characters so may be uuid's later
	 * 
	 * @return The current Players
	 */
	@SuppressWarnings("unchecked")
	public List<String> getPlayers() {
		return (List<String>) container.getSpecificModifier(Collection.class)
				.read(0);
	}

	/**
	 * Set Players.
	 * 
	 * @param value - new value.
	 */
	public void setPlayers(List<String> value) {
		container.getSpecificModifier(Collection.class).write(0, value);
	}

	/**
	 * Retrieve Mode.
	 * <p>
	 * Notes: if 0 then the team is created. If 1 then the team is removed. If 2
	 * the team team information is updated. If 3 then new players are added to
	 * the team. If 4 then players are removed from the team.
	 * 
	 * @return The current Mode
	 */
	public int getMode() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Mode.
	 * 
	 * @param value - new value.
	 */
	public void setMode(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve pack option data. Pack data is calculated as follows:
	 * 
	 * <pre>
	 * <code>
	 * int data = 0;
	 * if (team.allowFriendlyFire()) {
	 *     data |= 1;
	 * }
	 * if (team.canSeeFriendlyInvisibles()) {
	 *     data |= 2;
	 * }
	 * </code>
	 * </pre>
	 * 
	 * @return The current pack option data
	 */
	public int getPackOptionData() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set pack option data.
	 * 
	 * @param value - new value
	 * @see #getPackOptionData()
	 */
	public void setPackOptionData(int value) {
		container.getIntegers().write(2, value);
	}
}
