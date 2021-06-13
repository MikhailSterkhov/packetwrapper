package org.stonlexx.packetwrapper.api.packet.server;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;

public interface WrapperPlayServerEntityTeleport extends WrapperPacket {
 PacketType TYPE =
			PacketType.Play.Server.ENTITY_TELEPORT;


	/**
	 * Retrieve entity ID.
	 * 
	 * @return The current EID
	 */
 int getEntityID();

	/**
	 * Set entity ID.
	 * 
	 * @param value - new value.
	 */
 void setEntityID(int value);

	/**
	 * Retrieve the entity.
	 * 
	 * @param world - the current world of the entity.
	 * @return The entity.
	 */
 Entity getEntity(World world);

	/**
	 * Retrieve the entity.
	 * 
	 * @param event - the packet event.
	 * @return The entity.
	 */
 Entity getEntity(PacketEvent event);

 double getX();

 void setX(double value);

 double getY();

 void setY(double value);

 double getZ();

 void setZ(double value);

	/**
	 * Retrieve the yaw of the current entity.
	 * 
	 * @return The current Yaw
	 */
 float getYaw();

	/**
	 * Set the yaw of the current entity.
	 * 
	 * @param value - new yaw.
	 */
 void setYaw(float value);

	/**
	 * Retrieve the pitch of the current entity.
	 * 
	 * @return The current pitch
	 */
 float getPitch();

	/**
	 * Set the pitch of the current entity.
	 * 
	 * @param value - new pitch.
	 */
 void setPitch(float value);

 boolean getOnGround();

 void setOnGround(boolean value);
}