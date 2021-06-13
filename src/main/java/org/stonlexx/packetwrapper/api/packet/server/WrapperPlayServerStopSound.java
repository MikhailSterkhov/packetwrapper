package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerStopSound extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.STOP_SOUND;


    MinecraftKey getSoundEffect();

    void setSoundEffect(MinecraftKey value);

    EnumWrappers.SoundCategory getCategory();

    void setCategory(EnumWrappers.SoundCategory value);
}
