package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.bukkit.Material;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerBlockAction extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.BLOCK_ACTION;


    /**
     * Retrieve Location.
     * <p>
     * Notes: block Coordinates
     *
     * @return The current Location
     */
    BlockPosition getLocation();

    /**
     * Set Location.
     *
     * @param value - new value.
     */
    void setLocation(BlockPosition value);

    /**
     * Retrieve Byte 1.
     * <p>
     * Notes: varies depending on block - see Block_Actions
     *
     * @return The current Byte 1
     */
    int getByte1();

    /**
     * Set Byte 1.
     *
     * @param value - new value.
     */
    void setByte1(int value);

    /**
     * Retrieve Byte 2.
     * <p>
     * Notes: varies depending on block - see Block_Actions
     *
     * @return The current Byte 2
     */
    int getByte2();

    /**
     * Set Byte 2.
     *
     * @param value - new value.
     */
    void setByte2(int value);

    /**
     * Retrieve Block Type.
     * <p>
     * Notes: the block type for the block
     *
     * @return The current Block Type
     */
    Material getBlockType();

    /**
     * Set Block Type.
     *
     * @param value - new value.
     */
    void setBlockType(Material value);

}
