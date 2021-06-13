package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerLookAt extends WrapperPacket {

	PacketType TYPE = PacketType.Play.Server.LOOK_AT;


	/**
	 * Retrieve Feet/eyes.
	 * <p>
	 * Notes: values are feet=0, eyes=1. If set to eyes, aims using the head position; otherwise aims using the feet position.
	 * @return The current Feet/eyes
	 */
	Anchor getAnchor();

	/**
	 * Set Feet/eyes.
	 * @param value - new value.
	 */
	void setAnchor(Anchor value);

	/**
	 * Retrieve Target x.
	 * <p>
	 * Notes: x coordinate of the point to face towards
	 * @return The current Target x
	 */
	double getTargetX();

	/**
	 * Set Target x.
	 * @param value - new value.
	 */
	void setTargetX(double value);

	/**
	 * Retrieve Target y.
	 * <p>
	 * Notes: y coordinate of the point to face towards
	 * @return The current Target y
	 */
	double getTargetY();

	/**
	 * Set Target y.
	 * @param value - new value.
	 */
	void setTargetY(double value);

	/**
	 * Retrieve Target z.
	 * <p>
	 * Notes: z coordinate of the point to face towards
	 * @return The current Target z
	 */
	double getTargetZ();

	/**
	 * Set Target z.
	 * @param value - new value.
	 */
	void setTargetZ(double value);

	/**
	 * Retrieve Is entity.
	 * <p>
	 * Notes: if true, additional information about an entity is provided.
	 * @return The current Is entity
	 */
	boolean getIsEntity();

	/**
	 * Set Is entity.
	 * @param value - new value.
	 */
	void setIsEntity(boolean value);

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: only if is entity is true — the entity to face towards
	 * @return The current Entity ID
	 */
	int getEntityID();

	/**
	 * Set Entity ID.
	 * @param value - new value.
	 */
	void setEntityID(int value);

	/**
	 * Retrieve the entity involved in this event.
	 * @param world - the current world of the entity.
	 * @return The involved entity.
	 */
	Entity getEntity(World world);

	/**
	 * Retrieve the entity involved in this event.
	 * @param event - the packet event.
	 * @return The involved entity.
	 */
	Entity getEntity(PacketEvent event);

	/**
	 * Retrieve Entity feet/eyes.
	 * <p>
	 * Notes: whether to look at the entity's eyes or feet. Same values and meanings as before, just for the entity's head/feet.
	 * @return The current Entity feet/eyes
	 */
	Anchor getEntityAnchor();

	/**
	 * Set Entity feet/eyes.
	 * @param value - new value.
	 */
	void setEntityAnchor(Anchor value);

	enum Anchor {
		FEET,
		EYES
	}
}
