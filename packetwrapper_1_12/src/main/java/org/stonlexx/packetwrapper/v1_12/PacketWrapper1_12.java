package org.stonlexx.packetwrapper.v1_12;

import com.comphenix.protocol.events.PacketContainer;
import lombok.Getter;
import lombok.NonNull;
import lombok.SneakyThrows;
import org.bukkit.entity.Entity;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.stonlexx.packetwrapper.api.PacketWrapper;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.UndefinedPacket;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import org.stonlexx.packetwrapper.api.packet.client.*;
import org.stonlexx.packetwrapper.api.packet.server.*;
import org.stonlexx.packetwrapper.v1_12.packet.client.*;
import org.stonlexx.packetwrapper.v1_12.packet.server.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class PacketWrapper1_12 implements PacketWrapper {

// ================================================================================================================== //

    @Getter
    private final int versionMinor = 12;

// ================================================================================================================== //


    @Override
    public <T extends WrapperPacket> T findPacketByClass(@NonNull Class<T> packetClass) {
        return findPacketByClass(packetClass.getSimpleName());
    }

    @SneakyThrows
    @SuppressWarnings("all")
    @Override
    public <T extends WrapperPacket> T findPacketByClass(@NonNull String packetClassName) {
        List<ClassLoader> classLoadersList = new LinkedList<>();

        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        Reflections reflections = new Reflections(new ConfigurationBuilder()
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))

                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix("org.stonlexx.packetwrapper.v1_12.packet"))));

        Set<Class<? extends MinecraftPacket>> classSet = reflections.getSubTypesOf(MinecraftPacket.class);

        return (T) classSet.stream().filter(packetClass -> packetClass.getName().contains(packetClassName)).findFirst().orElse(null)
                .getConstructor().newInstance();
    }

