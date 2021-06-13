package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperStatusClientStart extends WrapperPacket {
    PacketType TYPE = PacketType.Status.Client.START;
}


