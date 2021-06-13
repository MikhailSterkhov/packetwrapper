package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedBlockData;
import org.bukkit.Location;
import org.bukkit.World;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerBlockChange extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.BLOCK_CHANGE;


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
     * Retrieve the Bukkit Location.
     *
     * @param world World for the location
     * @return Bukkit Location
     */
    Location getBukkitLocation(World world);

    /**
     * Retrieve Block Data.
     *
     * @return The current Block Data
     */
    WrappedBlockData getBlockData();

    /**
     * Set Block Data.
     *
     * @param value - new value.
     */
    void setBlockData(WrappedBlockData value);
}
