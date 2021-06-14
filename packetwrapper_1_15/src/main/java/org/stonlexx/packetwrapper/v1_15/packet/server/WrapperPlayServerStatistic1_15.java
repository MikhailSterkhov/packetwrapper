package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerStatistic;


public class WrapperPlayServerStatistic1_15 
        extends MinecraftPacket
        implements WrapperPlayServerStatistic {

	public WrapperPlayServerStatistic1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerStatistic1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	// TODO fix upon request
}
