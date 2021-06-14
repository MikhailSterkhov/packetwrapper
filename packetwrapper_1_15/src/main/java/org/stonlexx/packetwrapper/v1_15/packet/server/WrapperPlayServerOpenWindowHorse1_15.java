package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerOpenWindowHorse;

import com.comphenix.protocol.events.PacketEvent;

import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayServerOpenWindowHorse1_15 
        extends MinecraftPacket
        implements WrapperPlayServerOpenWindowHorse {

    public WrapperPlayServerOpenWindowHorse1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerOpenWindowHorse1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Window ID?.
     * @return The current Window ID?
     */
    public int getWindowId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Window ID?.
     * @param value - new value.
     */
    public void setWindowId(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Number of slots?.
     * @return The current Number of slots?
     */
    public int getNumberOfSlots() {
        return container.getIntegers().read(1);
    }
    
    /**
     * Set Number of slots?.
     * @param value - new value.
     */
    public void setNumberOfSlots(int value) {
        container.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Entity ID?.
     * @return The current Entity ID?
     */
    public int getEntityID() {
        return container.getIntegers().read(2);
    }
    
    /**
     * Retrieve the entity involved in this event.
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    public Entity getEntity(World world) {
        return container.getEntityModifier(world).read(2);
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
     * Set Entity ID?.
     * @param value - new value.
     */
    public void setEntityID(int value) {
        container.getIntegers().write(2, value);
    }
    
}
