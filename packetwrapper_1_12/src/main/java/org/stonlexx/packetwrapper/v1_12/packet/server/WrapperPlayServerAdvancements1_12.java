package org.stonlexx.packetwrapper.v1_12.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerAdvancements;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class WrapperPlayServerAdvancements1_12 
        extends MinecraftPacket
        implements WrapperPlayServerAdvancements {


    public WrapperPlayServerAdvancements1_12() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAdvancements1_12(PacketContainer packet) {
        super(packet, TYPE);
    }

    static {
        CRITERION.field(0, PROGRESS);
    }

    /**
     * Retrieve Reset/Clear.
     * <p>
     * Notes: whether to reset/clear the current advancements
     * @return The current Reset/Clear
     */
    public boolean isReset() {
        return container.getBooleans().read(0);
    }
    
    /**
     * Set Reset/Clear.
     * @param value - new value.
     */
    public void setReset(boolean value) {
        container.getBooleans().write(0,  value);
    }

    public Optional<Map<MinecraftKey, SerializedAdvancement>> getAdvancements() {
        return container.getMaps(MinecraftKey.getConverter(), WRAPPER).optionRead(0);
    }

    public void setAdvancements(Map<MinecraftKey, SerializedAdvancement> value) {
        container.getMaps(MinecraftKey.getConverter(), WRAPPER).writeSafely(0, value);
    }

    public Optional<Set<MinecraftKey>> getKeys() {
        return container.getSets(MinecraftKey.getConverter()).optionRead(0);
    }

    public void setKeys(Set<MinecraftKey> value) {
        container.getSets(MinecraftKey.getConverter()).writeSafely(0, value);
    }

    public Optional<Map<MinecraftKey, AdvancementProgress>> getProgress() {
        return container.getMaps(MinecraftKey.getConverter(), PROGRESS).optionRead(1);
    }
}
