package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientSetCommandBlock extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.SET_COMMAND_BLOCK;


    /**
     * Retrieve Location.
     *
     * @return The current Location
     */
    BlockPosition getLocation();

    /**
     * Set Location.
     *
     * @param value - new value.
     */
    void setLocation(BlockPosition value);

    /**
     * Retrieve Command.
     *
     * @return The current Command
     */
    String getCommand();

    /**
     * Set Command.
     *
     * @param value - new value.
     */
    void setCommand(String value);

    /**
     * if false, the output of the previous command will not be stored within the command block
     */
    boolean isTrackOutput();

    void setTrackOutput(boolean value);

    boolean isConditional();

    void setConditional(boolean value);

    boolean isAutomatic();

    void setAutomatic(boolean value);

    Mode getMode();

    void setMode(Mode mode);


    enum Mode {

        SHOWN,
        SETTINGS;
    }
}
