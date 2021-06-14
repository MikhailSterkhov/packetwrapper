package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCombatEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.CombatEventType;

public class WrapperPlayServerCombatEvent1_12 
        extends MinecraftPacket
        implements WrapperPlayServerCombatEvent {

	public WrapperPlayServerCombatEvent1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCombatEvent1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	// ---- All

	/**
	 * Retrieve Event.
	 * <p>
	 * Notes: 0 ENTER_COMBAT, 1 END_COMBAT, 2 ENTITY_DEAD
	 * 
	 * @return The current Event
	 */
	public CombatEventType getEvent() {
		return container.getCombatEvents().read(0);
	}

	/**
	 * Set Event.
	 * 
	 * @param value - new value.
	 */
	public void setEvent(CombatEventType value) {
		container.getCombatEvents().write(0, value);
	}

	// ---- END_COMBAT

	public int getDuration() {
		if (getEvent() != CombatEventType.END_COMBAT)
			throw new IllegalStateException(
					"Duration only exists for END_COMBAT");

		return container.getIntegers().read(0);
	}

	public void setDuration(int value) {
		if (getEvent() != CombatEventType.END_COMBAT)
			throw new IllegalStateException(
					"Duration only exists for END_COMBAT");

		container.getIntegers().write(0, value);
	}

	// ---- ENTITY_DIED

	public int getPlayerID() {
		if (getEvent() != CombatEventType.ENTITY_DIED)
			throw new IllegalStateException(
					"Player ID only exists for ENTITY_DEAD");

		return container.getIntegers().read(0);
	}

	public void setPlayerId(int value) {
		if (getEvent() != CombatEventType.ENTITY_DIED)
			throw new IllegalStateException(
					"Player ID only exists for ENTITY_DEAD");

		container.getIntegers().write(0, value);
	}

	public int getEntityID() {
		CombatEventType event = getEvent();
		switch (event) {
			case END_COMBAT:
			case ENTITY_DIED:
				return container.getIntegers().read(1);
			default:
				throw new IllegalStateException("Entity ID does not exist for "
						+ event);

		}
	}

	public void setEntityId(int value) {
		CombatEventType event = getEvent();
		switch (event) {
			case END_COMBAT:
			case ENTITY_DIED:
				container.getIntegers().write(1, value);
			default:
				throw new IllegalStateException("Entity ID does not exist for "
						+ event);

		}
	}

	public String getMessage() {
		if (getEvent() != CombatEventType.ENTITY_DIED)
			throw new IllegalStateException(
					"Message only exists for ENTITY_DEAD");

		return container.getStrings().read(0);
	}

	public void setMessage(String value) {
		if (getEvent() != CombatEventType.ENTITY_DIED)
			throw new IllegalStateException(
					"Message only exists for ENTITY_DEAD");

		container.getStrings().write(0, value);
	}
}
