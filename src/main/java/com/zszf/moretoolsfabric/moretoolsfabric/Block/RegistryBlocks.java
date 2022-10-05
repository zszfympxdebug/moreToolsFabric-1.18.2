package com.zszf.moretoolsfabric.moretoolsfabric.Block;

import com.zszf.moretoolsfabric.moretoolsfabric.Utils;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryBlocks {
    public static final ObsidianOre OBSIDIAN_ORE = new ObsidianOre(FabricBlockSettings.of(Material.METAL).hardness(50.0f).resistance(1200.0f));

    public static void Registry() {
        Registry.register(Registry.BLOCK, new Identifier(Utils.MOD_ID, "obsidian_ore"), OBSIDIAN_ORE);
    }
}