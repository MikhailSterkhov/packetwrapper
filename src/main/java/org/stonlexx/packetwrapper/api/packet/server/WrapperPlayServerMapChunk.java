package org.stonlexx.packetwrapper.api.packet.server;

import java.util.List;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.nbt.NbtBase;

public interface WrapperPlayServerMapChunk extends WrapperPacket {
 PacketType TYPE = PacketType.Play.Server.MAP_CHUNK;


	/**
	 * Retrieve Chunk X.
	 * <p>
	 * Notes: chunk X coordinate
	 * 
	 * @return The current Chunk X
	 */
 int getChunkX();

	/**
	 * Set Chunk X.
	 * 
	 * @param value - new value.
	 */
 void setChunkX(int value);

	/**
	 * Retrieve Chunk Z.
	 * <p>
	 * Notes: chunk Z coordinate
	 * 
	 * @return The current Chunk Z
	 */
 int getChunkZ();

	/**
	 * Set Chunk Z.
	 * 
	 * @param value - new value.
	 */
 void setChunkZ(int value);

	/**
	 * Retrieve Ground-Up continuous.
	 * <p>
	 * Notes: this is True if the packet represents all sections in this
	 * vertical column, where the primary bit map specifies exactly which
	 * sections are included, and which are air
	 * 
	 * @return The current Ground-Up continuous
	 */
 boolean getGroundUpContinuous();

	/**
	 * Set Ground-Up continuous.
	 * 
	 * @param value - new value.
	 */
 void setGroundUpContinuous(boolean value);

	/**
	 * Bitmask with bits set to 1 for every 16×16×16 chunk section whose data is
	 * included in Data. The least significant bit represents the chunk section at
	 * the bottom of the chunk column (from y=0 to y=15).
	 * @return the bitmask
	 */
 int getBitmask();

 void setBitmask(int value);

	/**
	 */
 byte[] getData();

 void setData(byte[] value);

	/**
	 * @return all block entities in the chunk
	 */
 List<NbtBase<?>> getTileEntities();

 void setTileEntities(List<NbtBase<?>> value);
}
