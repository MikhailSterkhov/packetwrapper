package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperLoginServerEncryptionBegin;


import java.security.PublicKey;

public class WrapperLoginServerEncryptionBegin1_15 
        extends MinecraftPacket
        implements WrapperLoginServerEncryptionBegin {

	public WrapperLoginServerEncryptionBegin1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperLoginServerEncryptionBegin1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Server ID.
	 * <p>
	 * Notes: appears to be empty as of 1.7.x
	 * 
	 * @return The current Server ID
	 */
	public String getServerId() {
		return container.getStrings().read(0);
	}

	/**
	 * Set Server ID.
	 * 
	 * @param value - new value.
	 */
	public void setServerId(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve Public Key.
	 * 
	 * @return The current Public Key
	 */
	public PublicKey getPublicKey() {
		return container.getSpecificModifier(PublicKey.class).read(0);
	}

	/**
	 * Set Public Key.
	 * 
	 * @param value - new value.
	 */
	public void setPublicKey(PublicKey value) {
		container.getSpecificModifier(PublicKey.class).write(0, value);
	}

	/**
	 * Retrieve Verify Token.
	 * 
	 * @return The current Verify Token
	 */
	public byte[] getVerifyToken() {
		return container.getByteArrays().read(0);
	}

	/**
	 * Set Verify Token.
	 * 
	 * @param value - new value.
	 */
	public void setVerifyToken(byte[] value) {
		container.getByteArrays().write(0, value);
	}
}
