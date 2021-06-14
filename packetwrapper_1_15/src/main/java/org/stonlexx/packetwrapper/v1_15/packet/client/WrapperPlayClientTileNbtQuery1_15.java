package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientTileNbtQuery;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayClientTileNbtQuery1_15 
        extends MinecraftPacket
        implements WrapperPlayClientTileNbtQuery {

    public WrapperPlayClientTileNbtQuery1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientTileNbtQuery1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: an incremental ID so that the client can verify that the response matches.
     * @return The current Transaction ID
     */
    public int getTransactionId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Transaction ID.
     * @param value - new value.
     */
    public void setTransactionId(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: the location of the block to check.
     * @return The current Location
     */
    public BlockPosition getLocation() {
        return container.getBlockPositionModifier().read(0);
    }
    
    /**
     * Set Location.
     * @param value - new value.
     */
    public void setLocation(BlockPosition value) {
        container.getBlockPositionModifier().write(0, value);
    }
    
}
