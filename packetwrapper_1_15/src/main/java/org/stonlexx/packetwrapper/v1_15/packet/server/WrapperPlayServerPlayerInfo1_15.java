package org.stonlexx.packetwrapper.v1_15.packet.server;

import java.util.List;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerPlayerInfo;

import com.comphenix.protocol.wrappers.EnumWrappers.PlayerInfoAction;
import com.comphenix.protocol.wrappers.PlayerInfoData;

public class WrapperPlayServerPlayerInfo1_15 
        extends MinecraftPacket
        implements WrapperPlayServerPlayerInfo {

	public WrapperPlayServerPlayerInfo1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerPlayerInfo1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public PlayerInfoAction getAction() {
		return container.getPlayerInfoAction().read(0);
	}

	public void setAction(PlayerInfoAction value) {
		container.getPlayerInfoAction().write(0, value);
	}

	public List<PlayerInfoData> getData() {
		return container.getPlayerInfoDataLists().read(0);
	}

	public void setData(List<PlayerInfoData> value) {
		container.getPlayerInfoDataLists().write(0, value);
	}
}
