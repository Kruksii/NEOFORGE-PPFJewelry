package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.items.ModItems;
import net.kruksi.ppfjewelry.util.ModTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, PPFJewelry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // CUSTOM
        tag(ModTag.Items.PRECIOUSSTONE_ITEMS)
                .add(Items.EMERALD)
                .add(ModItems.EMERALD_POLISHED.get())
                .add(Items.DIAMOND)
                .add(ModItems.DIAMOND_POLISHED.get())
                .add(ModItems.SAPHIR.get())
                .add(ModItems.SAPHIR_POLISHED.get())
                .add(ModItems.RUBY.get())
                .add(ModItems.RUBY_POLISHED.get());

        // VANILLA
        tag(ItemTags.SWORDS)
                .add(ModItems.PALLADIUM_SWORD.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.PALLADIUM_SHOVEL.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.PALLADIUM_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.PALLADIUM_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.PALLADIUM_HOE.get());
    }
}
