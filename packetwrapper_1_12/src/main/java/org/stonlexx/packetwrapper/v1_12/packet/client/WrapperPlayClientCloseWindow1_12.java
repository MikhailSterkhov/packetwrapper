package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientCloseWindow;

public class WrapperPlayClientCloseWindow1_12 
        extends MinecraftPacket
        implements WrapperPlayClientCloseWindow {

	public WrapperPlayClientCloseWindow1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientCloseWindow1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window id.
	 * <p>
	 * Notes: this is the id of the window that was closed. 0 for inventory.
	 * 
	 * @return The current Window id
	 */
	public int getWindowId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Window id.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		container.getIntegers().write(0, value);
	}

}
