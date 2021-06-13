package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.ChatType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerChat extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.CHAT;


    /**
     * Retrieve the chat message.
     * <p>
     * Limited to 32767 bytes
     *
     * @return The current message
     */
    WrappedChatComponent getMessage();

    /**
     * Set the message.
     *
     * @param value - new value.
     */
    void setMessage(WrappedChatComponent value);

    ChatType getChatType();

    void setChatType(ChatType type);

    /**
     * Retrieve Position.
     * <p>
     * Notes: 0 - Chat (chat box) ,1 - System Message (chat box), 2 - Above
     * action bar
     *
     * @return The current Position
     * @deprecated Magic values replaced by enum
     */
    byte getPosition();

    /**
     * Set Position.
     *
     * @param value - new value.
     * @deprecated Magic values replaced by enum
     */
    void setPosition(byte value);
}
