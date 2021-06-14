package org.stonlexx.packetwrapper.v1_12.packet.server;

import org.bukkit.WorldType;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerRespawn;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;

public class WrapperPlayServerRespawn1_12 
        extends MinecraftPacket
        implements WrapperPlayServerRespawn {

	public WrapperPlayServerRespawn1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerRespawn1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Dimension.
	 * <p>
	 * Notes: -1: The Nether, 0: The Overworld, 1: The End
	 * 
	 * @return The current Dimension
	 */
	public int getDimension() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Dimension.
	 * 
	 * @param value - new value.
	 */
	public void setDimension(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Difficulty.
	 * <p>
	 * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard.
	 * 
	 * @return The current Difficulty
	 */
	public Difficulty getDifficulty() {
		return container.getDifficulties().read(0);
	}

	/**
	 * Set Difficulty.
	 * 
	 * @param value - new value.
	 */
	public void setDifficulty(Difficulty value) {
		container.getDifficulties().write(0, value);
	}

	/**
	 * Retrieve Gamemode.
	 * <p>
	 * Notes: 0: survival, 1: creative, 2: adventure. The hardcore flag is not
	 * included
	 * 
	 * @return The current Gamemode
	 */
	public NativeGameMode getGamemode() {
		return container.getGameModes().read(0);
	}

	/**
	 * Set Gamemode.
	 * 
	 * @param value - new value.
	 */
	public void setGamemode(NativeGameMode value) {
		container.getGameModes().write(0, value);
	}

	/**
	 * Retrieve Level Type.
	 * <p>
	 * Notes: same as Join Game
	 * 
	 * @return The current Level Type
	 */
	public WorldType getLevelType() {
		return container.getWorldTypeModifier().read(0);
	}

	/**
	 * Set Level Type.
	 * 
	 * @param value - new value.
	 */
	public void setLevelType(WorldType value) {
		container.getWorldTypeModifier().write(0, value);
	}

}
