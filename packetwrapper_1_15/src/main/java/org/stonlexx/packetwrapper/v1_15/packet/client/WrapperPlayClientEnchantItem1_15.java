package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientEnchantItem;


public class WrapperPlayClientEnchantItem1_15 
        extends MinecraftPacket
        implements WrapperPlayClientEnchantItem {

	public WrapperPlayClientEnchantItem1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientEnchantItem1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the ID sent by Open Window
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
	public void setWindowId(byte value) {
		container.getIntegers().write(0, (int) value);
	}

	/**
	 * Retrieve Enchantment.
	 * <p>
	 * Notes: the position of the enchantment on the enchantment table window,
	 * starting with 0 as the topmost one.
	 * 
	 * @return The current Enchantment
	 */
	public int getEnchantment() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Enchantment.
	 * 
	 * @param value - new value.
	 */
	public void setEnchantment(int value) {
		container.getIntegers().write(1, value);
	}

}
