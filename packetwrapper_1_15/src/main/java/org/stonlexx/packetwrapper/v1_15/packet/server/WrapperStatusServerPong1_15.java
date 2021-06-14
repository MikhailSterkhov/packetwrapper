package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperStatusServerPong;


public class WrapperStatusServerPong1_15 
        extends MinecraftPacket
        implements WrapperStatusServerPong {

	public WrapperStatusServerPong1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperStatusServerPong1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Time.
	 * <p>
	 * Notes: should be the same as sent by the client
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
