package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import org.bukkit.Sound;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerNamedSoundEffect extends WrapperPacket {
    PacketType TYPE =
            PacketType.Play.Server.NAMED_SOUND_EFFECT;


    Sound getSoundEffect();

    void setSoundEffect(Sound value);

    SoundCategory getSoundCategory();

    void setSoundCategory(SoundCategory value);

    /**
     * Retrieve Effect position X.
     * <p>
     * Notes: effect X multiplied by 8
     *
     * @return The current Effect position X
     */
    int getEffectPositionX();

    /**
     * Set Effect position X.
     *
     * @param value - new value.
     */
    void setEffectPositionX(int value);

    /**
     * Retrieve Effect position Y.
     * <p>
     * Notes: effect Y multiplied by 8
     *
     * @return The current Effect position Y
     */
    int getEffectPositionY();

    /**
     * Set Effect position Y.
     *
     * @param value - new value.
     */
    void setEffectPositionY(int value);

    /**
     * Retrieve Effect position Z.
     * <p>
     * Notes: effect Z multiplied by 8
     *
     * @return The current Effect position Z
     */
    int getEffectPositionZ();

    /**
     * Set Effect position Z.
     *
     * @param value - new value.
     */
    void setEffectPositionZ(int value);

    /**
     * Retrieve Volume.
     * <p>
     * Notes: 1 is 100%, can be more
     *
     * @return The current Volume
     */
    float getVolume();

    /**
     * Set Volume.
     *
     * @param value - new value.
     */
    void setVolume(float value);

    /**
     * Retrieve Pitch.
     * <p>
     * Notes: 63 is 100%, can be more
     *
     * @return The current Pitch
     */
    float getPitch();

    /**
     * Set Pitch.
     *
     * @param value - new value.
     */
    void setPitch(float value);

}
