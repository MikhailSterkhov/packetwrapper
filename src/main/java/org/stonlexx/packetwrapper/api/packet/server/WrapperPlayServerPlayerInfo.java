package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerInfoAction;
import com.comphenix.protocol.wrappers.PlayerInfoData;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerPlayerInfo extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.PLAYER_INFO;


    PlayerInfoAction getAction();

    void setAction(PlayerInfoAction value);

    List<PlayerInfoData> getData();

    void setData(List<PlayerInfoData> value);
}
