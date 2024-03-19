package net.raum.firstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raum.firstmod.FirstMod;

public class ModBlocks {
    public static final Block PALM_STEM = registerBlock("palm_stem",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD)));

    public static final Block TESTBLOCK = registerBlock("testblock",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        FirstMod.LOGGER.info("registering mod blocks for "+ FirstMod.MOD_ID);
    }

}
