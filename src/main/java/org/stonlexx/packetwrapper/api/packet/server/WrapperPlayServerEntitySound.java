package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;

import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public interface WrapperPlayServerEntitySound extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.ENTITY_SOUND;
    
    
    /**
     * Retrieve Sound ID.
     * <p>
     * Notes: iD of hardcoded sound event (events as of 1.15.2)
     * @return The current Sound ID
     */
    Sound getSound();
    
    /**
     * Set Sound ID.
     * @param value - new value.
     */
    void setSound(Sound value);
    
    /**
     * Retrieve Sound Category.
     * <p>
     * Notes: the category that this sound will be played from (current categories)
     * @return The current Sound Category
     */
    SoundCategory getSoundCategory();
    
    /**
     * Set Sound Category.
     * @param value - new value.
     */
    void setSoundCategory(SoundCategory value);
    
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
     * Retrieve Volume.
     * <p>
     * Notes: 1.0 is 100%, capped between 0.0 and 1.0 by Notchian clients
     * @return The current Volume
     */
    float getVolume();
    
    /**
     * Set Volume.
     * @param value - new value.
     */
    void setVolume(float value);
    
    /**
     * Retrieve Pitch.
     * <p>
     * Notes: float between 0.5 and 2.0 by Notchian clients
     * @return The current Pitch
     */
    float getPitch();
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    void setPitch(float value);
    
}
