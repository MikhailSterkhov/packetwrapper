package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientChat;

public class WrapperPlayClientChat1_12 
        extends MinecraftPacket
        implements WrapperPlayClientChat {

	public WrapperPlayClientChat1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientChat1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Message.
	 * 
	 * @return The current Message
	 */
	public String getMessage() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Message.
	 * 
	 * @param value - new value.
	 */
	public void setMessage(String value) {
		container.getStrings().write(0, value);
	}

}
