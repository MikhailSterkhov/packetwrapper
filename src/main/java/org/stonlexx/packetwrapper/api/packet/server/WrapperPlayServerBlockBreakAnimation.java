package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerBlockBreakAnimation extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.BLOCK_BREAK_ANIMATION;


    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity's ID
     *
     * @return The current Entity ID
     */
    int getEntityID();

    /**
     * Set Entity ID.
     *
     * @param value - new value.
     */
    void setEntityID(int value);

    /**
     * Retrieve the entity of the painting that will be spawned.
     *
     * @param world - the current world of the entity.
     * @return The spawned entity.
     */
    Entity getEntity(World world);

    /**
     * Retrieve the entity of the painting that will be spawned.
     *
     * @param event - the packet event.
     * @return The spawned entity.
     */
    Entity getEntity(PacketEvent event);

    /**
     * Retrieve Location.
     * <p>
     * Notes: block Position
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
     * Retrieve Destroy Stage.
     * <p>
     * Notes: 0 - 9
     *
     * @return The current Destroy Stage
     */
    int getDestroyStage();

    /**
     * Set Destroy Stage.
     *
     * @param value - new value.
     */
    void setDestroyStage(int value);

}
