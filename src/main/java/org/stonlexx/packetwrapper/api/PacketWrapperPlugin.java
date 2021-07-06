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

        getLogger().log(Level.INFO, ChatColor.GREEN + "Detected version " + currentVersion.toString() + ", search mappings...");
        packetWrapper = getWrapperByVersion(currentMinor);

        if (packetWrapper == null) {
            getLogger().log(Level.WARNING, ChatColor.RED + "Plugin no found version to mapping!");

            return;
        }

        getLogger().log(Level.INFO, ChatColor.YELLOW + String.format("Version detected: 1.%s", packetWrapper.getVersionMinor()));
        getLogger().log(Level.INFO, ChatColor.YELLOW + "Loading mappings & wrappers...");
    }

    public static PacketWrapper getWrapperByVersion(int versionMinor) {
        if (versionMinor <= 7) {
            return null;
        }

        PacketWrapper packetWrapper = ((PacketWrapper) getWrapperInstance(versionMinor));

        if (packetWrapper == null) {
            packetWrapper = getWrapperByVersion(versionMinor - 1);
        }

        return packetWrapper;
    }

    private static Object getWrapperInstance(int versionMinor) {
        try {
            String classPath = String.format("org.stonlexx.packetwrapper.v1_%s.PacketWrapper1_%s",
                    versionMinor, versionMinor);

            return Class.forName(classPath).newInstance();

        } catch (Exception exception) {
            return null;
        }
    }

}
