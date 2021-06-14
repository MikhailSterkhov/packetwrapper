package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBlockPlace;

import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBlockPlace;

public class WrapperPlayClientBlockPlace1_15
		extends MinecraftPacket
		implements WrapperPlayClientBlockPlace {

	public WrapperPlayClientBlockPlace1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientBlockPlace1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public Hand getHand() {
		return container.getHands().read(0);
	}

	public void setHand(Hand value) {
		container.getHands().write(0, value);
	}

	public long getTimestamp() {
		return container.getLongs().read(0);
	}

	public void setTimestamp(long value) {
		container.getLongs().write(0, value);
	}

}
