package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientBeacon extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.BEACON;


    /**
     * Retrieve Primary Effect.
     * <p>
     * Notes: a Potion ID. (Was a full Integer for the plugin message)
     *
     * @return The current Primary Effect
     */
    int getPrimaryEffect();

    /**
     * Set Primary Effect.
     *
     * @param value - new value.
     */
    void setPrimaryEffect(int value);

    /**
     * Retrieve Secondary Effect.
     * <p>
     * Notes: a Potion ID. (Was a full Integer for the plugin message)
     *
     * @return The current Secondary Effect
     */
    int getSecondaryEffect();

    /**
     * Set Secondary Effect.
     *
     * @param value - new value.
     */
    void setSecondaryEffect(int value);

}
