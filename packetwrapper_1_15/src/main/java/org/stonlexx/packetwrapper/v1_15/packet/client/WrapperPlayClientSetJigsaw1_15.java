package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSetJigsaw;

import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.MinecraftKey;

public class WrapperPlayClientSetJigsaw1_15 
        extends MinecraftPacket
        implements WrapperPlayClientSetJigsaw {

    public WrapperPlayClientSetJigsaw1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetJigsaw1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Location.
     * <p>
     * Notes: block entity location
     * @return The current Location
     */
    public BlockPosition getLocation() {
        return container.getBlockPositionModifier().read(0);
    }
    
    /**
     * Set Location.
     * @param value - new value.
     */
    public void setLocation(BlockPosition value) {
        container.getBlockPositionModifier().write(0, value);
    }
    
    /**
     * Retrieve Attachment type.
     * @return The current Attachment type
     */
    public MinecraftKey getAttachmentType() {
        return container.getMinecraftKeys().read(0);
    }
    
    /**
     * Set Attachment type.
     * @param value - new value.
     */
    public void setAttachmentType(MinecraftKey value) {
        container.getMinecraftKeys().write(0, value);
    }
    
    /**
     * Retrieve Target pool.
     * @return The current Target pool
     */
    public MinecraftKey getTargetPool() {
        return container.getMinecraftKeys().read(1);
    }
    
    /**
     * Set Target pool.
     * @param value - new value.
     */
    public void setTargetPool(MinecraftKey value) {
        container.getMinecraftKeys().write(1, value);
    }
    
    /**
     * Retrieve Final state.
     * <p>
     * Notes: "Turns into" on the GUI, final_state in NBT
     * @return The current Final state
     */
    public String getFinalState() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Final state.
     * @param value - new value.
     */
    public void setFinalState(String value) {
        container.getStrings().write(0, value);
    }
    
}
