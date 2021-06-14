package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerViewDistance;


public class WrapperPlayServerViewDistance1_15 
        extends MinecraftPacket
        implements WrapperPlayServerViewDistance {

    public WrapperPlayServerViewDistance1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerViewDistance1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve View Distance.
     * <p>
     * Notes: render distance (2-32)
     * @return The current View Distance
     */
    public int getViewDistance() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set View Distance.
     * @param value - new value.
     */
    public void setViewDistance(int value) {
        container.getIntegers().write(0, value);
    }
    
}
