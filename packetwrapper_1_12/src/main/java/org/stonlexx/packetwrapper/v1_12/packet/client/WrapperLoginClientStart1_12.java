package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedGameProfile;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperLoginClientStart;

public class WrapperLoginClientStart1_12 
        extends MinecraftPacket
        implements WrapperLoginClientStart {

	public WrapperLoginClientStart1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginClientStart1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Profile.
	 * 
	 * @return The current Profile
	 */
	public WrappedGameProfile getProfile() {
		return container.getGameProfiles().read(0);
	}

	/**
	 * Set Name.
	 * 
	 * @param value - new value.
	 */
	public void setProfile(WrappedGameProfile value) {
		container.getGameProfiles().write(0, value);
	}
}
