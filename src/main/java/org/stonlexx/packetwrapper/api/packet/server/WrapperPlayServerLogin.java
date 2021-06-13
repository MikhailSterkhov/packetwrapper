package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerLogin extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.LOGIN;


	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
 int getEntityID();

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
 void setEntityID(int value);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
 Entity getEntity(World world);

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
 Entity getEntity(PacketEvent event);

	/**
	 * Retrieve Gamemode.
	 * <p>
	 * Notes: 0: survival, 1: creative, 2: adventure. Bit 3 (0x8) is the
	 * hardcore flag
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
	 * Retrieve Dimension.
	 * <p>
	 * Notes: -1: nether, 0: overworld, 1: end
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
	 * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard
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
	 * Retrieve Max Players.
	 * <p>
	 * Notes: used by the client to draw the player list
	 * 
	 * @return The current Max Players
	 */
 int getMaxPlayers();

	/**
	 * Set Max Players.
	 * 
	 * @param value - new value.
	 */
 void setMaxPlayers(int value);

	/**
	 * Retrieve Level Type.
	 * <p>
	 * Notes: default, flat, largeBiomes, amplified, default_1_1
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

	/**
	 * Retrieve Reduced Debug Info.
	 * 
	 * @return The current Reduced Debug Info
	 */
 boolean getReducedDebugInfo();

	/**
	 * Set Reduced Debug Info.
	 * 
	 * @param value - new value.
	 */
 void setReducedDebugInfo(boolean value);
}
