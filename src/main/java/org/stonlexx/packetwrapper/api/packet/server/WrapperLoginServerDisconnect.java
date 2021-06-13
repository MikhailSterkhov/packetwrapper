package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginServerDisconnect extends WrapperPacket {
    PacketType TYPE = PacketType.Login.Server.DISCONNECT;


    /**
     * Retrieve reason.
     *
     * @return The current reason
     */
    WrappedChatComponent getReason();

    /**
     * Set reason.
     *
     * @param value - new value.
     */
    void setReason(WrappedChatComponent value);

    WrappedChatComponent getJsonData();

    void setJsonData(WrappedChatComponent value);
}
