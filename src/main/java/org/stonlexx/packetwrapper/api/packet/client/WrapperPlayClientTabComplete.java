package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientTabComplete extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.TAB_COMPLETE;


    int getTransactionId();

    void setTransactionId(int value);

    String getInput();

    void setInput(String value);
}
