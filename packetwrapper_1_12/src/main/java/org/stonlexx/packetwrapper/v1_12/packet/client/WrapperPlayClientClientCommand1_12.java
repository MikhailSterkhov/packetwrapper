package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ClientCommand;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientClientCommand;

public class WrapperPlayClientClientCommand1_12 
        extends MinecraftPacket
        implements WrapperPlayClientClientCommand {

	public WrapperPlayClientClientCommand1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientClientCommand1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Action ID.
	 * <p>
	 * Notes: see below
	 * 
	 * @return The current Action ID
	 */
	public ClientCommand getAction() {
		return container.getClientCommands().read(0);
	}

	/**
	 * Set Action ID.
	 * 
	 * @param value - new value.
	 */
	public void setAction(ClientCommand value) {
		container.getClientCommands().write(0, value);
	}

}
