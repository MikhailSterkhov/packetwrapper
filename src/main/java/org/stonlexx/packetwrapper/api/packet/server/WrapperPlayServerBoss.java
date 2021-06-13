package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.boss.BarColor;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.UUID;

public interface WrapperPlayServerBoss extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.BOSS;


    /**
     * Retrieve UUID.
     * <p>
     * Notes: unique ID for this bar
     *
     * @return The current UUID
     */
    UUID getUniqueId();

    /**
     * Set UUID.
     *
     * @param value - new value.
     */
    void setUniqueId(UUID value);

    Action getAction();

    void setAction(Action value);

    WrappedChatComponent getTitle();

    void setTitle(WrappedChatComponent value);

    float getHealth();

    void setHealth(float value);

    BarColor getColor();

    void setColor(BarColor value);

    BarStyle getStyle();

    void setStyle(BarStyle value);

    boolean isDarkenSky();

    void setDarkenSky(boolean value);

    boolean isPlayMusic();

    void setPlayMusic(boolean value);

    boolean isCreateFog();

    void setCreateFog(boolean value);

    enum Action {
        ADD, REMOVE, UPDATE_PCT, UPDATE_NAME, UPDATE_STYLE, UPDATE_PROPERTIES;
    }

    enum BarStyle {
        PROGRESS, NOTCHED_6, NOTCHED_10, NOTCHED_12, NOTCHED_20;
    }
}
