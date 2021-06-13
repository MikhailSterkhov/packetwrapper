package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerUpdateTime extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.UPDATE_TIME;


    /**
     * Retrieve Age of the world.
     * <p>
     * Notes: in ticks; not changed by server commands
     *
     * @return The current Age of the world
     */
    long getAgeOfTheWorld();

    /**
     * Set Age of the world.
     *
     * @param value - new value.
     */
    void setAgeOfTheWorld(long value);

    /**
     * Retrieve Time of day.
     * <p>
     * Notes: the world (or region) time, in ticks. If negative the sun will
     * stop moving at the Math.abs of the time
     *
     * @return The current Time of day
     */
    long getTimeOfDay();

    /**
     * Set Time of day.
     *
     * @param value - new value.
     */
    void setTimeOfDay(long value);

}
