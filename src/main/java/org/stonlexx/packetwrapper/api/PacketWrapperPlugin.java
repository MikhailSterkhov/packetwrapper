package org.stonlexx.packetwrapper.api;

import com.comphenix.protocol.utility.MinecraftVersion;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class PacketWrapperPlugin
        extends JavaPlugin {

    static PacketWrapper packetWrapper = null;

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
        if (versionMinor <= 0) {
            return null;
        }

        PacketWrapper packetWrapper = ((PacketWrapper) getWrapperInstance(versionMinor));

        if (packetWrapper == null) {
            if (versionMinor >= 7) {
                return getPacketWrapper(versionMinor + 1);
            }

            packetWrapper = getPacketWrapper(versionMinor - 1);
        }

        return packetWrapper;
    }

    private Object getWrapperInstance(int versionMinor) {
        try {
            String classPath = String.format("org.stonlexx.packetwrapper.v1_%s.PacketWrapper1_%s",
                    versionMinor, versionMinor);

            return Class.forName(classPath).newInstance();

        } catch (Exception exception) {

            return null;
        }
    }

}
