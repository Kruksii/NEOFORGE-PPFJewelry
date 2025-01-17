package net.kruksi.ppfjewelry.datagen;

import net.kruksi.ppfjewelry.block.ModBlock;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        // DROP SELF
        dropSelf(ModBlock.RUBY_BLOCK.get());
        dropSelf(ModBlock.RUBY_STAIRS.get());
        dropSelf(ModBlock.RUBY_FENCE.get());
        dropSelf(ModBlock.RUBY_FENCE_GATE.get());
        dropSelf(ModBlock.RUBY_WALL.get());
        dropSelf(ModBlock.RUBY_BLOCK_POLISHED.get());
        dropSelf(ModBlock.RUBY_POLISHED_STAIRS.get());
        dropSelf(ModBlock.RUBY_POLISHED_FENCE.get());
        dropSelf(ModBlock.RUBY_POLISHED_FENCE_GATE.get());
        dropSelf(ModBlock.RUBY_POLISHED_WALL.get());
        dropSelf(ModBlock.PALLADIUM_BLOCK.get());
        dropSelf(ModBlock.PALLADIUM_BLOCK_POLISHED.get());
        dropSelf(ModBlock.SAPHIR_BLOCK.get());
        dropSelf(ModBlock.SAPHIR_STAIRS.get());
        dropSelf(ModBlock.SAPHIR_FENCE.get());
        dropSelf(ModBlock.SAPHIR_FENCE_GATE.get());
        dropSelf(ModBlock.SAPHIR_WALL.get());
        dropSelf(ModBlock.SAPHIR_BLOCK_POLISHED.get());
        dropSelf(ModBlock.SAPHIR_POLISHED_STAIRS.get());
        dropSelf(ModBlock.SAPHIR_POLISHED_FENCE.get());
        dropSelf(ModBlock.SAPHIR_POLISHED_FENCE_GATE.get());
        dropSelf(ModBlock.SAPHIR_POLISHED_WALL.get());
        dropSelf(ModBlock.PPF_BLOCK.get());

        // SLABS
        add(ModBlock.RUBY_SLAB.get(),
                block -> createSlabItemTable(ModBlock.RUBY_SLAB.get()));
        add(ModBlock.RUBY_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlock.RUBY_POLISHED_SLAB.get()));
        add(ModBlock.SAPHIR_SLAB.get(),
                block -> createSlabItemTable(ModBlock.SAPHIR_SLAB.get()));
        add(ModBlock.SAPHIR_POLISHED_SLAB.get(),
                block -> createSlabItemTable(ModBlock.SAPHIR_POLISHED_SLAB.get()));

        // ORE
        add(ModBlock.RUBY_ORE.get(), block ->
                createOreDrop(ModBlock.RUBY_ORE.get(), ModItems.RUBY.get()));
        add(ModBlock.PALLADIUM_ORE.get(), block ->
                createOreDrop(ModBlock.PALLADIUM_ORE.get(), ModItems.PALLADIUM_RAW.get()));
        add(ModBlock.SAPHIR_ORE.get(), block ->
                createOreDrop(ModBlock.SAPHIR_ORE.get(), ModItems.SAPHIR.get()));
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlock.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
