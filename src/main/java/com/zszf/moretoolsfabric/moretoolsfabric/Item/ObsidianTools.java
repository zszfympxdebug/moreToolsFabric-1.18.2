package com.zszf.moretoolsfabric.moretoolsfabric.Item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianTools implements ToolMaterial {
    //暴露实例
    public static final ObsidianTools INSTANCE = new ObsidianTools();

    //耐久
    @Override
    public int getDurability() {
        return 1000;
    }

    // 挖掘速度
    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }

    // 攻击伤害
    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    // 挖掘等级
    @Override
    public int getMiningLevel() {
        return 4;
    }

    // 附魔等级
    @Override
    public int getEnchantability() {
        return 13;
    }

    // 修复物品
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }
}
