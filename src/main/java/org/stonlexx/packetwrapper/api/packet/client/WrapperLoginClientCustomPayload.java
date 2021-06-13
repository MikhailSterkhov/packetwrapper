package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginClientCustomPayload extends WrapperPacket {
    PacketType TYPE = PacketType.Login.Client.CUSTOM_PAYLOAD;
    
    /**
     * Retrieve Message ID.
     * <p>
     * Notes: should match ID from server.
     * @return The current Message ID
     */
    int getMessageId();
    
    /**
     * Set Message ID.
     * @param value - new value.
     */
    void setMessageId(int value);
}
