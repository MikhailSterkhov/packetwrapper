package org.stonlexx.packetwrapper.api.packet.server;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.wrappers.nbt.NbtBase;
import org.stonlexx.packetwrapper.api.packet.WrapperPacket;

public interface WrapperPlayServerNbtQuery extends WrapperPacket {

    PacketType TYPE = PacketType.Play.Server.NBT_QUERY;


    /**
     * Retrieve Transaction ID.
     * <p>
     * Notes: can be compared to the one sent in the original query packet.
     *
     * @return The current Transaction ID
     */
    int getTransactionId();

    /**
     * Set Transaction ID.
     *
     * @param value - new value.
     */
    void setTransactionId(int value);

    /**
     * Retrieve NBT.
     * <p>
     * Notes: the NBT of the block or entity. May be a TAG_END (0) in which case no NBT is present.
     *
     * @return The current NBT
     */
    NbtBase<?> getNbt();

    /**
     * Set NBT.
     *
     * @param value - new value.
     */
    void setNbt(NbtBase<?> value);

}
