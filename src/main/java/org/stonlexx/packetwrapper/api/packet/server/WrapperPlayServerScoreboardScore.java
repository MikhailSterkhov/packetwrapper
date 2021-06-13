package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.ScoreboardAction;

public interface WrapperPlayServerScoreboardScore extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.SCOREBOARD_SCORE;


	/**
	 * Retrieve Score name.
	 * <p>
	 * Notes: the name of the score to be updated or removed.
	 * 
	 * @return The current Score name
	 */
 String getScoreName();

	/**
	 * Set Score name.
	 * 
	 * @param value - new value.
	 */
 void setScoreName(String value);

	/**
	 * Retrieve Objective Name.
	 * <p>
	 * Notes: the name of the objective the score belongs to.
	 * 
	 * @return The current Objective Name
	 */
 String getObjectiveName();

	/**
	 * Set Objective Name.
	 * 
	 * @param value - new value.
	 */
 void setObjectiveName(String value);

	/**
	 * Retrieve Value.
	 * <p>
	 * Notes: the score to be displayed next to the entry. Only sent when
	 * Update/Remove does not equal 1.
	 * 
	 * @return The current Value
	 */
 int getValue();

	/**
	 * Set Value.
	 * 
	 * @param value - new value.
	 */
 void setValue(int value);

 ScoreboardAction getAction();

 void setScoreboardAction(ScoreboardAction value);

}
