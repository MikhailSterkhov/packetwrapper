package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBoatMove;

public class WrapperPlayClientBoatMove1_15
		extends MinecraftPacket
		implements WrapperPlayClientBoatMove {

	public WrapperPlayClientBoatMove1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientBoatMove1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public boolean getLeftOar() {
		return container.getBooleans().read(0);
	}

	public void setLeftOar(boolean value) {
		container.getBooleans().write(0, value);
	}

	public boolean getRightOar() {
		return container.getBooleans().read(1);
	}

	public void setRightOar(boolean value) {
		container.getBooleans().write(1, value);
	}

}
