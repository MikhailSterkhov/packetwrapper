package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientBlockPlace extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.BLOCK_PLACE;


    Hand getHand();

    void setHand(Hand value);

    long getTimestamp();

    void setTimestamp(long value);

}
