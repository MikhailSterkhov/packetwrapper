package org.stonlexx.packetwrapper.v1_15.packet.server;

import java.util.List;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerExplosion;

import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerExplosion1_15 
        extends MinecraftPacket
        implements WrapperPlayServerExplosion {

	public WrapperPlayServerExplosion1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerExplosion1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve X.
	 * 
	 * @return The current X
	 */
	public double getX() {
		return container.getDoubles().read(0);
	}

	/**
	 * Set X.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		container.getDoubles().write(0, value);
	}

	/**
	 * Retrieve Y.
	 * 
	 * @return The current Y
	 */
	public double getY() {
		return container.getDoubles().read(1);
	}

	/**
	 * Set Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		container.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Z.
	 * 
	 * @return The current Z
	 */
	public double getZ() {
		return container.getDoubles().read(2);
	}

	/**
	 * Set Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		container.getDoubles().write(2, value);
	}

	/**
	 * Retrieve Radius.
	 * <p>
	 * Notes: currently unused in the client
	 * 
	 * @return The current Radius
	 */
	public float getRadius() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Radius.
	 * 
	 * @param value - new value.
	 */
	public void setRadius(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Record count.
	 * <p>
	 * Notes: this is the count, not the size. The size is 3 times this value.
	 *
	 * @return The current Record count
	 */
	public List<BlockPosition> getRecords() {
		return container.getBlockPositionCollectionModifier().read(0);
	}

	/**
	 * Retrieve Record count.
	 * <p>
	 * Notes: this is the count, not the size. The size is 3 times this value.
	 * 
	 * @return The current Record count
	 * @deprecated Misspelled.
	 * @see #getRecords()
	 */
	@Deprecated
	public List<BlockPosition> getRecors() {
		return container.getBlockPositionCollectionModifier().read(0);
	}

	/**
	 * Set Record count.
	 * 
	 * @param value - new value.
	 */
	public void setRecords(List<BlockPosition> value) {
		container.getBlockPositionCollectionModifier().write(0, value);
	}

	public float getPlayerVelocityX() {
		return container.getFloat().read(1);
	}

	public void setPlayerVelocityX(float value) {
		container.getFloat().write(1, value);
	}

	public float getPlayerVelocityY() {
		return container.getFloat().read(2);
	}

	public void setPlayerVelocityY(float value) {
		container.getFloat().write(2, value);
	}

	public float getPlayerVelocityZ() {
		return container.getFloat().read(3);
	}

	public void setPlayerVelocityZ(float value) {
		container.getFloat().write(3, value);
	}

}
