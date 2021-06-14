package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.Particle;
import com.comphenix.protocol.wrappers.WrappedParticle;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerWorldParticles;

public class WrapperPlayServerWorldParticles1_12 
        extends MinecraftPacket
        implements WrapperPlayServerWorldParticles {

	public WrapperPlayServerWorldParticles1_12() {
		super(new PacketContainer(TYPE), TYPE);
		container.getModifier().writeDefaults();
	}

	public WrapperPlayServerWorldParticles1_12(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve Particle type.
	 * 
	 * @return The current Particle type
	 */
	public WrappedParticle getParticle() {
		return WrappedParticle.fromHandle(Particle.values()[container.getParticles().read(0).ordinal()]);
	}

	/**
	 * Set Particle type.
	 * 
	 * @param value - new value.
	 */
	public void setParticleType(WrappedParticle value) {
		container.getParticles().write(0, Particle.values()[value.getParticle().ordinal()]);
	}

	/**
	 * Retrieve X.
	 * <p>
	 * Notes: x position of the particle
	 * 
	 * @return The current X
	 */
	public double getX() {
		return container.getFloat().read(0);
	}

	/**
	 * Set X.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		container.getFloat().write(0, (float) value);
	}

	/**
	 * Retrieve Y.
	 * <p>
	 * Notes: y position of the particle
	 * 
	 * @return The current Y
	 */
	public double getY() {
		return container.getFloat().read(1);
	}

	/**
	 * Set Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		container.getFloat().write(1, (float) value);
	}

	/**
	 * Retrieve Z.
	 * <p>
	 * Notes: z position of the particle
	 * 
	 * @return The current Z
	 */
	public double getZ() {
		return container.getFloat().read(2);
	}

	/**
	 * Set Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		container.getFloat().write(2, (float) value);
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
		return container.getFloat().read(3);
	}

	/**
	 * Set Offset X.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetX(float value) {
		container.getFloat().write(3, value);
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
		return container.getFloat().read(4);
	}

	/**
	 * Set Offset Y.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetY(float value) {
		container.getFloat().write(4, value);
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
		return container.getFloat().read(5);
	}

	/**
	 * Set Offset Z.
	 * 
	 * @param value - new value.
	 */
	public void setOffsetZ(float value) {
		container.getFloat().write(5, value);
	}

	/**
	 * Retrieve Particle data.
	 * <p>
	 * Notes: the data of each particle
	 * 
	 * @return The current Particle data
	 */
	public float getParticleData() {
		return container.getFloat().read(6);
	}

	/**
	 * Set Particle data.
	 * 
	 * @param value - new value.
	 */
	public void setParticleData(float value) {
		container.getFloat().write(6, value);
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

	/**
	 * Retrieve Data.
	 * <p>
	 * Notes: length depends on particle. IRON_CRACK has a length of 2,
	 * BLOCK_CRACK and BLOCK_DUST have lengths of 1, the rest have 0.
	 * 
	 * @return The current Data
	 * @see Particle#getDataLength()
	 */
	public int[] getData() {
		return container.getIntegerArrays().read(0);
	}

	/**
	 * Set Data.
	 * 
	 * @param value - new value.
	 */
	public void setData(int[] value) {
		container.getIntegerArrays().write(0, value);
	}

}
