package org.stonlexx.packetwrapper.api;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import lombok.NonNull;
import org.bukkit.entity.Player;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperHandshakingClientSetProtocol;

public interface PacketWrapper {

    static PacketWrapper getInstance() {
        return PacketWrapperPlugin.packetWrapper;
    }


    int getVersionMinor();

    WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol();
    WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol(@NonNull PacketContainer packetContainer);



    default void sendPacket(@NonNull Player player, @NonNull MinecraftPacket packet) {
        packet.sendPacket(player);
    }

    default void broadcastPacket(@NonNull MinecraftPacket packet) {
        packet.broadcastPacket();
    }

    default MinecraftPacket createPacket(@NonNull PacketType packetType) {
        return new MinecraftPacket(packetType) { };
    }

    default MinecraftPacket clonePacket(@NonNull MinecraftPacket minecraftPacket) {
        return createPacket(minecraftPacket.getPacketType());
    }

}
