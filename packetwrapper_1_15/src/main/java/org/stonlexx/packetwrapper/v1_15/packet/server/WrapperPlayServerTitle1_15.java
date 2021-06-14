package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerTitle;

import com.comphenix.protocol.wrappers.EnumWrappers.TitleAction;
import com.comphenix.protocol.wrappers.WrappedChatComponent;

public class WrapperPlayServerTitle1_15 
        extends MinecraftPacket
        implements WrapperPlayServerTitle {

	public WrapperPlayServerTitle1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerTitle1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Action.
	 * 
	 * @return The current Action
	 */
	public TitleAction getAction() {
		return container.getTitleActions().read(0);
	}

	/**
	 * Set Action.
	 * 
	 * @param value - new value.
	 */
	public void setAction(TitleAction value) {
		container.getTitleActions().write(0, value);
	}

	/**
	 * Retrieve 0 (TITLE).
	 * <p>
	 * Notes: chat
	 * 
	 * @return The current 0 (TITLE)
	 */
	public WrappedChatComponent getTitle() {
		return container.getChatComponents().read(0);
	}

	/**
	 * Set 0 (TITLE).
	 * 
	 * @param value - new value.
	 */
	public void setTitle(WrappedChatComponent value) {
		container.getChatComponents().write(0, value);
	}

	/**
	 * Retrieve 2 (TIMES).
	 * <p>
	 * Notes: int
	 * 
	 * @return The current 2 (TIMES)
	 */
	public int getFadeIn() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set 2 (TIMES).
	 * 
	 * @param value - new value.
	 */
	public void setFadeIn(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Stay.
	 * 
	 * @return The current Stay
	 */
	public int getStay() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Stay.
	 * 
	 * @param value - new value.
	 */
	public void setStay(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Fade Out.
	 * 
	 * @return The current Fade Out
	 */
	public int getFadeOut() {
		return container.getIntegers().read(2);
	}

	/**
	 * Set Fade Out.
	 * 
	 * @param value - new value.
	 */
	public void setFadeOut(int value) {
		container.getIntegers().write(2, value);
	}
}
