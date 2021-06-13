package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientChat extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.CHAT;


	/**
	 * Retrieve Message.
	 * 
	 * @return The current Message
	 */
 String getMessage();

	/**
	 * Set Message.
	 * 
	 * @param value - new value.
	 */
 void setMessage(String value);

}
