package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCollect extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.COLLECT;


    /**
     * Retrieve Collected Entity ID.
     *
     * @return The current Collected Entity ID
     */
    int getCollectedEntityId();

    /**
     * Set Collected Entity ID.
     *
     * @param value - new value.
     */
    void setCollectedEntityId(int value);

    /**
     * Retrieve Collector Entity ID.
     *
     * @return The current Collector Entity ID
     */
    int getCollectorEntityId();

    /**
     * Set Collector Entity ID.
     *
     * @param value - new value.
     */
    void setCollectorEntityId(int value);

}
