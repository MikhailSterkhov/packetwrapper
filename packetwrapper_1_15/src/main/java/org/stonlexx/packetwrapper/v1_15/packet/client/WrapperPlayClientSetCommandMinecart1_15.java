package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSetCommandMinecart;

import com.comphenix.protocol.events.PacketEvent;

import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayClientSetCommandMinecart1_15 
        extends MinecraftPacket
        implements WrapperPlayClientSetCommandMinecart {

    public WrapperPlayClientSetCommandMinecart1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetCommandMinecart1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * @return The current Entity ID
     */
    public int getEntityID() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Retrieve the entity involved in this event.
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    public Entity getEntity(World world) {
        return container.getEntityModifier(world).read(0);
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
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Command.
     * @return The current Command
     */
    public String getCommand() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Command.
     * @param value - new value.
     */
    public void setCommand(String value) {
        container.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Track Output.
     * <p>
     * Notes: if false, the output of the previous command will not be stored within the command block.
     * @return The current Track Output
     */
    public boolean getTrackOutput() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Track Output.
     * @param value - new value.
     */
    public void setTrackOutput(boolean value) {
        container.getBooleans().write(0, value);
    }
    
}
