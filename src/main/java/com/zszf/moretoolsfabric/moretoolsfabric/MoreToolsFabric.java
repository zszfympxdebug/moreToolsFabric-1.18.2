package com.zszf.moretoolsfabric.moretoolsfabric;

import com.zszf.moretoolsfabric.moretoolsfabric.Item.ObsidianIngot;
import com.zszf.moretoolsfabric.moretoolsfabric.Item.RegistryItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreToolsFabric implements ModInitializer {

    public static final Logger logger = LogManager.getLogger();
    public void onInitialize() {
        logger.info("Enable MoreToolsFabric!");
        RegistryItems.RegistryItem();
        logger.info("MoreToolsFabric 所有物品注册完成");
    }
}
