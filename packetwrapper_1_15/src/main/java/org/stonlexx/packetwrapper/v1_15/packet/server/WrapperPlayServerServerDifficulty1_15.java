package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerServerDifficulty;

import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;

public class WrapperPlayServerServerDifficulty1_15 
        extends MinecraftPacket
        implements WrapperPlayServerServerDifficulty {

	public WrapperPlayServerServerDifficulty1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerServerDifficulty1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Difficulty.
	 * <p>
	 * Notes: 0:PEACEFUL, 1:EASY, 2:NORMAL, 3: HARD
	 * 
	 * @return The current Difficulty
	 */
	public Difficulty getDifficulty() {
		return container.getDifficulties().read(0);
	}

	/**
	 * Set Difficulty.
	 * 
	 * @param value - new value.
	 */
	public void setDifficulty(Difficulty value) {
		container.getDifficulties().write(0, value);
	}

}
