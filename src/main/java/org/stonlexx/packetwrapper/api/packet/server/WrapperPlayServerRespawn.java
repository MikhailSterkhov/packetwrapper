package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;
import org.bukkit.WorldType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerRespawn extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.RESPAWN;


    /**
     * Retrieve Dimension.
     * <p>
     * Notes: -1: The Nether, 0: The Overworld, 1: The End
     *
     * @return The current Dimension
     */
    int getDimension();

    /**
     * Set Dimension.
     *
     * @param value - new value.
     */
    void setDimension(int value);

    /**
     * Retrieve Difficulty.
     * <p>
     * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard.
     *
     * @return The current Difficulty
     */
    Difficulty getDifficulty();

    /**
     * Set Difficulty.
     *
     * @param value - new value.
     */
    void setDifficulty(Difficulty value);

    /**
     * Retrieve Gamemode.
     * <p>
     * Notes: 0: survival, 1: creative, 2: adventure. The hardcore flag is not
     * included
     *
     * @return The current Gamemode
     */
    NativeGameMode getGamemode();

    /**
     * Set Gamemode.
     *
     * @param value - new value.
     */
    void setGamemode(NativeGameMode value);

    /**
     * Retrieve Level Type.
     * <p>
     * Notes: same as Join Game
     *
     * @return The current Level Type
     */
    WorldType getLevelType();

    /**
     * Set Level Type.
     *
     * @param value - new value.
     */
    void setLevelType(WorldType value);

}
