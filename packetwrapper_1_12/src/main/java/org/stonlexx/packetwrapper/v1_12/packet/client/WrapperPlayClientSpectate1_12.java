package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSpectate;

import java.util.UUID;

public class WrapperPlayClientSpectate1_12 
        extends MinecraftPacket
        implements WrapperPlayClientSpectate {

	public WrapperPlayClientSpectate1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientSpectate1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Target Player.
	 * 
	 * @return The current Target Player
	 */
	public UUID getTargetPlayer() {
		return container.getUUIDs().read(0);
	}

	/**
	 * Set Target Player.
	 * 
	 * @param value - new value.
	 */
	public void setTargetPlayer(UUID value) {
		container.getUUIDs().write(0, value);
	}

}
