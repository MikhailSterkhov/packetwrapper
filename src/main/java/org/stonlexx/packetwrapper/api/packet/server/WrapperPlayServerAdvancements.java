package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.wrappers.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.inventory.ItemStack;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.Date;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface WrapperPlayServerAdvancements extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.ADVANCEMENTS;
    AutoWrapper<AdvancementDisplay> DISPLAY = AutoWrapper
            .wrap(AdvancementDisplay.class, "AdvancementDisplay")
            .field(0, BukkitConverters.getWrappedChatComponentConverter())
            .field(1, BukkitConverters.getWrappedChatComponentConverter())
            .field(2, BukkitConverters.getItemStackConverter())
            .field(3, MinecraftKey.getConverter())
            .field(4, EnumWrappers.getGenericConverter(MinecraftReflection.getMinecraftClass("AdvancementFrameType"), FrameType.class));
    AutoWrapper<SerializedAdvancement> WRAPPER = AutoWrapper
            .wrap(SerializedAdvancement.class, "Advancement$SerializedAdvancement")
            .field(0, MinecraftKey.getConverter())
            .field(1, BukkitConverters.getAdvancementConverter())
            .field(2, DISPLAY);
    AutoWrapper<CriterionProgress> CRITERION = AutoWrapper
            .wrap(CriterionProgress.class, "CriterionProgress");
    AutoWrapper<AdvancementProgress> PROGRESS = AutoWrapper
            .wrap(AdvancementProgress.class, "AdvancementProgress")
            .field(0, BukkitConverters.getMapConverter(Converters.passthrough(String.class), CRITERION));

    /**
     * Retrieve Reset/Clear.
     * <p>
     * Notes: whether to reset/clear the current advancements
     *
     * @return The current Reset/Clear
     */
    boolean isReset();

    /**
     * Set Reset/Clear.
     *
     * @param value - new value.
     */
    void setReset(boolean value);

    Optional<Map<MinecraftKey, SerializedAdvancement>> getAdvancements();

    void setAdvancements(Map<MinecraftKey, SerializedAdvancement> value);

    Optional<Set<MinecraftKey>> getKeys();

    void setKeys(Set<MinecraftKey> value);

    Optional<Map<MinecraftKey, AdvancementProgress>> getProgress();

    enum FrameType {
        TASK,
        CHALLENGE,
        GOAL
    }

    class SerializedAdvancement {
        MinecraftKey key;
        Advancement advancement;
        AdvancementDisplay display;
        Object rewards;
        Map<String, Object> criteria;
        String[][] requirements;
    }

    class AdvancementDisplay {
        WrappedChatComponent title;
        WrappedChatComponent description;
        ItemStack icon;
        MinecraftKey background;
        FrameType frame;
        boolean showToast;
        boolean announceToChat;
        boolean hidden;
        float xCoord;
        float yCoord;
    }

    class AdvancementProgress {
        Map<String, CriterionProgress> progress;
        String[][] array2d;
    }

    class CriterionProgress {
        AdvancementProgress progress;
        Date date;
    }
}
