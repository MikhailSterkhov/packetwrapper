package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerWindowData extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.WINDOW_DATA;


    /**
     * Retrieve Window ID.
     * <p>
     * Notes: the id of the window.
     *
     * @return The current Window ID
     */
    int getWindowId();

    /**
     * Set Window ID.
     *
     * @param value - new value.
     */
    void setWindowId(int value);

    /**
     * Retrieve Property.
     * <p>
     * Notes: which property should be updated.
     *
     * @return The current Property
     */
    int getProperty();

    /**
     * Set Property.
     *
     * @param value - new value.
     */
    void setProperty(int value);

    /**
     * Retrieve Value.
     * <p>
     * Notes: the new value for the property.
     *
     * @return The current Value
     */
    int getValue();

    /**
     * Set Value.
     *
     * @param value - new value.
     */
    void setValue(int value);

}
