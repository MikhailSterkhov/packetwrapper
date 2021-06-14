package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerMap;

public class WrapperPlayServerMap1_15 
        extends MinecraftPacket
        implements WrapperPlayServerMap {

	public WrapperPlayServerMap1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerMap1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Item Damage.
	 * <p>
	 * Notes: the damage value of the map being modified
	 * 
	 * @return The current Item Damage
	 */
	public int getItemDamage() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Item Damage.
	 * 
	 * @param value - new value.
	 */
	public void setItemDamage(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Scale.
	 * 
	 * @return The current Scale
	 */
	public byte getScale() {
		return container.getBytes().read(0);
	}

	/**
	 * Set Scale.
	 * 
	 * @param value - new value.
	 */
	public void setScale(byte value) {
		container.getBytes().write(0, value);
	}

	public boolean getTrackingPosition() {
		return container.getBooleans().read(0);
	}

	public void setTrackingPosition(boolean value) {
		container.getBooleans().write(0, value);
	}

	public boolean isLocked() {
		return container.getBooleans().read(1);
	}

	public void setLocked(boolean value) {
		container.getBooleans().write(1, value);
	}

	public MapIcon[] getMapIcons() {
		Object[] iconHandles = (Object[]) container.getModifier().read(4);
		MapIcon[] wrappers = new MapIcon[iconHandles.length];

		for (int i = 0; i < iconHandles.length; i++) {
			wrappers[i] = ICON_WRAPPER.getSpecific(iconHandles[i]);
		}

		return wrappers;
	}

	public void setMapIcons(MapIcon[] value) {
		Object[] iconHandles = new Object[value.length];

		for (int i = 0; i < value.length; i++) {
			iconHandles[i] = ICON_WRAPPER.getGeneric(value[i]);
		}

		container.getModifier().write(4, iconHandles);
	}

	public int getColumns() {
		return container.getIntegers().read(1);
	}

	public void setColumns(int value) {
		container.getIntegers().write(1, value);
	}

	public int getRows() {
		return container.getIntegers().read(2);
	}

	public void setRows(int value) {
		container.getIntegers().write(2, value);
	}

	public int getX() {
		return container.getIntegers().read(3);
	}

	public void setX(int value) {
		container.getIntegers().write(3, value);
	}

	public int getZ() {
		return container.getIntegers().read(4);
	}

	public void setZ(int value) {
		container.getIntegers().write(4, value);
	}

	public byte[] getData() {
		return container.getByteArrays().read(0);
	}

	public void setData(byte[] value) {
		container.getByteArrays().write(0, value);
	}
}
