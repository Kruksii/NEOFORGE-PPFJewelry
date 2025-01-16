package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PPFJewelry.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
