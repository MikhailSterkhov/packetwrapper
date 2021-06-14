package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerViewCentre;


public class WrapperPlayServerViewCentre1_15 
        extends MinecraftPacket
        implements WrapperPlayServerViewCentre {

    public WrapperPlayServerViewCentre1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerViewCentre1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: chunk X coordinate of the player's position
     * @return The current Chunk X
     */
    public int getChunkX() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Chunk X.
     * @param value - new value.
     */
    public void setChunkX(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Chunk Z.
     * <p>
     * Notes: chunk Z coordinate of the player's position
     * @return The current Chunk Z
     */
    public int getChunkZ() {
        return container.getIntegers().read(1);
    }
    
    /**
     * Set Chunk Z.
     * @param value - new value.
     */
    public void setChunkZ(int value) {
        container.getIntegers().write(1, value);
    }
    
}
