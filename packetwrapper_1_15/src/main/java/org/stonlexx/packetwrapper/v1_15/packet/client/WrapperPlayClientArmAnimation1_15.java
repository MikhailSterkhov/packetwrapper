package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientArmAnimation;

public class WrapperPlayClientArmAnimation1_15
		extends MinecraftPacket
		implements WrapperPlayClientArmAnimation {

	public WrapperPlayClientArmAnimation1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientArmAnimation1_15(PacketContainer packet) {
		super(packet, TYPE);
	}
}
