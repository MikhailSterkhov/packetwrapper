package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientEntityNbtQuery;

import com.comphenix.protocol.events.PacketEvent;

import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayClientEntityNbtQuery1_15 
        extends MinecraftPacket
        implements WrapperPlayClientEntityNbtQuery {

    public WrapperPlayClientEntityNbtQuery1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientEntityNbtQuery1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: an incremental ID so that the client can verify that the response matches.
     * @return The current Transaction ID
     */
    public int getTransactionId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Transaction ID.
     * @param value - new value.
     */
    public void setTransactionId(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: the ID of the entity to query.
     * @return The current Entity ID
     */
    public int getEntityID() {
        return container.getIntegers().read(1);
    }
    
    /**
     * Retrieve the entity involved in this event.
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    public Entity getEntity(World world) {
        return container.getEntityModifier(world).read(1);
    }
    
    /**
     * Retrieve the entity involved in this event.
     * @param event - the packet event.
     * @return The involved entity.
     */
    public Entity getEntity(PacketEvent event) {
        return getEntity(event.getPlayer().getWorld());
    }
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityID(int value) {
        container.getIntegers().write(1, value);
    }
    
}
