package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerExperience;

public class WrapperPlayServerExperience1_12 
        extends MinecraftPacket
        implements WrapperPlayServerExperience {

	public WrapperPlayServerExperience1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerExperience1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Experience bar.
	 * <p>
	 * Notes: between 0 and 1
	 * 
	 * @return The current Experience bar
	 */
	public float getExperienceBar() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Experience bar.
	 * 
	 * @param value - new value.
	 */
	public void setExperienceBar(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Level.
	 * 
	 * @return The current Level
	 */
	public int getLevel() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Level.
	 * 
	 * @param value - new value.
	 */
	public void setLevel(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Total Experience.
	 * 
	 * @return The current Total Experience
	 */
	public int getTotalExperience() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Total Experience.
	 * 
	 * @param value - new value.
	 */
	public void setTotalExperience(int value) {
		container.getIntegers().write(0, value);
	}

}
