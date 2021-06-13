package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.MinecraftKey;

public interface WrapperPlayServerSelectAdvancementTab extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.SELECT_ADVANCEMENT_TAB;
    
    
    MinecraftKey getKey();

    void setKey(MinecraftKey key);
}
