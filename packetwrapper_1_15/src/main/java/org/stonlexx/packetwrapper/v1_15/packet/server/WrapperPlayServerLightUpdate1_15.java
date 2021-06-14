package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerLightUpdate;

import java.util.List;

public class WrapperPlayServerLightUpdate1_15 
        extends MinecraftPacket
        implements WrapperPlayServerLightUpdate {

    public WrapperPlayServerLightUpdate1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerLightUpdate1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: chunk coordinate (block coordinate divided by 16, rounded down)
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
     * Notes: chunk coordinate (block coordinate divided by 16, rounded down)
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
    
    /**
     * Retrieve Sky Light Mask.
     * <p>
     * Notes: mask containing 18 bits, with the lowest bit corresponding to chunk section -1 (in the void, y=-16 to y=-1) and the highest bit for chunk section 16 (above the world, y=256 to y=271)
     * @return The current Sky Light Mask
     */
    public int getSkyLightMask() {
        return container.getIntegers().read(2);
    }
    
    /**
     * Set Sky Light Mask.
     * @param value - new value.
     */
    public void setSkyLightMask(int value) {
        container.getIntegers().write(2, value);
    }
    
    /**
     * Retrieve Block Light Mask.
     * <p>
     * Notes: mask containing 18 bits, with the same order as sky light
     * @return The current Block Light Mask
     */
    public int getBlockLightMask() {
        return container.getIntegers().read(3);
    }
    
    /**
     * Set Block Light Mask.
     * @param value - new value.
     */
    public void setBlockLightMask(int value) {
        container.getIntegers().write(3, value);
    }
    
    /**
     * Retrieve Empty Sky Light Mask.
     * <p>
     * Notes: mask containing 18 bits, which indicates sections that have 0 for all their sky light values. If a section is set in both this mask and the main sky light mask, it is ignored for this mask and it is included in the sky light arrays (the notchian server does not create such masks). If it is only set in this mask, it is not included in the sky light arrays.
     * @return The current Empty Sky Light Mask
     */
    public int getEmptySkyLightMask() {
        return container.getIntegers().read(4);
    }
    
    /**
     * Set Empty Sky Light Mask.
     * @param value - new value.
     */
    public void setEmptySkyLightMask(int value) {
        container.getIntegers().write(4, value);
    }
    
    /**
     * Retrieve Empty Block Light Mask.
     * <p>
     * Notes: mask containing 18 bits, which indicates sections that have 0 for all their block light values. If a section is set in both this mask and the main block light mask, it is ignored for this mask and it is included in the block light arrays (the notchian server does not create such masks). If it is only set in this mask, it is not included in the block light arrays.
     * @return The current Empty Block Light Mask
     */
    public int getEmptyBlockLightMask() {
        return container.getIntegers().read(5);
    }
    
    /**
     * Set Empty Block Light Mask.
     * @param value - new value.
     */
    public void setEmptyBlockLightMask(int value) {
        container.getIntegers().write(5, value);
    }
    
    /**
     * Retrieve Sky Light arrays.
     * <p>
     * Notes: array
     * @return The current Sky Light arrays
     */
    public List<BlockPosition> getSkyLightArrays() {
        return container.getBlockPositionCollectionModifier().read(0);
    }
    
    /**
     * Set Sky Light arrays.
     * @param value - new value.
     */
    public void setSkyLightArrays(List<BlockPosition> value) {
        container.getBlockPositionCollectionModifier().write(0, value);
    }
    
    /**
     * Retrieve Sky Light array.
     * <p>
     * Notes: there is 1 array for each bit set to true in the sky light mask, starting with the lowest value. Half a byte per light value.
     * @return The current Sky Light array
     */
    public List<BlockPosition> getSkyLightArray() {
        return container.getBlockPositionCollectionModifier().read(1);
    }
    
    /**
     * Set Sky Light array.
     * @param value - new value.
     */
    public void setSkyLightArray(List<BlockPosition> value) {
        container.getBlockPositionCollectionModifier().write(1, value);
    }
    
    // Cannot generate field Block Light arrays
    // Cannot generate field Block Light array
}
