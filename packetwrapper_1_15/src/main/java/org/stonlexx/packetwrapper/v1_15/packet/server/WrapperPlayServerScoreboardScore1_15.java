package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerScoreboardScore;

import com.comphenix.protocol.wrappers.EnumWrappers.ScoreboardAction;

public class WrapperPlayServerScoreboardScore1_15 
        extends MinecraftPacket
        implements WrapperPlayServerScoreboardScore {

	public WrapperPlayServerScoreboardScore1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerScoreboardScore1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Score name.
	 * <p>
	 * Notes: the name of the score to be updated or removed.
	 * 
	 * @return The current Score name
	 */
	public String getScoreName() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Score name.
	 * 
	 * @param value - new value.
	 */
	public void setScoreName(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Objective Name.
	 * <p>
	 * Notes: the name of the objective the score belongs to.
	 * 
	 * @return The current Objective Name
	 */
	public String getObjectiveName() {
		return container.getStrings().read(1);
	}

	/**
	 * Set Objective Name.
	 * 
	 * @param value - new value.
	 */
	public void setObjectiveName(String value) {
		container.getStrings().write(1, value);
	}

	/**
	 * Retrieve Value.
	 * <p>
	 * Notes: the score to be displayed next to the entry. Only sent when
	 * Update/Remove does not equal 1.
	 * 
	 * @return The current Value
	 */
	public int getValue() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Value.
	 * 
	 * @param value - new value.
	 */
	public void setValue(int value) {
		container.getIntegers().write(0, value);
	}

	public ScoreboardAction getAction() {
		return container.getScoreboardActions().read(0);
	}

	public void setScoreboardAction(ScoreboardAction value) {
		container.getScoreboardActions().write(0, value);
	}

}
