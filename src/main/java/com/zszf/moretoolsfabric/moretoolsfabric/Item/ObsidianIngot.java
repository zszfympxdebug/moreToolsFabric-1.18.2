package com.zszf.moretoolsfabric.moretoolsfabric.Item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ObsidianIngot extends Item {
    public ObsidianIngot(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
        entity.playSound(SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON, 1.0F, 1.0F);
        return TypedActionResult.success(entity.getStackInHand(hand));
    }
}
