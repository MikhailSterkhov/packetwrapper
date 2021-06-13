package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.MinecraftKey;
import io.netty.buffer.ByteBuf;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCustomPayload extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.CUSTOM_PAYLOAD;


    /**
     * Retrieve Channel.
     * <p>
     * Notes: name of the "channel" used to send the data.
     *
     * @return The current Channel
     */
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
     * @param contents - new payload content
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
