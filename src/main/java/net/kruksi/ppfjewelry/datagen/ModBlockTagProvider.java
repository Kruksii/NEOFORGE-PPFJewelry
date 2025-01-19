package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.util.ModTag;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PPFJewelry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // CUSTOM
        tag(ModTag.Blocks.ORE_BLOCKS)
                .add(ModBlock.RUBY_ORE.get())
                .add(ModBlock.PALLADIUM_ORE.get())
                .add(ModBlock.SAPHIR_ORE.get());
        tag(ModTag.Blocks.NEEDS_PALLADIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTag.Blocks.INCORRECT_FOR_PALLADIUM_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTag.Blocks.NEEDS_PALLADIUM_TOOL);

        // VANILLA
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlock.RUBY_ORE.get())
                .add(ModBlock.RUBY_BLOCK.get())
                .add(ModBlock.RUBY_BLOCK_POLISHED.get())
                .add(ModBlock.PALLADIUM_ORE.get())
                .add(ModBlock.PALLADIUM_BLOCK.get())
                .add(ModBlock.PALLADIUM_BLOCK_POLISHED.get())
                .add(ModBlock.SAPHIR_BLOCK.get())
                .add(ModBlock.SAPHIR_BLOCK_POLISHED.get())
                .add(ModBlock.PPF_BLOCK.get())
                .add(ModBlock.SAPHIR_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlock.RUBY_ORE.get())
                .add(ModBlock.PALLADIUM_ORE.get())
                .add(ModBlock.SAPHIR_ORE.get());
        tag(BlockTags.FENCES)
                .add(ModBlock.RUBY_FENCE.get())
                .add(ModBlock.SAPHIR_FENCE.get());
        tag(BlockTags.FENCE_GATES)
                .add(ModBlock.RUBY_FENCE_GATE.get())
                .add(ModBlock.SAPHIR_FENCE_GATE.get());
        tag(BlockTags.WALLS)
                .add(ModBlock.RUBY_WALL.get())
                .add(ModBlock.SAPHIR_WALL.get());
    }
}
