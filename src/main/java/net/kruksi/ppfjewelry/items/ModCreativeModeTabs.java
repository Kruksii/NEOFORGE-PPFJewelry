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
                    .icon(() -> new ItemStack(ModBlock.RUBY_ORE.get()))
                    .title(Component.translatable("creativetab.ppfjewelry"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.JEWELFILE);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.RUBY_POLISHED);
                        output.accept(ModBlock.RUBY_ORE);
                        output.accept(ModBlock.RUBY_BLOCK);
                        output.accept(ModBlock.RUBY_BLOCK_POLISHED);
                        output.accept(ModItems.PALLADIUM_RAW);
                        output.accept(ModBlock.PALLADIUM_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}