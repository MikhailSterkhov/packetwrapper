package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.EntityUseAction;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientUseEntity extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.USE_ENTITY;


    /**
     * Retrieve entity ID of the target.
     *
     * @return The current entity ID
     */
    int getTargetID();

    /**
     * Set entity ID of the target.
     *
     * @param value - new value.
     */
    void setTargetID(int value);

    /**
     * Retrieve the entity that was targeted.
     *
     * @param world - the current world of the entity.
     * @return The targeted entity.
     */
    Entity getTarget(World world);

    /**
     * Retrieve the entity that was targeted.
     *
     * @param event - the packet event.
     * @return The targeted entity.
     */
    Entity getTarget(PacketEvent event);

    /**
     * Retrieve Type.
     *
     * @return The current Type
     */
    EntityUseAction getType();

    /**
     * Set Type.
     *
     * @param value - new value.
     */
    void setType(EntityUseAction value);

    /**
     * Retrieve the target vector.
     * <p>
     * Notes: Only if {@link #getType()} is {@link EntityUseAction#INTERACT_AT;
     * <p>
     * /**
     * Set the target vector.
     *
     * @param value - new value.
     */
    void setTargetVector(Vector value);
}
