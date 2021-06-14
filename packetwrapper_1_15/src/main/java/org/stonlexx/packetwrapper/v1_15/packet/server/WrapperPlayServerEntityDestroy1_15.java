package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntityDestroy;


public class WrapperPlayServerEntityDestroy1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntityDestroy {

	public WrapperPlayServerEntityDestroy1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerEntityDestroy1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Count.
	 * <p>
	 * Notes: length of following array
	 * 
	 * @return The current Count
	 */
	public int getCount() {
		return container.getIntegerArrays().read(0).length;
	}

	/**
	 * Retrieve Entity IDs.
	 * <p>
	 * Notes: the list of entities of destroy
	 * 
	 * @return The current Entity IDs
	 */
	public int[] getEntityIDs() {
		return container.getIntegerArrays().read(0);
	}

	/**
	 * Set Entity IDs.
	 * 
	 * @param value - new value.
	 */
	public void setEntityIds(int[] value) {
		container.getIntegerArrays().write(0, value);
	}

}
