package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTags;


public class WrapperPlayServerTags1_15 
        extends MinecraftPacket
        implements WrapperPlayServerTags {

    public WrapperPlayServerTags1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerTags1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    // Cannot find type for a
    // Cannot find type for a
    // Cannot find type for a
}
