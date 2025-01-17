package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PPFJewelry.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // BLOCK
        blockWithItem(ModBlock.RUBY_ORE);
        blockWithItem(ModBlock.RUBY_BLOCK);
        blockWithItem(ModBlock.RUBY_BLOCK_POLISHED);
        blockWithItem(ModBlock.PALLADIUM_ORE);
        blockWithItem(ModBlock.PALLADIUM_BLOCK);
        blockWithItem(ModBlock.PALLADIUM_BLOCK_POLISHED);
        blockWithItem(ModBlock.SAPHIR_ORE);
        blockWithItem(ModBlock.SAPHIR_BLOCK);
        blockWithItem(ModBlock.SAPHIR_BLOCK_POLISHED);
        blockWithItem(ModBlock.PPF_BLOCK);

        // NON-BLOCK
        stairsBlock(ModBlock.RUBY_STAIRS.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        slabBlock(ModBlock.RUBY_SLAB.get(), blockTexture(ModBlock.RUBY_BLOCK.get()), blockTexture(ModBlock.RUBY_BLOCK.get()));
        fenceBlock(ModBlock.RUBY_FENCE.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        fenceGateBlock(ModBlock.RUBY_FENCE_GATE.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        wallBlock(ModBlock.RUBY_WALL.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        stairsBlock(ModBlock.RUBY_POLISHED_STAIRS.get(), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()));
        slabBlock(ModBlock.RUBY_POLISHED_SLAB.get(), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()));
        fenceBlock(ModBlock.RUBY_POLISHED_FENCE.get(), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()));
        fenceGateBlock(ModBlock.RUBY_POLISHED_FENCE_GATE.get(), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()));
        wallBlock(ModBlock.RUBY_POLISHED_WALL.get(), blockTexture(ModBlock.RUBY_BLOCK_POLISHED.get()));
        stairsBlock(ModBlock.SAPHIR_STAIRS.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        slabBlock(ModBlock.SAPHIR_SLAB.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        fenceBlock(ModBlock.SAPHIR_FENCE.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        fenceGateBlock(ModBlock.SAPHIR_FENCE_GATE.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        wallBlock(ModBlock.SAPHIR_WALL.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        stairsBlock(ModBlock.SAPHIR_POLISHED_STAIRS.get(), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()));
        slabBlock(ModBlock.SAPHIR_POLISHED_SLAB.get(), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()));
        fenceBlock(ModBlock.SAPHIR_POLISHED_FENCE.get(), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()));
        fenceGateBlock(ModBlock.SAPHIR_POLISHED_FENCE_GATE.get(), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()));
        wallBlock(ModBlock.SAPHIR_POLISHED_WALL.get(), blockTexture(ModBlock.SAPHIR_BLOCK_POLISHED.get()));


        blockItem(ModBlock.RUBY_STAIRS);
        blockItem(ModBlock.RUBY_SLAB);
        blockItem(ModBlock.RUBY_FENCE_GATE);
        blockItem(ModBlock.RUBY_POLISHED_STAIRS);
        blockItem(ModBlock.RUBY_POLISHED_SLAB);
        blockItem(ModBlock.RUBY_POLISHED_FENCE_GATE);
        blockItem(ModBlock.SAPHIR_STAIRS);
        blockItem(ModBlock.SAPHIR_SLAB);
        blockItem(ModBlock.SAPHIR_FENCE_GATE);
        blockItem(ModBlock.SAPHIR_POLISHED_STAIRS);
        blockItem(ModBlock.SAPHIR_POLISHED_SLAB);
        blockItem(ModBlock.SAPHIR_POLISHED_FENCE_GATE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ppfjewelry:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("ppfjewelry:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
