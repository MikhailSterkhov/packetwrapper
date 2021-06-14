package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerKickDisconnect;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerKickDisconnect1_12 
        extends MinecraftPacket
        implements WrapperPlayServerKickDisconnect {

	public WrapperPlayServerKickDisconnect1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerKickDisconnect1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Reason.
	 * <p>
	 * Notes: displayed to the client when the connection terminates. Must be
	 * valid JSON.
	 * 
	 * @return The current Reason
	 */
	public WrappedChatComponent getReason() {
		return container.getChatComponents().read(0);
	}

	/**
	 * Set Reason.
	 * 
	 * @param value - new value.
	 */
	public void setReason(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

}
