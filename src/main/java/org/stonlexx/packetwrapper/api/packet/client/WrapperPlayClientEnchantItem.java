package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientEnchantItem extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.ENCHANT_ITEM;


	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the ID sent by Open Window
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
	 * Retrieve Enchantment.
	 * <p>
	 * Notes: the position of the enchantment on the enchantment table window,
	 * starting with 0 as the topmost one.
	 * 
	 * @return The current Enchantment
	 */
 int getEnchantment();

	/**
	 * Set Enchantment.
	 * 
	 * @param value - new value.
	 */
 void setEnchantment(int value);

}
