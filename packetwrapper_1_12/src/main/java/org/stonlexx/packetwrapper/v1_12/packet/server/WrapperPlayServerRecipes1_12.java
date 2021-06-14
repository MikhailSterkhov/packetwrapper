package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerRecipes;

public class WrapperPlayServerRecipes1_12 
        extends MinecraftPacket
        implements WrapperPlayServerRecipes {


    public WrapperPlayServerRecipes1_12() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerRecipes1_12(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieve Action.
     * <p>
     * Notes: 0: init, 1: add, 2: remove
     * @return The current Action
     */
    public Action getAction() {
        return container.getEnumModifier(Action.class, 0).readSafely(0);
    }

    /**
     * Set Action.
     * @param value - new value.
     */
    public void setAction(Action value) {
        container.getEnumModifier(Action.class, 0).writeSafely(0, value);
    }
    
    /**
     * Retrieve Crafting Book Open.
     * <p>
     * Notes: if true, then the crafting book will be open when the player opens its inventory.
     * @return The current Crafting Book Open
     */
    public boolean getCraftingBookOpen() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Crafting Book Open.
     * @param value - new value.
     */
    public void setCraftingBookOpen(boolean value) {
        container.getBooleans().write(0, value);
    }
    
    /**
     * Retrieve Filtering Craftable.
     * <p>
     * Notes: if true, then the filtering option is active when the players opens its inventory.
     * @return The current Filtering Craftable
     */
    public boolean getFilteringCraftable() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Filtering Craftable.
     * @param value - new value.
     */
    public void setFilteringCraftable(boolean value) {
        container.getBooleans().write(0, value);
    }
}
