package com.zszf.moretoolsfabric.moretoolsfabric.Item;

import com.zszf.moretoolsfabric.moretoolsfabric.Utils;
import com.zszf.moretoolsfabric.moretoolsfabric.moretoolsfabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryItems {
    // 黑曜石锭
    public static final Item OBSIDIAN_INGOT = new ObsidianIngot(new FabricItemSettings().group(moretoolsfabric.MoreTools_Group));
    // 黑曜石剑
    public static final ToolItem OBSIDIAN_SWORD = new SwordItem(ObsidianTools.INSTANCE, 1, -3.0F, new Item.Settings().group(moretoolsfabric.MoreTools_Group));
    // 黑曜石铲铲
    public static final ToolItem OBSIDIAN_SHOVEL = new ShovelItem(ObsidianTools.INSTANCE, 3, -2.4F, new Item.Settings().group(moretoolsfabric.MoreTools_Group));
    // 黑曜石斧头
    public static final ToolItem OBSIDIAN_AXE = new CustomAxeItem(ObsidianTools.INSTANCE, 10, 3, new Item.Settings().group(moretoolsfabric.MoreTools_Group));
    // 黑曜石锄头
    public static final ToolItem OBSIDIAN_HOE = new CustomHoeItem(ObsidianTools.INSTANCE, 1, -3.0F, new Item.Settings().group(moretoolsfabric.MoreTools_Group));
    // 黑曜石稿子
    public static final ToolItem OBSIDIAN_PICKAXE = new CustomPickaxeItem(ObsidianTools.INSTANCE, 3, 3.0F, new Item.Settings().group(moretoolsfabric.MoreTools_Group));

    public static void RegistryItem() {
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_hoe"), OBSIDIAN_HOE);
        Registry.register(Registry.ITEM, new Identifier(Utils.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
    }

}
