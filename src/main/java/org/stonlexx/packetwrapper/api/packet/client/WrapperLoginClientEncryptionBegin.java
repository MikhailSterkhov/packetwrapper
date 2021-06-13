package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperLoginClientEncryptionBegin extends WrapperPacket {
	PacketType TYPE = PacketType.Login.Client.ENCRYPTION_BEGIN;


	/**
	 * Retrieve Shared Secret.
	 * 
	 * @return The current Shared Secret
	 */
	byte[] getSharedSecret();

	/**
	 * Set Shared Secret.
	 * 
	 * @param value - new value.
	 */
	void setSharedSecret(byte[] value);

	/**
	 * Retrieve Verify Token.
	 * 
	 * @return The current Verify Token
	 */
	byte[] getVerifyToken();

	/**
	 * Set Verify Token.
	 * 
	 * @param value - new value.
	 */
	void setVerifyToken(byte[] value);
}
