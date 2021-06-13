package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;

public interface WrapperPlayServerServerDifficulty extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.SERVER_DIFFICULTY;


	/**
	 * Retrieve Difficulty.
	 * <p>
	 * Notes: 0:PEACEFUL, 1:EASY, 2:NORMAL, 3: HARD
	 * 
	 * @return The current Difficulty
	 */
 Difficulty getDifficulty();

	/**
	 * Set Difficulty.
	 * 
	 * @param value - new value.
	 */
 void setDifficulty(Difficulty value);

}
