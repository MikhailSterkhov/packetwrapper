package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientBoatMove extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.BOAT_MOVE;


    boolean getLeftOar();

    void setLeftOar(boolean value);

    boolean getRightOar();

    void setRightOar(boolean value);

}
