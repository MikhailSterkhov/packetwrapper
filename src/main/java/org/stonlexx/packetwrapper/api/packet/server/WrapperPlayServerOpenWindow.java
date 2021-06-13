package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerOpenWindow extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.OPEN_WINDOW;


	/**
	 * Retrieve Window id.
	 * <p>
	 * Notes: a unique id number for the window to be displayed. Notchian server
	 * implementation is a counter, starting at 1.
	 * 
	 * @return The current Window id
	 */
 int getWindowID();

	/**
	 * Set Window id.
	 * 
	 * @param value - new value.
	 */
 void setWindowID(int value);

	/**
	 * Retrieve Inventory Type.
	 * <p>
	 * Notes: the window type to use for display. Check below
	 * 
	 * @return The current Inventory Type
	 */
 String getInventoryType();

	/**
	 * Set Inventory Type.
	 * 
	 * @param value - new value.
	 */
 void setInventoryType(String value);

	/**
	 * Retrieve Window title.
	 * <p>
	 * Notes: the title of the window.
	 * 
	 * @return The current Window title
	 */
 WrappedChatComponent getWindowTitle();

	/**
	 * Set Window title.
	 * 
	 * @param value - new value.
	 */
 void setWindowTitle(WrappedChatComponent value);

	/**
	 * Retrieve Number of Slots.
	 * <p>
	 * Notes: number of slots in the window (excluding the number of slots in
	 * the player inventory).
	 * 
	 * @return The current Number of Slots
	 */
 int getNumberOfSlots();

	/**
	 * Set Number of Slots.
	 * 
	 * @param value - new value.
	 */
 void setNumberOfSlots(int value);

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
 int getEntityID();

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
 void setEntityID(int value);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
 Entity getEntity(World world);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
 Entity getEntity(PacketEvent event);
}
