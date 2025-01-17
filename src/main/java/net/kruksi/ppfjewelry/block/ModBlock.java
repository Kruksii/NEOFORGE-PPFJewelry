package net.kruksi.ppfjewelry.block;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.custom.PPFBlock;
import net.kruksi.ppfjewelry.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PPFJewelry.MOD_ID);

    // BASIC
    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> RUBY_BLOCK_POLISHED = registerBlock("ruby_block_polished",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> PALLADIUM_ORE = registerBlock("palladium_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> PALLADIUM_BLOCK = registerBlock("palladium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> PALLADIUM_BLOCK_POLISHED = registerBlock("palladium_block_polished",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> SAPHIR_ORE = registerBlock("saphir_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> SAPHIR_BLOCK = registerBlock("saphir_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<Block> SAPHIR_BLOCK_POLISHED = registerBlock("saphir_block_polished",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));

    // NON-BLOCK
    public static final DeferredBlock<StairBlock> RUBY_STAIRS = registerBlock("ruby_stairs",
            () -> new StairBlock(ModBlock.RUBY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> RUBY_SLAB = registerBlock("ruby_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceBlock> RUBY_FENCE = registerBlock("ruby_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceGateBlock> RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK ,BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> RUBY_WALL = registerBlock("ruby_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> RUBY_POLISHED_STAIRS = registerBlock("ruby_polished_stairs",
            () -> new StairBlock(ModBlock.RUBY_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> RUBY_POLISHED_SLAB = registerBlock("ruby_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceBlock> RUBY_POLISHED_FENCE = registerBlock("ruby_polished_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceGateBlock> RUBY_POLISHED_FENCE_GATE = registerBlock("ruby_polished_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK ,BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> RUBY_POLISHED_WALL = registerBlock("ruby_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> SAPHIR_STAIRS = registerBlock("saphir_stairs",
            () -> new StairBlock(ModBlock.SAPHIR_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> SAPHIR_SLAB = registerBlock("saphir_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceBlock> SAPHIR_FENCE = registerBlock("saphir_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceGateBlock> SAPHIR_FENCE_GATE = registerBlock("saphir_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK ,BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> SAPHIR_WALL = registerBlock("saphir_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<StairBlock> SAPHIR_POLISHED_STAIRS = registerBlock("saphir_polished_stairs",
            () -> new StairBlock(ModBlock.SAPHIR_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .strength(4f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<SlabBlock> SAPHIR_POLISHED_SLAB = registerBlock("saphir_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceBlock> SAPHIR_POLISHED_FENCE = registerBlock("saphir_polished_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<FenceGateBlock> SAPHIR_POLISHED_FENCE_GATE = registerBlock("saphir_polished_fence_gate",
            () -> new FenceGateBlock(WoodType.OAK ,BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));
    public static final DeferredBlock<WallBlock> SAPHIR_POLISHED_WALL = registerBlock("saphir_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()
            ));

    //CUSTOM
    public static final DeferredBlock<Block> PPF_BLOCK = registerBlock("ppf_block",
            () -> new PPFBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
