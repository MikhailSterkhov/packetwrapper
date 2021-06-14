package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers.Direction;
import com.comphenix.protocol.wrappers.EnumWrappers.Hand;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientUseItem;

public class WrapperPlayClientUseItem1_12 
        extends MinecraftPacket
        implements WrapperPlayClientUseItem {

	public WrapperPlayClientUseItem1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientUseItem1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Location.
	 * <p>
	 * Notes: block position
	 * 
	 * @return The current Location
	 */
	public BlockPosition getLocation() {
		return container.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Location.
	 * 
	 * @param value - new value.
	 */
	public void setLocation(BlockPosition value) {
		container.getBlockPositionModifier().write(0, value);
	}

	public Direction getFace() {
		return container.getDirections().read(0);
	}

	public void setFace(Direction value) {
		container.getDirections().write(0, value);
	}

	public Hand getHand() {
		return container.getHands().read(0);
	}

	public void setHand(Hand value) {
		container.getHands().write(0, value);
	}

	/**
	 * Retrieve Cursor Position X.
	 * <p>
	 * Notes: the position of the crosshair on the block, from 0 to 15
	 * increasing from west to east
	 * 
	 * @return The current Cursor Position X
	 */
	public float getCursorPositionX() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Cursor Position X.
	 * 
	 * @param value - new value.
	 */
	public void setCursorPositionX(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Cursor Position Y.
	 * <p>
	 * Notes: the position of the crosshair on the block, from 0 to 15
	 * increasing from bottom to top
	 * 
	 * @return The current Cursor Position Y
	 */
	public float getCursorPositionY() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Cursor Position Y.
	 * 
	 * @param value - new value.
	 */
	public void setCursorPositionY(float value) {
		container.getFloat().write(1, value);
	}

	/**
	 * Retrieve Cursor Position Z.
	 * <p>
	 * Notes: the position of the crosshair on the block, from 0 to 15
	 * increasing from north to south
	 * 
	 * @return The current Cursor Position Z
	 */
	public float getCursorPositionZ() {
		return container.getFloat().read(2);
	}

	/**
	 * Set Cursor Position Z.
	 * 
	 * @param value - new value.
	 */
	public void setCursorPositionZ(float value) {
		container.getFloat().write(2, value);
	}


	// TODO: Как-то исправить, я уже устал это все кодить пиздец ((
	@Override
	public MovingObjectPosition getPosition() {
		return null;
	}

	@Override
	public void setPosition(MovingObjectPosition position) {

	}

}
