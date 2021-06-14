package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientTeleportAccept;


public class WrapperPlayClientTeleportAccept1_15 
        extends MinecraftPacket
        implements WrapperPlayClientTeleportAccept {

	public WrapperPlayClientTeleportAccept1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientTeleportAccept1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Teleport ID.
	 * <p>
	 * Notes: the ID given by the Player Position And Look packet
	 * 
	 * @return The current Teleport ID
	 */
	public int getTeleportId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Teleport ID.
	 * 
	 * @param value - new value.
	 */
	public void setTeleportId(int value) {
		container.getIntegers().write(0, value);
	}

}
