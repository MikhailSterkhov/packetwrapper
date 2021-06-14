package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerEntitySound;

import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;

import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;

public class WrapperPlayServerEntitySound1_15 
        extends MinecraftPacket
        implements WrapperPlayServerEntitySound {

    public WrapperPlayServerEntitySound1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerEntitySound1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Sound ID.
     * <p>
     * Notes: iD of hardcoded sound event (events as of 1.15.2)
     * @return The current Sound ID
     */
    public Sound getSound() {
        return container.getSoundEffects().read(0);
    }
    
    /**
     * Set Sound ID.
     * @param value - new value.
     */
    public void setSound(Sound value) {
        container.getSoundEffects().write(0, value);
    }
    
    /**
     * Retrieve Sound Category.
     * <p>
     * Notes: the category that this sound will be played from (current categories)
     * @return The current Sound Category
     */
    public SoundCategory getSoundCategory() {
        return container.getSoundCategories().read(0);
    }
    
    /**
     * Set Sound Category.
     * @param value - new value.
     */
    public void setSoundCategory(SoundCategory value) {
        container.getSoundCategories().write(0, value);
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
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityID(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve Volume.
     * <p>
     * Notes: 1.0 is 100%, capped between 0.0 and 1.0 by Notchian clients
     * @return The current Volume
     */
    public float getVolume() {
        return container.getFloat().read(0);
    }
    
    /**
     * Set Volume.
     * @param value - new value.
     */
    public void setVolume(float value) {
        container.getFloat().write(0, value);
    }
    
    /**
     * Retrieve Pitch.
     * <p>
     * Notes: float between 0.5 and 2.0 by Notchian clients
     * @return The current Pitch
     */
    public float getPitch() {
        return container.getFloat().read(1);
    }
    
    /**
     * Set Pitch.
     * @param value - new value.
     */
    public void setPitch(float value) {
        container.getFloat().write(1, value);
    }
    
}
