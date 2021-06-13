package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.CombatEventType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCombatEvent extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.COMBAT_EVENT;


    /**
     * Retrieve Event.
     * <p>
     * Notes: 0 ENTER_COMBAT, 1 END_COMBAT, 2 ENTITY_DEAD
     *
     * @return The current Event
     */
    CombatEventType getEvent();

    /**
     * Set Event.
     *
     * @param value - new value.
     */
    void setEvent(CombatEventType value);

    int getDuration();

    void setDuration(int value);

    int getPlayerID();

    void setPlayerId(int value);

    int getEntityID();

    void setEntityId(int value);

    String getMessage();

    void setMessage(String value);
}
