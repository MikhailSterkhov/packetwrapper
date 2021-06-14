package org.stonlexx.packetwrapper.api;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import lombok.NonNull;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.stonlexx.packetwrapper.api.packet.MinecraftPacket;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;
import org.stonlexx.packetwrapper.api.packet.client.*;
import org.stonlexx.packetwrapper.api.packet.server.*;

public interface PacketWrapper {

    static PacketWrapper getInstance() {
        return PacketWrapperPlugin.packetWrapper;
    }

    int getVersionMinor();

    <T extends WrapperPacket> T findPacketByClass(@NonNull Class<T> packetClass);

    <T extends WrapperPacket> T findPacketByClass(@NonNull String packetClassName);


    WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol();
    WrapperHandshakingClientSetProtocol createHandshakingClientSetProtocol(@NonNull PacketContainer packetContainer);

    WrapperLoginClientCustomPayload createLoginClientCustomPayload();
    WrapperLoginClientCustomPayload createLoginClientCustomPayload(@NonNull PacketContainer packetContainer);

    WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin();
    WrapperLoginClientEncryptionBegin createLoginClientEncryptionBegin(@NonNull PacketContainer packetContainer);

    WrapperLoginClientStart createLoginClientStart();
    WrapperLoginClientStart createLoginClientStart(@NonNull PacketContainer packetContainer);

    WrapperPlayClientAbilities createPlayClientAbilities();
    WrapperPlayClientAbilities createPlayClientAbilities(@NonNull PacketContainer packetContainer);

    WrapperPlayClientAdvancements createPlayClientAdvancements();
    WrapperPlayClientAdvancements createPlayClientAdvancements(@NonNull PacketContainer packetContainer);

    WrapperPlayClientArmAnimation createPlayClientArmAnimation();
    WrapperPlayClientArmAnimation createPlayClientArmAnimation(@NonNull PacketContainer packetContainer);

    WrapperPlayClientAutoRecipe createPlayClientAutoRecipe();
    WrapperPlayClientAutoRecipe createPlayClientAutoRecipe(@NonNull PacketContainer packetContainer);

    WrapperPlayClientBeacon createPlayClientBeacon();
    WrapperPlayClientBeacon createPlayClientBeacon(@NonNull PacketContainer packetContainer);

    WrapperPlayClientBlockDig createPlayClientBlockDig();
    WrapperPlayClientBlockDig createPlayClientBlockDig(@NonNull PacketContainer packetContainer);

    WrapperPlayClientBlockPlace createPlayClientBlockPlace();
    WrapperPlayClientBlockPlace createPlayClientBlockPlace(@NonNull PacketContainer packetContainer);

    WrapperPlayClientBoatMove createPlayClientBoatMove();
    WrapperPlayClientBoatMove createPlayClientBoatMove(@NonNull PacketContainer packetContainer);

    WrapperPlayClientBookEdit createPlayClientBookEdit();
    WrapperPlayClientBookEdit createPlayClientBookEdit(@NonNull PacketContainer packetContainer);

    WrapperPlayClientChat createPlayClientChat();
    WrapperPlayClientChat createPlayClientChat(@NonNull PacketContainer packetContainer);

    WrapperPlayClientClientCommand createPlayClientClientCommand();
    WrapperPlayClientClientCommand createPlayClientClientCommand(@NonNull PacketContainer packetContainer);

    WrapperPlayClientCloseWindow createPlayClientCloseWindow();
    WrapperPlayClientCloseWindow createPlayClientCloseWindow(@NonNull PacketContainer packetContainer);

    WrapperPlayClientCustomPayload createPlayClientCustomPayload();
    WrapperPlayClientCustomPayload createPlayClientCustomPayload(@NonNull PacketContainer packetContainer);

    WrapperPlayClientDifficultyChange createPlayClientDifficultyChange();
    WrapperPlayClientDifficultyChange createPlayClientDifficultyChange(@NonNull PacketContainer packetContainer);

    WrapperPlayClientDifficultyLock createPlayClientDifficultyLock();
    WrapperPlayClientDifficultyLock createPlayClientDifficultyLock(@NonNull PacketContainer packetContainer);

    WrapperPlayClientEnchantItem createPlayClientEnchantItem();
    WrapperPlayClientEnchantItem createPlayClientEnchantItem(@NonNull PacketContainer packetContainer);

