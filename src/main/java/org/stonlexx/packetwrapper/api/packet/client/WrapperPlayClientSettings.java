package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatVisibility;

public interface WrapperPlayClientSettings extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Client.SETTINGS;


	/**
	 * Retrieve Locale.
	 * <p>
	 * Notes: en_GB
	 * 
	 * @return The current Locale
	 */
 String getLocale();

	/**
	 * Set Locale.
	 * 
	 * @param value - new value.
	 */
 void setLocale(String value);

	/**
	 * Retrieve View distance.
	 * <p>
	 * Notes: client-side render distance(chunks)
	 * 
	 * @return The current View distance
	 */
 int getViewDistance();

	/**
	 * Set View distance.
	 * 
	 * @param value - new value.
	 */
 void setViewDistance(byte value);

	/**
	 * Retrieve Chat flags.
	 * <p>
	 * Notes: chat settings. See notes below.
	 * 
	 * @return The current Chat flags
	 */
 ChatVisibility getChatFlags();

	/**
	 * Set Chat flags.
	 * 
	 * @param value - new value.
	 */
 void setChatFlags(ChatVisibility value);

	/**
	 * Retrieve Chat colours.
	 * <p>
	 * Notes: "Colours" multiplayer setting
	 * 
	 * @return The current Chat colours
	 */
 boolean getChatColours();

	/**
	 * Set Chat colours.
	 * 
	 * @param value - new value.
	 */
 void setChatColours(boolean value);

	/**
	 * Retrieve Displayed skin parts.
	 * <p>
	 * Notes: skin parts. See note below
	 * 
	 * @return The current Displayed skin parts
	 */
 int getDisplayedSkinParts();

	/**
	 * Set Displayed skin parts.
	 * 
	 * @param value - new value.
	 */
 void setDisplayedSkinParts(int value);

}
