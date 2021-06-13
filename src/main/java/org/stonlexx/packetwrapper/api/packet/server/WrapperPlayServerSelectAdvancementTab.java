package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerSelectAdvancementTab extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.SELECT_ADVANCEMENT_TAB;


    MinecraftKey getKey();

    void setKey(MinecraftKey key);
}
