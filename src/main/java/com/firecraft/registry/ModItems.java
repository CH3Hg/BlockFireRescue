package com.firecraft.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.firecraft.FireCraft.MODID;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static void init(){}
    public static final DeferredItem<Item> FIRE_AXE = ITEMS.registerItem(
            "fire_axe",
            props -> new Item(
                    props.axe(
                            ModMaterial.FIRE_AXE_MATERIAL,1,-3f
                    )
            )
    );
    public static final DeferredItem<Item> FIRE_SHOVEL = ITEMS.registerItem(
            "fire_shovel",
            props -> new Item(
                    props.shovel(
                            ToolMaterial.DIAMOND,1,-1f
                    )
            )
    );
}
