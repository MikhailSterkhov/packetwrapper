package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.ResourcePackStatus;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientResourcePackStatus extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Client.RESOURCE_PACK_STATUS;


    /**
     * Retrieve Result.
     * <p>
     * Notes: successfully loaded: 0, Declined: 1, Failed download: 2, Accepted:
     * 3
     *
     * @return The current Result
     */
    ResourcePackStatus getResult();

    /**
     * Set Result.
     *
     * @param value - new value.
     */
    void setResult(ResourcePackStatus value);
}
