package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientBookEdit;


import org.bukkit.inventory.ItemStack;

public class WrapperPlayClientBookEdit1_15 
        extends MinecraftPacket
        implements WrapperPlayClientBookEdit {

    public WrapperPlayClientBookEdit1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientBookEdit1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve New book.
     * @return The current New book
     */
    public ItemStack getNewBook() {
        return container.getItemModifier().read(0);
    }
    
    /**
     * Set New book.
     * @param value - new value.
     */
    public void setNewBook(ItemStack value) {
        container.getItemModifier().write(0, value);
    }
    
    /**
     * Retrieve Is signing.
     * <p>
     * Notes: true if the player is signing the book; false if the player is saving a draft.
     * @return The current Is signing
     */
    public boolean getIsSigning() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Is signing.
     * @param value - new value.
     */
    public void setIsSigning(boolean value) {
        container.getBooleans().write(0, value);
    }
}
