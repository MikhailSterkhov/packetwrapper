package org.stonlexx.packetwrapper.api.packet.server;

import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedWatchableObject;

public interface WrapperPlayServerEntityMetadata extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.ENTITY_METADATA;


	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
 int getEntityID();

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
 void setEntityID(int value);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
 Entity getEntity(World world);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
 Entity getEntity(PacketEvent event);

	/**
	 * Retrieve Metadata.
	 * 
	 * @return The current Metadata
	 */
 List<WrappedWatchableObject> getMetadata();

	/**
	 * Set Metadata.
	 * 
	 * @param value - new value.
	 */
 void setMetadata(List<WrappedWatchableObject> value);
}
