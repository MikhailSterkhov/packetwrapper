package org.stonlexx.packetwrapper.api.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;

public interface WrapperPlayServerEntityHeadRotation extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.ENTITY_HEAD_ROTATION;


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
	 * Retrieve Head Yaw.
	 * <p>
	 * Notes: head yaw in steps of 2p/256
	 * 
	 * @return The current Head Yaw
	 */
 byte getHeadYaw();

	/**
	 * Set Head Yaw.
	 * 
	 * @param value - new value.
	 */
 void setHeadYaw(byte value);
}
