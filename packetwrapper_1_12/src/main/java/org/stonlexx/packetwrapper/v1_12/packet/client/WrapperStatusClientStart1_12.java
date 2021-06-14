package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperStatusClientStart;

public class WrapperStatusClientStart1_12 
        extends MinecraftPacket
        implements WrapperStatusClientStart {

	public WrapperStatusClientStart1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperStatusClientStart1_12(PacketContainer packet) {
		super(packet, TYPE);
	}
}
