package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.mojang.brigadier.suggestion.Suggestions;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerTabComplete extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.TAB_COMPLETE;


    int getTransactionId();

    void setTransactionId(int value);

    Suggestions getSuggestions();

    void setSuggestions(Suggestions value);

}
