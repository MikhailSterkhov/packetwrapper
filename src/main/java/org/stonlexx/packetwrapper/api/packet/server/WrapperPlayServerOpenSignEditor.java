package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.BlockPosition;

public interface WrapperPlayServerOpenSignEditor extends WrapperPacket {

 PacketType TYPE =
			PacketType.Play.Server.OPEN_SIGN_EDITOR;


	/**
	 * Retrieve Location.
	 * 
	 * @return The current Location
	 */
 BlockPosition getLocation();

	/**
	 * Set Location.
	 * 
	 * @param value - new value.
	 */
 void setLocation(BlockPosition value);

}
