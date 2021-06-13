package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.MinecraftKey;

public interface WrapperPlayClientSetJigsaw extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.SET_JIGSAW;
    
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block entity location
     * @return The current Location
     */
    BlockPosition getLocation();
    
    /**
     * Set Location.
     * @param value - new value.
     */
    void setLocation(BlockPosition value);
    
    /**
     * Retrieve Attachment type.
     * @return The current Attachment type
     */
    MinecraftKey getAttachmentType();
    
    /**
     * Set Attachment type.
     * @param value - new value.
     */
    void setAttachmentType(MinecraftKey value);
    
    /**
     * Retrieve Target pool.
     * @return The current Target pool
     */
    MinecraftKey getTargetPool();
    
    /**
     * Set Target pool.
     * @param value - new value.
     */
    void setTargetPool(MinecraftKey value);
    
    /**
     * Retrieve Final state.
     * <p>
     * Notes: "Turns into" on the GUI, _state in NBT
     * @return The current Final state
     */
    String getFinalState();
    
    /**
     * Set Final state.
     * @param value - new value.
     */
    void setFinalState(String value);
    
}
