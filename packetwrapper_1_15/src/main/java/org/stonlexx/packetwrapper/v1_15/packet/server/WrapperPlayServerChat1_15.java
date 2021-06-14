package org.stonlexx.packetwrapper.v1_15.packet.server;

import java.util.Arrays;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerChat;

import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerChat1_15 
        extends MinecraftPacket
        implements WrapperPlayServerChat {

	public WrapperPlayServerChat1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerChat1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve the chat message.
	 * <p>
	 * Limited to 32767 bytes
	 * 
	 * @return The current message
	 */
	public WrappedChatComponent getMessage() {
		return container.getChatComponents().read(0);
	}

	/**
	 * Set the message.
	 * 
	 * @param value - new value.
	 */
	public void setMessage(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	public ChatType getChatType() {
		return container.getChatTypes().read(0);
	}

	public void setChatType(ChatType type) {
		container.getChatTypes().write(0, type);
	}

	/**
	 * Retrieve Position.
	 * <p>
	 * Notes: 0 - Chat (chat box) ,1 - System Message (chat box), 2 - Above
	 * action bar
	 * 
	 * @return The current Position
	 * @deprecated Magic values replaced by enum
	 */
	@Deprecated
	public byte getPosition() {
		Byte position = container.getBytes().readSafely(0);
		if (position != null) {
			return position;
		} else {
			return getChatType().getId();
		}
	}

	/**
	 * Set Position.
	 * 
	 * @param value - new value.
	 * @deprecated Magic values replaced by enum
	 */
	@Deprecated
	public void setPosition(byte value) {
		container.getBytes().writeSafely(0, value);

		if (EnumWrappers.getChatTypeClass() != null)
		{
			Arrays.stream(ChatType.values()).filter(t -> t.getId() == value).findAny()
			      .ifPresent(t -> container.getChatTypes().writeSafely(0, t));
		}
	}
}
