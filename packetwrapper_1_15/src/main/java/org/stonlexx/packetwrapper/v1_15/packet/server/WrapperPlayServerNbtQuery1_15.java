package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerNbtQuery;

import com.comphenix.protocol.wrappers.nbt.NbtBase;

public class WrapperPlayServerNbtQuery1_15 
        extends MinecraftPacket
        implements WrapperPlayServerNbtQuery {

    public WrapperPlayServerNbtQuery1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerNbtQuery1_15(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: can be compared to the one sent in the original query packet.
     * @return The current Transaction ID
     */
    public int getTransactionId() {
        return container.getIntegers().read(0);
    }
    
    /**
     * Set Transaction ID.
     * @param value - new value.
     */
    public void setTransactionId(int value) {
        container.getIntegers().write(0, value);
    }
    
    /**
     * Retrieve NBT.
     * <p>
     * Notes: the NBT of the block or entity. May be a TAG_END (0) in which case no NBT is present.
     * @return The current NBT
     */
    public NbtBase<?> getNbt() {
        return container.getNbtModifier().read(0);
    }
    
    /**
     * Set NBT.
     * @param value - new value.
     */
    public void setNbt(NbtBase<?> value) {
        container.getNbtModifier().write(0, value);
    }
    
}
