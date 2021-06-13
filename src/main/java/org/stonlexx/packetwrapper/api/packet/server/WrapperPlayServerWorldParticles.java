package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.WrappedParticle;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerWorldParticles extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.WORLD_PARTICLES;


    /**
     * Retrieve the particle.
     *
     * @return The current particle
     */
    WrappedParticle getParticle();

    /**
     * Set the particle.
     *
     * @param value - new value.
     */
    void setParticleType(WrappedParticle value);

    /**
     * Retrieve X.
     * <p>
     * Notes: x position of the particle
     *
     * @return The current X
     */
    double getX();

    /**
     * Set X.
     *
     * @param value - new value.
     */
    void setX(double value);

    /**
     * Retrieve Y.
     * <p>
     * Notes: y position of the particle
     *
     * @return The current Y
     */
    double getY();

    /**
     * Set Y.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve Z.
     * <p>
     * Notes: z position of the particle
     *
     * @return The current Z
     */
    double getZ();

    /**
     * Set Z.
     *
     * @param value - new value.
     */
    void setZ(double value);

    /**
     * Retrieve Offset X.
     * <p>
     * Notes: this is added to the X position after being multiplied by
     * random.nextGaussian()
     *
     * @return The current Offset X
     */
    float getOffsetX();

    /**
     * Set Offset X.
     *
     * @param value - new value.
     */
    void setOffsetX(float value);

    /**
     * Retrieve Offset Y.
     * <p>
     * Notes: this is added to the Y position after being multiplied by
     * random.nextGaussian()
     *
     * @return The current Offset Y
     */
    float getOffsetY();

    /**
     * Set Offset Y.
     *
     * @param value - new value.
     */
    void setOffsetY(float value);

    /**
     * Retrieve Offset Z.
     * <p>
     * Notes: this is added to the Z position after being multiplied by
     * random.nextGaussian()
     *
     * @return The current Offset Z
     */
    float getOffsetZ();

    /**
     * Set Offset Z.
     *
     * @param value - new value.
     */
    void setOffsetZ(float value);

    /**
     * Retrieve Particle data.
     * <p>
     * Notes: the data of each particle
     *
     * @return The current Particle data
     */
    float getParticleData();

    /**
     * Set Particle data.
     *
     * @param value - new value.
     */
    void setParticleData(float value);

    /**
     * Retrieve Number of particles.
     * <p>
     * Notes: the number of particles to create
     *
     * @return The current Number of particles
     */
    int getNumberOfParticles();

    /**
     * Set Number of particles.
     *
     * @param value - new value.
     */
    void setNumberOfParticles(int value);

    /**
     * Retrieve Long Distance.
     * <p>
     * Notes: if true, particle distance increases from 256 to 65536.
     *
     * @return The current Long Distance
     */
    boolean getLongDistance();

    /**
     * Set Long Distance.
     *
     * @param value - new value.
     */
    void setLongDistance(boolean value);
}
