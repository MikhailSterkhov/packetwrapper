package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientResourcePackStatus;

import com.comphenix.protocol.wrappers.EnumWrappers.ResourcePackStatus;

public class WrapperPlayClientResourcePackStatus1_15 
        extends MinecraftPacket
        implements WrapperPlayClientResourcePackStatus {

	public WrapperPlayClientResourcePackStatus1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientResourcePackStatus1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Result.
	 * <p>
	 * Notes: successfully loaded: 0, Declined: 1, Failed download: 2, Accepted:
	 * 3
	 * 
	 * @return The current Result
	 */
	public ResourcePackStatus getResult() {
		return container.getResourcePackStatus().read(0);
	}

	/**
	 * Set Result.
	 * 
	 * @param value - new value.
	 */
	public void setResult(ResourcePackStatus value) {
		container.getResourcePackStatus().write(0, value);
	}
}
