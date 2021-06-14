package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerPlayerListHeaderFooter;

import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerPlayerListHeaderFooter1_15 
        extends MinecraftPacket
        implements WrapperPlayServerPlayerListHeaderFooter {

	public WrapperPlayServerPlayerListHeaderFooter1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerPlayerListHeaderFooter1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Header.
	 * 
	 * @return The current Header
	 */
	public WrappedChatComponent getHeader() {
		return container.getChatComponents().read(0);
	}

	/**
	 * Set Header.
	 * 
	 * @param value - new value.
	 */
	public void setHeader(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	/**
	 * Retrieve Footer.
	 * 
	 * @return The current Footer
	 */
	public WrappedChatComponent getFooter() {
		return container.getChatComponents().read(1);
	}

	/**
	 * Set Footer.
	 * 
	 * @param value - new value.
	 */
	public void setFooter(WrappedChatComponent value) {
		container.getChatComponents().write(1, value);
	}

}
