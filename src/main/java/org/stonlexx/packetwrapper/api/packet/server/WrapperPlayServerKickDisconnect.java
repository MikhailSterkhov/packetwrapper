package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public interface WrapperPlayServerKickDisconnect extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.KICK_DISCONNECT;


	/**
	 * Retrieve Reason.
	 * <p>
	 * Notes: displayed to the client when the connection terminates. Must be
	 * valid JSON.
	 * 
	 * @return The current Reason
	 */
 WrappedChatComponent getReason();

	/**
	 * Set Reason.
	 * 
	 * @param value - new value.
	 */
 void setReason(WrappedChatComponent value);

}
