package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerScoreboardObjective;

public class WrapperPlayServerScoreboardObjective1_12 
        extends MinecraftPacket
        implements WrapperPlayServerScoreboardObjective {

	public WrapperPlayServerScoreboardObjective1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerScoreboardObjective1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Objective name.
	 * <p>
	 * Notes: an unique name for the objective
	 * 
	 * @return The current Objective name
	 */
	public String getName() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Objective name.
	 * 
	 * @param value - new value.
	 */
	public void setName(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Objective DisplayName.
	 * <p>
	 * Notes: only if mode is 0 or 2. The text to be displayed for the score.
	 * 
	 * @return The current Objective value
	 */
	public WrappedChatComponent getDisplayName() {
		return WrappedChatComponent.fromText(container.getStrings().read(1));
	}

	/**
	 * Set Objective DisplayName.
	 * 
	 * @param value - new value.
	 */
	public void setDisplayName(WrappedChatComponent value) {
		container.getStrings().write(1, value.toString());
	}

	/**
	 * Retrieve health display.
	 * <p>
	 * Notes: Can be either INTEGER or HEARTS
	 * 
	 * @return the current health display value
	 */
	public HealthDisplay getHealthDisplay() {
		return container.getEnumModifier(HealthDisplay.class, 2).read(0);
	}

	/**
	 * Set health display.
	 * 
	 * @param value - value
	 * @see #getHealthDisplay()
	 */
	public void setHealthDisplay(HealthDisplay value) {
		container.getEnumModifier(HealthDisplay.class, 2).write(0, value);
	}

	/**
	 * Retrieve Mode.
	 * <p>
	 * Notes: 0 to create the scoreboard. 1 to remove the scoreboard. 2 to
	 * update the display text.
	 * 
	 * @return The current Mode
	 */
	public int getMode() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Mode.
	 * 
	 * @param value - new value.
	 */
	public void setMode(int value) {
		container.getIntegers().write(0, value);
	}

}
