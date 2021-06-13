package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.nbt.NbtBase;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerTileEntityData extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.TILE_ENTITY_DATA;


    /**
     * Retrieve Location.
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
     * Retrieve Action.
     * <p>
     * Notes: the type of update to perform
     *
     * @return The current Action
     */
    int getAction();

    /**
     * Set Action.
     *
     * @param value - new value.
     */
    void setAction(int value);

    /**
     * Retrieve NBT Data.
     * <p>
     * Notes: if not present then its TAG_END (0)
     *
     * @return The current NBT Data
     */
    NbtBase<?> getNbtData();

    /**
     * Set NBT Data.
     *
     * @param value - new value.
     */
    void setNbtData(NbtBase<?> value);

}
