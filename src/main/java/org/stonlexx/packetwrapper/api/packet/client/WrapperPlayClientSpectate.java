package org.stonlexx.packetwrapper.api.packet.client;

import java.util.UUID;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientSpectate extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.SPECTATE;


	/**
	 * Retrieve Target Player.
	 * 
	 * @return The current Target Player
	 */
 UUID getTargetPlayer();

	/**
	 * Set Target Player.
	 * 
	 * @param value - new value.
	 */
 void setTargetPlayer(UUID value);

}
