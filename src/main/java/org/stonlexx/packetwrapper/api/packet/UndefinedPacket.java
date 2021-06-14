package org.stonlexx.packetwrapper.api.packet;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import lombok.NonNull;
import org.stonlexx.packetwrapper.api.PacketWrapper;
import org.stonlexx.packetwrapper.api.PacketWrapperPlugin;

public final class UndefinedPacket
        extends MinecraftPacket
        implements WrapperPacket {

    public static final PacketType TYPE = PacketType.findLegacy(PacketType.UNKNOWN_PACKET);

    private UndefinedPacket() {
        super(new PacketContainer(TYPE), TYPE);
        container.getModifier().writeDefaults();
    }

    private UndefinedPacket(PacketContainer container) {
        super(container, TYPE);
    }


    public static <T extends WrapperPacket> T findPacket(Class<T> packetTo) {
        String packetName = packetTo.getSimpleName();

        if (packetName.contains("1_")) {
            packetName = packetName.substring(0, packetName.indexOf("1_"));
        }

        PacketWrapper packetWrapper = PacketWrapper.getInstance();
        PacketWrapper target = packetWrapper;

        int currentMinor = packetWrapper.getVersionMinor();

        while (target != null && currentMinor == target.getVersionMinor()) {
            target = PacketWrapperPlugin.getWrapperByVersion(packetWrapper.getVersionMinor() + 1);
        }

        if (target == null) {
            return packetWrapper.findPacketByClass(packetName);
        }

        return target.findPacketByClass(packetName);
    }

    public static UndefinedPacket create() {
        return new UndefinedPacket();
    }

    public static UndefinedPacket create(@NonNull PacketContainer packetContainer) {
        return new UndefinedPacket(packetContainer);
    }
}
