package org.stonlexx.packetwrapper.api.packet.client;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayClientStruct extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Client.STRUCT;
    
    
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

    enum UpdateType {
        UPDATE_DATA,
        SAVE_AREA,
        LOAD_AREA,
        SCAN_AREA;
    }
    
    /**
     * Retrieve Action.
     * <p>
     * Notes: an additional action to perform beyond simply saving the given data; see below
     * @return The current Action
     */
    UpdateType getAction();
    
    /**
     * Set Action.
     * @param value - new value.
     */
    void setAction(UpdateType value);

    enum BlockPropertyStructureMode {
        SAVE,
        LOAD,
        CORNER,
        DATA;
    }

    /**
     * Retrieve Mode.
     * <p>
     * Notes: one of SAVE (0), LOAD (1), CORNER (2), DATA (3).
     * @return The current Mode
     */
    BlockPropertyStructureMode getMode();
    
    /**
     * Set Mode.
     * @param value - new value.
     */
    void setMode(BlockPropertyStructureMode value);
    
    /**
     * Retrieve Name.
     * @return The current Name
     */
    String getName();
    
    /**
     * Set Name.
     * @param value - new value.
     */
    void setName(String value);
    
    /**
     * Retrieve Offset X, Y, and Z
     * <p>
     * Notes: between -32 and 32
     * @return The current Offset X, Y, Z
     */
    BlockPosition getOffsets();
    
    /**
     * Set Offset X, Y, and Z
     * @param value - new value.
     */
    void setOffsets(BlockPosition value);
    
    /**
     * Retrieve Size X, Y, and Z
     * <p>
     * Notes: between -32 and 32
     * @return The current Size X, Y, and Z
     */
    BlockPosition getSizes();
    
    /**
     * Set Size X, Y, and Z
     * @param value - new value.
     */
    void setSizes(BlockPosition value);

    enum BlockMirror {
        NONE,
        LEFT_RIGHT,
        FRONT_BACK;
    }
    
    /**
     * Retrieve Mirror.
     * <p>
     * Notes: one of NONE (0), LEFT_RIGHT (1), FRONT_BACK (2).
     * @return The current Mirror
     */
    BlockMirror getMirror();
    
    /**
     * Set Mirror.
     * @param value - new value.
     */
    void setMirror(BlockMirror value);

    enum BlockRotation {
        NONE,
        CLOCKWISE_90,
        CLOCKWISE_180,
        COUNTERCLOCKWISE_90
    }
    
    /**
     * Retrieve Rotation.
     * <p>
     * Notes: one of NONE (0), CLOCKWISE_90 (1), CLOCKWISE_180 (2), COUNTERCLOCKWISE_90 (3).
     * @return The current Rotation
     */
    BlockRotation getRotation();
    
    /**
     * Set Rotation.
     * @param value - new value.
     */
    void setRotation(BlockRotation value);
    
    /**
     * Retrieve Metadata.
     * @return The current Metadata
     */
    String getMetadata();
    
    /**
     * Set Metadata.
     * @param value - new value.
     */
    void setMetadata(String value);
    
    /**
     * Retrieve Integrity.
     * <p>
     * Notes: between 0 and 1
     * @return The current Integrity
     */
    float getIntegrity();
    
    /**
     * Set Integrity.
     * @param value - new value.
     */
    void setIntegrity(float value);
    
    /**
     * Retrieve Seed.
     * @return The current Seed
     */
    long getSeed();
    
    /**
     * Set Seed.
     * @param value - new value.
     */
    void setSeed(long value);
    
    boolean getIgnoreEntities();

    void setIgnoreEntities(boolean value);

    boolean getShowAir();

    void setShowAir(boolean value);

    boolean getShowBoundingBox();

    void setShowBoundingBox(boolean value);
}
