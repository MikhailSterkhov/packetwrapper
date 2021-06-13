package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerEntityVelocity extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.ENTITY_VELOCITY;


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
     * Retrieve the velocity in the x axis.
     *
     * @return The current velocity X
     */
    double getVelocityX();

    /**
     * Set the velocity in the x axis.
     *
     * @param value - new value.
     */
    void setVelocityX(double value);

    /**
     * Retrieve the velocity in the y axis.
     *
     * @return The current velocity y
     */
    double getVelocityY();

    /**
     * Set the velocity in the y axis.
     *
     * @param value - new value.
     */
    void setVelocityY(double value);

    /**
     * Retrieve the velocity in the z axis.
     *
     * @return The current velocity z
     */
    double getVelocityZ();

    /**
     * Set the velocity in the z axis.
     *
     * @param value - new value.
     */
    void setVelocityZ(double value);
}
