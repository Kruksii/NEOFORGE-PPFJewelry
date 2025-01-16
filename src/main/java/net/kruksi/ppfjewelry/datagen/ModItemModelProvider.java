package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PPFJewelry.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RUBY_POLISHED.get());
        basicItem(ModItems.PALLADIUM_RAW.get());
        basicItem(ModItems.PALLADIUM_INGOT.get());
        basicItem(ModItems.SAPHIR.get());
        basicItem(ModItems.SAPHIR_POLISHED.get());
        basicItem(ModItems.JEWELFILE.get());
        basicItem(ModItems.RUBY_APPLE.get());
        basicItem(ModItems.SAPHIR_APPLE.get());
        basicItem(ModItems.PALLADIUM_HELMET.get());
        basicItem(ModItems.PALLADIUM_CHESTPLATE.get());
        basicItem(ModItems.PALLADIUM_LEGGINGS.get());
        basicItem(ModItems.PALLADIUM_BOOTS.get());
    }
}
