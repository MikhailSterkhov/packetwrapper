package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.security.PublicKey;

public interface WrapperLoginServerEncryptionBegin extends WrapperPacket {
    PacketType TYPE =
            PacketType.Login.Server.ENCRYPTION_BEGIN;


    /**
     * Retrieve Server ID.
     * <p>
     * Notes: appears to be empty as of 1.7.x
     *
     * @return The current Server ID
     */
    String getServerId();

    /**
     * Set Server ID.
     *
     * @param value - new value.
     */
    void setServerId(String value);

    /**
     * Retrieve Public Key.
     *
     * @return The current Public Key
     */
    PublicKey getPublicKey();

    /**
     * Set Public Key.
     *
     * @param value - new value.
     */
    void setPublicKey(PublicKey value);

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
