package org.stonlexx.packetwrapper.v1_15;

import com.comphenix.protocol.events.PacketContainer;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.entity.Entity;
import org.stonlexx.packetwrapper.api.PacketWrapper;
import org.stonlexx.packetwrapper.api.packet.client.*;
import org.stonlexx.packetwrapper.api.packet.server.*;
import org.stonlexx.packetwrapper.v1_15.packet.client.*;
import org.stonlexx.packetwrapper.v1_15.packet.server.*;

public final class PacketWrapper1_15 implements PacketWrapper {

    @Getter
    private final int versionMinor = 15;

    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol() {
        return new WrapperHandshakingClientSetProtocol1_15();
    }

    @Override
    public WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol(@NonNull PacketContainer packetContainer) {
        return new WrapperHandshakingClientSetProtocol1_15(packetContainer);
    }

    @Override
    public WrapperLoginClientCustomPayload createLoginClientCustomPayload() {
        return new WrapperLoginClientCustomPayload1_15();
    }

    @Override
    public WrapperLoginClientCustomPayload createLoginClientCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginClientCustomPayload1_15(packetContainer);
    }

    @Override
    public WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin() {
        return new WrapperLoginClientEncryptionBegin1_15();
    }

    @Override
    public WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginClientEncryptionBegin1_15(packetContainer);
    }

    @Override
    public WrapperLoginClientStart createLoginClientStart() {
        return new WrapperLoginClientStart1_15();
    }

    @Override
    public WrapperLoginClientStart createLoginClientStart(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginClientStart1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientAbilities createPlayClientAbilities() {
        return new WrapperPlayClientAbilities1_15();
    }

    @Override
    public WrapperPlayClientAbilities createPlayClientAbilities(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAbilities1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientAdvancements createPlayClientAdvancements() {
        return new WrapperPlayClientAdvancements1_15();
    }

    @Override
    public WrapperPlayClientAdvancements createPlayClientAdvancements(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAdvancements1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientArmAnimation createPlayClientArmAnimation() {
        return new WrapperPlayClientArmAnimation1_15();
    }

    @Override
    public WrapperPlayClientArmAnimation createPlayClientArmAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientArmAnimation1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientAutoRecipe createPlayClientAutoRecipe() {
        return new WrapperPlayClientAutoRecipe1_15();
    }

    @Override
    public WrapperPlayClientAutoRecipe createPlayClientAutoRecipe(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientAutoRecipe1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientBeacon createPlayClientBeacon() {
        return new WrapperPlayClientBeacon1_15();
    }

    @Override
    public WrapperPlayClientBeacon createPlayClientBeacon(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBeacon1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientBlockDig createPlayClientBlockDig() {
        return new WrapperPlayClientBlockDig1_15();
    }

    @Override
    public WrapperPlayClientBlockDig createPlayClientBlockDig(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBlockDig1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientBlockPlace createPlayClientBlockPlace() {
        return new WrapperPlayClientBlockPlace1_15();
    }

    @Override
    public WrapperPlayClientBlockPlace createPlayClientBlockPlace(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBlockPlace1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientBoatMove createPlayClientBoatMove() {
        return new WrapperPlayClientBoatMove1_15();
    }

    @Override
    public WrapperPlayClientBoatMove createPlayClientBoatMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBoatMove1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientBookEdit createPlayClientBookEdit() {
        return new WrapperPlayClientBookEdit1_15();
    }

    @Override
    public WrapperPlayClientBookEdit createPlayClientBookEdit(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientBookEdit1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientChat createPlayClientChat() {
        return new WrapperPlayClientChat1_15();
    }

    @Override
    public WrapperPlayClientChat createPlayClientChat(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientChat1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientClientCommand createPlayClientClientCommand() {
        return new WrapperPlayClientClientCommand1_15();
    }

    @Override
    public WrapperPlayClientClientCommand createPlayClientClientCommand(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientClientCommand1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientCloseWindow createPlayClientCloseWindow() {
        return new WrapperPlayClientCloseWindow1_15();
    }

    @Override
    public WrapperPlayClientCloseWindow createPlayClientCloseWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientCloseWindow1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientCustomPayload createPlayClientCustomPayload() {
        return new WrapperPlayClientCustomPayload1_15();
    }

    @Override
    public WrapperPlayClientCustomPayload createPlayClientCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientCustomPayload1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientDifficultyChange createPlayClientDifficultyChange() {
        return new WrapperPlayClientDifficultyChange1_15();
    }

    @Override
    public WrapperPlayClientDifficultyChange createPlayClientDifficultyChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientDifficultyChange1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientDifficultyLock createPlayClientDifficultyLock() {
        return new WrapperPlayClientDifficultyLock1_15();
    }

    @Override
    public WrapperPlayClientDifficultyLock createPlayClientDifficultyLock(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientDifficultyLock1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientEnchantItem createPlayClientEnchantItem() {
        return new WrapperPlayClientEnchantItem1_15();
    }

    @Override
    public WrapperPlayClientEnchantItem createPlayClientEnchantItem(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientEnchantItem1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientEntityAction createPlayClientEntityAction() {
        return new WrapperPlayClientEntityAction1_15();
    }

    @Override
    public WrapperPlayClientEntityAction createPlayClientEntityAction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientEntityAction1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery() {
        return new WrapperPlayClientEntityNbtQuery1_15();
    }

    @Override
    public WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientEntityNbtQuery1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientFlying createPlayClientFlying() {
        return new WrapperPlayClientFlying1_15();
    }

    @Override
    public WrapperPlayClientFlying createPlayClientFlying(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientFlying1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot() {
        return new WrapperPlayClientHeldItemSlot1_15();
    }

    @Override
    public WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientHeldItemSlot1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientItemName createPlayClientItemName() {
        return new WrapperPlayClientItemName1_15();
    }

    @Override
    public WrapperPlayClientItemName createPlayClientItemName(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientItemName1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientKeepAlive createPlayClientKeepAlive() {
        return new WrapperPlayClientKeepAlive1_15();
    }

    @Override
    public WrapperPlayClientKeepAlive createPlayClientKeepAlive(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientKeepAlive1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientLook createPlayClientLook() {
        return new WrapperPlayClientLook1_15();
    }

    @Override
    public WrapperPlayClientLook createPlayClientLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientLook1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientPickItem createPlayClientPickItem() {
        return new WrapperPlayClientPickItem1_15();
    }

    @Override
    public WrapperPlayClientPickItem createPlayClientPickItem(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientPickItem1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientPosition createPlayClientPosition() {
        return new WrapperPlayClientPosition1_15();
    }

    @Override
    public WrapperPlayClientPosition createPlayClientPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientPosition1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientPositionLook createPlayClientPositionLook() {
        return new WrapperPlayClientPositionLook1_15();
    }

    @Override
    public WrapperPlayClientPositionLook createPlayClientPositionLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientPositionLook1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed() {
        return new WrapperPlayClientRecipeDisplayed1_15();
    }

    @Override
    public WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientRecipeDisplayed1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus() {
        return new WrapperPlayClientResourcePackStatus1_15();
    }

    @Override
    public WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientResourcePackStatus1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock() {
        return new WrapperPlayClientSetCommandBlock1_15();
    }

    @Override
    public WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSetCommandBlock1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart() {
        return new WrapperPlayClientSetCommandMinecart1_15();
    }

    @Override
    public WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSetCommandMinecart1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot() {
        return new WrapperPlayClientSetCreativeSlot1_15();
    }

    @Override
    public WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSetCreativeSlot1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSetJigsaw createPlayClientSetJigsaw() {
        return new WrapperPlayClientSetJigsaw1_15();
    }

    @Override
    public WrapperPlayClientSetJigsaw createPlayClientSetJigsaw(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSetJigsaw1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSettings createPlayClientSettings() {
        return new WrapperPlayClientSettings1_15();
    }

    @Override
    public WrapperPlayClientSettings createPlayClientSettings(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSettings1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSpectate createPlayClientSpectate() {
        return new WrapperPlayClientSpectate1_15();
    }

    @Override
    public WrapperPlayClientSpectate createPlayClientSpectate(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSpectate1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientSteerVehicle createPlayClientSteerVehicle() {
        return new WrapperPlayClientSteerVehicle1_15();
    }

    @Override
    public WrapperPlayClientSteerVehicle createPlayClientSteerVehicle(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientSteerVehicle1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientStruct createPlayClientStruct() {
        return new WrapperPlayClientStruct1_15();
    }

    @Override
    public WrapperPlayClientStruct createPlayClientStruct(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientStruct1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientStructureBlock createPlayClientStructureBlock() {
        return new WrapperPlayClientStructureBlock1_15();
    }

    @Override
    public WrapperPlayClientStructureBlock createPlayClientStructureBlock(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientStructureBlock1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientTabComplete createPlayClientTabComplete() {
        return new WrapperPlayClientTabComplete1_15();
    }

    @Override
    public WrapperPlayClientTabComplete createPlayClientTabComplete(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTabComplete1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientTeleportAccept createPlayClientTeleportAccept() {
        return new WrapperPlayClientTeleportAccept1_15();
    }

    @Override
    public WrapperPlayClientTeleportAccept createPlayClientTeleportAccept(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTeleportAccept1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery() {
        return new WrapperPlayClientTileNbtQuery1_15();
    }

    @Override
    public WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTileNbtQuery1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientTradeSelect createPlayClientTradeSelect() {
        return new WrapperPlayClientTradeSelect1_15();
    }

    @Override
    public WrapperPlayClientTransaction createPlayClientTransaction() {
        return new WrapperPlayClientTransaction1_15();
    }

    @Override
    public WrapperPlayClientTransaction createPlayClientTransaction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientTransaction1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientUpdateSign createPlayClientUpdateSign() {
        return new WrapperPlayClientUpdateSign1_15();
    }

    @Override
    public WrapperPlayClientUpdateSign createPlayClientUpdateSign(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUpdateSign1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientUseEntity createPlayClientUseEntity() {
        return new WrapperPlayClientUseEntity1_15();
    }

    @Override
    public WrapperPlayClientUseEntity createPlayClientUseEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUseEntity1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientUseItem createPlayClientUseItem() {
        return new WrapperPlayClientUseItem1_15();
    }

    @Override
    public WrapperPlayClientUseItem createPlayClientUseItem(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientUseItem1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientVehicleMove createPlayClientVehicleMove() {
        return new WrapperPlayClientVehicleMove1_15();
    }

    @Override
    public WrapperPlayClientVehicleMove createPlayClientVehicleMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientVehicleMove1_15(packetContainer);
    }

    @Override
    public WrapperPlayClientWindowClick createPlayClientWindowClick() {
        return new WrapperPlayClientWindowClick1_15();
    }

    @Override
    public WrapperPlayClientWindowClick createPlayClientWindowClick(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayClientWindowClick1_15(packetContainer);
    }

    @Override
    public WrapperStatusClientPing createStatusClientPing() {
        return new WrapperStatusClientPing1_15();
    }

    @Override
    public WrapperStatusClientPing createStatusClientPing(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusClientPing1_15(packetContainer);
    }

    @Override
    public WrapperStatusClientStart createStatusClientStart() {
        return new WrapperStatusClientStart1_15();
    }

    @Override
    public WrapperStatusClientStart createStatusClientStart(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusClientStart1_15(packetContainer);
    }

    @Override
    public WrapperLoginServerCustomPayload createLoginServerCustomPayload() {
        return new WrapperLoginServerCustomPayload1_15();
    }

    @Override
    public WrapperLoginServerCustomPayload createLoginServerCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerCustomPayload1_15(packetContainer);
    }

    @Override
    public WrapperLoginServerDisconnect createLoginServerDisconnect() {
        return new WrapperLoginServerDisconnect1_15();
    }

    @Override
    public WrapperLoginServerDisconnect createLoginServerDisconnect(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerDisconnect1_15(packetContainer);
    }

    @Override
    public WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin() {
        return new WrapperLoginServerEncryptionBegin1_15();
    }

    @Override
    public WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerEncryptionBegin1_15(packetContainer);
    }

    @Override
    public WrapperLoginServerSetCompression createLoginServerSetCompression() {
        return new WrapperLoginServerSetCompression1_15();
    }

    @Override
    public WrapperLoginServerSetCompression createLoginServerSetCompression(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerSetCompression1_15(packetContainer);
    }

    @Override
    public WrapperLoginServerSuccess createLoginServerSuccess() {
        return new WrapperLoginServerSuccess1_15();
    }

    @Override
    public WrapperLoginServerSuccess createLoginServerSuccess(@NonNull PacketContainer packetContainer) {
        return new WrapperLoginServerSuccess1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerAbilities createPlayServerAbilities() {
        return new WrapperPlayServerAbilities1_15();
    }

    @Override
    public WrapperPlayServerAbilities createPlayServerAbilities(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAbilities1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerAdvancements createPlayServerAdvancements() {
        return new WrapperPlayServerAdvancements1_15();
    }

    @Override
    public WrapperPlayServerAdvancements createPlayServerAdvancements(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAdvancements1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerAnimation createPlayServerAnimation() {
        return new WrapperPlayServerAnimation1_15();
    }

    @Override
    public WrapperPlayServerAnimation createPlayServerAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAnimation1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerAttachEntity createPlayServerAttachEntity() {
        return new WrapperPlayServerAttachEntity1_15();
    }

    @Override
    public WrapperPlayServerAttachEntity createPlayServerAttachEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAttachEntity1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerAutoRecipe createPlayServerAutoRecipe() {
        return new WrapperPlayServerAutoRecipe1_15();
    }

    @Override
    public WrapperPlayServerAutoRecipe createPlayServerAutoRecipe(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerAutoRecipe1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBed createPlayServerBed() {
        return new WrapperPlayServerBed1_15();
    }

    @Override
    public WrapperPlayServerBed createPlayServerBed(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBed1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockAction createPlayServerBlockAction() {
        return new WrapperPlayServerBlockAction1_15();
    }

    @Override
    public WrapperPlayServerBlockAction createPlayServerBlockAction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockAction1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockBreak createPlayServerBlockBreak() {
        return new WrapperPlayServerBlockBreak1_15();
    }

    @Override
    public WrapperPlayServerBlockBreak createPlayServerBlockBreak(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockBreak1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation() {
        return new WrapperPlayServerBlockBreakAnimation1_15();
    }

    @Override
    public WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockBreakAnimation1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBlockChange createPlayServerBlockChange() {
        return new WrapperPlayServerBlockChange1_15();
    }

    @Override
    public WrapperPlayServerBlockChange createPlayServerBlockChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBlockChange1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerBoss createPlayServerBoss() {
        return new WrapperPlayServerBoss1_15();
    }

    @Override
    public WrapperPlayServerBoss createPlayServerBoss(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerBoss1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCamera createPlayServerCamera() {
        return new WrapperPlayServerCamera1_15();
    }

    @Override
    public WrapperPlayServerCamera createPlayServerCamera(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCamera1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerChat createPlayServerChat() {
        return new WrapperPlayServerChat1_15();
    }

    @Override
    public WrapperPlayServerChat createPlayServerChat(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerChat1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCloseWindow createPlayServerCloseWindow() {
        return new WrapperPlayServerCloseWindow1_15();
    }

    @Override
    public WrapperPlayServerCloseWindow createPlayServerCloseWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCloseWindow1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCollect createPlayServerCollect() {
        return new WrapperPlayServerCollect1_15();
    }

    @Override
    public WrapperPlayServerCollect createPlayServerCollect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCollect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCombatEvent createPlayServerCombatEvent() {
        return new WrapperPlayServerCombatEvent1_15();
    }

    @Override
    public WrapperPlayServerCombatEvent createPlayServerCombatEvent(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCombatEvent1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCommands createPlayServerCommands() {
        return new WrapperPlayServerCommands1_15();
    }

    @Override
    public WrapperPlayServerCommands createPlayServerCommands(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCommands1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCustomPayload createPlayServerCustomPayload() {
        return new WrapperPlayServerCustomPayload1_15();
    }

    @Override
    public WrapperPlayServerCustomPayload createPlayServerCustomPayload(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCustomPayload1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect() {
        return new WrapperPlayServerCustomSoundEffect1_15();
    }

    @Override
    public WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerCustomSoundEffect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntity createPlayServerEntity() {
        return new WrapperPlayServerEntity1_15();
    }

    @Override
    public WrapperPlayServerEntity createPlayServerEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntity1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityDestroy createPlayServerEntityDestroy() {
        return new WrapperPlayServerEntityDestroy1_15();
    }

    @Override
    public WrapperPlayServerEntityDestroy createPlayServerEntityDestroy(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityDestroy1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityEffect createPlayServerEntityEffect() {
        return new WrapperPlayServerEntityEffect1_15();
    }

    @Override
    public WrapperPlayServerEntityEffect createPlayServerEntityEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityEffect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityEquipment createPlayServerEntityEquipment() {
        return new WrapperPlayServerEntityEquipment1_15();
    }

    @Override
    public WrapperPlayServerEntityEquipment createPlayServerEntityEquipment(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityEquipment1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation() {
        return new WrapperPlayServerEntityHeadRotation1_15();
    }

    @Override
    public WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityHeadRotation1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityLook createPlayServerEntityLook() {
        return new WrapperPlayServerEntityLook1_15();
    }

    @Override
    public WrapperPlayServerEntityLook createPlayServerEntityLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityLook1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityMetadata createPlayServerEntityMetadata() {
        return new WrapperPlayServerEntityMetadata1_15();
    }

    @Override
    public WrapperPlayServerEntityMetadata createPlayServerEntityMetadata(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityMetadata1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntitySound createPlayServerEntitySound() {
        return new WrapperPlayServerEntitySound1_15();
    }

    @Override
    public WrapperPlayServerEntitySound createPlayServerEntitySound(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntitySound1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityStatus createPlayServerEntityStatus() {
        return new WrapperPlayServerEntityStatus1_15();
    }

    @Override
    public WrapperPlayServerEntityStatus createPlayServerEntityStatus(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityStatus1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityTeleport createPlayServerEntityTeleport() {
        return new WrapperPlayServerEntityTeleport1_15();
    }

    @Override
    public WrapperPlayServerEntityTeleport createPlayServerEntityTeleport(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityTeleport1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerEntityVelocity createPlayServerEntityVelocity() {
        return new WrapperPlayServerEntityVelocity1_15();
    }

    @Override
    public WrapperPlayServerEntityVelocity createPlayServerEntityVelocity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerEntityVelocity1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerExperience createPlayServerExperience() {
        return new WrapperPlayServerExperience1_15();
    }

    @Override
    public WrapperPlayServerExperience createPlayServerExperience(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerExperience1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerExplosion createPlayServerExplosion() {
        return new WrapperPlayServerExplosion1_15();
    }

    @Override
    public WrapperPlayServerExplosion createPlayServerExplosion(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerExplosion1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerGameStateChange createPlayServerGameStateChange() {
        return new WrapperPlayServerGameStateChange1_15();
    }

    @Override
    public WrapperPlayServerGameStateChange createPlayServerGameStateChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerGameStateChange1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot() {
        return new WrapperPlayServerHeldItemSlot1_15();
    }

    @Override
    public WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerHeldItemSlot1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerKeepAlive createPlayServerKeepAlive() {
        return new WrapperPlayServerKeepAlive1_15();
    }

    @Override
    public WrapperPlayServerKeepAlive createPlayServerKeepAlive(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerKeepAlive1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerKickDisconnect createPlayServerKickDisconnect() {
        return new WrapperPlayServerKickDisconnect1_15();
    }

    @Override
    public WrapperPlayServerKickDisconnect createPlayServerKickDisconnect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerKickDisconnect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerLightUpdate createPlayServerLightUpdate() {
        return new WrapperPlayServerLightUpdate1_15();
    }

    @Override
    public WrapperPlayServerLightUpdate createPlayServerLightUpdate(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerLightUpdate1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerLogin createPlayServerLogin() {
        return new WrapperPlayServerLogin1_15();
    }

    @Override
    public WrapperPlayServerLogin createPlayServerLogin(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerLogin1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerLookAt createPlayServerLookAt() {
        return new WrapperPlayServerLookAt1_15();
    }

    @Override
    public WrapperPlayServerLookAt createPlayServerLookAt(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerLookAt1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerMap createPlayServerMap() {
        return new WrapperPlayServerMap1_15();
    }

    @Override
    public WrapperPlayServerMap createPlayServerMap(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMap1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerMapChunk createPlayServerMapChunk() {
        return new WrapperPlayServerMapChunk1_15();
    }

    @Override
    public WrapperPlayServerMapChunk createPlayServerMapChunk(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMapChunk1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerMount createPlayServerMount() {
        return new WrapperPlayServerMount1_15();
    }

    @Override
    public WrapperPlayServerMount createPlayServerMount(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMount1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange() {
        return new WrapperPlayServerMultiBlockChange1_15();
    }

    @Override
    public WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerMultiBlockChange1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn() {
        return new WrapperPlayServerNamedEntitySpawn1_15();
    }

    @Override
    public WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerNamedEntitySpawn1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect() {
        return new WrapperPlayServerNamedSoundEffect1_15();
    }

    @Override
    public WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerNamedSoundEffect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerNbtQuery createPlayServerNbtQuery() {
        return new WrapperPlayServerNbtQuery1_15();
    }

    @Override
    public WrapperPlayServerNbtQuery createPlayServerNbtQuery(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerNbtQuery1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenBook createPlayServerOpenBook() {
        return new WrapperPlayServerOpenBook1_15();
    }

    @Override
    public WrapperPlayServerOpenBook createPlayServerOpenBook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenBook1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor() {
        return new WrapperPlayServerOpenSignEditor1_15();
    }

    @Override
    public WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenSignEditor1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenWindow createPlayServerOpenWindow() {
        return new WrapperPlayServerOpenWindow1_15();
    }

    @Override
    public WrapperPlayServerOpenWindow createPlayServerOpenWindow(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenWindow1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse() {
        return new WrapperPlayServerOpenWindowHorse1_15();
    }

    @Override
    public WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenWindowHorse1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant() {
        return new WrapperPlayServerOpenWindowMerchant1_15();
    }

    @Override
    public WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerOpenWindowMerchant1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerPlayerInfo createPlayServerPlayerInfo() {
        return new WrapperPlayServerPlayerInfo1_15();
    }

    @Override
    public WrapperPlayServerPlayerInfo createPlayServerPlayerInfo(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPlayerInfo1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter() {
        return new WrapperPlayServerPlayerListHeaderFooter1_15();
    }

    @Override
    public WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPlayerListHeaderFooter1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerPosition createPlayServerPosition() {
        return new WrapperPlayServerPosition1_15();
    }

    @Override
    public WrapperPlayServerPosition createPlayServerPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerPosition1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRecipes createPlayServerRecipes() {
        return new WrapperPlayServerRecipes1_15();
    }

    @Override
    public WrapperPlayServerRecipes createPlayServerRecipes(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRecipes1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate() {
        return new WrapperPlayServerRecipeUpdate1_15();
    }

    @Override
    public WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRecipeUpdate1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRelEntityMove createPlayServerRelEntityMove() {
        return new WrapperPlayServerRelEntityMove1_15();
    }

    @Override
    public WrapperPlayServerRelEntityMove createPlayServerRelEntityMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRelEntityMove1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook() {
        return new WrapperPlayServerRelEntityMoveLook1_15();
    }

    @Override
    public WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRelEntityMoveLook1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect() {
        return new WrapperPlayServerRemoveEntityEffect1_15();
    }

    @Override
    public WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRemoveEntityEffect1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerResourcePackSend createPlayServerResourcePackSend() {
        return new WrapperPlayServerResourcePackSend1_15();
    }

    @Override
    public WrapperPlayServerResourcePackSend createPlayServerResourcePackSend(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerResourcePackSend1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerRespawn createPlayServerRespawn() {
        return new WrapperPlayServerRespawn1_15();
    }

    @Override
    public WrapperPlayServerRespawn createPlayServerRespawn(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerRespawn1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective() {
        return new WrapperPlayServerScoreboardDisplayObjective1_15();
    }

    @Override
    public WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardDisplayObjective1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective() {
        return new WrapperPlayServerScoreboardObjective1_15();
    }

    @Override
    public WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardObjective1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardScore createPlayServerScoreboardScore() {
        return new WrapperPlayServerScoreboardScore1_15();
    }

    @Override
    public WrapperPlayServerScoreboardScore createPlayServerScoreboardScore(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardScore1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam() {
        return new WrapperPlayServerScoreboardTeam1_15();
    }

    @Override
    public WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerScoreboardTeam1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab() {
        return new WrapperPlayServerSelectAdvancementTab1_15();
    }

    @Override
    public WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSelectAdvancementTab1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerServerDifficulty createPlayServerServerDifficulty() {
        return new WrapperPlayServerServerDifficulty1_15();
    }

    @Override
    public WrapperPlayServerServerDifficulty createPlayServerServerDifficulty(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerServerDifficulty1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSetCooldown createPlayServerSetCooldown() {
        return new WrapperPlayServerSetCooldown1_15();
    }

    @Override
    public WrapperPlayServerSetCooldown createPlayServerSetCooldown(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSetCooldown1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSetSlot createPlayServerSetSlot() {
        return new WrapperPlayServerSetSlot1_15();
    }

    @Override
    public WrapperPlayServerSetSlot createPlayServerSetSlot(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSetSlot1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity() {
        return new WrapperPlayServerSpawnEntity1_15();
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntity1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull Entity entity, int type, int objectData) {
        return new WrapperPlayServerSpawnEntity1_15(entity, type, objectData);
    }

    @Override
    public WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb() {
        return new WrapperPlayServerSpawnEntityExperienceOrb1_15();
    }

    @Override
    public WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityExperienceOrb1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving() {
        return new WrapperPlayServerSpawnEntityLiving1_15();
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityLiving1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull Entity entity) {
        return new WrapperPlayServerSpawnEntityLiving1_15(entity);
    }

    @Override
    public WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting() {
        return new WrapperPlayServerSpawnEntityPainting1_15();
    }

    @Override
    public WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityPainting1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather() {
        return new WrapperPlayServerSpawnEntityWeather1_15();
    }

    @Override
    public WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnEntityWeather1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerSpawnPosition createPlayServerSpawnPosition() {
        return new WrapperPlayServerSpawnPosition1_15();
    }

    @Override
    public WrapperPlayServerSpawnPosition createPlayServerSpawnPosition(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerSpawnPosition1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerStatistic createPlayServerStatistic() {
        return new WrapperPlayServerStatistic1_15();
    }

    @Override
    public WrapperPlayServerStatistic createPlayServerStatistic(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerStatistic1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerStopSound createPlayServerStopSound() {
        return new WrapperPlayServerStopSound1_15();
    }

    @Override
    public WrapperPlayServerStopSound createPlayServerStopSound(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerStopSound1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerTabComplete createPlayServerTabComplete() {
        return new WrapperPlayServerTabComplete1_15();
    }

    @Override
    public WrapperPlayServerTabComplete createPlayServerTabComplete(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTabComplete1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerTags createPlayServerTags() {
        return new WrapperPlayServerTags1_15();
    }

    @Override
    public WrapperPlayServerTags createPlayServerTags(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTags1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerTileEntityData createPlayServerTileEntityData() {
        return new WrapperPlayServerTileEntityData1_15();
    }

    @Override
    public WrapperPlayServerTileEntityData createPlayServerTileEntityData(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTileEntityData1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerTitle createPlayServerTitle() {
        return new WrapperPlayServerTitle1_15();
    }

    @Override
    public WrapperPlayServerTitle createPlayServerTitle(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTitle1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerTransaction createPlayServerTransaction() {
        return new WrapperPlayServerTransaction1_15();
    }

    @Override
    public WrapperPlayServerTransaction createPlayServerTransaction(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerTransaction1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerUnloadChunk createPlayServerUnloadChunk() {
        return new WrapperPlayServerUnloadChunk1_15();
    }

    @Override
    public WrapperPlayServerUnloadChunk createPlayServerUnloadChunk(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUnloadChunk1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes() {
        return new WrapperPlayServerUpdateAttributes1_15();
    }

    @Override
    public WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateAttributes1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateHealth createPlayServerUpdateHealth() {
        return new WrapperPlayServerUpdateHealth1_15();
    }

    @Override
    public WrapperPlayServerUpdateHealth createPlayServerUpdateHealth(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateHealth1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerUpdateTime createPlayServerUpdateTime() {
        return new WrapperPlayServerUpdateTime1_15();
    }

    @Override
    public WrapperPlayServerUpdateTime createPlayServerUpdateTime(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerUpdateTime1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerVehicleMove createPlayServerVehicleMove() {
        return new WrapperPlayServerVehicleMove1_15();
    }

    @Override
    public WrapperPlayServerVehicleMove createPlayServerVehicleMove(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerVehicleMove1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerViewCentre createPlayServerViewCentre() {
        return new WrapperPlayServerViewCentre1_15();
    }

    @Override
    public WrapperPlayServerViewCentre createPlayServerViewCentre(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerViewCentre1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerViewDistance createPlayServerViewDistance() {
        return new WrapperPlayServerViewDistance1_15();
    }

    @Override
    public WrapperPlayServerViewDistance createPlayServerViewDistance(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerViewDistance1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerWindowData createPlayServerWindowData() {
        return new WrapperPlayServerWindowData1_15();
    }

    @Override
    public WrapperPlayServerWindowData createPlayServerWindowData(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWindowData1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerWindowItems createPlayServerWindowItems() {
        return new WrapperPlayServerWindowItems1_15();
    }

    @Override
    public WrapperPlayServerWindowItems createPlayServerWindowItems(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWindowItems1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldBorder createPlayServerWorldBorder() {
        return new WrapperPlayServerWorldBorder1_15();
    }

    @Override
    public WrapperPlayServerWorldBorder createPlayServerWorldBorder(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldBorder1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldEvent createPlayServerWorldEvent() {
        return new WrapperPlayServerWorldEvent1_15();
    }

    @Override
    public WrapperPlayServerWorldEvent createPlayServerWorldEvent(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldEvent1_15(packetContainer);
    }

    @Override
    public WrapperPlayServerWorldParticles createPlayServerWorldParticles() {
        return new WrapperPlayServerWorldParticles1_15();
    }

    @Override
    public WrapperPlayServerWorldParticles createPlayServerWorldParticles(@NonNull PacketContainer packetContainer) {
        return new WrapperPlayServerWorldParticles1_15(packetContainer);
    }

    @Override
    public WrapperStatusServerPong createStatusServerPong() {
        return new WrapperStatusServerPong1_15();
    }

    @Override
    public WrapperStatusServerPong createStatusServerPong(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusServerPong1_15(packetContainer);
    }

    @Override
    public WrapperStatusServerServerInfo createStatusServerServerInfo() {
        return new WrapperStatusServerServerInfo1_15();
    }

    @Override
    public WrapperStatusServerServerInfo createStatusServerServerInfo(@NonNull PacketContainer packetContainer) {
        return new WrapperStatusServerServerInfo1_15(packetContainer);
    }

}
