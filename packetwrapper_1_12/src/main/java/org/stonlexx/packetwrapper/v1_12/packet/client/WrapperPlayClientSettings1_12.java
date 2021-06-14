package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatVisibility;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSettings;

public class WrapperPlayClientSettings1_12 
        extends MinecraftPacket
        implements WrapperPlayClientSettings {

	public WrapperPlayClientSettings1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientSettings1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Locale.
	 * <p>
	 * Notes: en_GB
	 * 
	 * @return The current Locale
	 */
	public String getLocale() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Locale.
	 * 
	 * @param value - new value.
	 */
	public void setLocale(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve View distance.
	 * <p>
	 * Notes: client-side render distance(chunks)
	 * 
	 * @return The current View distance
	 */
	public int getViewDistance() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set View distance.
	 * 
	 * @param value - new value.
	 */
	public void setViewDistance(byte value) {
		container.getIntegers().write(0, (int) value);
	}

	/**
	 * Retrieve Chat flags.
	 * <p>
	 * Notes: chat settings. See notes below.
	 * 
	 * @return The current Chat flags
	 */
	public ChatVisibility getChatFlags() {
		return container.getChatVisibilities().read(0);
	}

	/**
	 * Set Chat flags.
	 * 
	 * @param value - new value.
	 */
	public void setChatFlags(ChatVisibility value) {
		container.getChatVisibilities().write(0, value);
	}

	/**
	 * Retrieve Chat colours.
	 * <p>
	 * Notes: "Colours" multiplayer setting
	 * 
	 * @return The current Chat colours
	 */
	public boolean getChatColours() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Chat colours.
	 * 
	 * @param value - new value.
	 */
	public void setChatColours(boolean value) {
		container.getBooleans().write(0, value);
	}

	/**
	 * Retrieve Displayed skin parts.
	 * <p>
	 * Notes: skin parts. See note below
	 * 
	 * @return The current Displayed skin parts
	 */
	public int getDisplayedSkinParts() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Displayed skin parts.
	 * 
	 * @param value - new value.
	 */
	public void setDisplayedSkinParts(int value) {
		container.getIntegers().write(1, value);
	}

}
