package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.EnumWrappers.TitleAction;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerTitle extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.TITLE;


    /**
     * Retrieve Action.
     *
     * @return The current Action
     */
    TitleAction getAction();

    /**
     * Set Action.
     *
     * @param value - new value.
     */
    void setAction(TitleAction value);

    /**
     * Retrieve 0 (TITLE).
     * <p>
     * Notes: chat
     *
     * @return The current 0 (TITLE)
     */
    WrappedChatComponent getTitle();

    /**
     * Set 0 (TITLE).
     *
     * @param value - new value.
     */
    void setTitle(WrappedChatComponent value);

    /**
     * Retrieve 2 (TIMES).
     * <p>
     * Notes: int
     *
     * @return The current 2 (TIMES)
     */
    int getFadeIn();

    /**
     * Set 2 (TIMES).
     *
     * @param value - new value.
     */
    void setFadeIn(int value);

    /**
     * Retrieve Stay.
     *
     * @return The current Stay
     */
    int getStay();

    /**
     * Set Stay.
     *
     * @param value - new value.
     */
    void setStay(int value);

    /**
     * Retrieve Fade Out.
     *
     * @return The current Fade Out
     */
    int getFadeOut();

    /**
     * Set Fade Out.
     *
     * @param value - new value.
     */
    void setFadeOut(int value);
}
