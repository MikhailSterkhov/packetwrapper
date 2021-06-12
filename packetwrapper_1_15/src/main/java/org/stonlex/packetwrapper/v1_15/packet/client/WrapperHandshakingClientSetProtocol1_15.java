package org.stonlex.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType.Protocol;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperHandshakingClientSetProtocol;

public class WrapperHandshakingClientSetProtocol1_15
		extends MinecraftPacket
		implements WrapperHandshakingClientSetProtocol {

	public WrapperHandshakingClientSetProtocol1_15() {
		super(new PacketContainer(TYPE), TYPE);

		container.getModifier().writeDefaults();
	}

	public WrapperHandshakingClientSetProtocol1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Protocol Version.
	 * <p>
	 * Notes: (4 as of 1.7.2)
	 * 
	 * @return The current Protocol Version
	 */
	public int getProtocolVersion() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Protocol Version.
	 * 
	 * @param value - new value.
	 */
	public void setProtocolVersion(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Server Address (hostname or IP).
	 * <p>
	 * Notes: localhost
	 * 
	 * @return The current Server Address (hostname or IP)
	 */
	public String getServerAddressHostnameOrIp() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Server Address (hostname or IP).
	 * 
	 * @param value - new value.
	 */
	public void setServerAddressHostnameOrIp(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Server Port.
	 * <p>
	 * Notes: 25565
	 * 
	 * @return The current Server Port
	 */
	public int getServerPort() {
		return container.getIntegers().read(1);
	}

	/**
	 * Set Server Port.
	 * 
	 * @param value - new value.
	 */
	public void setServerPort(int value) {
		container.getIntegers().write(1, value);
	}

	/**
	 * Retrieve Next state.
	 * <p>
	 * Notes: 1 for status, 2 for login
	 * 
	 * @return The current Next state
	 */
	public Protocol getNextState() {
		return container.getProtocols().read(0);
	}

	/**
	 * Set Next state.
	 * 
	 * @param value - new value.
	 */
	public void setNextState(Protocol value) {
		container.getProtocols().write(0, value);
	}

}
