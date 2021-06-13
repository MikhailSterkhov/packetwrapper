package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerRecipeUpdate extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.RECIPE_UPDATE;
}
    
    
