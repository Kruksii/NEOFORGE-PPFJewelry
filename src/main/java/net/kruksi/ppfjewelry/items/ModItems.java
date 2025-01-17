package net.kruksi.ppfjewelry.items;

import net.kruksi.ppfjewelry.PPFJewelry;
import net.kruksi.ppfjewelry.items.custom.JewelfileItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PPFJewelry.MOD_ID);

    // BASIC
    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY_POLISHED = ITEMS.register("ruby_polished",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_RAW = ITEMS.register("palladium_raw",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPHIR = ITEMS.register("saphir",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPHIR_POLISHED = ITEMS.register("saphir_polished",
            () -> new Item(new Item.Properties()));

    // CUSTOM
    public static final DeferredItem<Item> JEWELFILE = ITEMS.register("jewelfile",
            () -> new JewelfileItem(new Item.Properties()
                    .durability(250)));

    // FOOD
    public static final DeferredItem<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.RUBY_APPLE)
                    .rarity(Rarity.RARE))
    );
    public static final DeferredItem<Item> SAPHIR_APPLE = ITEMS.register("saphir_apple",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.SAPHIR_APPLE)
                    .rarity(Rarity.RARE))
    );
    public static final DeferredItem<Item> PALLADIUM_APPLE = ITEMS.register("palladium_apple",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.PALLADIUM_APPLE)
                    .rarity(Rarity.RARE))
    );

    // ARMOR
    public static final DeferredItem<ArmorItem> PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(40))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(40))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(40))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.BOOTS.getDurability(40))
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
