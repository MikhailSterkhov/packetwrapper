package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCamera;


public class WrapperPlayServerCamera1_15 
        extends MinecraftPacket
        implements WrapperPlayServerCamera {

	public WrapperPlayServerCamera1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCamera1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Camera ID.
	 * 
	 * @return The current Camera ID
	 */
	public int getCameraId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Camera ID.
	 * 
	 * @param value - new value.
	 */
	public void setCameraId(int value) {
		container.getIntegers().write(0, value);
	}

}
