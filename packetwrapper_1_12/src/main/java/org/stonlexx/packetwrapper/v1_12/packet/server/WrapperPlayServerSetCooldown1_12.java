package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Material;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerSetCooldown;

public class WrapperPlayServerSetCooldown1_12 
        extends MinecraftPacket
        implements WrapperPlayServerSetCooldown {

	public WrapperPlayServerSetCooldown1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerSetCooldown1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	public Material getItem() {
		return container.getModifier().withType(ITEM_CLASS, new ItemConverter()).read(0);
	}

	public void setItem(Material value) {
		container.getModifier().withType(ITEM_CLASS, new ItemConverter()).write(0, value);
	}

	public int getTicks() {
		return container.getIntegers().read(0);
	}

	public void setTicks(int value) {
		container.getIntegers().write(0, value);
	}
}
