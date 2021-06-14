package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntityEffect;

public class WrapperPlayServerEntityEffect1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntityEffect {

	public WrapperPlayServerEntityEffect1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerEntityEffect1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Retrieve Effect ID.
	 * <p>
	 * Notes: see [[1]]
	 * 
	 * @return The current Effect ID
	 */
	public byte getEffectID() {
		return container.getBytes().read(0);
	}

	/**
	 * Set Effect ID.
	 * 
	 * @param value - new value.
	 */
	public void setEffectID(byte value) {
		container.getBytes().write(0, (byte) (value & 255));
	}

	/**
	 * Retrieve Amplifier.
	 * 
	 * @return The current Amplifier
	 */
	public byte getAmplifier() {
		return container.getBytes().read(1);
	}

	/**
	 * Set Amplifier.
	 * 
	 * @param value - new value.
	 */
	public void setAmplifier(byte value) {
		container.getBytes().write(1, (byte) (value & 255));
	}

	/**
	 * Retrieve Duration.
	 * 
	 * @return The current Duration
	 */
	public int getDuration() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Duration.
	 * 
	 * @param value - new value.
	 */
	public void setDuration(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Hide Particles.
	 * 
	 * @return The current Hide Particles
	 */
	public boolean getHideParticles() {
		return container.getBytes().read(2) == 0;
	}

	/**
	 * Set Hide Particles.
	 * 
	 * @param value - new value.
	 */
	public void setHideParticles(boolean value) {
		container.getBytes().write(2, (byte) (value ? 0 : 1));
	}

}
