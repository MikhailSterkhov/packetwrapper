package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerScoreboardDisplayObjective;


public class WrapperPlayServerScoreboardDisplayObjective1_15 
        extends MinecraftPacket
        implements WrapperPlayServerScoreboardDisplayObjective {

	public WrapperPlayServerScoreboardDisplayObjective1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerScoreboardDisplayObjective1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Position.
	 * <p>
	 * Notes: the position of the scoreboard. 0 = list, 1 = sidebar, 2 =
	 * belowName.
	 * 
	 * @return The current Position
	 */
	public int getPosition() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Position.
	 * 
	 * @param value - new value.
	 */
	public void setPosition(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Score Name.
	 * <p>
	 * Notes: the unique name for the scoreboard to be displayed.
	 * 
	 * @return The current Score Name
	 */
	public String getScoreName() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Score Name.
	 * 
	 * @param value - new value.
	 */
	public void setScoreName(String value) {
		container.getStrings().write(0, value);
	}

}
