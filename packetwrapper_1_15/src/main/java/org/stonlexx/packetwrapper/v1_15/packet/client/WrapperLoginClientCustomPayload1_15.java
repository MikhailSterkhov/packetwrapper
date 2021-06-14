package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperLoginClientCustomPayload;

public class WrapperLoginClientCustomPayload1_15
        extends MinecraftPacket
        implements WrapperLoginClientCustomPayload {

    public WrapperLoginClientCustomPayload1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperLoginClientCustomPayload1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Message ID.
     * <p>
     * Notes: should match ID from server.
     * @return The current Message ID
     */
    public int getMessageId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Message ID.
     * @param value - new value.
     */
    public void setMessageId(int value) {
        container.getIntegers().write(0, value);
    }
    
    // Cannot find type for b
    // Cannot find type for b
}
