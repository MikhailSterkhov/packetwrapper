package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.mojang.brigadier.tree.RootCommandNode;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCommands extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.COMMANDS;


    /**
     * Mojang's brigadier library isn't versioned inside craftbukkit,
     * so it should be safe to use here.
     */
    RootCommandNode getRoot();

    void setRoot(RootCommandNode node);
}
