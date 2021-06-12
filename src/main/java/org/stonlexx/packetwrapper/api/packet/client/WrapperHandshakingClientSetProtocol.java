package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;

public interface WrapperHandshakingClientSetProtocol {
    PacketType TYPE = PacketType.Handshake.Client.SET_PROTOCOL;


    int getProtocolVersion();

    int getServerPort();

    String getServerAddressHostnameOrIp();

    PacketType.Protocol getNextState();


    void setProtocolVersion(int value);

    void setServerAddressHostnameOrIp(String value);

    void setServerPort(int value);

    void setNextState(PacketType.Protocol value);
}
