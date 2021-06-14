package org.stonlexx.packetwrapper.v1_12.packet.server;

import java.util.Map;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerStatistic;
import com.comphenix.protocol.wrappers.WrappedStatistic;

public class WrapperPlayServerStatistic1_12 
        extends MinecraftPacket
        implements WrapperPlayServerStatistic {

	public WrapperPlayServerStatistic1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerStatistic1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	public Map<WrappedStatistic, Integer> getStatistics() {
		return container.getStatisticMaps().read(0);
	}

	public void setStatistics(Map<WrappedStatistic, Integer> value) {
		container.getStatisticMaps().write(0, value);
	}
}
