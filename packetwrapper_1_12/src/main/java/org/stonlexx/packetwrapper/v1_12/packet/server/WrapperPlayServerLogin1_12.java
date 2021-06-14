package org.stonlexx.packetwrapper.v1_12.packet.server;

import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.entity.Entity;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerLogin;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.EnumWrappers.Difficulty;
import com.comphenix.protocol.wrappers.EnumWrappers.NativeGameMode;

public class WrapperPlayServerLogin1_12 
        extends MinecraftPacket
        implements WrapperPlayServerLogin {

	public WrapperPlayServerLogin1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerLogin1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Entity ID.
	 * <p>
	 * Notes: entity's ID
	 * 
	 * @return The current Entity ID
	 */
	public int getEntityID() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Entity ID.
	 * 
	 * @param value - new value.
	 */
	public void setEntityID(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param world - the current world of the entity.
	 * @return The spawned entity.
	 */
	public Entity getEntity(World world) {
		return container.getEntityModifier(world).read(0);
	}

	/**
	 * Retrieve the entity of the painting that will be spawned.
	 * 
	 * @param event - the packet event.
	 * @return The spawned entity.
	 */
	public Entity getEntity(PacketEvent event) {
		return getEntity(event.getPlayer().getWorld());
	}

	/**
	 * Retrieve Gamemode.
	 * <p>
	 * Notes: 0: survival, 1: creative, 2: adventure. Bit 3 (0x8) is the
	 * hardcore flag
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
	 * Retrieve Dimension.
	 * <p>
	 * Notes: -1: nether, 0: overworld, 1: end
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
	 * Notes: 0 thru 3 for Peaceful, Easy, Normal, Hard
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
	 * Retrieve Max Players.
	 * <p>
	 * Notes: used by the client to draw the player list
	 * 
	 * @return The current Max Players
	 */
	public int getMaxPlayers() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Max Players.
	 * 
	 * @param value - new value.
	 */
	public void setMaxPlayers(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Level Type.
	 * <p>
	 * Notes: default, flat, largeBiomes, amplified, default_1_1
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

	/**
	 * Retrieve Reduced Debug Info.
	 * 
	 * @return The current Reduced Debug Info
	 */
	public boolean getReducedDebugInfo() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Reduced Debug Info.
	 * 
	 * @param value - new value.
	 */
	public void setReducedDebugInfo(boolean value) {
		container.getBooleans().write(0, value);
	}
}
