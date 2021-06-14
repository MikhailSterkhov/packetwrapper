package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperStatusClientPing;

public class WrapperStatusClientPing1_12 
        extends MinecraftPacket
        implements WrapperStatusClientPing {

	public WrapperStatusClientPing1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperStatusClientPing1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Time.
	 * 
	 * @return The current Time
	 */
	public long getTime() {
		return container.getLongs().read(0);
	}

	/**
	 * Set Time.
	 * 
	 * @param value - new value.
	 */
	public void setTime(long value) {
		container.getLongs().write(0, value);
	}

}
