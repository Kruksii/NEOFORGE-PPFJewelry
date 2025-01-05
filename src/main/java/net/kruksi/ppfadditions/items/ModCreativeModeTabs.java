package net.kruksi.ppfadditions.items;

import net.kruksi.ppfadditions.PPFAdditions;
import net.kruksi.ppfadditions.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PPFAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> PPF_ITEM_TAB = CREATIVE_MODE_TAB.register("ppf_item_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlock.PPF_BLOCK.get()))
                    .title(Component.translatable("creativetab.ppfadditions"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CARBON);
                        output.accept(ModItems.EMPTY_BOTTLE);
                        output.accept(ModBlock.PPF_BLOCK);
                        output.accept(ModBlock.RUBY_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
