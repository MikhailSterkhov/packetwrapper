package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.WorldBorderAction;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerWorldBorder extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.WORLD_BORDER;


    WorldBorderAction getAction();

    void setAction(WorldBorderAction value);

    int getPortalTeleportBoundary();

    void setPortalTeleportBoundary(int value);

    double getCenterX();

    void setCenterX(double value);

    double getCenterZ();

    void setCenterZ(double value);

    double getOldRadius();

    void setOldRadius(double value);

    double getRadius();

    void setRadius(double value);

    long getSpeed();

    void setSpeed(long value);

    int getWarningTime();

    void setWarningTime(int value);

    int getWarningDistance();

    void setWarningDistance(int value);
}
