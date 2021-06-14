package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTabComplete;

import com.mojang.brigadier.suggestion.Suggestions;

public class WrapperPlayServerTabComplete1_15 
        extends MinecraftPacket
        implements WrapperPlayServerTabComplete {

	public WrapperPlayServerTabComplete1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerTabComplete1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public int getTransactionId() {
		return container.getIntegers().read(0);
	}

	public void setTransactionId(int value) {
		container.getIntegers().write(0, value);
	}

	public Suggestions getSuggestions() {
		return container.getSpecificModifier(Suggestions.class).read(0);
	}

	public void setSuggestions(Suggestions value) {
		container.getSpecificModifier(Suggestions.class).write(0, value);
	}

}
