package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerLightUpdate extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.LIGHT_UPDATE;


    /**
     * Retrieve Chunk X.
     * <p>
     * Notes: chunk coordinate (block coordinate divided by 16, rounded down)
     *
     * @return The current Chunk X
     */
    int getChunkX();

    /**
     * Set Chunk X.
     *
     * @param value - new value.
     */
    void setChunkX(int value);

    /**
     * Retrieve Chunk Z.
     * <p>
     * Notes: chunk coordinate (block coordinate divided by 16, rounded down)
     *
     * @return The current Chunk Z
     */
    int getChunkZ();

    /**
     * Set Chunk Z.
     *
     * @param value - new value.
     */
    void setChunkZ(int value);

    /**
     * Retrieve Sky Light Mask.
     * <p>
     * Notes: mask containing 18 bits, with the lowest bit corresponding to chunk section -1 (in the void, y=-16 to y=-1) and the highest bit for chunk section 16 (above the world, y=256 to y=271)
     *
     * @return The current Sky Light Mask
     */
    int getSkyLightMask();

    /**
     * Set Sky Light Mask.
     *
     * @param value - new value.
     */
    void setSkyLightMask(int value);

    /**
     * Retrieve Block Light Mask.
     * <p>
     * Notes: mask containing 18 bits, with the same order as sky light
     *
     * @return The current Block Light Mask
     */
    int getBlockLightMask();

    /**
     * Set Block Light Mask.
     *
     * @param value - new value.
     */
    void setBlockLightMask(int value);

    /**
     * Retrieve Empty Sky Light Mask.
     * <p>
     * Notes: mask containing 18 bits, which indicates sections that have 0 for all their sky light values. If a section is set in both this mask and the main sky light mask, it is ignored for this mask and it is included in the sky light arrays (the notchian server does not create such masks). If it is only set in this mask, it is not included in the sky light arrays.
     *
     * @return The current Empty Sky Light Mask
     */
    int getEmptySkyLightMask();

    /**
     * Set Empty Sky Light Mask.
     *
     * @param value - new value.
     */
    void setEmptySkyLightMask(int value);

    /**
     * Retrieve Empty Block Light Mask.
     * <p>
     * Notes: mask containing 18 bits, which indicates sections that have 0 for all their block light values. If a section is set in both this mask and the main block light mask, it is ignored for this mask and it is included in the block light arrays (the notchian server does not create such masks). If it is only set in this mask, it is not included in the block light arrays.
     *
     * @return The current Empty Block Light Mask
     */
    int getEmptyBlockLightMask();

    /**
     * Set Empty Block Light Mask.
     *
     * @param value - new value.
     */
    void setEmptyBlockLightMask(int value);

    /**
     * Retrieve Sky Light arrays.
     * <p>
     * Notes: array
     *
     * @return The current Sky Light arrays
     */
    List<BlockPosition> getSkyLightArrays();

    /**
     * Set Sky Light arrays.
     *
     * @param value - new value.
     */
    void setSkyLightArrays(List<BlockPosition> value);

    /**
     * Retrieve Sky Light array.
     * <p>
     * Notes: there is 1 array for each bit set to true in the sky light mask, starting with the lowest value. Half a byte per light value.
     *
     * @return The current Sky Light array
     */
    List<BlockPosition> getSkyLightArray();

    /**
     * Set Sky Light array.
     *
     * @param value - new value.
     */
    void setSkyLightArray(List<BlockPosition> value);

}
