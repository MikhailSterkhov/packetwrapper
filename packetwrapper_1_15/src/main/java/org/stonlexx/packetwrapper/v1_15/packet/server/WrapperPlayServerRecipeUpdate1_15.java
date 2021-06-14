package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerRecipeUpdate;


public class WrapperPlayServerRecipeUpdate1_15 
        extends MinecraftPacket
        implements WrapperPlayServerRecipeUpdate {

    public WrapperPlayServerRecipeUpdate1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRecipeUpdate1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    // TODO manually upon request
}
