package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.utility.MinecraftReflection;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerLookAt;

public class WrapperPlayServerLookAt1_15 
        extends MinecraftPacket
        implements WrapperPlayServerLookAt {

	public WrapperPlayServerLookAt1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerLookAt1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Feet/eyes.
	 * <p>
	 * Notes: values are feet=0, eyes=1. If set to eyes, aims using the head position; otherwise aims using the feet position.
	 * @return The current Feet/eyes
	 */
	public Anchor getAnchor() {
		return container.getEnumModifier(Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor"))
		             .readSafely(0);
	}

	/**
	 * Set Feet/eyes.
	 * @param value - new value.
	 */
	public void setAnchor(Anchor value) {
		container.getEnumModifier(Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor"))
		      .writeSafely(0, value);
	}

	/**
	 * Retrieve Target x.
	 * <p>
	 * Notes: x coordinate of the point to face towards
	 * @return The current Target x
	 */
	public double getTargetX() {
		return container.getDoubles().read(0);
	}

	/**
	 * Set Target x.
	 * @param value - new value.
	 */
	public void setTargetX(double value) {
		container.getDoubles().write(0, value);
	}

	/**
	 * Retrieve Target y.
	 * <p>
	 * Notes: y coordinate of the point to face towards
	 * @return The current Target y
	 */
	public double getTargetY() {
		return container.getDoubles().read(1);
	}

	/**
	 * Set Target y.
	 * @param value - new value.
	 */
	public void setTargetY(double value) {
		container.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Target z.
	 * <p>
	 * Notes: z coordinate of the point to face towards
	 * @return The current Target z
	 */
	public double getTargetZ() {
		return container.getDoubles().read(2);
	}

	/**
	 * Set Target z.
	 * @param value - new value.
	 */
	public void setTargetZ(double value) {
		container.getDoubles().write(2, value);
	}

	/**
	 * Retrieve Is entity.
	 * <p>
	 * Notes: if true, additional information about an entity is provided.
	 * @return The current Is entity
	 */
	public boolean getIsEntity() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Is entity.
	 * @param value - new value.
	 */
	public void setIsEntity(boolean value) {
		container.getBooleans().write(0, value);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: only if is entity is true — the entity to face towards
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity involved in this event.
	 * @param world - the current world of the entity.
	 * @return The involved entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(6);
	}

	/**
	 * Retrieve the entity involved in this event.
	 * @param event - the packet event.
	 * @return The involved entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Retrieve Entity feet/eyes.
	 * <p>
	 * Notes: whether to look at the entity's eyes or feet. Same values and meanings as before, just for the entity's head/feet.
	 * @return The current Entity feet/eyes
	 */
	public Anchor getEntityAnchor() {
		return container.getEnumModifier(Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor"))
		             .readSafely(1);
	}

	/**
	 * Set Entity feet/eyes.
	 * @param value - new value.
	 */
	public void setEntityAnchor(Anchor value) {
		container.getEnumModifier(Anchor.class, MinecraftReflection.getMinecraftClass("ArgumentAnchor$Anchor"))
		      .writeSafely(1, value);
	}

}
