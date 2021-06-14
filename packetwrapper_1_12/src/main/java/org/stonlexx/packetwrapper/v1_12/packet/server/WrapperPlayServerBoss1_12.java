package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.boss.BarColor;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerBoss;

import java.util.UUID;

public class WrapperPlayServerBoss1_12 
        extends MinecraftPacket
        implements WrapperPlayServerBoss {


	public WrapperPlayServerBoss1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerBoss1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve UUID.
	 * <p>
	 * Notes: unique ID for this bar
	 * 
	 * @return The current UUID
	 */
	public UUID getUniqueId() {
		return container.getUUIDs().read(0);
	}

	/**
	 * Set UUID.
	 * 
	 * @param value - new value.
	 */
	public void setUniqueId(UUID value) {
		container.getUUIDs().write(0, value);
	}

	public Action getAction() {
		return container.getEnumModifier(Action.class, 1).read(0);
	}

	public void setAction(Action value) {
		container.getEnumModifier(Action.class, 1).write(0, value);
	}

	public WrappedChatComponent getTitle() {
		return container.getChatComponents().read(0);
	}

	public void setTitle(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	public float getHealth() {
		return container.getFloat().read(0);
	}

	public void setHealth(float value) {
		container.getFloat().write(0, value);
	}

	public BarColor getColor() {
		return container.getEnumModifier(BarColor.class, 4).read(0);
	}

	public void setColor(BarColor value) {
		container.getEnumModifier(BarColor.class, 4).write(0, value);
	}

	public BarStyle getStyle() {
		return container.getEnumModifier(BarStyle.class, 5).read(0);
	}

	public void setStyle(BarStyle value) {
		container.getEnumModifier(BarStyle.class, 5).write(0, value);
	}

	public boolean isDarkenSky() {
		return container.getBooleans().read(0);
	}

	public void setDarkenSky(boolean value) {
		container.getBooleans().write(0, value);
	}

	public boolean isPlayMusic() {
		return container.getBooleans().read(1);
	}

	public void setPlayMusic(boolean value) {
		container.getBooleans().write(1, value);
	}

	public boolean isCreateFog() {
		return container.getBooleans().read(2);
	}

	public void setCreateFog(boolean value) {
		container.getBooleans().write(2, value);
	}
}
