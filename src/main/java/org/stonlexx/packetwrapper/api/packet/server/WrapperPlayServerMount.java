package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.List;

public interface WrapperPlayServerMount extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.MOUNT;


    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: vehicle's EID
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
     * Retrieve the entity involved in this event.
     *
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    Entity getEntity(World world);

    /**
     * Retrieve the entity involved in this event.
     *
     * @param event - the packet event.
     * @return The involved entity.
     */
    Entity getEntity(PacketEvent event);

    int[] getPassengerIds();

    void setPassengerIds(int[] value);

    List<Entity> getPassengers(PacketEvent event);

    List<Entity> getPassengers(World world);

    void setPassengers(List<Entity> value);
}
