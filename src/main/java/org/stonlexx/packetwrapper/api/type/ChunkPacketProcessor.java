package org.stonlexx.packetwrapper.api.type;

import org.bukkit.Location;
import org.bukkit.World;

public interface ChunkPacketProcessor {

    int BYTES_PER_NIBBLE_PART = 2048;
    int CHUNK_SEGMENTS = 16;
    int NIBBLES_REQUIRED = 4;

    int BLOCK_ID_LENGTH = 4096;
    int DATA_LENGTH = 2048;
    int BIOME_ARRAY_LENGTH = 256;


    void process(ChunkletProcessor processor);

    int getSkylightCount();

    int getOffset(int nibbles);

    void translate(ChunkletProcessor processor);

    boolean isChunkLoaded(World world, int x, int z);


    interface ChunkletProcessor {
        /**
         * Process a given chunklet (16x16x16).
         *
         * @param origin  - the block with the lowest x, y and z coordinate in
         *                the chunklet.
         * @param data    - the data array.
         * @param offsets - the offsets with the data for the given chunklet.
         */
        void processChunklet(Location origin, byte[] data,
                             ChunkOffsets offsets);

        /**
         * Process the biome array for a chunk (16x256x16).
         * <p>
         * This method will not be called if the chunk is missing biome
         * information.
         *
         * @param origin     - the block with the lowest x, y and z coordinate in
         *                   the chunk.
         * @param data       - the data array.
         * @param biomeIndex - the starting index of the biome data (256 bytes
         *                   in lenght).
         */
        void processBiomeArray(Location origin, byte[] data,
                               int biomeIndex);
    }

    class ChunkOffsets {
        private final int lightOffset;
        private int blockIdOffset;
        private int dataOffset;
        private int skylightOffset;
        private int extraOffset;

        public ChunkOffsets(int blockIdOffset, int dataOffset,
                            int lightOffset, int skylightOffset, int extraOffset) {
            this.blockIdOffset = blockIdOffset;
            this.dataOffset = dataOffset;
            this.lightOffset = lightOffset;
            this.skylightOffset = skylightOffset;
            this.extraOffset = extraOffset;
        }

        public void incrementIdIndex() {
            blockIdOffset += ChunkPacketProcessor.BLOCK_ID_LENGTH;
            dataOffset += ChunkPacketProcessor.BYTES_PER_NIBBLE_PART;
            dataOffset += ChunkPacketProcessor.BYTES_PER_NIBBLE_PART;

            if (skylightOffset >= 0) {
                skylightOffset += ChunkPacketProcessor.BYTES_PER_NIBBLE_PART;
            }
        }

        public void incrementExtraIndex() {
            if (extraOffset >= 0) {
                extraOffset += ChunkPacketProcessor.BYTES_PER_NIBBLE_PART;
            }
        }

        /**
         * Retrieve the starting index of the block ID data.
         * <p>
         * This will be 4096 bytes in length, one byte for each block in the
         * 16x16x16 chunklet.
         *
         * @return The starting location of the block ID data.
         */
        public int getBlockIdOffset() {
            return blockIdOffset;
        }

        /**
         * Retrieve the starting index of the meta data (4 bit per block).
         * <p>
         * This will be 2048 bytes in length, one nibblet for each block in the
         * 16x16x16 chunklet.
         *
         * @return The starting location of the block meta data.
         */
        public int getDataOffset() {
            return dataOffset;
        }

        /**
         * Retrieve the starting index of the torch light data (4 bit per
         * block).
         * <p>
         * This will be 2048 bytes in length, one nibblet for each block in the
         * 16x16x16 chunklet.
         *
         * @return The starting location of the torch light data.
         */
        public int getLightOffset() {
            return lightOffset;
        }

        /**
         * Retrieve the starting index of the skylight data (4 bit per block).
         * <p>
         * This will be 2048 bytes in length if the skylight data exists (see
         * {@link #hasSkylightOffset()}), no bytes if not.
         *
         * @return The starting location of the skylight data.
         */
        public int getSkylightOffset() {
            return skylightOffset;
        }

        /**
         * Determine if the current chunklet contains skylight data.
         *
         * @return TRUE if it does, FALSE otherwise.
         */
        public boolean hasSkylightOffset() {
            return skylightOffset >= 0;
        }

        /**
         * Retrieve the extra 4 bits in each block ID, if necessary.
         * <p>
         * This will be 2048 bytes in length if the extra data exists, no bytes
         * if not.
         *
         * @return The starting location of the extra data.
         */
        public int getExtraOffset() {
            return extraOffset;
        }

        /**
         * Determine if the current chunklet contains any extra block ID data.
         *
         * @return TRUE if it does, FALSE otherwise.
         */
        public boolean hasExtraOffset() {
            return extraOffset > 0;
        }
    }

}
