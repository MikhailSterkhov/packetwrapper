package org.stonlexx.packetwrapper.v1_15.packet.server;

import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.*;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.server.WrapperPlayServerAdvancements;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static com.comphenix.protocol.utility.MinecraftReflection.getMinecraftClass;

public class WrapperPlayServerAdvancements1_15 
        extends MinecraftPacket
        implements WrapperPlayServerAdvancements {

    public WrapperPlayServerAdvancements1_15() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAdvancements1_15(PacketContainer packet) {
        super(packet, TYPE);
    }

    private static final AutoWrapper<AdvancementDisplay> DISPLAY = AutoWrapper
            .wrap(AdvancementDisplay.class, "AdvancementDisplay")
            .field(0, BukkitConverters.getWrappedChatComponentConverter())
            .field(1, BukkitConverters.getWrappedChatComponentConverter())
            .field(2, BukkitConverters.getItemStackConverter())
            .field(3, MinecraftKey.getConverter())
            .field(4, EnumWrappers.getGenericConverter(getMinecraftClass("AdvancementFrameType"), FrameType.class));

    private static final AutoWrapper<SerializedAdvancement> WRAPPER = AutoWrapper
            .wrap(SerializedAdvancement.class,"Advancement$SerializedAdvancement")
            .field(0, MinecraftKey.getConverter())
            .field(1, BukkitConverters.getAdvancementConverter())
            .field(2, DISPLAY);

    private static final AutoWrapper<CriterionProgress> CRITERION = AutoWrapper
            .wrap(CriterionProgress.class, "CriterionProgress");

    private static final AutoWrapper<AdvancementProgress> PROGRESS = AutoWrapper
            .wrap(AdvancementProgress.class, "AdvancementProgress")
            .field(0, BukkitConverters.getMapConverter(Converters.passthrough(String.class), CRITERION));

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
