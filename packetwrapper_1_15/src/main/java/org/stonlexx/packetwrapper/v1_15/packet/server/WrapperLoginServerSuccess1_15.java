package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperLoginServerSuccess;

import com.comphenix.protocol.wrappers.WrappedGameProfile;

public class WrapperLoginServerSuccess1_15 
        extends MinecraftPacket
        implements WrapperLoginServerSuccess {

	public WrapperLoginServerSuccess1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginServerSuccess1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve the UUID and player name of the connected client.
	 * 
	 * @return The current client profile.
	 */
	public WrappedGameProfile getProfile() {
		return container.getGameProfiles().read(0);
	}

	/**
	 * Set the UUID and player name of the connected client as a game profile.
	 * 
	 * @param value - new profile.
	 */
	public void setProfile(WrappedGameProfile value) {
		container.getGameProfiles().write(0, value);
	}
}
