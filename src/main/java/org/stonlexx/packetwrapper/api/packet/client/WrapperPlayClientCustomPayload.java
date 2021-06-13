package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.MinecraftKey;
import io.netty.buffer.ByteBuf;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientCustomPayload extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Client.CUSTOM_PAYLOAD;


    MinecraftKey getChannel();

    /**
     * Starting in 1.13, channel names need to be lower case, in the new identifier format,
     * i.e. {@code minecraft:brand}. The previously standard {@code |} is no longer allowe;
     * <p>
     * /**
     * Retrieve payload contents as a raw Netty buffer
     *
     * @return Payload contents as a Netty buffer
     */
    ByteBuf getContentsBuffer();

    /**
     * Update payload contents with a Netty buffer
     *
     * @param contents - new payload contents
     */
    void setContentsBuffer(ByteBuf contents);

    /**
     * Retrieve payload contents
     *
     * @return Payload contents as a byte array
     */
    byte[] getContents();

    /**
     * Update payload contents with a byte array
     *
     * @param content - new payload content
     */
    void setContents(byte[] content);
}
