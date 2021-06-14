package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTransaction;


public class WrapperPlayServerTransaction1_15 
        extends MinecraftPacket
        implements WrapperPlayServerTransaction {

	public WrapperPlayServerTransaction1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerTransaction1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of the window that the action occurred in.
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
	 * Retrieve Action number.
	 * <p>
	 * Notes: every action that is to be accepted has a unique number. This
	 * field corresponds to that number.
	 * 
	 * @return The current Action number
	 */
	public short getActionNumber() {
		return container.getShorts().read(0);
	}

	/**
	 * Set Action number.
	 * 
	 * @param value - new value.
	 */
	public void setActionNumber(short value) {
		container.getShorts().write(0, value);
	}

	/**
	 * Retrieve Accepted.
	 * <p>
	 * Notes: whether the action was accepted.
	 * 
	 * @return The current Accepted
	 */
	public boolean getAccepted() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Accepted.
	 * 
	 * @param value - new value.
	 */
	public void setAccepted(boolean value) {
		container.getBooleans().write(0, value);
	}

}
