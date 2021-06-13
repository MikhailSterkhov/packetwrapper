package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedGameProfile;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginClientStart extends WrapperPacket {
	PacketType TYPE = PacketType.Login.Client.START;

	/**
	 * Retrieve Profile.
	 * 
	 * @return The current Profile
	 */
	WrappedGameProfile getProfile();

	/**
	 * Set Name.
	 * 
	 * @param value - new value.
	 */
	void setProfile(WrappedGameProfile value);
}
