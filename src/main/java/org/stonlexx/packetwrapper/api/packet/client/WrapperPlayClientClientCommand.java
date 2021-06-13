package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.ClientCommand;

public interface WrapperPlayClientClientCommand extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.CLIENT_COMMAND;


	/**
	 * Retrieve Action ID.
	 * <p>
	 * Notes: see below
	 * 
	 * @return The current Action ID
	 */
 ClientCommand getAction();

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
 void setAction(ClientCommand value);

}
