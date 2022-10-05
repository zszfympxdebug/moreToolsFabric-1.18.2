package com.zszf.moretoolsfabric.moretoolsfabric;

import com.zszf.moretoolsfabric.moretoolsfabric.Block.RegistryBlocks;
import com.zszf.moretoolsfabric.moretoolsfabric.Item.RegistryItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class moretoolsfabric implements ModInitializer {
    // 添加物品组
    public static final ItemGroup MoreTools_Group = FabricItemGroupBuilder.create(
                    new Identifier(Utils.MOD_ID, "moretools_group"))
            .icon(() -> new ItemStack(RegistryItems.OBSIDIAN_INGOT))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_INGOT));
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_AXE));
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_HOE));
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_PICKAXE));
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_SHOVEL));
                stacks.add(new ItemStack(RegistryItems.OBSIDIAN_SWORD));
                stacks.add(new ItemStack(RegistryItems.RAW_OBSIDIAN));
                stacks.add(new ItemStack(RegistryBlocks.OBSIDIAN_ORE));
            })
            .build();
    // log4j
    public static final Logger logger = LogManager.getLogger();

    //启动生命周期
    public void onInitialize() {
        logger.info("Enable MoreToolsFabric!");
        //注册物品
        RegistryItems.RegistryItem();
        RegistryBlocks.Registry();
        logger.info("MoreToolsFabric 所有物品注册完成");
    }
}
