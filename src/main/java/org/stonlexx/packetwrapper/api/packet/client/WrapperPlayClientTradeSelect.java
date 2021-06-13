package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientTradeSelect extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.TR_SEL;


    int getSlot();

    void setSlot(int value);
}
