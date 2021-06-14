package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerStopSound;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayServerStopSound1_15 
        extends MinecraftPacket
        implements WrapperPlayServerStopSound {

    public WrapperPlayServerStopSound1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerStopSound1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    public MinecraftKey getSoundEffect() {
        return container.getMinecraftKeys().readSafely(0);
    }

    public void setSoundEffect(MinecraftKey value) {
        container.getMinecraftKeys().writeSafely(0, value);
    }

    public EnumWrappers.SoundCategory getCategory() {
    	return container.getSoundCategories().readSafely(0);
    }

    public void setCategory(EnumWrappers.SoundCategory value) {
    	container.getSoundCategories().writeSafely(0, value);
    }
}
