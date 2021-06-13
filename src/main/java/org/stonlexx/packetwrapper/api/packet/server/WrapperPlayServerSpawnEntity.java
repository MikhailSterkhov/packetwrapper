package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.IntEnum;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

import java.util.UUID;

public interface WrapperPlayServerSpawnEntity extends WrapperPacket {
    PacketType TYPE = PacketType.Play.Server.SPAWN_ENTITY;

    /**
     * Retrieve entity ID of the Object.
     *
     * @return The current EID
     */
    int getEntityID();

    /**
     * Set entity ID of the Object.
     *
     * @param value - new value.
     */
    void setEntityID(int value);

    /**
     * Retrieve the entity that will be spawned.
     *
     * @param world - the current world of the entity.
     * @return The spawned entity.
     */
    Entity getEntity(World world);

    /**
     * Retrieve the entity that will be spawned.
     *
     * @param event - the packet event.
     * @return The spawned entity.
     */
    Entity getEntity(PacketEvent event);

    UUID getUniqueId();

    void setUniqueId(UUID value);

    /**
     * Retrieve the x position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current X
     */
    double getX();

    /**
     * Set the x position of the object.
     *
     * @param value - new value.
     */
    void setX(double value);

    /**
     * Retrieve the y position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current y
     */
    double getY();

    /**
     * Set the y position of the object.
     *
     * @param value - new value.
     */
    void setY(double value);

    /**
     * Retrieve the z position of the object.
     * <p>
     * Note that the coordinate is rounded off to the nearest 1/32 of a meter.
     *
     * @return The current z
     */
    double getZ();

    /**
     * Set the z position of the object.
     *
     * @param value - new value.
     */
    void setZ(double value);

    /**
     * Retrieve the optional speed x.
     * <p>
     * This is ignored if {@link #getObjectData()} is zer;
     * <p>
     * /**
     * Set the optional speed x.
     *
     * @param value - new value.
     */
    void setOptionalSpeedX(double value);

    /**
     * Retrieve the optional speed y.
     * <p>
     * This is ignored if {@link #getObjectData()} is zer;
     * <p>
     * /**
     * Set the optional speed y.
     *
     * @param value - new value.
     */
    void setOptionalSpeedY(double value);

    /**
     * Retrieve the optional speed z.
     * <p>
     * This is ignored if {@link #getObjectData()} is zer;
     * <p>
     * /**
     * Set the optional speed z.
     *
     * @param value - new value.
     */
    void setOptionalSpeedZ(double value);

    /**
     * Retrieve the pitch.
     *
     * @return The current pitch.
     */
    float getPitch();

    /**
     * Set the pitch.
     *
     * @param value - new pitch.
     */
    void setPitch(float value);

    /**
     * Retrieve the yaw.
     *
     * @return The current Yaw
     */
    float getYaw();

    /**
     * Set the yaw of the object spawned.
     *
     * @param value - new yaw.
     */
    void setYaw(float value);

    /**
     * Retrieve the type of object. See {@link ObjectType;
     * <p>
     * /**
     * Set the type of object. See {@link ObjectTypes;
     * <p>
     * /**
     * Retrieve object data.
     * <p>
     * The content depends on the object type:
     * <table border="1" cellpadding="4">
     * <tr>
     * <th>Object Type:</th>
     * <th>Name:</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>ITEM_FRAME</td>
     * <td>Orientation</td>
     * <td>0-3: South, West, North, East</td>
     * </tr>
     * <tr>
     * <td>FALLING_BLOCK</td>
     * <td>Block Type</td>
     * <td>BlockID | (Metadata << 0xC)</td>
     * </tr>
     * <tr>
     * <td>Projectiles</td>
     * <td>Entity ID</td>
     * <td>The entity ID of the thrower</td>
     * </tr>
     * <tr>
     * <td>Splash Potions</td>
     * <td>Data Value</td>
     * <td>Potion data value.</td>
     * </tr>
     * </table>
     *
     * @return The current object Data
     */
    int getObjectData();

    /**
     * Set object Data.
     * <p>
     * The content depends on the object type. See {@link #getObjectData()} for
     * more information.
     *
     * @param value - new object data.
     */
    void setObjectData(int value);

    /**
     * Represents the different object types.
     *
     * @author Kristian
     */
    class ObjectTypes extends IntEnum {
        public static final int BOAT = 1;
        public static final int ITEM_STACK = 2;
        public static final int AREA_EFFECT_CLOUD = 3;
        public static final int MINECART = 10;
        public static final int ACTIVATED_TNT = 50;
        public static final int ENDER_CRYSTAL = 51;
        public static final int TIPPED_ARROW_PROJECTILE = 60;
        public static final int SNOWBALL_PROJECTILE = 61;
        public static final int EGG_PROJECTILE = 62;
        public static final int GHAST_FIREBALL = 63;
        public static final int BLAZE_FIREBALL = 64;
        public static final int THROWN_ENDERPEARL = 65;
        public static final int WITHER_SKULL_PROJECTILE = 66;
        public static final int SHULKER_BULLET = 67;
        public static final int FALLING_BLOCK = 70;
        public static final int ITEM_FRAME = 71;
        public static final int EYE_OF_ENDER = 72;
        public static final int THROWN_POTION = 73;
        public static final int THROWN_EXP_BOTTLE = 75;
        public static final int FIREWORK_ROCKET = 76;
        public static final int LEASH_KNOT = 77;
        public static final int ARMORSTAND = 78;
        public static final int FISHING_FLOAT = 90;
        public static final int SPECTRAL_ARROW = 91;
        public static final int DRAGON_FIREBALL = 93;

        /**
         * The singleton instance. Can also be retrieved from the parent class.
         */
        private static final ObjectTypes INSTANCE = new ObjectTypes();

        /**
         * Retrieve an instance of the object types enum.
         *
         * @return Object type enum.
         */
        public static ObjectTypes getInstance() {
            return INSTANCE;
        }
    }


    /**
     * Retrieve the type of object. See {@link ObjectTypes}
     *
     * @return The current Type
     */
    EntityType getType();

    /**
     * Set the type of object. See {@link ObjectTypes}.
     *
     * @param value - new value.
     */
    void setType(EntityType value);
}
