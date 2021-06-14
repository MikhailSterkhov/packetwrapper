package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSelectAdvancementTab;

import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerSelectAdvancementTab1_15 
        extends MinecraftPacket
        implements WrapperPlayServerSelectAdvancementTab {

    public WrapperPlayServerSelectAdvancementTab1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerSelectAdvancementTab1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    public MinecraftKey getKey() {
        return container.getMinecraftKeys().readSafely(0);
    }

    public void setKey(MinecraftKey key) {
        container.getMinecraftKeys().writeSafely(0, key);
    }
}
