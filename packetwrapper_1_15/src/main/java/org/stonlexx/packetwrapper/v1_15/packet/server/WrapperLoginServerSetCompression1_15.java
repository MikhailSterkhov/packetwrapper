package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperLoginServerSetCompression;


public class WrapperLoginServerSetCompression1_15 
        extends MinecraftPacket
        implements WrapperLoginServerSetCompression {

	public WrapperLoginServerSetCompression1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginServerSetCompression1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Threshold.
	 * <p>
	 * Notes: threshold is the max size of a packet before its compressed
	 * 
	 * @return The current Threshold
	 */
	public int getThreshold() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Threshold.
	 * 
	 * @param value - new value.
	 */
	public void setThreshold(int value) {
		container.getIntegers().write(0, value);
	}

}
