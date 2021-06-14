package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerBlockBreak;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;
import com.comphenix.protocol.wrappers.WrappedBlockData;

public class WrapperPlayServerBlockBreak1_15 
        extends MinecraftPacket
        implements WrapperPlayServerBlockBreak {

    public WrapperPlayServerBlockBreak1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerBlockBreak1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: position where the digging was happening
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
    
    /**
     * Retrieve Block.
     * <p>
     * Notes: block state ID of the block that should be at that position now.
     * @return The current Block
     */
    public WrappedBlockData getBlock() {
        return container.getBlockData().read(0);
    }
    
    /**
     * Set Block.
     * @param value - new value.
     */
    public void setBlock(WrappedBlockData value) {
        container.getBlockData().write(0, value);
    }
    
    /**
     * Retrieve Status.
     * <p>
     * Notes: same as Player Digging. Only Started digging (0), Cancelled digging (1), and Finished digging (2) are used.
     * @return The current Status
     */
    public PlayerDigType getStatus() {
        return container.getPlayerDigTypes().read(0);
    }
    
    /**
     * Set Status.
     * @param value - new value.
     */
    public void setStatus(PlayerDigType value) {
        container.getPlayerDigTypes().write(0, value);
    }
    
    /**
     * Retrieve Successful.
     * <p>
     * Notes: true if the digging succeeded; false if the client should undo any changes it made locally. (How does this work?)
     * @return The current Successful
     */
    public boolean getSuccessful() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Successful.
     * @param value - new value.
     */
    public void setSuccessful(boolean value) {
        container.getBooleans().write(0, value);
    }
    
}
