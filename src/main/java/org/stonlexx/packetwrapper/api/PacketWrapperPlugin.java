package org.stonlexx.packetwrapper.api;

import com.comphenix.protocol.utility.MinecraftVersion;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import lombok.NonNull;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.stonlex.packetwrapper.v1_15.PacketWrapper1_15;

import java.util.logging.Level;

public final class PacketWrapperPlugin
        extends JavaPlugin {

    static PacketWrapper packetWrapper = null;

    private final TIntObjectMap<PacketWrapper> packetWrappersMap = new TIntObjectHashMap<>();

    {
        registerWrapper(new PacketWrapper1_15());
    }

    @Override
    public void onEnable() {

        MinecraftVersion currentVersion = MinecraftVersion.getCurrentVersion();
        int currentMinor = currentVersion.getMinor();

        packetWrapper = getPacketWrapper(currentMinor);

        if (packetWrapper == null) {
            getLogger().log(Level.WARNING, ChatColor.RED + "Plugin no found version to mapping!");
            return;
        }

        getLogger().log(Level.INFO, ChatColor.GREEN + String.format("Detect version 1.%s. Load mappings & wrappers...", packetWrapper.getVersionMinor()));
    }


    private PacketWrapper getPacketWrapper(int versionMinor) {
        if (versionMinor <= -1) {
            return null;
        }

        PacketWrapper packetWrapper = packetWrappersMap.get(versionMinor);

        if (packetWrapper == null) {
            if (versionMinor >= 7) {
                return getPacketWrapper(versionMinor + 1);
            }

            packetWrapper = getPacketWrapper(versionMinor - 1);
        }

        return packetWrapper;
    }

    private void registerWrapper(@NonNull PacketWrapper packetWrapper) {
        packetWrappersMap.put(packetWrapper.getVersionMinor(), packetWrapper);
    }

}
