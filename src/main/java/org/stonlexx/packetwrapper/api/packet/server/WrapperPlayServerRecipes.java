package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerRecipes extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.RECIPES;
    
    
    /**
     * Retrieve Action.
     * <p>
     * Notes: 0: init, 1: add, 2: remove
     * @return The current Action
     */
    Action getAction();

    /**
     * Set Action.
     * @param value - new value.
     */
    void setAction(Action value);
    
    /**
     * Retrieve Crafting Book Open.
     * <p>
     * Notes: if true, then the crafting book will be open when the player opens its inventory.
     * @return The current Crafting Book Open
     */
    boolean getCraftingBookOpen();
    
    /**
     * Set Crafting Book Open.
     * @param value - new value.
     */
    void setCraftingBookOpen(boolean value);
    
    /**
     * Retrieve Filtering Craftable.
     * <p>
     * Notes: if true, then the filtering option is active when the players opens its inventory.
     * @return The current Filtering Craftable
     */
    boolean getFilteringCraftable();
    
    /**
     * Set Filtering Craftable.
     * @param value - new value.
     */
    void setFilteringCraftable(boolean value);

     enum Action {
        INIT,
        ADD,
        REMOVE;
    }
}
