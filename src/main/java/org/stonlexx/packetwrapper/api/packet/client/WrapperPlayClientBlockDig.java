package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.PlayerDigType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientBlockDig extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.BLOCK_DIG;


    /**
     * Retrieve Location.
     * <p>
     * Notes: block position
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

    Direction getDirection();

    void setDirection(Direction value);

    /**
     * Retrieve Status.
     * <p>
     * Notes: the action the player is taking against the block (see below)
     *
     * @return The current Status
     */
    PlayerDigType getStatus();

    /**
     * Set Status.
     *
     * @param value - new value.
     */
    void setStatus(PlayerDigType value);
}
