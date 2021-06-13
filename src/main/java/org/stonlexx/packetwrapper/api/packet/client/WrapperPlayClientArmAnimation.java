package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientArmAnimation extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.ARM_ANIMATION;
}


