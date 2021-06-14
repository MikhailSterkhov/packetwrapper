package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.mojang.brigadier.suggestion.Suggestions;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTabComplete;

public class WrapperPlayServerTabComplete1_12 
        extends MinecraftPacket
        implements WrapperPlayServerTabComplete {

	public WrapperPlayServerTabComplete1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerTabComplete1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Count.
	 * <p>
	 * Notes: number of following strings
	 * 
	 * @return The current Count
	 */
	public int getCount() {
		return container.getStringArrays().read(0).length;
	}

	/**
	 * Retrieve Match.
	 * <p>
	 * Notes: one eligible command, note that each command is sent separately
	 * instead of in a single string, hence the need for Count
	 * 
	 * @return The current Match
	 */
	public String[] getMatches() {
		return container.getStringArrays().read(0);
	}

	/**
	 * Set Match.
	 * 
	 * @param value - new value.
	 */
	public void setMatches(String[] value) {
		container.getStringArrays().write(0, value);
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
