package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerKeepAlive;

public class WrapperPlayServerKeepAlive1_12 
        extends MinecraftPacket
        implements WrapperPlayServerKeepAlive {

	public WrapperPlayServerKeepAlive1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerKeepAlive1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Keep Alive ID.
	 * 
	 * @return The current Keep Alive ID
	 */
	public long getKeepAliveId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Keep Alive ID.
	 * 
	 * @param value - new value.
	 */
	public void setKeepAliveId(long value) {
		container.getIntegers().write(0, (int) value);
	}

}
