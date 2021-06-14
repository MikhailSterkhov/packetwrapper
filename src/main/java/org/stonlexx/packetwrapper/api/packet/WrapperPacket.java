package org.stonlexx.packetwrapper.api.packet;

import com.comphenix.protocol.events.PacketContainer;
import lombok.NonNull;
import org.bukkit.entity.Player;

public interface WrapperPacket {

    PacketContainer getContainer();


    void sendPacket(@NonNull Player receiver);

    void broadcastPacket();
}
