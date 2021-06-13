package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.AutoWrapper;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientUseItem extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.USE_ITEM;


    Class<?> POSITION_CLASS = MinecraftReflection.getMinecraftClass("MovingObjectPositionBlock");

    AutoWrapper<MovingObjectPosition> AUTO_WRAPPER = AutoWrapper.wrap(MovingObjectPosition.class, POSITION_CLASS)
            .field(0, EnumWrappers.getDirectionConverter())
            .field(1, BlockPosition.getConverter());

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

    Direction getFace();

    void setFace(Direction value);

    Hand getHand();

    void setHand(Hand value);

    /**
     * Retrieve Cursor Position X.
     * <p>
     * Notes: the position of the crosshair on the block, from 0 to 15
     * increasing from west to east
     *
     * @return The current Cursor Position X
     */
    float getCursorPositionX();

    /**
     * Set Cursor Position X.
     *
     * @param value - new value.
     */
    void setCursorPositionX(float value);

    /**
     * Retrieve Cursor Position Y.
     * <p>
     * Notes: the position of the crosshair on the block, from 0 to 15
     * increasing from bottom to top
     *
     * @return The current Cursor Position Y
     */
    float getCursorPositionY();

    /**
     * Set Cursor Position Y.
     *
     * @param value - new value.
     */
    void setCursorPositionY(float value);

    /**
     * Retrieve Cursor Position Z.
     * <p>
     * Notes: the position of the crosshair on the block, from 0 to 15
     * increasing from north to south
     *
     * @return The current Cursor Position Z
     */
    float getCursorPositionZ();

    /**
     * Set Cursor Position Z.
     *
     * @param value - new value.
     */
    void setCursorPositionZ(float value);

    MovingObjectPosition getPosition();

    void setPosition(MovingObjectPosition position);

    class MovingObjectPosition {

        public Direction direction;
        public BlockPosition position;
        public boolean insideBlock;
    }
}
