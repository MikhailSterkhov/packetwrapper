package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerResourcePackSend;

public class WrapperPlayServerResourcePackSend1_12 
        extends MinecraftPacket
        implements WrapperPlayServerResourcePackSend {

	public WrapperPlayServerResourcePackSend1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerResourcePackSend1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve URL.
	 * <p>
	 * Notes: the URL to the resource pack.
	 * 
	 * @return The current URL
	 */
	public String getUrl() {
		return container.getStrings().read(0);
	}

	/**
	 * Set URL.
	 * 
	 * @param value - new value.
	 */
	public void setUrl(String value) {
		container.getStrings().write(0, value);
	}

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
	public String getHash() {
		return container.getStrings().read(1);
	}

	/**
	 * Set Hash.
	 * 
	 * @param value - new value.
	 */
	public void setHash(String value) {
		container.getStrings().write(1, value);
	}

}
