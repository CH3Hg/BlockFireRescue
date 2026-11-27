package com.blockfirerescue.registry;

import com.blockfirerescue.BlockFireRescue;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public class ModMaterial {
    public static final TagKey<Block> NEEDS_FIRE_AXE = TagKey.create(BuiltInRegistries.BLOCK.key(),Identifier.fromNamespaceAndPath(BlockFireRescue.MODID,"needs_fire_axe"));
    public static final TagKey<Block> INCORRECT_FOR_FIRE_AXE = TagKey.create(BuiltInRegistries.BLOCK.key(),Identifier.fromNamespaceAndPath(BlockFireRescue.MODID,"incorrect_for_fire_axe"));
    public static final ToolMaterial FIRE_AXE_MATERIAL = new ToolMaterial(
        INCORRECT_FOR_FIRE_AXE,500,8f,1f,20,Tags.Items.INGOTS_IRON
    );
}
