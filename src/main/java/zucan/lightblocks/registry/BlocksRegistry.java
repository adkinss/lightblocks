package zucan.lightblocks.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import zucan.lightblocks.LightBlocks;

public class BlocksRegistry {

    public static final Block STONE_LIGHT_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15));

    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(LightBlocks.MOD_ID, "stone_light_block"), STONE_LIGHT_BLOCK);
    }
}
