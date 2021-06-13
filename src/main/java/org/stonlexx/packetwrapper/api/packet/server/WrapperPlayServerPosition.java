package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.utility.MinecraftReflection;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.Set;

public interface WrapperPlayServerPosition extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.POSITION;

    Class<?> FLAGS_CLASS = MinecraftReflection.getMinecraftClass("EnumPlayerTeleportFlags",
                    "PacketPlayOutPosition$EnumPlayerTeleportFlags");

    /**
     * Retrieve X.
     * <p>
     * Notes: absolute/Relative position
     *
     * @return The current X
     */
    double getX();

    /**
     * Set X.
     *
     * @param value - new value.
     */
    void setX(double value);

    /**
     * Retrieve Y.
     * <p>
     * Notes: absolute/Relative position
     *
     * @return The current Y
     */
    double getY();

    /**
     * Set Y.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve Z.
     * <p>
     * Notes: absolute/Relative position
     *
     * @return The current Z
     */
    double getZ();

    /**
     * Set Z.
     *
     * @param value - new value.
     */
    void setZ(double value);

    /**
     * Retrieve Yaw.
     * <p>
     * Notes: absolute/Relative rotation on the X Axis, in degrees
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set Yaw.
     *
     * @param value - new value.
     */
    void setYaw(float value);

    /**
     * Retrieve Pitch.
     * <p>
     * Notes: absolute/Relative rotation on the Y Axis, in degrees
     *
     * @return The current Pitch
     */
    float getPitch();

    /**
     * Set Pitch.
     *
     * @param value - new value.
     */
    void setPitch(float value);

    StructureModifier<Set<PlayerTeleportFlag>> getFlagsModifier();

    Set<PlayerTeleportFlag> getFlags();

    void setFlags(Set<PlayerTeleportFlag> value);

    enum PlayerTeleportFlag {
        X, Y, Z, Y_ROT, X_ROT
    }
}
