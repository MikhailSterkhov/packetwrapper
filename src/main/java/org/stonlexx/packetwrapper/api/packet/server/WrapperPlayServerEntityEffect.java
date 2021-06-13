package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerEntityEffect extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.ENTITY_EFFECT;


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
     * Retrieve Effect ID.
     * <p>
     * Notes: see [[1]]
     *
     * @return The current Effect ID
     */
    byte getEffectID();

    /**
     * Set Effect ID.
     *
     * @param value - new value.
     */
    void setEffectID(byte value);

    /**
     * Retrieve Amplifier.
     *
     * @return The current Amplifier
     */
    byte getAmplifier();

    /**
     * Set Amplifier.
     *
     * @param value - new value.
     */
    void setAmplifier(byte value);

    /**
     * Retrieve Duration.
     *
     * @return The current Duration
     */
    int getDuration();

    /**
     * Set Duration.
     *
     * @param value - new value.
     */
    void setDuration(int value);

    /**
     * Retrieve Hide Particles.
     *
     * @return The current Hide Particles
     */
    boolean getHideParticles();

    /**
     * Set Hide Particles.
     *
     * @param value - new value.
     */
    void setHideParticles(boolean value);

}
