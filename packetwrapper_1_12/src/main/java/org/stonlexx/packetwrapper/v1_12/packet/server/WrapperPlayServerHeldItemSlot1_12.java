package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerHeldItemSlot;

public class WrapperPlayServerHeldItemSlot1_12 
        extends MinecraftPacket
        implements WrapperPlayServerHeldItemSlot {

	public WrapperPlayServerHeldItemSlot1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerHeldItemSlot1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Slot.
	 * <p>
	 * Notes: the slot which the player has selected (0-8)
	 * 
	 * @return The current Slot
	 */
	public int getSlot() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Slot.
	 * 
	 * @param value - new value.
	 */
	public void setSlot(int value) {
		container.getIntegers().write(0, value);
	}

}
