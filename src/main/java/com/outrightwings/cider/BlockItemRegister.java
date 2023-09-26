package com.outrightwings.cider;

import com.outrightwings.cider.blocks.Mug;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockItemRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CiderMain.MODID);
    public static final RegistryObject<Block> EMPTY_MUG = BLOCKS.register("empty_mug", () -> new Mug(BlockBehaviour.Properties.of()));
    public static final RegistryObject<Block> CIDER_MUG = BLOCKS.register("cider_mug", () -> new Mug(BlockBehaviour.Properties.of()));

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CiderMain.MODID);
    public static final RegistryObject<Item> EMPTY_MUG_ITEM = ITEMS.register("empty_mug", () -> new BlockItem(EMPTY_MUG.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIDER_MUG_ITEM = ITEMS.register("cider_mug", () -> new BlockItem(CIDER_MUG.get(), new Item.Properties()));

}
