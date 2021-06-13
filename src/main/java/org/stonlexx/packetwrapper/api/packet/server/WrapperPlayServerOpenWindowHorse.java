package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerOpenWindowHorse extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.OPEN_WINDOW_HORSE;


    /**
     * Retrieve Window ID?.
     *
     * @return The current Window ID?
     */
    int getWindowId();

    /**
     * Set Window ID?.
     *
     * @param value - new value.
     */
    void setWindowId(int value);

    /**
     * Retrieve Number of slots?.
     *
     * @return The current Number of slots?
     */
    int getNumberOfSlots();

    /**
     * Set Number of slots?.
     *
     * @param value - new value.
     */
    void setNumberOfSlots(int value);

    /**
     * Retrieve Entity ID?.
     *
     * @return The current Entity ID?
     */
    int getEntityID();

    /**
     * Set Entity ID?.
     *
     * @param value - new value.
     */
    void setEntityID(int value);

    /**
     * Retrieve the entity involved in this event.
     *
     * @param world - the current world of the entity.
     * @return The involved entity.
     */
    Entity getEntity(World world);

    /**
     * Retrieve the entity involved in this event.
     *
     * @param event - the packet event.
     * @return The involved entity.
     */
    Entity getEntity(PacketEvent event);

}
