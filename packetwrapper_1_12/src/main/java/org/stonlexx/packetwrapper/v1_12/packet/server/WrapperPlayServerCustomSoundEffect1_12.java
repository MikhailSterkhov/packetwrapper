package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCustomSoundEffect;

public class WrapperPlayServerCustomSoundEffect1_12 
        extends MinecraftPacket
        implements WrapperPlayServerCustomSoundEffect {


	public WrapperPlayServerCustomSoundEffect1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCustomSoundEffect1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Sound Name.
	 * <p>
	 * Notes: all known sound effect names can be seen here.
	 * 
	 * @return The current Sound Name
	 */
	public MinecraftKey getSoundName() {
		return MinecraftKey.fromHandle(container.getStrings().read(0));
	}

	/**
	 * Set Sound Name.
	 * 
	 * @param value - new value.
	 */
	public void setSoundName(MinecraftKey value) {
		container.getStrings().write(0, value.getFullKey());
	}

	/**
	 * Retrieve Sound Category.
	 * <p>
	 * Notes: the category that this sound will be played from (current
	 * categories)
	 * 
	 * @return The current Sound Category
	 */
	public SoundCategory getSoundCategory() {
		return container.getSoundCategories().read(0);
	}

	/**
	 * Set Sound Category.
	 * 
	 * @param value - new value.
	 */
	public void setSoundCategory(SoundCategory value) {
		container.getSoundCategories().write(0, value);
	}

	/**
	 * Retrieve Effect Position X.
	 * <p>
	 * Notes: effect X multiplied by 8 (fixed-point number with only 3 bits
	 * dedicated to the fractional part)
	 * 
	 * @return The current Effect Position X
	 */
	public int getX() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Effect Position X.
	 * 
	 * @param value - new value.
	 */
	public void setX(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Effect Position Y.
	 * <p>
	 * Notes: effect Y multiplied by 8 (fixed-point number with only 3 bits
	 * dedicated to the fractional part)
	 * 
	 * @return The current Effect Position Y
	 */
	public int getY() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Effect Position Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Effect Position Z.
	 * <p>
	 * Notes: effect Z multiplied by 8 (fixed-point number with only 3 bits
	 * dedicated to the fractional part)
	 * 
	 * @return The current Effect Position Z
	 */
	public int getZ() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set Effect Position Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(int value) {
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
