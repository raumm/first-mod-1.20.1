package net.raum.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raum.firstmod.FirstMod;
import net.raum.firstmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RAUMSGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstMod.MOD_ID, "moddedgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.moddedgroup"))
                    .icon(() -> new ItemStack(ModItems.DATE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TESTITEM);
                        entries.add(ModItems.DATE);

                        entries.add(ModBlocks.PALM_STEM);
                        entries.add(ModBlocks.TESTBLOCK);

                    }).build());

    public static void registerItemGroups() {
        FirstMod.LOGGER.info("Registering Item Groups for " +FirstMod.MOD_ID);
    }
}
