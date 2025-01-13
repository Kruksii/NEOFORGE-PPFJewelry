package net.kruksi.ppfjewelry.util;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTag {
    public static class Blocks {
        public static final TagKey<Block> ORE_BLOCKS = createTag("ore_blocks");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> PRECIOUSSTONE_ITEMS = createTag("preciousstone_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID, name));
        }
    }
}
