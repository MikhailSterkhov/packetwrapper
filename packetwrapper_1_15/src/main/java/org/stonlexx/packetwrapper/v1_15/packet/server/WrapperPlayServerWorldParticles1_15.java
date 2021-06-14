package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWorldParticles;

import com.comphenix.protocol.wrappers.WrappedParticle;

public class WrapperPlayServerWorldParticles1_15 
        extends MinecraftPacket
        implements WrapperPlayServerWorldParticles {

	public WrapperPlayServerWorldParticles1_15() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWorldParticles1_15(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve the particle.
	 * 
	 * @return The current particle
	 */
	public WrappedParticle getParticle() {
		return container.getNewParticles().read(0);
	}

	/**
	 * Set the particle.
	 * 
	 * @param value - new value.
	 */
	public void setParticleType(WrappedParticle value) {
		container.getNewParticles().write(0, value);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: x position of the particle
	 * 
	 * @return The current X
	 */
	public double getX() {
		return container.getDoubles().read(0);
	}

	/**
	 * Set X.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		container.getDoubles().write(0, value);
	}

	/**
	 * Retrieve Y.
	 * <p>
	 * Notes: y position of the particle
	 * 
	 * @return The current Y
	 */
	public double getY() {
		return container.getDoubles().read(1);
	}

	/**
	 * Set Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		container.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Z.
	 * <p>
	 * Notes: z position of the particle
	 * 
	 * @return The current Z
	 */
	public double getZ() {
		return container.getDoubles().read(2);
	}

	/**
	 * Set Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		container.getDoubles().write(2, value);
	}

	/**
	 * Retrieve Offset X.
	 * <p>
	 * Notes: this is added to the X position after being multiplied by
	 * random.nextGaussian()
	 * 
	 * @return The current Offset X
	 */
	public float getOffsetX() {
		return container.getFloat().read(0);
	}

	/**
	 * Set Offset X.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetX(float value) {
		container.getFloat().write(0, value);
	}

	/**
	 * Retrieve Offset Y.
	 * <p>
	 * Notes: this is added to the Y position after being multiplied by
	 * random.nextGaussian()
	 * 
	 * @return The current Offset Y
	 */
	public float getOffsetY() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Offset Y.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetY(float value) {
		container.getFloat().write(1, value);
	}

	/**
	 * Retrieve Offset Z.
	 * <p>
	 * Notes: this is added to the Z position after being multiplied by
	 * random.nextGaussian()
	 * 
	 * @return The current Offset Z
	 */
	public float getOffsetZ() {
		return container.getFloat().read(2);
	}

	/**
	 * Set Offset Z.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetZ(float value) {
		container.getFloat().write(2, value);
	}

	/**
	 * Retrieve Particle data.
	 * <p>
	 * Notes: the data of each particle
	 * 
	 * @return The current Particle data
	 */
	public float getParticleData() {
		return container.getFloat().read(3);
	}

	/**
	 * Set Particle data.
	 * 
	 * @param value - new value.
	 */
	public void setParticleData(float value) {
		container.getFloat().write(3, value);
	}

	/**
	 * Retrieve Number of particles.
	 * <p>
	 * Notes: the number of particles to create
	 * 
	 * @return The current Number of particles
	 */
	public int getNumberOfParticles() {
		return container.getIntegers().read(0);
	}

	/**
	 * Set Number of particles.
	 * 
	 * @param value - new value.
	 */
	public void setNumberOfParticles(int value) {
		container.getIntegers().write(0, value);
	}

	/**
	 * Retrieve Long Distance.
	 * <p>
	 * Notes: if true, particle distance increases from 256 to 65536.
	 * 
	 * @return The current Long Distance
	 */
	public boolean getLongDistance() {
		return container.getBooleans().read(0);
	}

	/**
	 * Set Long Distance.
	 * 
	 * @param value - new value.
	 */
	public void setLongDistance(boolean value) {
		container.getBooleans().write(0, value);
	}
}
