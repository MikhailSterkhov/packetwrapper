package org.stonlexx.packetwrapper.v1_15.packet.client;

import java.util.UUID;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSpectate;


public class WrapperPlayClientSpectate1_15 
        extends MinecraftPacket
        implements WrapperPlayClientSpectate {

	public WrapperPlayClientSpectate1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientSpectate1_15(PacketContainer packet) {
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
