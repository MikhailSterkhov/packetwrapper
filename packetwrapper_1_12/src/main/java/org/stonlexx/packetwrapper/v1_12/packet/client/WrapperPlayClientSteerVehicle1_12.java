package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSteerVehicle;

public class WrapperPlayClientSteerVehicle1_12 
        extends MinecraftPacket
        implements WrapperPlayClientSteerVehicle {

	public WrapperPlayClientSteerVehicle1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientSteerVehicle1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Sideways.
	 * <p>
	 * Notes: positive to the left of the player
	 * 
	 * @return The current Sideways
	 */
	public float getSideways() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Sideways.
	 * 
	 * @param value - new value.
	 */
	public void setSideways(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Forward.
	 * <p>
	 * Notes: positive forward
	 * 
	 * @return The current Forward
	 */
	public float getForward() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Forward.
	 * 
	 * @param value - new value.
	 */
	public void setForward(float value) {
		container.getFloat().write(1, value);
	}

	public boolean isJump() {
		return container.getBooleans().read(0);
	}

	public void setJump(boolean value) {
		container.getBooleans().write(0, value);
	}

	public boolean isUnmount() {
		return container.getBooleans().read(1);
	}

	public void setUnmount(boolean value) {
		container.getBooleans().write(1, value);
	}

}
