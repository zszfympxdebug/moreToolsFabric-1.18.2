package com.zszf.moretoolsfabric.moretoolsfabric.Item;

import com.zszf.moretoolsfabric.moretoolsfabric.Utils;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryItems {
    public static final Item OBSIDIAN_INGOT = new ObsidianIngot(new FabricItemSettings().group(ItemGroup.MISC));
    public static void RegistryItem(){
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_ingot"), OBSIDIAN_INGOT);
    }

}
