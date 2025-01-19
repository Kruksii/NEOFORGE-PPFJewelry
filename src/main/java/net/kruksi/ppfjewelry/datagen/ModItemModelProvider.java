package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PPFJewelry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // BLOCK
        basicItem(ModItems.DIAMOND_POLISHED.get());
        basicItem(ModItems.EMERALD_POLISHED.get());
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RUBY_POLISHED.get());
        basicItem(ModItems.PALLADIUM_RAW.get());
        basicItem(ModItems.PALLADIUM_INGOT.get());
        basicItem(ModItems.SAPHIR.get());
        basicItem(ModItems.SAPHIR_POLISHED.get());
        basicItem(ModItems.JEWELFILE.get());
        basicItem(ModItems.RUBY_APPLE.get());
        basicItem(ModItems.PALLADIUM_APPLE.get());
        basicItem(ModItems.SAPHIR_APPLE.get());
        basicItem(ModItems.PALLADIUM_HELMET.get());
        basicItem(ModItems.PALLADIUM_CHESTPLATE.get());
        basicItem(ModItems.PALLADIUM_LEGGINGS.get());
        basicItem(ModItems.PALLADIUM_BOOTS.get());

        // NON-BLOCK
        fenceItem(ModBlock.RUBY_FENCE, ModBlock.RUBY_BLOCK);
        wallItem(ModBlock.RUBY_WALL, ModBlock.RUBY_BLOCK);
        fenceItem(ModBlock.SAPHIR_FENCE, ModBlock.SAPHIR_BLOCK);
        wallItem(ModBlock.SAPHIR_WALL, ModBlock.SAPHIR_BLOCK);

        // HANDHELF
        handheldItem(ModItems.PALLADIUM_SWORD);
        handheldItem(ModItems.PALLADIUM_SHOVEL);
        handheldItem(ModItems.PALLADIUM_PICKAXE);
        handheldItem(ModItems.PALLADIUM_AXE);
        handheldItem(ModItems.PALLADIUM_HOE);
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(PPFJewelry.MOD_ID,"item/" + item.getId().getPath()));
    }
}
