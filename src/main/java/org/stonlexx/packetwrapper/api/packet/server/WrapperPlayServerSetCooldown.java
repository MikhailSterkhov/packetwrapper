package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.reflect.EquivalentConverter;
import com.comphenix.protocol.reflect.accessors.Accessors;
import com.comphenix.protocol.reflect.accessors.MethodAccessor;
import com.comphenix.protocol.utility.MinecraftReflection;
import org.bukkit.Material;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerSetCooldown extends WrapperPacket {

    Class<?> ITEM_CLASS = MinecraftReflection.getMinecraftClass("Item");
    PacketType TYPE = PacketType.Play.Server.SET_COOLDOWN;


    Material getItem();

    void setItem(Material value);

    int getTicks();

    void setTicks(int value);

    class ItemConverter implements EquivalentConverter<Material> {
        private static MethodAccessor getMaterial = null;
        private static MethodAccessor getItem = null;

        @Override
        public Material getSpecific(Object generic) {
            if (getMaterial == null) {
                getMaterial =
                        Accessors.getMethodAccessor(MinecraftReflection
                                        .getCraftBukkitClass("util.CraftMagicNumbers"),
                                "getMaterial", ITEM_CLASS);
            }

            return (Material) getMaterial.invoke(null, generic);
        }

        @Override
        public Object getGeneric(Material specific) {
            if (getItem == null) {
                getItem =
                        Accessors.getMethodAccessor(MinecraftReflection
                                        .getCraftBukkitClass("util.CraftMagicNumbers"),
                                "getItem", Material.class);
            }

            return getItem.invoke(null, specific);
        }

        @Override
        public Class<Material> getSpecificType() {
            return Material.class;
        }
    }
}
