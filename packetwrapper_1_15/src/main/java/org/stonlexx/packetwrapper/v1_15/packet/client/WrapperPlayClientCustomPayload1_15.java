package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientCustomPayload;

import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.MinecraftKey;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class WrapperPlayClientCustomPayload1_15 
        extends MinecraftPacket
        implements WrapperPlayClientCustomPayload {

	public WrapperPlayClientCustomPayload1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientCustomPayload1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public MinecraftKey getChannel() {
		return container.getMinecraftKeys().readSafely(0);
	}

	/**
	 * Starting in 1.13, channel names need to be lower case, in the new identifier format,
	 * i.e. {@code minecraft:brand}. The previously standard {@code |} is no longer allowed.
	 */
	public void setChannel(MinecraftKey value) {
		container.getMinecraftKeys().writeSafely(0, value);
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
		ByteBuf buffer = getContentsBuffer().copy();
		byte[] array = new byte[buffer.readableBytes()];
		buffer.readBytes(array);
		return array;
	}

	/**
	 * Update payload contents with a Netty buffer
	 * 
	 * @param contents - new payload contents
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
