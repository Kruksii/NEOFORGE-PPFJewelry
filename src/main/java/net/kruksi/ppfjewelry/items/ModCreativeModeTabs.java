package net.kruksi.ppfjewelry.items;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PPFJewelry.MOD_ID);

    public static final Supplier<CreativeModeTab> PPF_ITEM_TAB = CREATIVE_MODE_TAB.register("ppf_item_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY_POLISHED.get()))
                    .title(Component.translatable("creativetab.ppfjewelry"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlock.PPF_BLOCK);
                        output.accept(ModItems.JEWELFILE);
                        output.accept(ModItems.RUBY_APPLE);
                        output.accept(ModItems.PALLADIUM_APPLE);
                        output.accept(ModItems.SAPHIR_APPLE);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.RUBY_POLISHED);
                        output.accept(ModBlock.RUBY_ORE);
                        output.accept(ModBlock.RUBY_BLOCK);
                        output.accept(ModBlock.RUBY_STAIRS);
                        output.accept(ModBlock.RUBY_SLAB);
                        output.accept(ModBlock.RUBY_FENCE);
                        output.accept(ModBlock.RUBY_FENCE_GATE);
                        output.accept(ModBlock.RUBY_WALL);
                        output.accept(ModBlock.RUBY_LAMP);
                        output.accept(ModBlock.RUBY_BLOCK_POLISHED);
                        output.accept(ModItems.PALLADIUM_RAW);
                        output.accept(ModItems.PALLADIUM_INGOT);
                        output.accept(ModBlock.PALLADIUM_ORE);
                        output.accept(ModBlock.PALLADIUM_BLOCK);
                        output.accept(ModBlock.PALLADIUM_BLOCK_POLISHED);
                        output.accept(ModItems.PALLADIUM_HELMET);
                        output.accept(ModItems.PALLADIUM_CHESTPLATE);
                        output.accept(ModItems.PALLADIUM_LEGGINGS);
                        output.accept(ModItems.PALLADIUM_BOOTS);
                        output.accept(ModItems.SAPHIR);
                        output.accept(ModItems.SAPHIR_POLISHED);
                        output.accept(ModBlock.SAPHIR_ORE);
                        output.accept(ModBlock.SAPHIR_BLOCK);
                        output.accept(ModBlock.SAPHIR_STAIRS);
                        output.accept(ModBlock.SAPHIR_SLAB);
                        output.accept(ModBlock.SAPHIR_FENCE);
                        output.accept(ModBlock.SAPHIR_FENCE_GATE);
                        output.accept(ModBlock.SAPHIR_WALL);
                        output.accept(ModBlock.SAPHIR_LAMP);
                        output.accept(ModBlock.SAPHIR_BLOCK_POLISHED);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
