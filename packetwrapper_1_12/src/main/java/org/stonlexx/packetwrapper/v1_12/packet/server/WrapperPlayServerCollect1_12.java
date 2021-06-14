package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCollect;

public class WrapperPlayServerCollect1_12 
        extends MinecraftPacket
        implements WrapperPlayServerCollect {

	public WrapperPlayServerCollect1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCollect1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Collected Entity ID.
	 * 
	 * @return The current Collected Entity ID
	 */
	public int getCollectedEntityId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Collected Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setCollectedEntityId(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Collector Entity ID.
	 * 
	 * @return The current Collector Entity ID
	 */
	public int getCollectorEntityId() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Collector Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setCollectorEntityId(int value) {
		container.getIntegers().write(1, value);
	}

}
