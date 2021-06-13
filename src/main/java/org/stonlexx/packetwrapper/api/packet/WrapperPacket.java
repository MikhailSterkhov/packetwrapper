package org.stonlexx.packetwrapper.api.packet;

import lombok.NonNull;
import org.bukkit.entity.Player;

public interface WrapperPacket {

    void sendPacket(@NonNull Player receiver);

    void broadcastPacket();
}
