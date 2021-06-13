package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientTransaction extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.TRANSACTION;


	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of the window that the action occurred in.
	 * 
	 * @return The current Window ID
	 */
 int getWindowId();

	/**
	 * Set Window ID.
	 * 
	 * @param value - new value.
	 */
 void setWindowId(byte value);

	/**
	 * Retrieve Action number.
	 * <p>
	 * Notes: every action that is to be accepted has a unique number. This
	 * field corresponds to that number.
	 * 
	 * @return The current Action number
	 */
 short getActionNumber();

	/**
	 * Set Action number.
	 * 
	 * @param value - new value.
	 */
 void setActionNumber(short value);

	/**
	 * Retrieve Accepted.
	 * <p>
	 * Notes: whether the action was accepted.
	 * 
	 * @return The current Accepted
	 */
 boolean getAccepted();

	/**
	 * Set Accepted.
	 * 
	 * @param value - new value.
	 */
 void setAccepted(boolean value);

}
