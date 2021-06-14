package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedServerPing;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperStatusServerServerInfo;


public class WrapperStatusServerServerInfo1_15 
        extends MinecraftPacket
        implements WrapperStatusServerServerInfo {

	public WrapperStatusServerServerInfo1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperStatusServerServerInfo1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve JSON Response.
	 * <p>
	 * Notes: https://gist.github.com/thinkofdeath/6927216
	 * 
	 * @return The current JSON Response
	 */
	public WrappedServerPing getJsonResponse() {
		return container.getServerPings().read(0);
	}

	/**
	 * Set JSON Response.
	 * 
	 * @param value - new value.
	 */
	public void setJsonResponse(WrappedServerPing value) {
		container.getServerPings().write(0, value);
	}

}
