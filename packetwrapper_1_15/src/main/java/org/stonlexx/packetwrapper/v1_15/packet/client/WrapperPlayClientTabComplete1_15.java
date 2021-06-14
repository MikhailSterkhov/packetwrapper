package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientTabComplete;


public class WrapperPlayClientTabComplete1_15 
        extends MinecraftPacket
        implements WrapperPlayClientTabComplete {

	public WrapperPlayClientTabComplete1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientTabComplete1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public int getTransactionId() {
		return container.getIntegers().read(0);
	}

	public void setTransactionId(int value) {
		container.getIntegers().write(0, value);
	}

	public String getInput() {
		return container.getStrings().read(0);
	}

	public void setInput(String value) {
		container.getStrings().write(0, value);
	}
}
