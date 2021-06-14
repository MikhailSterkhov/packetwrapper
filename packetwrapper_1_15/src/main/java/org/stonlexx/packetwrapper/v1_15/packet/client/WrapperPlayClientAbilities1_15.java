package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientAbilities;

import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientAbilities;

public class WrapperPlayClientAbilities1_15
		extends MinecraftPacket
		implements WrapperPlayClientAbilities {

	public WrapperPlayClientAbilities1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayClientAbilities1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	public boolean isInvulnerable() {
		return container.getBooleans().read(0);
	}

	public void setInvulnerable(boolean value) {
		container.getBooleans().write(0, value);
	}

	/**Misspelled.
	 * @see #isInvulnerable()
	 */
	@Deprecated
	public boolean isInvulnurable() {
		return container.getBooleans().read(0);
	}

	/**Misspelled.
	 * @see #setInvulnerable(boolean)
	 */
	@Deprecated
	public void setInvulnurable(boolean value) {
		container.getBooleans().write(0, value);
	}

	public boolean isFlying() {
		return container.getBooleans().read(1);
	}

	public void setFlying(boolean value) {
		container.getBooleans().write(1, value);
	}

	public boolean canFly() {
		return container.getBooleans().read(2);
	}

	public void setCanFly(boolean value) {
		container.getBooleans().write(2, value);
	}

	public boolean canInstantlyBuild() {
		return container.getBooleans().read(3);
	}

	public void setCanInstantlyBuild(boolean value) {
		container.getBooleans().write(3, value);
	}

	public float getFlyingSpeed() {
		return container.getFloat().read(0);
	}

	public void setFlyingSpeed(float value) {
		container.getFloat().write(0, value);
	}

	public float getWalkingSpeed() {
		return container.getFloat().read(1);
	}

	public void setWalkingSpeed(float value) {
		container.getFloat().write(1, value);
	}
}
