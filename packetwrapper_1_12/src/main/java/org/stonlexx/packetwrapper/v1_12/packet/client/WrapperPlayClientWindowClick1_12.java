package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientWindowClick;

public class WrapperPlayClientWindowClick1_12 
        extends MinecraftPacket
        implements WrapperPlayClientWindowClick {

	public WrapperPlayClientWindowClick1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientWindowClick1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window ID.
	 * <p>
	 * Notes: the id of the window which was clicked. 0 for player inventory.
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
	 * Retrieve Slot.
	 * <p>
	 * Notes: the clicked slot. See below.
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Button.
	 * <p>
	 * Notes: the button used in the click. See below.
	 * 
	 * @return The current Button
	 */
	public int getButton() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set Button.
	 * 
	 * @param value - new value.
	 */
	public void setButton(int value) {
		container.getIntegers().write(2, value);
	}

	/**
	 * Retrieve Action number.
	 * <p>
	 * Notes: a unique number for the action, used for transaction handling (See
	 * the Transaction packet).
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
	 * Retrieve Clicked item.
	 * 
	 * @return The current Clicked item
	 */
	public ItemStack getClickedItem() {
		return container.getItemModifier().read(0);
	}

	/**
	 * Set Clicked item.
	 * 
	 * @param value - new value.
	 */
	public void setClickedItem(ItemStack value) {
		container.getItemModifier().write(0, value);
	}

	public InventoryClickType getShift() {
		return container.getEnumModifier(InventoryClickType.class, 5).read(0);
	}

	public void setShift(InventoryClickType value) {
		container.getEnumModifier(InventoryClickType.class, 5).write(0, value);
	}
}
