package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerUpdateTime;


public class WrapperPlayServerUpdateTime1_15 
        extends MinecraftPacket
        implements WrapperPlayServerUpdateTime {

	public WrapperPlayServerUpdateTime1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerUpdateTime1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Age of the world.
	 * <p>
	 * Notes: in ticks; not changed by server commands
	 * 
	 * @return The current Age of the world
	 */
	public long getAgeOfTheWorld() {
		return container.getLongs().read(0);
	}

	/**
	 * Set Age of the world.
	 * 
	 * @param value - new value.
	 */
	public void setAgeOfTheWorld(long value) {
		container.getLongs().write(0, value);
	}

	/**
	 * Retrieve Time of day.
	 * <p>
	 * Notes: the world (or region) time, in ticks. If negative the sun will
	 * stop moving at the Math.abs of the time
	 * 
	 * @return The current Time of day
	 */
	public long getTimeOfDay() {
		return container.getLongs().read(1);
	}

	/**
	 * Set Time of day.
	 * 
	 * @param value - new value.
	 */
	public void setTimeOfDay(long value) {
		container.getLongs().write(1, value);
	}

}
