package org.stonlexx.packetwrapper.v1_12.packet.server;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.World;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerMount;
import com.comphenix.protocol.events.PacketEvent;

public class WrapperPlayServerMount1_12 
        extends MinecraftPacket
        implements WrapperPlayServerMount {


	public WrapperPlayServerMount1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerMount1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: vehicle's EID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Retrieve the entity involved in this event.
	 * 
	 * @param world - the current world of the entity.
	 * @return The involved entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity involved in this event.
	 * 
	 * @param event - the packet event.
	 * @return The involved entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	public int[] getPassengerIds() {
		return container.getIntegerArrays().read(0);
	}

	public void setPassengerIds(int[] value) {
		container.getIntegerArrays().write(0, value);
	}

	public List<Entity> getPassengers(PacketEvent event) {
		return getPassengers(event.getPlayer().getWorld());
	}

	public List<Entity> getPassengers(World world) {
		int[] ids = getPassengerIds();
		List<Entity> passengers = new ArrayList<>();
		ProtocolManager manager = ProtocolLibrary.getProtocolManager();

		for (int id : ids) {
			Entity entity = manager.getEntityFromID(world, id);
			if (entity != null) {
				passengers.add(entity);
			}
		}

		return passengers;
	}

	public void setPassengers(List<Entity> value) {
		int[] array = new int[value.size()];
		for (int i = 0; i < value.size(); i++) {
			array[i] = value.get(i).getEntityId();
		}

		setPassengerIds(array);
	}
}
