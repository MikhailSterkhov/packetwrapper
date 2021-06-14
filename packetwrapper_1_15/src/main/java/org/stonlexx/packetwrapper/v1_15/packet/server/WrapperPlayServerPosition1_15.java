package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.EnumWrappers;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerPosition;

import java.util.Set;

public class WrapperPlayServerPosition1_15 
        extends MinecraftPacket
        implements WrapperPlayServerPosition {

	public WrapperPlayServerPosition1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerPosition1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: absolute/Relative position
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
	 * <p>
	 * Notes: absolute/Relative position
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
	 * <p>
	 * Notes: absolute/Relative position
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
	 * Retrieve Yaw.
	 * <p>
	 * Notes: absolute/Relative rotation on the X Axis, in degrees
	 * 
	 * @return The current Yaw
	 */
	public float getYaw() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Yaw.
	 * 
	 * @param value - new value.
	 */
	public void setYaw(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Pitch.
	 * <p>
	 * Notes: absolute/Relative rotation on the Y Axis, in degrees
	 * 
	 * @return The current Pitch
	 */
	public float getPitch() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Pitch.
	 * 
	 * @param value - new value.
	 */
	public void setPitch(float value) {
		container.getFloat().write(1, value);
	}

	public StructureModifier<Set<PlayerTeleportFlag>> getFlagsModifier() {
		return container.getSets(
				EnumWrappers.getGenericConverter(FLAGS_CLASS, PlayerTeleportFlag.class));
	}

	public Set<PlayerTeleportFlag> getFlags() {
		return getFlagsModifier().read(0);
	}

	public void setFlags(Set<PlayerTeleportFlag> value) {
		getFlagsModifier().write(0, value);
	}
}
