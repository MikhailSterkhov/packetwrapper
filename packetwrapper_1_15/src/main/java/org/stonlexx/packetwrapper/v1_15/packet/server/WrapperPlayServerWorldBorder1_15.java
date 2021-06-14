package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWorldBorder;

import com.comphenix.protocol.wrappers.EnumWrappers.WorldBorderAction;

public class WrapperPlayServerWorldBorder1_15 
        extends MinecraftPacket
        implements WrapperPlayServerWorldBorder {

	public WrapperPlayServerWorldBorder1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWorldBorder1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public WorldBorderAction getAction() {
		return container.getWorldBorderActions().read(0);
	}

	public void setAction(WorldBorderAction value) {
		container.getWorldBorderActions().write(0, value);
	}

	public int getPortalTeleportBoundary() {
		return container.getIntegers().read(0);
	}

	public void setPortalTeleportBoundary(int value) {
		container.getIntegers().write(0, value);
	}

	public double getCenterX() {
		return container.getDoubles().read(0);
	}

	public void setCenterX(double value) {
		container.getDoubles().write(0, value);
	}

	public double getCenterZ() {
		return container.getDoubles().read(1);
	}

	public void setCenterZ(double value) {
		container.getDoubles().write(1, value);
	}

	public double getOldRadius() {
		return container.getDoubles().read(2);
	}

	public void setOldRadius(double value) {
		container.getDoubles().write(2, value);
	}

	public double getRadius() {
		return container.getDoubles().read(3);
	}

	public void setRadius(double value) {
		container.getDoubles().write(3, value);
	}

	public long getSpeed() {
		return container.getLongs().read(0);
	}

	public void setSpeed(long value) {
		container.getLongs().write(0, value);
	}

	public int getWarningTime() {
		return container.getIntegers().read(1);
	}

	public void setWarningTime(int value) {
		container.getIntegers().write(1, value);
	}

	public int getWarningDistance() {
		return container.getIntegers().read(2);
	}

	public void setWarningDistance(int value) {
		container.getIntegers().write(2, value);
	}
}
