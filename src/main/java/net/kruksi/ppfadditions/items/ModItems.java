package net.kruksi.ppfadditions.items;

import net.kruksi.ppfadditions.PPFAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PPFAdditions.MOD_ID);

    /*public static final DeferredItem<Item> CARBON = ITEMS.register("carbon",
            () -> new Item(new Item.Properties()));*/

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
