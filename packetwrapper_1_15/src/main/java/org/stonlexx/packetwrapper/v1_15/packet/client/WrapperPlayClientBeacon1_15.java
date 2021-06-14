package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBeacon;

import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBeacon;

public class WrapperPlayClientBeacon1_15
        extends MinecraftPacket
        implements WrapperPlayClientBeacon {

    public WrapperPlayClientBeacon1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBeacon1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Primary Effect.
     * <p>
     * Notes: a Potion ID. (Was a full Integer for the plugin message)
     * @return The current Primary Effect
     */
    public int getPrimaryEffect() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Primary Effect.
     * @param value - new value.
     */
    public void setPrimaryEffect(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Secondary Effect.
     * <p>
     * Notes: a Potion ID. (Was a full Integer for the plugin message)
     * @return The current Secondary Effect
     */
    public int getSecondaryEffect() {
        return container.getIntegers().read(1);
    }
    
    /**
     * Set Secondary Effect.
     * @param value - new value.
     */
    public void setSecondaryEffect(int value) {
        container.getIntegers().write(1, value);
    }
    
}
