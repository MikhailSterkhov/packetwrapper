package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.MinecraftKey;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerCustomPayload;

public class WrapperPlayServerCustomPayload1_12 
        extends MinecraftPacket
        implements WrapperPlayServerCustomPayload {

	public WrapperPlayServerCustomPayload1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerCustomPayload1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Channel.
	 * <p>
	 * Notes: name of the "channel" used to send the data.
	 * 
	 * @return The current Channel
	 */
	public MinecraftKey getChannel() {
		return MinecraftKey.fromHandle(container.getStrings().read(0));
	}

	/**
	 * Set Channel.
	 * 
	 * @param value - new value.
	 */
	public void setChannel(String value) {
		container.getStrings().write(0, value);
	}

	/**
	 * Retrieve payload contents as a raw Netty buffer
	 * 
	 * @return Payload contents as a Netty buffer
	 */
	public ByteBuf getContentsBuffer() {
		return (ByteBuf) container.getModifier().withType(ByteBuf.class).read(0);
	}

	/**
	 * Retrieve payload contents
	 * 
	 * @return Payload contents as a byte array
	 */
	public byte[] getContents() {
		ByteBuf buffer = getContentsBuffer();
		byte[] array = new byte[buffer.readableBytes()];
		buffer.readBytes(array);
		return array;
	}

	/**
	 * Update payload contents with a Netty buffer
	 * 
	 * @param contents - new payload content
	 */
	public void setContentsBuffer(ByteBuf contents) {
		if (MinecraftReflection.is(MinecraftReflection.getPacketDataSerializerClass(), contents)) {
			container.getModifier().withType(ByteBuf.class).write(0, contents);
		} else {
			Object serializer = MinecraftReflection.getPacketDataSerializer(contents);
			container.getModifier().withType(ByteBuf.class).write(0, serializer);
		}
	}

	/**
	 * Update payload contents with a byte array
	 * 
	 * @param content - new payload content
	 */
	public void setContents(byte[] content) {
		setContentsBuffer(Unpooled.copiedBuffer(content));
	}
}
