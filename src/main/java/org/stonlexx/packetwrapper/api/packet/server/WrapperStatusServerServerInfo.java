package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedServerPing;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperStatusServerServerInfo extends WrapperPacket {
    PacketType TYPE = PacketType.Status.Server.SERVER_INFO;


    /**
     * Retrieve JSON Response.
     * <p>
     *
     * @return The current JSON Response
     */
    WrappedServerPing getJsonResponse();

    /**
     * Set JSON Response.
     *
     * @param value - new value.
     */
    void setJsonResponse(WrappedServerPing value);

}
