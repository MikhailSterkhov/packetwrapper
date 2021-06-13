package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;

import org.bukkit.World;
import org.bukkit.entity.Entity;

public interface WrapperPlayClientEntityNbtQuery extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.ENTITY_NBT_QUERY;
    
    
    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: an incremental ID so that the client can verify that the response matches.
     * @return The current Transaction ID
     */
    int getTransactionId();
    
    /**
     * Set Transaction ID.
     * @param value - new value.
     */
    void setTransactionId(int value);
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: the ID of the entity to query.
     * @return The current Entity ID
     */
    int getEntityID();
    
    /**
     * Retrieve the entity involved in this event.
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    Entity getEntity(World world);
    
    /**
     * Retrieve the entity involved in this event.
     * @param event - the packet event.
     * @return The involved entity.
     */
    Entity getEntity(PacketEvent event);
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    void setEntityID(int value);
    
}
