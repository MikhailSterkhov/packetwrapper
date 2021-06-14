package org.stonlexx.packetwrapper.v1_15.packet.server;

import org.bukkit.Sound;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerNamedSoundEffect;

import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;

public class WrapperPlayServerNamedSoundEffect1_15 
        extends MinecraftPacket
        implements WrapperPlayServerNamedSoundEffect {

	public WrapperPlayServerNamedSoundEffect1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerNamedSoundEffect1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public Sound getSoundEffect() {
		return container.getSoundEffects().read(0);
	}

	public void setSoundEffect(Sound value) {
		container.getSoundEffects().write(0, value);
	}

	public SoundCategory getSoundCategory() {
		return container.getSoundCategories().read(0);
	}

	public void setSoundCategory(SoundCategory value) {
		container.getSoundCategories().write(0, value);
	}

	/**
	 * Retrieve Effect position X.
	 * <p>
	 * Notes: effect X multiplied by 8
	 * 
	 * @return The current Effect position X
	 */
	public int getEffectPositionX() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Effect position X.
	 * 
	 * @param value - new value.
	 */
	public void setEffectPositionX(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Effect position Y.
	 * <p>
	 * Notes: effect Y multiplied by 8
	 * 
	 * @return The current Effect position Y
	 */
	public int getEffectPositionY() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Effect position Y.
	 * 
	 * @param value - new value.
	 */
	public void setEffectPositionY(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Effect position Z.
	 * <p>
	 * Notes: effect Z multiplied by 8
	 * 
	 * @return The current Effect position Z
	 */
	public int getEffectPositionZ() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set Effect position Z.
	 * 
	 * @param value - new value.
	 */
	public void setEffectPositionZ(int value) {
		container.getIntegers().write(2, value);
	}

	/**
	 * Retrieve Volume.
	 * <p>
	 * Notes: 1 is 100%, can be more
	 * 
	 * @return The current Volume
	 */
	public float getVolume() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Volume.
	 * 
	 * @param value - new value.
	 */
	public void setVolume(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Pitch.
	 * <p>
	 * Notes: 63 is 100%, can be more
	 * 
	 * @return The current Pitch
	 */
	public float getPitch() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Pitch.
	 * 
	 * @param value - new value.
	 */
	public void setPitch(float value) {
		container.getFloat().write(1, value);
	}

}
