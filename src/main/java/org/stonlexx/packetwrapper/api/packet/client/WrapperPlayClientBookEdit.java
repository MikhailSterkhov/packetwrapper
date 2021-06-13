package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientBookEdit extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.B_EDIT;


    /**
     * Retrieve New book.
     *
     * @return The current New book
     */
    ItemStack getNewBook();

    /**
     * Set New book.
     *
     * @param value - new value.
     */
    void setNewBook(ItemStack value);

    /**
     * Retrieve Is signing.
     * <p>
     * Notes: true if the player is signing the book; false if the player is saving a draft.
     *
     * @return The current Is signing
     */
    boolean getIsSigning();

    /**
     * Set Is signing.
     *
     * @param value - new value.
     */
    void setIsSigning(boolean value);
}
