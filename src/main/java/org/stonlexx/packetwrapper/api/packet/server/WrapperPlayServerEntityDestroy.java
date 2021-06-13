package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerEntityDestroy extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.ENTITY_DESTROY;


	/**
	 * Retrieve Count.
	 * <p>
	 * Notes: length of following array
	 * 
	 * @return The current Count
	 */
 int getCount();

	/**
	 * Retrieve Entity IDs.
	 * <p>
	 * Notes: the list of entities of destroy
	 * 
	 * @return The current Entity IDs
	 */
 int[] getEntityIDs();

	/**
	 * Set Entity IDs.
	 * 
	 * @param value - new value.
	 */
 void setEntityIds(int[] value);

}