    WrapperPlayClientEntityAction createPlayClientEntityAction();
    WrapperPlayClientEntityAction createPlayClientEntityAction(@NonNull PacketContainer packetContainer);

    WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery();
    WrapperPlayClientEntityNbtQuery createPlayClientEntityNbtQuery(@NonNull PacketContainer packetContainer);

    WrapperPlayClientFlying createPlayClientFlying();
    WrapperPlayClientFlying createPlayClientFlying(@NonNull PacketContainer packetContainer);

    WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot();
    WrapperPlayClientHeldItemSlot createPlayClientHeldItemSlot(@NonNull PacketContainer packetContainer);

    WrapperPlayClientItemName createPlayClientItemName();
    WrapperPlayClientItemName createPlayClientItemName(@NonNull PacketContainer packetContainer);

    WrapperPlayClientKeepAlive createPlayClientKeepAlive();
    WrapperPlayClientKeepAlive createPlayClientKeepAlive(@NonNull PacketContainer packetContainer);

    WrapperPlayClientLook createPlayClientLook();
    WrapperPlayClientLook createPlayClientLook(@NonNull PacketContainer packetContainer);

    WrapperPlayClientPickItem createPlayClientPickItem();
    WrapperPlayClientPickItem createPlayClientPickItem(@NonNull PacketContainer packetContainer);

    WrapperPlayClientPosition createPlayClientPosition();
    WrapperPlayClientPosition createPlayClientPosition(@NonNull PacketContainer packetContainer);

    WrapperPlayClientPositionLook createPlayClientPositionLook();
    WrapperPlayClientPositionLook createPlayClientPositionLook(@NonNull PacketContainer packetContainer);

    WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed();
    WrapperPlayClientRecipeDisplayed createPlayClientRecipeDisplayed(@NonNull PacketContainer packetContainer);

    WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus();
    WrapperPlayClientResourcePackStatus createPlayClientResourcePackStatus(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock();
    WrapperPlayClientSetCommandBlock createPlayClientSetCommandBlock(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart();
    WrapperPlayClientSetCommandMinecart createPlayClientSetCommandMinecart(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot();
    WrapperPlayClientSetCreativeSlot createPlayClientSetCreativeSlot(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSetJigsaw createPlayClientSetJigsaw();
    WrapperPlayClientSetJigsaw createPlayClientSetJigsaw(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSettings createPlayClientSettings();
    WrapperPlayClientSettings createPlayClientSettings(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSpectate createPlayClientSpectate();
    WrapperPlayClientSpectate createPlayClientSpectate(@NonNull PacketContainer packetContainer);

    WrapperPlayClientSteerVehicle createPlayClientSteerVehicle();
    WrapperPlayClientSteerVehicle createPlayClientSteerVehicle(@NonNull PacketContainer packetContainer);

    WrapperPlayClientStruct createPlayClientStruct();
    WrapperPlayClientStruct createPlayClientStruct(@NonNull PacketContainer packetContainer);

    WrapperPlayClientStructureBlock createPlayClientStructureBlock();
    WrapperPlayClientStructureBlock createPlayClientStructureBlock(@NonNull PacketContainer packetContainer);

    WrapperPlayClientTabComplete createPlayClientTabComplete();
    WrapperPlayClientTabComplete createPlayClientTabComplete(@NonNull PacketContainer packetContainer);

    WrapperPlayClientTeleportAccept createPlayClientTeleportAccept();
    WrapperPlayClientTeleportAccept createPlayClientTeleportAccept(@NonNull PacketContainer packetContainer);

    WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery();
    WrapperPlayClientTileNbtQuery createPlayClientTileNbtQuery(@NonNull PacketContainer packetContainer);

    WrapperPlayClientTradeSelect createPlayClientTradeSelect();

    WrapperPlayClientTransaction createPlayClientTransaction();
    WrapperPlayClientTransaction createPlayClientTransaction(@NonNull PacketContainer packetContainer);

    WrapperPlayClientUpdateSign createPlayClientUpdateSign();
    WrapperPlayClientUpdateSign createPlayClientUpdateSign(@NonNull PacketContainer packetContainer);

    WrapperPlayClientUseEntity createPlayClientUseEntity();
    WrapperPlayClientUseEntity createPlayClientUseEntity(@NonNull PacketContainer packetContainer);

    WrapperPlayClientUseItem createPlayClientUseItem();
    WrapperPlayClientUseItem createPlayClientUseItem(@NonNull PacketContainer packetContainer);

    WrapperPlayClientVehicleMove createPlayClientVehicleMove();
    WrapperPlayClientVehicleMove createPlayClientVehicleMove(@NonNull PacketContainer packetContainer);

    WrapperPlayClientWindowClick createPlayClientWindowClick();
    WrapperPlayClientWindowClick createPlayClientWindowClick(@NonNull PacketContainer packetContainer);

    WrapperStatusClientPing createStatusClientPing();
    WrapperStatusClientPing createStatusClientPing(@NonNull PacketContainer packetContainer);

    WrapperStatusClientStart createStatusClientStart();
    WrapperStatusClientStart createStatusClientStart(@NonNull PacketContainer packetContainer);

    WrapperLoginServerCustomPayload createLoginServerCustomPayload();
    WrapperLoginServerCustomPayload createLoginServerCustomPayload(@NonNull PacketContainer packetContainer);

    WrapperLoginServerDisconnect createLoginServerDisconnect();
    WrapperLoginServerDisconnect createLoginServerDisconnect(@NonNull PacketContainer packetContainer);

    WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin();
    WrapperLoginServerEncryptionBegin createLoginServerEncryptionBegin(@NonNull PacketContainer packetContainer);

    WrapperLoginServerSetCompression createLoginServerSetCompression();
    WrapperLoginServerSetCompression createLoginServerSetCompression(@NonNull PacketContainer packetContainer);

    WrapperLoginServerSuccess createLoginServerSuccess();
    WrapperLoginServerSuccess createLoginServerSuccess(@NonNull PacketContainer packetContainer);

    WrapperPlayServerAbilities createPlayServerAbilities();
    WrapperPlayServerAbilities createPlayServerAbilities(@NonNull PacketContainer packetContainer);

    WrapperPlayServerAdvancements createPlayServerAdvancements();
    WrapperPlayServerAdvancements createPlayServerAdvancements(@NonNull PacketContainer packetContainer);

    WrapperPlayServerAnimation createPlayServerAnimation();
    WrapperPlayServerAnimation createPlayServerAnimation(@NonNull PacketContainer packetContainer);

    WrapperPlayServerAttachEntity createPlayServerAttachEntity();
    WrapperPlayServerAttachEntity createPlayServerAttachEntity(@NonNull PacketContainer packetContainer);

    WrapperPlayServerAutoRecipe createPlayServerAutoRecipe();
    WrapperPlayServerAutoRecipe createPlayServerAutoRecipe(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBed createPlayServerBed();
    WrapperPlayServerBed createPlayServerBed(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBlockAction createPlayServerBlockAction();
    WrapperPlayServerBlockAction createPlayServerBlockAction(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBlockBreak createPlayServerBlockBreak();
    WrapperPlayServerBlockBreak createPlayServerBlockBreak(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation();
    WrapperPlayServerBlockBreakAnimation createPlayServerBlockBreakAnimation(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBlockChange createPlayServerBlockChange();
    WrapperPlayServerBlockChange createPlayServerBlockChange(@NonNull PacketContainer packetContainer);

    WrapperPlayServerBoss createPlayServerBoss();
    WrapperPlayServerBoss createPlayServerBoss(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCamera createPlayServerCamera();
    WrapperPlayServerCamera createPlayServerCamera(@NonNull PacketContainer packetContainer);

    WrapperPlayServerChat createPlayServerChat();
    WrapperPlayServerChat createPlayServerChat(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCloseWindow createPlayServerCloseWindow();
    WrapperPlayServerCloseWindow createPlayServerCloseWindow(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCollect createPlayServerCollect();
    WrapperPlayServerCollect createPlayServerCollect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCombatEvent createPlayServerCombatEvent();
    WrapperPlayServerCombatEvent createPlayServerCombatEvent(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCommands createPlayServerCommands();
    WrapperPlayServerCommands createPlayServerCommands(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCustomPayload createPlayServerCustomPayload();
    WrapperPlayServerCustomPayload createPlayServerCustomPayload(@NonNull PacketContainer packetContainer);

    WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect();
    WrapperPlayServerCustomSoundEffect createPlayServerCustomSoundEffect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntity createPlayServerEntity();
    WrapperPlayServerEntity createPlayServerEntity(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityDestroy createPlayServerEntityDestroy();
    WrapperPlayServerEntityDestroy createPlayServerEntityDestroy(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityEffect createPlayServerEntityEffect();
    WrapperPlayServerEntityEffect createPlayServerEntityEffect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityEquipment createPlayServerEntityEquipment();
    WrapperPlayServerEntityEquipment createPlayServerEntityEquipment(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation();
    WrapperPlayServerEntityHeadRotation createPlayServerEntityHeadRotation(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityLook createPlayServerEntityLook();
    WrapperPlayServerEntityLook createPlayServerEntityLook(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityMetadata createPlayServerEntityMetadata();
    WrapperPlayServerEntityMetadata createPlayServerEntityMetadata(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntitySound createPlayServerEntitySound();
    WrapperPlayServerEntitySound createPlayServerEntitySound(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityStatus createPlayServerEntityStatus();
    WrapperPlayServerEntityStatus createPlayServerEntityStatus(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityTeleport createPlayServerEntityTeleport();
    WrapperPlayServerEntityTeleport createPlayServerEntityTeleport(@NonNull PacketContainer packetContainer);

    WrapperPlayServerEntityVelocity createPlayServerEntityVelocity();
    WrapperPlayServerEntityVelocity createPlayServerEntityVelocity(@NonNull PacketContainer packetContainer);

    WrapperPlayServerExperience createPlayServerExperience();
    WrapperPlayServerExperience createPlayServerExperience(@NonNull PacketContainer packetContainer);

    WrapperPlayServerExplosion createPlayServerExplosion();
    WrapperPlayServerExplosion createPlayServerExplosion(@NonNull PacketContainer packetContainer);

    WrapperPlayServerGameStateChange createPlayServerGameStateChange();
    WrapperPlayServerGameStateChange createPlayServerGameStateChange(@NonNull PacketContainer packetContainer);

    WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot();
    WrapperPlayServerHeldItemSlot createPlayServerHeldItemSlot(@NonNull PacketContainer packetContainer);

    WrapperPlayServerKeepAlive createPlayServerKeepAlive();
    WrapperPlayServerKeepAlive createPlayServerKeepAlive(@NonNull PacketContainer packetContainer);

    WrapperPlayServerKickDisconnect createPlayServerKickDisconnect();
    WrapperPlayServerKickDisconnect createPlayServerKickDisconnect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerLightUpdate createPlayServerLightUpdate();
    WrapperPlayServerLightUpdate createPlayServerLightUpdate(@NonNull PacketContainer packetContainer);

    WrapperPlayServerLogin createPlayServerLogin();
    WrapperPlayServerLogin createPlayServerLogin(@NonNull PacketContainer packetContainer);

    WrapperPlayServerLookAt createPlayServerLookAt();
    WrapperPlayServerLookAt createPlayServerLookAt(@NonNull PacketContainer packetContainer);

    WrapperPlayServerMap createPlayServerMap();
    WrapperPlayServerMap createPlayServerMap(@NonNull PacketContainer packetContainer);

    WrapperPlayServerMapChunk createPlayServerMapChunk();
    WrapperPlayServerMapChunk createPlayServerMapChunk(@NonNull PacketContainer packetContainer);

    WrapperPlayServerMount createPlayServerMount();
    WrapperPlayServerMount createPlayServerMount(@NonNull PacketContainer packetContainer);

    WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange();
    WrapperPlayServerMultiBlockChange createPlayServerMultiBlockChange(@NonNull PacketContainer packetContainer);

    WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn();
    WrapperPlayServerNamedEntitySpawn createPlayServerNamedEntitySpawn(@NonNull PacketContainer packetContainer);

    WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect();
    WrapperPlayServerNamedSoundEffect createPlayServerNamedSoundEffect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerNbtQuery createPlayServerNbtQuery();
    WrapperPlayServerNbtQuery createPlayServerNbtQuery(@NonNull PacketContainer packetContainer);

    WrapperPlayServerOpenBook createPlayServerOpenBook();
    WrapperPlayServerOpenBook createPlayServerOpenBook(@NonNull PacketContainer packetContainer);

    WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor();
    WrapperPlayServerOpenSignEditor createPlayServerOpenSignEditor(@NonNull PacketContainer packetContainer);

    WrapperPlayServerOpenWindow createPlayServerOpenWindow();
    WrapperPlayServerOpenWindow createPlayServerOpenWindow(@NonNull PacketContainer packetContainer);

    WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse();
    WrapperPlayServerOpenWindowHorse createPlayServerOpenWindowHorse(@NonNull PacketContainer packetContainer);

    WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant();
    WrapperPlayServerOpenWindowMerchant createPlayServerOpenWindowMerchant(@NonNull PacketContainer packetContainer);

    WrapperPlayServerPlayerInfo createPlayServerPlayerInfo();
    WrapperPlayServerPlayerInfo createPlayServerPlayerInfo(@NonNull PacketContainer packetContainer);

    WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter();
    WrapperPlayServerPlayerListHeaderFooter createPlayServerPlayerListHeaderFooter(@NonNull PacketContainer packetContainer);

    WrapperPlayServerPosition createPlayServerPosition();
    WrapperPlayServerPosition createPlayServerPosition(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRecipes createPlayServerRecipes();
    WrapperPlayServerRecipes createPlayServerRecipes(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate();
    WrapperPlayServerRecipeUpdate createPlayServerRecipeUpdate(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRelEntityMove createPlayServerRelEntityMove();
    WrapperPlayServerRelEntityMove createPlayServerRelEntityMove(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook();
    WrapperPlayServerRelEntityMoveLook createPlayServerRelEntityMoveLook(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect();
    WrapperPlayServerRemoveEntityEffect createPlayServerRemoveEntityEffect(@NonNull PacketContainer packetContainer);

    WrapperPlayServerResourcePackSend createPlayServerResourcePackSend();
    WrapperPlayServerResourcePackSend createPlayServerResourcePackSend(@NonNull PacketContainer packetContainer);

    WrapperPlayServerRespawn createPlayServerRespawn();
    WrapperPlayServerRespawn createPlayServerRespawn(@NonNull PacketContainer packetContainer);

    WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective();
    WrapperPlayServerScoreboardDisplayObjective createPlayServerScoreboardDisplayObjective(@NonNull PacketContainer packetContainer);

    WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective();
    WrapperPlayServerScoreboardObjective createPlayServerScoreboardObjective(@NonNull PacketContainer packetContainer);

    WrapperPlayServerScoreboardScore createPlayServerScoreboardScore();
    WrapperPlayServerScoreboardScore createPlayServerScoreboardScore(@NonNull PacketContainer packetContainer);

    WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam();
    WrapperPlayServerScoreboardTeam createPlayServerScoreboardTeam(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab();
    WrapperPlayServerSelectAdvancementTab createPlayServerSelectAdvancementTab(@NonNull PacketContainer packetContainer);

    WrapperPlayServerServerDifficulty createPlayServerServerDifficulty();
    WrapperPlayServerServerDifficulty createPlayServerServerDifficulty(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSetCooldown createPlayServerSetCooldown();
    WrapperPlayServerSetCooldown createPlayServerSetCooldown(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSetSlot createPlayServerSetSlot();
    WrapperPlayServerSetSlot createPlayServerSetSlot(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSpawnEntity createPlayServerSpawnEntity();
    WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull PacketContainer packetContainer);
    WrapperPlayServerSpawnEntity createPlayServerSpawnEntity(@NonNull Entity entity, int type, int objectData);

    WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb();
    WrapperPlayServerSpawnEntityExperienceOrb createPlayServerSpawnEntityExperienceOrb(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving();
    WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull PacketContainer packetContainer);
    WrapperPlayServerSpawnEntityLiving createPlayServerSpawnEntityLiving(@NonNull Entity entity);

    WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting();
    WrapperPlayServerSpawnEntityPainting createPlayServerSpawnEntityPainting(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather();
    WrapperPlayServerSpawnEntityWeather createPlayServerSpawnEntityWeather(@NonNull PacketContainer packetContainer);

    WrapperPlayServerSpawnPosition createPlayServerSpawnPosition();
    WrapperPlayServerSpawnPosition createPlayServerSpawnPosition(@NonNull PacketContainer packetContainer);

    WrapperPlayServerStatistic createPlayServerStatistic();
    WrapperPlayServerStatistic createPlayServerStatistic(@NonNull PacketContainer packetContainer);

    WrapperPlayServerStopSound createPlayServerStopSound();
    WrapperPlayServerStopSound createPlayServerStopSound(@NonNull PacketContainer packetContainer);

    WrapperPlayServerTabComplete createPlayServerTabComplete();
    WrapperPlayServerTabComplete createPlayServerTabComplete(@NonNull PacketContainer packetContainer);

    WrapperPlayServerTags createPlayServerTags();
    WrapperPlayServerTags createPlayServerTags(@NonNull PacketContainer packetContainer);

    WrapperPlayServerTileEntityData createPlayServerTileEntityData();
    WrapperPlayServerTileEntityData createPlayServerTileEntityData(@NonNull PacketContainer packetContainer);

    WrapperPlayServerTitle createPlayServerTitle();
    WrapperPlayServerTitle createPlayServerTitle(@NonNull PacketContainer packetContainer);

    WrapperPlayServerTransaction createPlayServerTransaction();
    WrapperPlayServerTransaction createPlayServerTransaction(@NonNull PacketContainer packetContainer);

    WrapperPlayServerUnloadChunk createPlayServerUnloadChunk();
    WrapperPlayServerUnloadChunk createPlayServerUnloadChunk(@NonNull PacketContainer packetContainer);

    WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes();
    WrapperPlayServerUpdateAttributes createPlayServerUpdateAttributes(@NonNull PacketContainer packetContainer);

    WrapperPlayServerUpdateHealth createPlayServerUpdateHealth();
    WrapperPlayServerUpdateHealth createPlayServerUpdateHealth(@NonNull PacketContainer packetContainer);

    WrapperPlayServerUpdateTime createPlayServerUpdateTime();
    WrapperPlayServerUpdateTime createPlayServerUpdateTime(@NonNull PacketContainer packetContainer);

    WrapperPlayServerVehicleMove createPlayServerVehicleMove();
    WrapperPlayServerVehicleMove createPlayServerVehicleMove(@NonNull PacketContainer packetContainer);

    WrapperPlayServerViewCentre createPlayServerViewCentre();
    WrapperPlayServerViewCentre createPlayServerViewCentre(@NonNull PacketContainer packetContainer);

    WrapperPlayServerViewDistance createPlayServerViewDistance();
    WrapperPlayServerViewDistance createPlayServerViewDistance(@NonNull PacketContainer packetContainer);

    WrapperPlayServerWindowData createPlayServerWindowData();
    WrapperPlayServerWindowData createPlayServerWindowData(@NonNull PacketContainer packetContainer);

    WrapperPlayServerWindowItems createPlayServerWindowItems();
    WrapperPlayServerWindowItems createPlayServerWindowItems(@NonNull PacketContainer packetContainer);

    WrapperPlayServerWorldBorder createPlayServerWorldBorder();
    WrapperPlayServerWorldBorder createPlayServerWorldBorder(@NonNull PacketContainer packetContainer);

    WrapperPlayServerWorldEvent createPlayServerWorldEvent();
    WrapperPlayServerWorldEvent createPlayServerWorldEvent(@NonNull PacketContainer packetContainer);

    WrapperPlayServerWorldParticles createPlayServerWorldParticles();
    WrapperPlayServerWorldParticles createPlayServerWorldParticles(@NonNull PacketContainer packetContainer);

    WrapperStatusServerPong createStatusServerPong();
    WrapperStatusServerPong createStatusServerPong(@NonNull PacketContainer packetContainer);

    WrapperStatusServerServerInfo createStatusServerServerInfo();
    WrapperStatusServerServerInfo createStatusServerServerInfo(@NonNull PacketContainer packetContainer);


    default void sendPacket(@NonNull Player player, @NonNull MinecraftPacket packet) {
        packet.sendPacket(player);
    }

    default void broadcastPacket(@NonNull MinecraftPacket packet) {
        packet.broadcastPacket();
    }

    default MinecraftPacket createPacket(@NonNull PacketType packetType) {
        return new MinecraftPacket(packetType) {
        };
    }

    default MinecraftPacket clonePacket(@NonNull MinecraftPacket minecraftPacket) {
        return createPacket(minecraftPacket.getPacketType());
    }

}
