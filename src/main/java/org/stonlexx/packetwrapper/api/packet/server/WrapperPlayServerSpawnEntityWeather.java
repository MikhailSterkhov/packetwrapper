package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerSpawnEntityWeather extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.SPAWN_ENTITY_WEATHER;


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
     * Retrieve Type.
     * <p>
     * Notes: the global entity type, currently always 1 for thunderbolt.
     *
     * @return The current Type
     */
    int getType();

    /**
     * Set Type.
     *
     * @param value - new value.
     */
    void setType(int value);

    /**
     * Retrieve the x position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current X
     */
    double getX();

    /**
     * Set the x position of the object.
     *
     * @param value - new value.
     */
    void setX(double value);

    /**
     * Retrieve the y position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current y
     */
    double getY();

    /**
     * Set the y position of the object.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve the z position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current z
     */
    double getZ();

    /**
     * Set the z position of the object.
     *
     * @param value - new value.
     */
    void setZ(double value);
}
