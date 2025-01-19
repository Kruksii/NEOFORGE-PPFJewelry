package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JEWELFILE.get())
                .pattern("  R")
                .pattern(" I ")
                .pattern("S  ")
                .define('S', Items.STICK)
                .define('I', Items.IRON_INGOT)
                .define('R', ModItems.RUBY)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUBY_APPLE.get())
                .pattern("RRR")
                .pattern("RAR")
                .pattern("RRR")
                .define('A', Items.APPLE)
                .define('R', ModItems.RUBY)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_APPLE.get())
                .pattern("PPP")
                .pattern("PAP")
                .pattern("PPP")
                .define('A', Items.APPLE)
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPHIR_APPLE.get())
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SSS")
                .define('A', Items.APPLE)
                .define('S', ModItems.SAPHIR)
                .unlockedBy("has_saphir", has(ModItems.SAPHIR)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.RUBY_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY)
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.RUBY_BLOCK_POLISHED.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY_POLISHED)
                .unlockedBy("has_ruby_polished", has(ModItems.RUBY_POLISHED)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.PALLADIUM_BLOCK.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PALLADIUM_RAW)
                .unlockedBy("has_palladium_raw", has(ModItems.PALLADIUM_RAW)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.PALLADIUM_BLOCK_POLISHED.get())
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_palladium_ingot", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_HELMET.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("   ")
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_palladium_ingot", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_CHESTPLATE.get())
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_palladium_ingot", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_LEGGINGS.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_palladium_ingot", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PALLADIUM_BOOTS.get())
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .define('P', ModItems.PALLADIUM_INGOT)
                .unlockedBy("has_palladium_ingot", has(ModItems.PALLADIUM_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.SAPHIR_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPHIR)
                .unlockedBy("has_saphir", has(ModItems.SAPHIR)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.SAPHIR_BLOCK_POLISHED.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPHIR_POLISHED)
                .unlockedBy("has_saphir_polished", has(ModItems.SAPHIR_POLISHED)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.RUBY_LAMP.get())
                .pattern(" R ")
                .pattern("RGR")
                .pattern(" R ")
                .define('G', Items.GLOWSTONE)
                .define('R', ModItems.RUBY_POLISHED)
                .unlockedBy("has_ruby_polished", has(ModItems.RUBY_POLISHED)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.SAPHIR_LAMP.get())
                .pattern(" S ")
                .pattern("SGS")
                .pattern(" S ")
                .define('G', Items.GLOWSTONE)
                .define('S', ModItems.SAPHIR_POLISHED)
                .unlockedBy("has_saphir_polished", has(ModItems.SAPHIR_POLISHED)).save(recipeOutput);

        // SHAPELESS
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_RAW.get(), 9)
                .requires(ModBlock.PALLADIUM_BLOCK)
                .unlockedBy("has_palladium_block", has(ModBlock.PALLADIUM_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 9)
                .requires(ModBlock.PALLADIUM_BLOCK_POLISHED)
                .unlockedBy("has_palladium_block_polished", has(ModBlock.PALLADIUM_BLOCK_POLISHED)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlock.RUBY_BLOCK)
                .unlockedBy("has_ruby_block", has(ModBlock.RUBY_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY_POLISHED.get(), 9)
                .requires(ModBlock.RUBY_BLOCK_POLISHED)
                .unlockedBy("has_ruby_block_polished", has(ModBlock.RUBY_BLOCK_POLISHED)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPHIR.get(), 9)
                .requires(ModBlock.SAPHIR_BLOCK)
                .unlockedBy("has_saphir_block", has(ModBlock.SAPHIR_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPHIR_POLISHED.get(), 9)
                .requires(ModBlock.SAPHIR_BLOCK_POLISHED)
                .unlockedBy("has_saphir_block_polished", has(ModBlock.SAPHIR_BLOCK_POLISHED)).save(recipeOutput);

        // SMELTING
        oreSmelting(recipeOutput, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.5f, 200, "palladium");

        // BLASTING
        oreBlasting(recipeOutput, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.5f, 100, "palladium");

        // STAIRS
        stairBuilder(ModBlock.RUBY_STAIRS.get(), Ingredient.of(ModItems.RUBY))
                .group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        stairBuilder(ModBlock.SAPHIR_STAIRS.get(), Ingredient.of(ModItems.SAPHIR))
                .group("saphir")
                .unlockedBy("has_saphir", has(ModItems.SAPHIR)).save(recipeOutput);

        // SLABS
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlock.RUBY_SLAB.get(), ModItems.RUBY);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlock.SAPHIR_SLAB.get(), ModItems.SAPHIR);

        // FENCE
        fenceBuilder(ModBlock.RUBY_FENCE.get(), Ingredient.of(ModItems.RUBY))
                .group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        fenceBuilder(ModBlock.SAPHIR_FENCE.get(), Ingredient.of(ModItems.SAPHIR))
                .group("saphir")
                .unlockedBy("has_saphir", has(ModItems.SAPHIR)).save(recipeOutput);

        // FENCE_GATE
        fenceGateBuilder(ModBlock.RUBY_FENCE_GATE.get(), Ingredient.of(ModItems.RUBY))
                .group("ruby")
                .unlockedBy("has_ruby", has(ModItems.RUBY)).save(recipeOutput);
        fenceGateBuilder(ModBlock.SAPHIR_FENCE_GATE.get(), Ingredient.of(ModItems.SAPHIR))
                .group("saphir")
                .unlockedBy("has_saphir", has(ModItems.SAPHIR)).save(recipeOutput);

        // WALL
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlock.RUBY_WALL.get(), ModItems.RUBY);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlock.SAPHIR_WALL.get(), ModItems.SAPHIR);
    }
}
