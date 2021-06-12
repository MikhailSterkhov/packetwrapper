package org.stonlex.packetwrapper.v1_15;

import com.comphenix.protocol.events.PacketContainer;
import lombok.Getter;
import lombok.NonNull;
import org.stonlex.packetwrapper.v1_15.packet.client.WrapperHandshakingClientSetProtocol1_15;
import org.stonlexx.packetwrapper.api.packet.client.WrapperHandshakingClientSetProtocol;
import org.stonlexx.packetwrapper.api.PacketWrapper;

public final class PacketWrapper1_15 implements PacketWrapper {

    @Getter
    private final int versionMinor = 15;


    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol() {
        return new WrapperHandshakingClientSetProtocol1_15();
    }

    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol(@NonNull PacketContainer packetContainer) {
        return new WrapperHandshakingClientSetProtocol1_15(packetContainer);
    }

}
