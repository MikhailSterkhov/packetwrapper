package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientKeepAlive;


public class WrapperPlayClientKeepAlive1_15 
        extends MinecraftPacket
        implements WrapperPlayClientKeepAlive {

	public WrapperPlayClientKeepAlive1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientKeepAlive1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Keep Alive ID.
	 * 
	 * @return The current Keep Alive ID
	 */
	public long getKeepAliveId() {
		return container.getLongs().read(0);
	}

	/**
	 * Set Keep Alive ID.
	 * 
	 * @param value - new value.
	 */
	public void setKeepAliveId(long value) {
		container.getLongs().write(0, value);
	}

}
