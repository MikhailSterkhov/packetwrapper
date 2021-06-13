package org.stonlexx.packetwrapper.api.packet.server;

import java.util.List;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerInfoAction;
import com.comphenix.protocol.wrappers.PlayerInfoData;

public interface WrapperPlayServerPlayerInfo extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.PLAYER_INFO;


 PlayerInfoAction getAction();

 void setAction(PlayerInfoAction value);

 List<PlayerInfoData> getData();

 void setData(List<PlayerInfoData> value);
}
