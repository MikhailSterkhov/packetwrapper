package org.stonlexx.packetwrapper.v1_15.packet.client;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.BlockPosition;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.client.WrapperPlayClientSetCommandBlock;

public class WrapperPlayClientSetCommandBlock1_15 
        extends MinecraftPacket
        implements WrapperPlayClientSetCommandBlock {

    public WrapperPlayClientSetCommandBlock1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSetCommandBlock1_15(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieve Location.
     * @return The current Location
     */
    public BlockPosition getLocation() {
        return container.getBlockPositionModifier().readSafely(0);
    }
    
    /**
     * Set Location.
     * @param value - new value.
     */
    public void setLocation(BlockPosition value) {
        container.getBlockPositionModifier().writeSafely(0,  value);
    }
    
    /**
     * Retrieve Command.
     * @return The current Command
     */
    public String getCommand() {
        return container.getStrings().read(0);
    }
    
    /**
     * Set Command.
     * @param value - new value.
     */
    public void setCommand(String value) {
        container.getStrings().write(0, value);
    }

	/**
	 * if false, the output of the previous command will not be stored within the command block
	 */
	public boolean isTrackOutput() {
    	return container.getBooleans().read(0);
    }

    public void setTrackOutput(boolean value) {
		container.getBooleans().write(0, value);
    }

    public boolean isConditional() {
	    return container.getBooleans().read(1);
    }

    public void setConditional(boolean value) {
	    container.getBooleans().write(1, value);
    }

    public boolean isAutomatic() {
	    return container.getBooleans().read(2);
    }

    public void setAutomatic(boolean value) {
	    container.getBooleans().write(2, value);
    }

    public Mode getMode() {
		return container.getEnumModifier(Mode.class, MinecraftReflection.getMinecraftClass("TileEntityCommand$Type")).readSafely(0);
    }

    public void setMode(Mode mode) {
	    container.getEnumModifier(Mode.class, MinecraftReflection.getMinecraftClass("TileEntityCommand$Type")).writeSafely(0, mode);
    }

}
