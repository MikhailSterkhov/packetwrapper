package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientTradeSelect;


public class WrapperPlayClientTradeSelect1_15 
        extends MinecraftPacket
        implements WrapperPlayClientTradeSelect {

	public WrapperPlayClientTradeSelect1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public int getSlot() {
		return container.getIntegers().read(0);
	}

	public void setSlot(int value) {
		container.getIntegers().write(0, value);
	}
}
