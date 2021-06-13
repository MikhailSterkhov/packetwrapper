package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerEntityLook extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.ENTITY_LOOK;


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
     * Retrieve the yaw of the current entity.
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set the yaw of the current entity.
     *
     * @param value - new yaw.
     */
    void setYaw(float value);

    /**
     * Retrieve the pitch of the current entity.
     *
     * @return The current pitch
     */
    float getPitch();

    /**
     * Set the pitch of the current entity.
     *
     * @param value - new pitch.
     */
    void setPitch(float value);

    /**
     * Retrieve On Ground.
     *
     * @return The current On Ground
     */
    boolean getOnGround();

    /**
     * Set On Ground.
     *
     * @param value - new value.
     */
    void setOnGround(boolean value);
}
