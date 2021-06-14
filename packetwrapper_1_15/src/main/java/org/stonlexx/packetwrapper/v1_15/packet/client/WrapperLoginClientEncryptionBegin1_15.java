package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperLoginClientEncryptionBegin;

import org.stonlexx.packetwrapper.api.packet.client.WrapperLoginClientEncryptionBegin;

public class WrapperLoginClientEncryptionBegin1_15
		extends MinecraftPacket
		implements WrapperLoginClientEncryptionBegin {

	public WrapperLoginClientEncryptionBegin1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginClientEncryptionBegin1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Shared Secret.
	 * 
	 * @return The current Shared Secret
	 */
	public byte[] getSharedSecret() {
		return container.getByteArrays().read(0);
	}

	/**
	 * Set Shared Secret.
	 * 
	 * @param value - new value.
	 */
	public void setSharedSecret(byte[] value) {
		container.getByteArrays().write(0, value);
	}

	/**
	 * Retrieve Verify Token.
	 * 
	 * @return The current Verify Token
	 */
	public byte[] getVerifyToken() {
		return container.getByteArrays().read(1);
	}

	/**
	 * Set Verify Token.
	 * 
	 * @param value - new value.
	 */
	public void setVerifyToken(byte[] value) {
		container.getByteArrays().write(1, value);
	}
}
