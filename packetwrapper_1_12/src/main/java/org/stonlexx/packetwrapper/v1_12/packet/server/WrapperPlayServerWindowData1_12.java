package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWindowData;

public class WrapperPlayServerWindowData1_12 
        extends MinecraftPacket
        implements WrapperPlayServerWindowData {

	public WrapperPlayServerWindowData1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWindowData1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of the window.
	 * 
	 * @return The current Window ID
	 */
	public int getWindowId() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
	public void setWindowId(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Property.
	 * <p>
	 * Notes: which property should be updated.
	 * 
	 * @return The current Property
	 */
	public int getProperty() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Property.
	 * 
	 * @param value - new value.
	 */
	public void setProperty(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Value.
	 * <p>
	 * Notes: the new value for the property.
	 * 
	 * @return The current Value
	 */
	public int getValue() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set Value.
	 * 
	 * @param value - new value.
	 */
	public void setValue(int value) {
		container.getIntegers().write(2, value);
	}

}
