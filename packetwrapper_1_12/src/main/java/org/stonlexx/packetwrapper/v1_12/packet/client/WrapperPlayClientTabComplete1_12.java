package org.stonlexx.packetwrapper.v1_12.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientTabComplete;

public class WrapperPlayClientTabComplete1_12 
        extends MinecraftPacket
        implements WrapperPlayClientTabComplete {

	public WrapperPlayClientTabComplete1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientTabComplete1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Text.
	 * 
	 * @return The current Text
	 */
	public String getInput() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Text.
	 * 
	 * @param value - new value.
	 */
	public void setInput(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Has Position.
	 * 
	 * @return The current Has Position
	 */
	public BlockPosition getHasPosition() {
		return container.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Has Position.
	 * 
	 * @param value - new value.
	 */
	public void setHasPosition(BlockPosition value) {
		container.getBlockPositionModifier().write(0, value);
	}

	/**
	 * Retrieve Looked at block.
	 * <p>
	 * Notes: the position of the block being looked at. Only sent if the
	 * previous field is true
	 * 
	 * @return The current Looked at block
	 */
	public BlockPosition getLookedAtBlock() {
		return container.getBlockPositionModifier().read(0);
	}

	/**
	 * Set Looked at block.
	 * 
	 * @param value - new value.
	 */
	public void setLookedAtBlock(BlockPosition value) {
		container.getBlockPositionModifier().write(0, value);
	}

	public int getTransactionId() {
		return container.getIntegers().read(0);
	}

	public void setTransactionId(int value) {
		container.getIntegers().write(0, value);
	}

}
