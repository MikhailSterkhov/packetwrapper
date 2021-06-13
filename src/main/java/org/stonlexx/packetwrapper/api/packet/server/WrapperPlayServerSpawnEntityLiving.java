package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.UUID;

public interface WrapperPlayServerSpawnEntityLiving extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.SPAWN_ENTITY_LIVING;

    /**
     * Retrieve entity ID.
     *
     * @return The current EID
     */
    int getEntityID();

    /**
     * Set entity ID.
     *
     * @param value - new value.
     */
    void setEntityID(int value);

    /**
     * Retrieve the entity that will be spawned.
     *
     * @param world - the current world of the entity.
     * @return The spawned entity.
     */
    Entity getEntity(World world);

    /**
     * Retrieve the entity that will be spawned.
     *
     * @param event - the packet event.
     * @return The spawned entity.
     */
    Entity getEntity(PacketEvent event);

    UUID getUniqueId();

    void setUniqueId(UUID value);

    /**
     * Retrieve the type of mob.
     *
     * @return The current Type
     */
    @SuppressWarnings("deprecation")
    EntityType getType();

    /**
     * Set the type of mob.
     *
     * @param value - new value.
     */
    @SuppressWarnings("deprecation")
    void setType(EntityType value);

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

    /**
     * Retrieve the yaw.
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set the yaw of the spawned mob.
     *
     * @param value - new yaw.
     */
    void setYaw(float value);

    /**
     * Retrieve the pitch.
     *
     * @return The current pitch
     */
    float getPitch();

    /**
     * Set the pitch of the spawned mob.
     *
     * @param value - new pitch.
     */
    void setPitch(float value);

    /**
     * Retrieve the yaw of the mob's head.
     *
     * @return The current yaw.
     */
    float getHeadPitch();

    /**
     * Set the yaw of the mob's head.
     *
     * @param value - new yaw.
     */
    void setHeadPitch(float value);

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

    /**
     * Retrieve the data watcher. This was removed in 1.15
     * <p>
     * Content varies by mob, see Entities.
     *
     * @return The current Metadata
     */
    WrappedDataWatcher getMetadata();

    /**
     * Set the data watcher. This was removed in 1.15.
     *
     * @param value - new value.
     */
    void setMetadata(WrappedDataWatcher value);
}
