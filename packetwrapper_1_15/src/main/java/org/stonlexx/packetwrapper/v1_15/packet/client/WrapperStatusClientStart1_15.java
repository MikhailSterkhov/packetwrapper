package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperStatusClientStart;


public class WrapperStatusClientStart1_15 
        extends MinecraftPacket
        implements WrapperStatusClientStart {

	public WrapperStatusClientStart1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperStatusClientStart1_15(PacketContainer packet) {
		super(packet, TYPE);
	}
}
