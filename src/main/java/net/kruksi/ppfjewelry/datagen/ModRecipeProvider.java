package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // LIST
        List<ItemLike> PALLADIUM_SMELTABLES = List.of(
                ModBlock.PALLADIUM_ORE.get(),
                ModItems.PALLADIUM_RAW.get()
        );

        // SHAPED
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.PPF_BLOCK.get())
                .pattern(" S ")
                .pattern(" C ")
                .pattern("   ")
                .define('S', Items.STONE)
                .define('C', Items.COAL)
                .unlockedBy("has_stone", has(Items.STONE)).save(recipeOutput);

        // SHAPELESS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 9)
                .requires(ModBlock.PALLADIUM_BLOCK)
                .unlockedBy("has_palladium_block", has(ModBlock.PALLADIUM_BLOCK)).save(recipeOutput);

        // SMELTING
        oreSmelting(recipeOutput, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.5f, 200, "palladium");

        // BLASTING
        oreBlasting(recipeOutput, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.5f, 100, "palladium");
    }
}
