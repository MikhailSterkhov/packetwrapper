package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientTeleportAccept extends WrapperPacket {

 PacketType TYPE =
			PacketType.Play.Client.TELEPORT_ACCEPT;


	/**
	 * Retrieve Teleport ID.
	 * <p>
	 * Notes: the ID given by the Player Position And Look packet
	 * 
	 * @return The current Teleport ID
	 */
 int getTeleportId();

	/**
	 * Set Teleport ID.
	 * 
	 * @param value - new value.
	 */
 void setTeleportId(int value);

}