// ================================================================================================================== //

    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol() {
        return new WrapperHandshakingClientSetProtocol1_12();
    }

    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol(@NonNull PacketContainer packetContainer) {
        return new WrapperHandshakingClientSetProtocol1_12(packetContainer);
    }

    @Override
    public WrapperLoginClientCustomPayload createLoginClientCustomPayload() {
        return UndefinedPacket.findPacket(WrapperLoginClientCustomPayload.class);
    }

    @Override
    public WrapperLoginClientCustomPayload createLoginClientCustomPayload(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperLoginClientCustomPayload.class);
    }

    @Override
    public WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin() {
        return new WrapperLoginClientEncryptionBegin1_12();
    }

    @Override
    public WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginClientEncryptionBegin1_12(packetContainer);
    }

    @Override
    public WrapperLoginClientStart createLoginClientStart() {
        return new WrapperLoginClientStart1_12();
    }

    @Override
    public WrapperLoginClientStart createLoginClientStart(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginClientStart1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientAbilities createPlayClientAbilities() {
        return new WrapperPlayClientAbilities1_12();
    }

    @Override
    public WrapperPlayClientAbilities createPlayClientAbilities(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAbilities1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientAdvancements createPlayClientAdvancements() {
        return new WrapperPlayClientAdvancements1_12();
    }

    @Override
    public WrapperPlayClientAdvancements createPlayClientAdvancements(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAdvancements1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientArmAnimation createPlayClientArmAnimation() {
        return new WrapperPlayClientArmAnimation1_12();
    }

    @Override
    public WrapperPlayClientArmAnimation createPlayClientArmAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientArmAnimation1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientAutoRecipe createPlayClientAutoRecipe() {
        return new WrapperPlayClientAutoRecipe1_12();
    }

    @Override
    public WrapperPlayClientAutoRecipe createPlayClientAutoRecipe(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAutoRecipe1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientBeacon createPlayClientBeacon() {
        return UndefinedPacket.findPacket(WrapperPlayClientBeacon.class);
    }

    @Override
    public WrapperPlayClientBeacon createPlayClientBeacon(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientBeacon.class);
    }

    @Override
    public WrapperPlayClientBlockDig createPlayClientBlockDig() {
        return new WrapperPlayClientBlockDig1_12();
    }

    @Override
    public WrapperPlayClientBlockDig createPlayClientBlockDig(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBlockDig1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientBlockPlace createPlayClientBlockPlace() {
        return new WrapperPlayClientBlockPlace1_12();
    }

    @Override
    public WrapperPlayClientBlockPlace createPlayClientBlockPlace(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBlockPlace1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientBoatMove createPlayClientBoatMove() {
        return new WrapperPlayClientBoatMove1_12();
    }

    @Override
    public WrapperPlayClientBoatMove createPlayClientBoatMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBoatMove1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientBookEdit createPlayClientBookEdit() {
        return UndefinedPacket.findPacket(WrapperPlayClientBookEdit.class);
    }

    @Override
    public WrapperPlayClientBookEdit createPlayClientBookEdit(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientBookEdit.class);
    }

    @Override
    public WrapperPlayClientChat createPlayClientChat() {
        return new WrapperPlayClientChat1_12();
    }

    @Override
    public WrapperPlayClientChat createPlayClientChat(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientChat1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientClientCommand createPlayClientClientCommand() {
        return new WrapperPlayClientClientCommand1_12();
    }

    @Override
    public WrapperPlayClientClientCommand createPlayClientClientCommand(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientClientCommand1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientCloseWindow createPlayClientCloseWindow() {
        return new WrapperPlayClientCloseWindow1_12();
    }

    @Override
    public WrapperPlayClientCloseWindow createPlayClientCloseWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientCloseWindow1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientCustomPayload createPlayClientCustomPayload() {
        return new WrapperPlayClientCustomPayload1_12();
    }

    @Override
    public WrapperPlayClientCustomPayload createPlayClientCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientCustomPayload1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientDifficultyChange createPlayClientDifficultyChange() {
        return UndefinedPacket.findPacket(WrapperPlayClientDifficultyChange.class);
    }

    @Override
    public WrapperPlayClientDifficultyChange createPlayClientDifficultyChange(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientDifficultyChange.class);
    }

    @Override
    public WrapperPlayClientDifficultyLock createPlayClientDifficultyLock() {
        return UndefinedPacket.findPacket(WrapperPlayClientDifficultyLock.class);
    }

    @Override
    public WrapperPlayClientDifficultyLock createPlayClientDifficultyLock(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientDifficultyLock.class);
    }

    @Override
    public WrapperPlayClientEnchantItem createPlayClientEnchantItem() {
        return new WrapperPlayClientEnchantItem1_12();
    }

    @Override
    public WrapperPlayClientEnchantItem createPlayClientEnchantItem(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientEnchantItem1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientEntityAction createPlayClientEntityAction() {
        return new WrapperPlayClientEntityAction1_12();
    }

    @Override
    public WrapperPlayClientEntityAction createPlayClientEntityAction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientEntityAction1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery() {
        return UndefinedPacket.findPacket(WrapperPlayClientEntityNbtQuery.class);
    }

    @Override
    public WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientEntityNbtQuery.class);
    }

    @Override
    public WrapperPlayClientFlying createPlayClientFlying() {
        return new WrapperPlayClientFlying1_12();
    }

    @Override
    public WrapperPlayClientFlying createPlayClientFlying(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientFlying1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot() {
        return new WrapperPlayClientHeldItemSlot1_12();
    }

    @Override
    public WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientHeldItemSlot1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientItemName createPlayClientItemName() {
        return UndefinedPacket.findPacket(WrapperPlayClientItemName.class);
    }

    @Override
    public WrapperPlayClientItemName createPlayClientItemName(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientItemName.class);
    }

    @Override
    public WrapperPlayClientKeepAlive createPlayClientKeepAlive() {
        return new WrapperPlayClientKeepAlive1_12();
    }

    @Override
    public WrapperPlayClientKeepAlive createPlayClientKeepAlive(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientKeepAlive1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientLook createPlayClientLook() {
        return new WrapperPlayClientLook1_12();
    }

    @Override
    public WrapperPlayClientLook createPlayClientLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientLook1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientPickItem createPlayClientPickItem() {
        return UndefinedPacket.findPacket(WrapperPlayClientPickItem.class);
    }

    @Override
    public WrapperPlayClientPickItem createPlayClientPickItem(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientPickItem.class);
    }

    @Override
    public WrapperPlayClientPosition createPlayClientPosition() {
        return new WrapperPlayClientPosition1_12();
    }

    @Override
    public WrapperPlayClientPosition createPlayClientPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientPosition1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientPositionLook createPlayClientPositionLook() {
        return new WrapperPlayClientPositionLook1_12();
    }

    @Override
    public WrapperPlayClientPositionLook createPlayClientPositionLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientPositionLook1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed() {
        return new WrapperPlayClientRecipeDisplayed1_12();
    }

    @Override
    public WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientRecipeDisplayed1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus() {
        return new WrapperPlayClientResourcePackStatus1_12();
    }

    @Override
    public WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientResourcePackStatus1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock() {
        return UndefinedPacket.findPacket(WrapperPlayClientSetCommandBlock.class);
    }

    @Override
    public WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientSetCommandBlock.class);
    }

    @Override
    public WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart() {
        return UndefinedPacket.findPacket(WrapperPlayClientSetCommandMinecart.class);
    }

    @Override
    public WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientSetCommandMinecart.class);
    }

    @Override
    public WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot() {
        return new WrapperPlayClientSetCreativeSlot1_12();
    }

    @Override
    public WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSetCreativeSlot1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientSetJigsaw createPlayClientSetJigsaw() {
        return UndefinedPacket.findPacket(WrapperPlayClientSetJigsaw.class);
    }

    @Override
    public WrapperPlayClientSetJigsaw createPlayClientSetJigsaw(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientSetJigsaw.class);
    }

    @Override
    public WrapperPlayClientSettings createPlayClientSettings() {
        return new WrapperPlayClientSettings1_12();
    }

    @Override
    public WrapperPlayClientSettings createPlayClientSettings(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSettings1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientSpectate createPlayClientSpectate() {
        return new WrapperPlayClientSpectate1_12();
    }

    @Override
    public WrapperPlayClientSpectate createPlayClientSpectate(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSpectate1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientSteerVehicle createPlayClientSteerVehicle() {
        return new WrapperPlayClientSteerVehicle1_12();
    }

    @Override
    public WrapperPlayClientSteerVehicle createPlayClientSteerVehicle(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSteerVehicle1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientStruct createPlayClientStruct() {
        return UndefinedPacket.findPacket(WrapperPlayClientStruct.class);
    }

    @Override
    public WrapperPlayClientStruct createPlayClientStruct(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientStruct.class);
    }

    @Override
    public WrapperPlayClientStructureBlock createPlayClientStructureBlock() {
        return UndefinedPacket.findPacket(WrapperPlayClientStructureBlock.class);
    }

    @Override
    public WrapperPlayClientStructureBlock createPlayClientStructureBlock(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientStructureBlock.class);
    }

    @Override
    public WrapperPlayClientTabComplete createPlayClientTabComplete() {
        return new WrapperPlayClientTabComplete1_12();
    }

    @Override
    public WrapperPlayClientTabComplete createPlayClientTabComplete(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTabComplete1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientTeleportAccept createPlayClientTeleportAccept() {
        return new WrapperPlayClientTeleportAccept1_12();
    }

    @Override
    public WrapperPlayClientTeleportAccept createPlayClientTeleportAccept(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTeleportAccept1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery() {
        return UndefinedPacket.findPacket(WrapperPlayClientTileNbtQuery.class);
    }

    @Override
    public WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayClientTileNbtQuery.class);
    }

    @Override
    public WrapperPlayClientTradeSelect createPlayClientTradeSelect() {
        return UndefinedPacket.findPacket(WrapperPlayClientTradeSelect.class);
    }

    @Override
    public WrapperPlayClientTransaction createPlayClientTransaction() {
        return new WrapperPlayClientTransaction1_12();
    }

    @Override
    public WrapperPlayClientTransaction createPlayClientTransaction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTransaction1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientUpdateSign createPlayClientUpdateSign() {
        return new WrapperPlayClientUpdateSign1_12();
    }

    @Override
    public WrapperPlayClientUpdateSign createPlayClientUpdateSign(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUpdateSign1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientUseEntity createPlayClientUseEntity() {
        return new WrapperPlayClientUseEntity1_12();
    }

    @Override
    public WrapperPlayClientUseEntity createPlayClientUseEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUseEntity1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientUseItem createPlayClientUseItem() {
        return new WrapperPlayClientUseItem1_12();
    }

    @Override
    public WrapperPlayClientUseItem createPlayClientUseItem(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUseItem1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientVehicleMove createPlayClientVehicleMove() {
        return new WrapperPlayClientVehicleMove1_12();
    }

    @Override
    public WrapperPlayClientVehicleMove createPlayClientVehicleMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientVehicleMove1_12(packetContainer);
    }

    @Override
    public WrapperPlayClientWindowClick createPlayClientWindowClick() {
        return new WrapperPlayClientWindowClick1_12();
    }

    @Override
    public WrapperPlayClientWindowClick createPlayClientWindowClick(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientWindowClick1_12(packetContainer);
    }

    @Override
    public WrapperStatusClientPing createStatusClientPing() {
        return new WrapperStatusClientPing1_12();
    }

    @Override
    public WrapperStatusClientPing createStatusClientPing(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusClientPing1_12(packetContainer);
    }

    @Override
    public WrapperStatusClientStart createStatusClientStart() {
        return new WrapperStatusClientStart1_12();
    }

    @Override
    public WrapperStatusClientStart createStatusClientStart(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusClientStart1_12(packetContainer);
    }

    @Override
    public WrapperLoginServerCustomPayload createLoginServerCustomPayload() {
        return UndefinedPacket.findPacket(WrapperLoginServerCustomPayload.class);
    }

    @Override
    public WrapperLoginServerCustomPayload createLoginServerCustomPayload(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperLoginServerCustomPayload.class);
    }

    @Override
    public WrapperLoginServerDisconnect createLoginServerDisconnect() {
        return new WrapperLoginServerDisconnect1_12();
    }

    @Override
    public WrapperLoginServerDisconnect createLoginServerDisconnect(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerDisconnect1_12(packetContainer);
    }

    @Override
    public WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin() {
        return new WrapperLoginServerEncryptionBegin1_12();
    }

    @Override
    public WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerEncryptionBegin1_12(packetContainer);
    }

    @Override
    public WrapperLoginServerSetCompression createLoginServerSetCompression() {
        return new WrapperLoginServerSetCompression1_12();
    }

    @Override
    public WrapperLoginServerSetCompression createLoginServerSetCompression(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerSetCompression1_12(packetContainer);
    }

    @Override
    public WrapperLoginServerSuccess createLoginServerSuccess() {
        return new WrapperLoginServerSuccess1_12();
    }

    @Override
    public WrapperLoginServerSuccess createLoginServerSuccess(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerSuccess1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerAbilities createPlayServerAbilities() {
        return new WrapperPlayServerAbilities1_12();
    }

    @Override
    public WrapperPlayServerAbilities createPlayServerAbilities(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAbilities1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerAdvancements createPlayServerAdvancements() {
        return new WrapperPlayServerAdvancements1_12();
    }

    @Override
    public WrapperPlayServerAdvancements createPlayServerAdvancements(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAdvancements1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerAnimation createPlayServerAnimation() {
        return new WrapperPlayServerAnimation1_12();
    }

    @Override
    public WrapperPlayServerAnimation createPlayServerAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAnimation1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerAttachEntity createPlayServerAttachEntity() {
        return new WrapperPlayServerAttachEntity1_12();
    }

    @Override
    public WrapperPlayServerAttachEntity createPlayServerAttachEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAttachEntity1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerAutoRecipe createPlayServerAutoRecipe() {
        return new WrapperPlayServerAutoRecipe1_12();
    }

    @Override
    public WrapperPlayServerAutoRecipe createPlayServerAutoRecipe(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAutoRecipe1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerBed createPlayServerBed() {
        return new WrapperPlayServerBed1_12();
    }

    @Override
    public WrapperPlayServerBed createPlayServerBed(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBed1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockAction createPlayServerBlockAction() {
        return new WrapperPlayServerBlockAction1_12();
    }

    @Override
    public WrapperPlayServerBlockAction createPlayServerBlockAction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockAction1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockBreak createPlayServerBlockBreak() {
        return UndefinedPacket.findPacket(WrapperPlayServerBlockBreak.class);
    }

    @Override
    public WrapperPlayServerBlockBreak createPlayServerBlockBreak(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerBlockBreak.class);
    }

    @Override
    public WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation() {
        return new WrapperPlayServerBlockBreakAnimation1_12();
    }

    @Override
    public WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockBreakAnimation1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockChange createPlayServerBlockChange() {
        return new WrapperPlayServerBlockChange1_12();
    }

    @Override
    public WrapperPlayServerBlockChange createPlayServerBlockChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockChange1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerBoss createPlayServerBoss() {
        return new WrapperPlayServerBoss1_12();
    }

    @Override
    public WrapperPlayServerBoss createPlayServerBoss(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBoss1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCamera createPlayServerCamera() {
        return new WrapperPlayServerCamera1_12();
    }

    @Override
    public WrapperPlayServerCamera createPlayServerCamera(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCamera1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerChat createPlayServerChat() {
        return new WrapperPlayServerChat1_12();
    }

    @Override
    public WrapperPlayServerChat createPlayServerChat(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerChat1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCloseWindow createPlayServerCloseWindow() {
        return new WrapperPlayServerCloseWindow1_12();
    }

    @Override
    public WrapperPlayServerCloseWindow createPlayServerCloseWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCloseWindow1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCollect createPlayServerCollect() {
        return new WrapperPlayServerCollect1_12();
    }

    @Override
    public WrapperPlayServerCollect createPlayServerCollect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCollect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCombatEvent createPlayServerCombatEvent() {
        return new WrapperPlayServerCombatEvent1_12();
    }

    @Override
    public WrapperPlayServerCombatEvent createPlayServerCombatEvent(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCombatEvent1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCommands createPlayServerCommands() {
        return UndefinedPacket.findPacket(WrapperPlayServerCommands.class);
    }

    @Override
    public WrapperPlayServerCommands createPlayServerCommands(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerCommands.class);
    }

    @Override
    public WrapperPlayServerCustomPayload createPlayServerCustomPayload() {
        return new WrapperPlayServerCustomPayload1_12();
    }

    @Override
    public WrapperPlayServerCustomPayload createPlayServerCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCustomPayload1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect() {
        return new WrapperPlayServerCustomSoundEffect1_12();
    }

    @Override
    public WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCustomSoundEffect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntity createPlayServerEntity() {
        return new WrapperPlayServerEntity1_12();
    }

    @Override
    public WrapperPlayServerEntity createPlayServerEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntity1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityDestroy createPlayServerEntityDestroy() {
        return new WrapperPlayServerEntityDestroy1_12();
    }

    @Override
    public WrapperPlayServerEntityDestroy createPlayServerEntityDestroy(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityDestroy1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityEffect createPlayServerEntityEffect() {
        return new WrapperPlayServerEntityEffect1_12();
    }

    @Override
    public WrapperPlayServerEntityEffect createPlayServerEntityEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityEffect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityEquipment createPlayServerEntityEquipment() {
        return new WrapperPlayServerEntityEquipment1_12();
    }

    @Override
    public WrapperPlayServerEntityEquipment createPlayServerEntityEquipment(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityEquipment1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation() {
        return new WrapperPlayServerEntityHeadRotation1_12();
    }

    @Override
    public WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityHeadRotation1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityLook createPlayServerEntityLook() {
        return new WrapperPlayServerEntityLook1_12();
    }

    @Override
    public WrapperPlayServerEntityLook createPlayServerEntityLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityLook1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityMetadata createPlayServerEntityMetadata() {
        return new WrapperPlayServerEntityMetadata1_12();
    }

    @Override
    public WrapperPlayServerEntityMetadata createPlayServerEntityMetadata(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityMetadata1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntitySound createPlayServerEntitySound() {
        return UndefinedPacket.findPacket(WrapperPlayServerEntitySound.class);
    }

    @Override
    public WrapperPlayServerEntitySound createPlayServerEntitySound(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerEntitySound.class);
    }

    @Override
    public WrapperPlayServerEntityStatus createPlayServerEntityStatus() {
        return new WrapperPlayServerEntityStatus1_12();
    }

    @Override
    public WrapperPlayServerEntityStatus createPlayServerEntityStatus(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityStatus1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityTeleport createPlayServerEntityTeleport() {
        return new WrapperPlayServerEntityTeleport1_12();
    }

    @Override
    public WrapperPlayServerEntityTeleport createPlayServerEntityTeleport(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityTeleport1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityVelocity createPlayServerEntityVelocity() {
        return new WrapperPlayServerEntityVelocity1_12();
    }

    @Override
    public WrapperPlayServerEntityVelocity createPlayServerEntityVelocity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityVelocity1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerExperience createPlayServerExperience() {
        return new WrapperPlayServerExperience1_12();
    }

    @Override
    public WrapperPlayServerExperience createPlayServerExperience(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerExperience1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerExplosion createPlayServerExplosion() {
        return new WrapperPlayServerExplosion1_12();
    }

    @Override
    public WrapperPlayServerExplosion createPlayServerExplosion(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerExplosion1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerGameStateChange createPlayServerGameStateChange() {
        return new WrapperPlayServerGameStateChange1_12();
    }

    @Override
    public WrapperPlayServerGameStateChange createPlayServerGameStateChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerGameStateChange1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot() {
        return new WrapperPlayServerHeldItemSlot1_12();
    }

    @Override
    public WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerHeldItemSlot1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerKeepAlive createPlayServerKeepAlive() {
        return new WrapperPlayServerKeepAlive1_12();
    }

    @Override
    public WrapperPlayServerKeepAlive createPlayServerKeepAlive(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerKeepAlive1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerKickDisconnect createPlayServerKickDisconnect() {
        return new WrapperPlayServerKickDisconnect1_12();
    }

    @Override
    public WrapperPlayServerKickDisconnect createPlayServerKickDisconnect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerKickDisconnect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerLightUpdate createPlayServerLightUpdate() {
        return UndefinedPacket.findPacket(WrapperPlayServerLightUpdate.class);
    }

    @Override
    public WrapperPlayServerLightUpdate createPlayServerLightUpdate(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerLightUpdate.class);
    }

    @Override
    public WrapperPlayServerLogin createPlayServerLogin() {
        return new WrapperPlayServerLogin1_12();
    }

    @Override
    public WrapperPlayServerLogin createPlayServerLogin(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerLogin1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerLookAt createPlayServerLookAt() {
        return UndefinedPacket.findPacket(WrapperPlayServerLookAt.class);
    }

    @Override
    public WrapperPlayServerLookAt createPlayServerLookAt(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerLookAt.class);
    }

    @Override
    public WrapperPlayServerMap createPlayServerMap() {
        return new WrapperPlayServerMap1_12();
    }

    @Override
    public WrapperPlayServerMap createPlayServerMap(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMap1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerMapChunk createPlayServerMapChunk() {
        return new WrapperPlayServerMapChunk1_12();
    }

    @Override
    public WrapperPlayServerMapChunk createPlayServerMapChunk(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMapChunk1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerMount createPlayServerMount() {
        return new WrapperPlayServerMount1_12();
    }

    @Override
    public WrapperPlayServerMount createPlayServerMount(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMount1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange() {
        return new WrapperPlayServerMultiBlockChange1_12();
    }

    @Override
    public WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMultiBlockChange1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn() {
        return new WrapperPlayServerNamedEntitySpawn1_12();
    }

    @Override
    public WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerNamedEntitySpawn1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect() {
        return new WrapperPlayServerNamedSoundEffect1_12();
    }

    @Override
    public WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerNamedSoundEffect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerNbtQuery createPlayServerNbtQuery() {
        return UndefinedPacket.findPacket(WrapperPlayServerNbtQuery.class);
    }

    @Override
    public WrapperPlayServerNbtQuery createPlayServerNbtQuery(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerNbtQuery.class);
    }

    @Override
    public WrapperPlayServerOpenBook createPlayServerOpenBook() {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenBook.class);
    }

    @Override
    public WrapperPlayServerOpenBook createPlayServerOpenBook(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenBook.class);
    }

    @Override
    public WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor() {
        return new WrapperPlayServerOpenSignEditor1_12();
    }

    @Override
    public WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenSignEditor1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenWindow createPlayServerOpenWindow() {
        return new WrapperPlayServerOpenWindow1_12();
    }

    @Override
    public WrapperPlayServerOpenWindow createPlayServerOpenWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenWindow1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse() {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenWindowHorse.class);
    }

    @Override
    public WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenWindowHorse.class);
    }

    @Override
    public WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant() {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenWindowMerchant.class);
    }

    @Override
    public WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerOpenWindowMerchant.class);
    }

    @Override
    public WrapperPlayServerPlayerInfo createPlayServerPlayerInfo() {
        return new WrapperPlayServerPlayerInfo1_12();
    }

    @Override
    public WrapperPlayServerPlayerInfo createPlayServerPlayerInfo(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPlayerInfo1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter() {
        return new WrapperPlayServerPlayerListHeaderFooter1_12();
    }

    @Override
    public WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPlayerListHeaderFooter1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerPosition createPlayServerPosition() {
        return new WrapperPlayServerPosition1_12();
    }

    @Override
    public WrapperPlayServerPosition createPlayServerPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPosition1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerRecipes createPlayServerRecipes() {
        return new WrapperPlayServerRecipes1_12();
    }

    @Override
    public WrapperPlayServerRecipes createPlayServerRecipes(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRecipes1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate() {
        return UndefinedPacket.findPacket(WrapperPlayServerRecipeUpdate.class);
    }

    @Override
    public WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerRecipeUpdate.class);
    }

    @Override
    public WrapperPlayServerRelEntityMove createPlayServerRelEntityMove() {
        return new WrapperPlayServerRelEntityMove1_12();
    }

    @Override
    public WrapperPlayServerRelEntityMove createPlayServerRelEntityMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRelEntityMove1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook() {
        return new WrapperPlayServerRelEntityMoveLook1_12();
    }

    @Override
    public WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRelEntityMoveLook1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect() {
        return new WrapperPlayServerRemoveEntityEffect1_12();
    }

    @Override
    public WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRemoveEntityEffect1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerResourcePackSend createPlayServerResourcePackSend() {
        return new WrapperPlayServerResourcePackSend1_12();
    }

    @Override
    public WrapperPlayServerResourcePackSend createPlayServerResourcePackSend(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerResourcePackSend1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerRespawn createPlayServerRespawn() {
        return new WrapperPlayServerRespawn1_12();
    }

    @Override
    public WrapperPlayServerRespawn createPlayServerRespawn(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRespawn1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective() {
        return new WrapperPlayServerScoreboardDisplayObjective1_12();
    }

    @Override
    public WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardDisplayObjective1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective() {
        return new WrapperPlayServerScoreboardObjective1_12();
    }

    @Override
    public WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardObjective1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardScore createPlayServerScoreboardScore() {
        return new WrapperPlayServerScoreboardScore1_12();
    }

    @Override
    public WrapperPlayServerScoreboardScore createPlayServerScoreboardScore(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardScore1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam() {
        return new WrapperPlayServerScoreboardTeam1_12();
    }

    @Override
    public WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardTeam1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab() {
        return new WrapperPlayServerSelectAdvancementTab1_12();
    }

    @Override
    public WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSelectAdvancementTab1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerServerDifficulty createPlayServerServerDifficulty() {
        return new WrapperPlayServerServerDifficulty1_12();
    }

    @Override
    public WrapperPlayServerServerDifficulty createPlayServerServerDifficulty(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerServerDifficulty1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSetCooldown createPlayServerSetCooldown() {
        return new WrapperPlayServerSetCooldown1_12();
    }

    @Override
    public WrapperPlayServerSetCooldown createPlayServerSetCooldown(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSetCooldown1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSetSlot createPlayServerSetSlot() {
        return new WrapperPlayServerSetSlot1_12();
    }

    @Override
    public WrapperPlayServerSetSlot createPlayServerSetSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSetSlot1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity() {
        return new WrapperPlayServerSpawnEntity1_12();
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntity1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull Entity entity, int type, int objectData) {
        return new WrapperPlayServerSpawnEntity1_12(entity, type, objectData);
    }

    @Override
    public WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb() {
        return new WrapperPlayServerSpawnEntityExperienceOrb1_12();
    }

    @Override
    public WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityExperienceOrb1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving() {
        return new WrapperPlayServerSpawnEntityLiving1_12();
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityLiving1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull Entity entity) {
        return new WrapperPlayServerSpawnEntityLiving1_12(entity);
    }

    @Override
    public WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting() {
        return new WrapperPlayServerSpawnEntityPainting1_12();
    }

    @Override
    public WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityPainting1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather() {
        return new WrapperPlayServerSpawnEntityWeather1_12();
    }

    @Override
    public WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityWeather1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnPosition createPlayServerSpawnPosition() {
        return new WrapperPlayServerSpawnPosition1_12();
    }

    @Override
    public WrapperPlayServerSpawnPosition createPlayServerSpawnPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnPosition1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerStatistic createPlayServerStatistic() {
        return new WrapperPlayServerStatistic1_12();
    }

    @Override
    public WrapperPlayServerStatistic createPlayServerStatistic(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerStatistic1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerStopSound createPlayServerStopSound() {
        return UndefinedPacket.findPacket(WrapperPlayServerStopSound.class);
    }

    @Override
    public WrapperPlayServerStopSound createPlayServerStopSound(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerStopSound.class);
    }

    @Override
    public WrapperPlayServerTabComplete createPlayServerTabComplete() {
        return new WrapperPlayServerTabComplete1_12();
    }

    @Override
    public WrapperPlayServerTabComplete createPlayServerTabComplete(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTabComplete1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerTags createPlayServerTags() {
        return UndefinedPacket.findPacket(WrapperPlayServerTags.class);
    }

    @Override
    public WrapperPlayServerTags createPlayServerTags(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerTags.class);
    }

    @Override
    public WrapperPlayServerTileEntityData createPlayServerTileEntityData() {
        return new WrapperPlayServerTileEntityData1_12();
    }

    @Override
    public WrapperPlayServerTileEntityData createPlayServerTileEntityData(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTileEntityData1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerTitle createPlayServerTitle() {
        return new WrapperPlayServerTitle1_12();
    }

    @Override
    public WrapperPlayServerTitle createPlayServerTitle(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTitle1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerTransaction createPlayServerTransaction() {
        return new WrapperPlayServerTransaction1_12();
    }

    @Override
    public WrapperPlayServerTransaction createPlayServerTransaction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTransaction1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerUnloadChunk createPlayServerUnloadChunk() {
        return new WrapperPlayServerUnloadChunk1_12();
    }

    @Override
    public WrapperPlayServerUnloadChunk createPlayServerUnloadChunk(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUnloadChunk1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes() {
        return new WrapperPlayServerUpdateAttributes1_12();
    }

    @Override
    public WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateAttributes1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateHealth createPlayServerUpdateHealth() {
        return new WrapperPlayServerUpdateHealth1_12();
    }

    @Override
    public WrapperPlayServerUpdateHealth createPlayServerUpdateHealth(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateHealth1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateTime createPlayServerUpdateTime() {
        return new WrapperPlayServerUpdateTime1_12();
    }

    @Override
    public WrapperPlayServerUpdateTime createPlayServerUpdateTime(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateTime1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerVehicleMove createPlayServerVehicleMove() {
        return new WrapperPlayServerVehicleMove1_12();
    }

    @Override
    public WrapperPlayServerVehicleMove createPlayServerVehicleMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerVehicleMove1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerViewCentre createPlayServerViewCentre() {
        return UndefinedPacket.findPacket(WrapperPlayServerViewCentre.class);
    }

    @Override
    public WrapperPlayServerViewCentre createPlayServerViewCentre(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerViewCentre.class);
    }

    @Override
    public WrapperPlayServerViewDistance createPlayServerViewDistance() {
        return UndefinedPacket.findPacket(WrapperPlayServerViewDistance.class);
    }

    @Override
    public WrapperPlayServerViewDistance createPlayServerViewDistance(@NonNull PacketContainer packetContainer) {
        return UndefinedPacket.findPacket(WrapperPlayServerViewDistance.class);
    }

    @Override
    public WrapperPlayServerWindowData createPlayServerWindowData() {
        return new WrapperPlayServerWindowData1_12();
    }

    @Override
    public WrapperPlayServerWindowData createPlayServerWindowData(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWindowData1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerWindowItems createPlayServerWindowItems() {
        return new WrapperPlayServerWindowItems1_12();
    }

    @Override
    public WrapperPlayServerWindowItems createPlayServerWindowItems(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWindowItems1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldBorder createPlayServerWorldBorder() {
        return new WrapperPlayServerWorldBorder1_12();
    }

    @Override
    public WrapperPlayServerWorldBorder createPlayServerWorldBorder(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldBorder1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldEvent createPlayServerWorldEvent() {
        return new WrapperPlayServerWorldEvent1_12();
    }

    @Override
    public WrapperPlayServerWorldEvent createPlayServerWorldEvent(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldEvent1_12(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldParticles createPlayServerWorldParticles() {
        return new WrapperPlayServerWorldParticles1_12();
    }

    @Override
    public WrapperPlayServerWorldParticles createPlayServerWorldParticles(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldParticles1_12(packetContainer);
    }

    @Override
    public WrapperStatusServerPong createStatusServerPong() {
        return new WrapperStatusServerPong1_12();
    }

    @Override
    public WrapperStatusServerPong createStatusServerPong(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusServerPong1_12(packetContainer);
    }

    @Override
    public WrapperStatusServerServerInfo createStatusServerServerInfo() {
        return new WrapperStatusServerServerInfo1_12();
    }

    @Override
    public WrapperStatusServerServerInfo createStatusServerServerInfo(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusServerServerInfo1_12(packetContainer);
    }

}
