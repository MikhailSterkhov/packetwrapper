package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedAttribute;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerUpdateAttributes extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.UPDATE_ATTRIBUTES;


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
     * Retrieve the collection of attributes associated with the entity.
     *
     * @return The current attributes.
     */
    List<WrappedAttribute> getAttributes();

    /**
     * Set the new or updated attributes associated with the entity.
     *
     * @param value - new/updated attributes.
     */
    void setAttributes(List<WrappedAttribute> value);
}
