package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerPlayerListHeaderFooter extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.PLAYER_LIST_HEADER_FOOTER;


    /**
     * Retrieve Header.
     *
     * @return The current Header
     */
    WrappedChatComponent getHeader();

    /**
     * Set Header.
     *
     * @param value - new value.
     */
    void setHeader(WrappedChatComponent value);

    /**
     * Retrieve Footer.
     *
     * @return The current Footer
     */
    WrappedChatComponent getFooter();

    /**
     * Set Footer.
     *
     * @param value - new value.
     */
    void setFooter(WrappedChatComponent value);

}
