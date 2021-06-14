package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerGameStateChange;


public class WrapperPlayServerGameStateChange1_15 
        extends MinecraftPacket
        implements WrapperPlayServerGameStateChange {

	public WrapperPlayServerGameStateChange1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerGameStateChange1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Reason.
	 * 
	 * @return The current Reason
	 */
	public int getReason() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Reason.
	 * 
	 * @param value - new value.
	 */
	public void setReason(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Value.
	 * <p>
	 * Notes: depends on reason
	 * 
	 * @return The current Value
	 */
	public float getValue() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Value.
	 * 
	 * @param value - new value.
	 */
	public void setValue(float value) {
		container.getFloat().write(0, value);
	}

}
