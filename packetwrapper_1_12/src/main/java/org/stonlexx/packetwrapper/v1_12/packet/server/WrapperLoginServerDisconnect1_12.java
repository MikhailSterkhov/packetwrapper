package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperLoginServerDisconnect;

public class WrapperLoginServerDisconnect1_12 
        extends MinecraftPacket
        implements WrapperLoginServerDisconnect {

	public WrapperLoginServerDisconnect1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginServerDisconnect1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve reason.
	 * 
	 * @return The current reason
	 */
	public WrappedChatComponent getReason() {
		return container.getChatComponents().read(0);
	}

	@Deprecated
	public WrappedChatComponent getJsonData() {
		return getReason();
	}

	/**
	 * Set reason.
	 * 
	 * @param value - new value.
	 */
	public void setReason(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	@Deprecated
	public void setJsonData(WrappedChatComponent value) {
		setReason(value);
	}
}
