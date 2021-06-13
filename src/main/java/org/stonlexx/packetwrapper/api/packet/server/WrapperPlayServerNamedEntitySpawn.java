package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.UUID;

public interface WrapperPlayServerNamedEntitySpawn extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.NAMED_ENTITY_SPAWN;


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
     * Retrieve Player UUID.
     * <p>
     * Notes: player's UUID
     *
     * @return The current Player UUID
     */
    UUID getPlayerUUID();

    /**
     * Set Player UUID.
     *
     * @param value - new value.
     */
    void setPlayerUUID(UUID value);

    /**
     * Retrieve the position of the spawned entity as a vector.
     *
     * @return The position as a vector.
     */
    Vector getPosition();

    /**
     * Set the position of the spawned entity using a vector.
     *
     * @param position - the new position.
     */
    void setPosition(Vector position);

    double getX();

    void setX(double value);

    double getY();

    void setY(double value);

    double getZ();

    void setZ(double value);

    /**
     * Retrieve the yaw of the spawned entity.
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set the yaw of the spawned entity.
     *
     * @param value - new yaw.
     */
    void setYaw(float value);

    /**
     * Retrieve the pitch of the spawned entity.
     *
     * @return The current pitch
     */
    float getPitch();

    /**
     * Set the pitch of the spawned entity.
     *
     * @param value - new pitch.
     */
    void setPitch(float value);

    /**
     * Retrieve Metadata.
     * <p>
     * Notes: the client will crash if no metadata is sent
     *
     * @return The current Metadata
     */
    WrappedDataWatcher getMetadata();

    /**
     * Set Metadata.
     *
     * @param value - new value.
     */
    void setMetadata(WrappedDataWatcher value);
}
