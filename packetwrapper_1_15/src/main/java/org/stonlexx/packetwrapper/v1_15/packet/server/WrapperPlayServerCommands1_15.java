package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCommands;

import com.mojang.brigadier.tree.RootCommandNode;

public class WrapperPlayServerCommands1_15 
        extends MinecraftPacket
        implements WrapperPlayServerCommands {

    public WrapperPlayServerCommands1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerCommands1_15(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Mojang's brigadier library isn't versioned inside craftbukkit,
     * so it should be safe to use here.
     */
    public RootCommandNode getRoot() {
        return (RootCommandNode) container.getModifier().read(0);
    }

    public void setRoot(RootCommandNode node) {
        container.getModifier().write(0, node);
    }
}
