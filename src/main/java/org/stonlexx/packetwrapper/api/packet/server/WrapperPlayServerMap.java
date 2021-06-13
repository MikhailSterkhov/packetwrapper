package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.AutoWrapper;
import com.comphenix.protocol.wrappers.BukkitConverters;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerMap extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.MAP;

	AutoWrapper<MapIcon> ICON_WRAPPER = AutoWrapper.wrap(MapIcon.class, "MapIcon")
            .field(0, EnumWrappers.getGenericConverter(MinecraftReflection.getMinecraftClass("MapIcon$Type"), MapIconType.class))
            .field(4, BukkitConverters.getWrappedChatComponentConverter());

    /**
     * Retrieve Item Damage.
     * <p>
     * Notes: the damage value of the map being modified
     *
     * @return The current Item Damage
     */
    int getItemDamage();

    /**
     * Set Item Damage.
     *
     * @param value - new value.
     */
    void setItemDamage(int value);

    /**
     * Retrieve Scale.
     *
     * @return The current Scale
     */
    byte getScale();

    /**
     * Set Scale.
     *
     * @param value - new value.
     */
    void setScale(byte value);

    boolean getTrackingPosition();

    void setTrackingPosition(boolean value);

    boolean isLocked();

    void setLocked(boolean value);

    MapIcon[] getMapIcons();

    void setMapIcons(MapIcon[] value);

    int getColumns();

    void setColumns(int value);

    int getRows();

    void setRows(int value);

    int getX();

    void setX(int value);

    int getZ();

    void setZ(int value);

    byte[] getData();

    void setData(byte[] value);

    enum MapIconType {
        PLAYER,
        FRAME,
        RED_MARKER,
        BLUE_MARKER,
        TARGET_X,
        TARGET_POINT,
        PLAYER_OFF_MAP,
        PLAYER_OFF_LIMITS,
        MANSION,
        MONUMENT,
        BANNER_WHITE,
        BANNER_ORANGE,
        BANNER_MAGENTA,
        BANNER_LIGHT_BLUE,
        BANNER_YELLOW,
        BANNER_LIME,
        BANNER_PINK,
        BANNER_GRAY,
        BANNER_LIGHT_GRAY,
        BANNER_CYAN,
        BANNER_PURPLE,
        BANNER_BLUE,
        BANNER_BROWN,
        BANNER_GREEN,
        BANNER_RED,
        BANNER_BLACK,
        RED_X;
    }

    class MapIcon {
        MapIconType type;
        byte x;
        byte y;
        byte rotation;
        WrappedChatComponent name;
    }
}
