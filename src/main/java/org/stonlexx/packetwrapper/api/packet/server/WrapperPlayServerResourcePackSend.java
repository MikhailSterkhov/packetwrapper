package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerResourcePackSend extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.RESOURCE_PACK_SEND;


    /**
     * Retrieve URL.
     * <p>
     * Notes: the URL to the resource pack.
     *
     * @return The current URL
     */
    String getUrl();

    /**
     * Set URL.
     *
     * @param value - new value.
     */
    void setUrl(String value);

    /**
     * Retrieve Hash.
     * <p>
     * Notes: a 40 character hexadecimal and lower-case SHA-1 hash of the
     * resource pack file. (must be lower case in order to work) If it's not a
     * 40 character hexadecimal string, the client will not use it for hash
     * verification and likely waste bandwidth - but it will still treat it as a
     * unique id
     *
     * @return The current Hash
     */
    String getHash();

    /**
     * Set Hash.
     *
     * @param value - new value.
     */
    void setHash(String value);

}
