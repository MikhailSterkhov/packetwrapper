package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerUpdateHealth;

public class WrapperPlayServerUpdateHealth1_12 
        extends MinecraftPacket
        implements WrapperPlayServerUpdateHealth {

	public WrapperPlayServerUpdateHealth1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerUpdateHealth1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Health.
	 * <p>
	 * Notes: 0 or less = dead, 20 = full HP
	 * 
	 * @return The current Health
	 */
	public float getHealth() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Health.
	 * 
	 * @param value - new value.
	 */
	public void setHealth(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Food.
	 * <p>
	 * Notes: 0 - 20
	 * 
	 * @return The current Food
	 */
	public int getFood() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Food.
	 * 
	 * @param value - new value.
	 */
	public void setFood(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Food Saturation.
	 * <p>
	 * Notes: seems to vary from 0.0 to 5.0 in integer increments
	 * 
	 * @return The current Food Saturation
	 */
	public float getFoodSaturation() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Food Saturation.
	 * 
	 * @param value - new value.
	 */
	public void setFoodSaturation(float value) {
		container.getFloat().write(1, value);
	}

}
