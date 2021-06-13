package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.SoundCategory;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerCustomSoundEffect extends WrapperPacket {

    PacketType TYPE =
            PacketType.Play.Server.CUSTOM_SOUND_EFFECT;


    /**
     * Retrieve Sound Name.
     * <p>
     * Notes: all known sound effect names can be seen here.
     *
     * @return The current Sound Name
     */
    MinecraftKey getSoundName();

    /**
     * Set Sound Name.
     *
     * @param value - new value.
     */
    void setSoundName(MinecraftKey value);

    /**
     * Retrieve Sound Category.
     * <p>
     * Notes: the category that this sound will be played from (current
     * categories)
     *
     * @return The current Sound Category
     */
    SoundCategory getSoundCategory();

    /**
     * Set Sound Category.
     *
     * @param value - new value.
     */
    void setSoundCategory(SoundCategory value);

    /**
     * Retrieve Effect Position X.
     * <p>
     * Notes: effect X multiplied by 8 (fixed-point number with only 3 bits
     * dedicated to the fractional part)
     *
     * @return The current Effect Position X
     */
    int getX();

    /**
     * Set Effect Position X.
     *
     * @param value - new value.
     */
    void setX(int value);

    /**
     * Retrieve Effect Position Y.
     * <p>
     * Notes: effect Y multiplied by 8 (fixed-point number with only 3 bits
     * dedicated to the fractional part)
     *
     * @return The current Effect Position Y
     */
    int getY();

    /**
     * Set Effect Position Y.
     *
     * @param value - new value.
     */
    void setY(int value);

    /**
     * Retrieve Effect Position Z.
     * <p>
     * Notes: effect Z multiplied by 8 (fixed-point number with only 3 bits
     * dedicated to the fractional part)
     *
     * @return The current Effect Position Z
     */
    int getZ();

    /**
     * Set Effect Position Z.
     *
     * @param value - new value.
     */
    void setZ(int value);

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
