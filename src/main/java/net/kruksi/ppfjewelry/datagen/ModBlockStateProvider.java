package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.block.custom.RubyLampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
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

        // CUSTOM BLOCKSTATE
        rubyLamp();

        // NON-BLOCK
        stairsBlock(ModBlock.RUBY_STAIRS.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        slabBlock(ModBlock.RUBY_SLAB.get(), blockTexture(ModBlock.RUBY_BLOCK.get()), blockTexture(ModBlock.RUBY_BLOCK.get()));
        fenceBlock(ModBlock.RUBY_FENCE.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        fenceGateBlock(ModBlock.RUBY_FENCE_GATE.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        wallBlock(ModBlock.RUBY_WALL.get(), blockTexture(ModBlock.RUBY_BLOCK.get()));
        stairsBlock(ModBlock.SAPHIR_STAIRS.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        slabBlock(ModBlock.SAPHIR_SLAB.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        fenceBlock(ModBlock.SAPHIR_FENCE.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        fenceGateBlock(ModBlock.SAPHIR_FENCE_GATE.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));
        wallBlock(ModBlock.SAPHIR_WALL.get(), blockTexture(ModBlock.SAPHIR_BLOCK.get()));


        blockItem(ModBlock.RUBY_STAIRS);
        blockItem(ModBlock.RUBY_SLAB);
        blockItem(ModBlock.RUBY_FENCE_GATE);
        blockItem(ModBlock.SAPHIR_STAIRS);
        blockItem(ModBlock.SAPHIR_SLAB);
        blockItem(ModBlock.SAPHIR_FENCE_GATE);
    }

    // CUSTOM BLOCKSTATE FUNCTION
    private void rubyLamp() {
        getVariantBuilder(ModBlock.RUBY_LAMP.get()).forAllStates(state -> {
            if(state.getValue(RubyLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("ruby_lamp_on",
                        ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID, "block/" + "ruby_lamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("ruby_lamp_off",
                        ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID, "block/" + "ruby_lamp_off")))};
            }
        });

        simpleBlockItem(ModBlock.RUBY_LAMP.get(), models().cubeAll("ruby_lamp_on",
                ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID, "block/" + "ruby_lamp_on")));
    }

    // HELPER FUNCTION
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
