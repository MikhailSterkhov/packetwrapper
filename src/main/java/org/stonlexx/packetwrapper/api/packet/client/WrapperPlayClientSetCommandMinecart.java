package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;

import org.bukkit.World;
import org.bukkit.entity.Entity;

public interface WrapperPlayClientSetCommandMinecart extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.SET_COMMAND_MINECART;
    
    
    /**
     * Retrieve Entity ID.
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
    
    /**
     * Retrieve Command.
     * @return The current Command
     */
    String getCommand();
    
    /**
     * Set Command.
     * @param value - new value.
     */
    void setCommand(String value);
    
    /**
     * Retrieve Track Output.
     * <p>
     * Notes: if false, the output of the previous command will not be stored within the command block.
     * @return The current Track Output
     */
    boolean getTrackOutput();
    
    /**
     * Set Track Output.
     * @param value - new value.
     */
    void setTrackOutput(boolean value);
    
}
