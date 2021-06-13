package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientKeepAlive extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.KEEP_ALIVE;


	/**
	 * Retrieve Keep Alive ID.
	 * 
	 * @return The current Keep Alive ID
	 */
 long getKeepAliveId();

	/**
	 * Set Keep Alive ID.
	 * 
	 * @param value - new value.
	 */
 void setKeepAliveId(long value);

}
