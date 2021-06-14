package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerOpenWindow;


public class WrapperPlayServerOpenWindow1_15 
        extends MinecraftPacket
        implements WrapperPlayServerOpenWindow {

	public WrapperPlayServerOpenWindow1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerOpenWindow1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Window id.
	 * <p>
	 * Notes: a unique id number for the window to be displayed. Notchian server
	 * implementation is a counter, starting at 1.
	 * 
	 * @return The current Window id
	 */
	public int getWindowID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Window id.
	 * 
	 * @param value - new value.
	 */
	public void setWindowID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Inventory Type.
	 * <p>
	 * Notes: the window type to use for display. Check below
	 * 
	 * @return The current Inventory Type
	 */
	public String getInventoryType() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Inventory Type.
	 * 
	 * @param value - new value.
	 */
	public void setInventoryType(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Window title.
	 * <p>
	 * Notes: the title of the window.
	 * 
	 * @return The current Window title
	 */
	public WrappedChatComponent getWindowTitle() {
		return container.getChatComponents().read(0);
	}

	/**
	 * Set Window title.
	 * 
	 * @param value - new value.
	 */
	public void setWindowTitle(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	/**
	 * Retrieve Number of Slots.
	 * <p>
	 * Notes: number of slots in the window (excluding the number of slots in
	 * the player inventory).
	 * 
	 * @return The current Number of Slots
	 */
	public int getNumberOfSlots() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Number of Slots.
	 * 
	 * @param value - new value.
	 */
	public void setNumberOfSlots(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}
}
