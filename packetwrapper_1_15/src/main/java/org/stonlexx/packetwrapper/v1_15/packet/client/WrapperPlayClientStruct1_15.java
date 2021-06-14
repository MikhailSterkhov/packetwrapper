package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientStruct;

public class WrapperPlayClientStruct1_15 
        extends MinecraftPacket
        implements WrapperPlayClientStruct {

    public WrapperPlayClientStruct1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientStruct1_15(PacketContainer packet) {
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
     * Retrieve Action.
     * <p>
     * Notes: an additional action to perform beyond simply saving the given data; see below
     * @return The current Action
     */
    public UpdateType getAction() {
        return container.getEnumModifier(UpdateType.class, 1).read(0);
    }
    
    /**
     * Set Action.
     * @param value - new value.
     */
    public void setAction(UpdateType value) {
        container.getEnumModifier(UpdateType.class, 1).write(0, value);
    }

    /**
     * Retrieve Mode.
     * <p>
     * Notes: one of SAVE (0), LOAD (1), CORNER (2), DATA (3).
     * @return The current Mode
     */
    public BlockPropertyStructureMode getMode() {
        return container.getEnumModifier(BlockPropertyStructureMode.class, 2).read(0);
    }
    
    /**
     * Set Mode.
     * @param value - new value.
     */
    public void setMode(BlockPropertyStructureMode value) {
        container.getEnumModifier(BlockPropertyStructureMode.class, 2).write(0, value);
    }
    
    /**
     * Retrieve Name.
     * @return The current Name
     */
    public String getName() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Name.
     * @param value - new value.
     */
    public void setName(String value) {
        container.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Offset X, Y, and Z
     * <p>
     * Notes: between -32 and 32
     * @return The current Offset X, Y, Z
     */
    public BlockPosition getOffsets() {
        return container.getBlockPositionModifier().read(1);
    }
    
    /**
     * Set Offset X, Y, and Z
     * @param value - new value.
     */
    public void setOffsets(BlockPosition value) {
        container.getBlockPositionModifier().write(1, value);
    }
    
    /**
     * Retrieve Size X, Y, and Z
     * <p>
     * Notes: between -32 and 32
     * @return The current Size X, Y, and Z
     */
    public BlockPosition getSizes() {
        return container.getBlockPositionModifier().read(2);
    }
    
    /**
     * Set Size X, Y, and Z
     * @param value - new value.
     */
    public void setSizes(BlockPosition value) {
        container.getBlockPositionModifier().write(2, value);
    }
    
    /**
     * Retrieve Mirror.
     * <p>
     * Notes: one of NONE (0), LEFT_RIGHT (1), FRONT_BACK (2).
     * @return The current Mirror
     */
    public BlockMirror getMirror() {
        return container.getEnumModifier(BlockMirror.class, 6).read(0);
    }
    
    /**
     * Set Mirror.
     * @param value - new value.
     */
    public void setMirror(BlockMirror value) {
        container.getEnumModifier(BlockMirror.class, 6).write(0, value);
    }
    
    /**
     * Retrieve Rotation.
     * <p>
     * Notes: one of NONE (0), CLOCKWISE_90 (1), CLOCKWISE_180 (2), COUNTERCLOCKWISE_90 (3).
     * @return The current Rotation
     */
    public BlockRotation getRotation() {
        return container.getEnumModifier(BlockRotation.class, 7).read(0);
    }
    
    /**
     * Set Rotation.
     * @param value - new value.
     */
    public void setRotation(BlockRotation value) {
        container.getEnumModifier(BlockRotation.class, 7).write(1, value);
    }
    
    /**
     * Retrieve Metadata.
     * @return The current Metadata
     */
    public String getMetadata() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Metadata.
     * @param value - new value.
     */
    public void setMetadata(String value) {
        container.getStrings().write(0, value);
    }
    
    /**
     * Retrieve Integrity.
     * <p>
     * Notes: between 0 and 1
     * @return The current Integrity
     */
    public float getIntegrity() {
        return container.getFloat().read(0);
    }
    
    /**
     * Set Integrity.
     * @param value - new value.
     */
    public void setIntegrity(float value) {
        container.getFloat().write(0, value);
    }
    
    /**
     * Retrieve Seed.
     * @return The current Seed
     */
    public long getSeed() {
        return container.getLongs().read(0);
    }
    
    /**
     * Set Seed.
     * @param value - new value.
     */
    public void setSeed(long value) {
        container.getLongs().write(0, value);
    }
    
    public boolean getIgnoreEntities() {
        return container.getBooleans().read(0);
    }

    public void setIgnoreEntities(boolean value) {
        container.getBooleans().write(0, value);
    }

    public boolean getShowAir() {
        return container.getBooleans().read(1);
    }

    public void setShowAir(boolean value) {
        container.getBooleans().write(1, value);
    }

    public boolean getShowBoundingBox() {
        return container.getBooleans().read(2);
    }

    public void setShowBoundingBox(boolean value) {
        container.getBooleans().write(2, value);
    }
}
