package org.stonlexx.packetwrapper.api.packet;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public abstract class MinecraftPacket {

    protected final PacketContainer container;
    protected final PacketType packetType;

    public MinecraftPacket(@NonNull PacketType packetType) {
        this(new PacketContainer(packetType), packetType);
    }

    public void broadcastPacket() {
        ProtocolLibrary.getProtocolManager().broadcastServerPacket(container);
    }

    @SneakyThrows
    public void sendPacket(@NonNull Player receiver) {
        ProtocolLibrary.getProtocolManager().sendServerPacket(receiver, container);
    }

}
