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
    public static final DeferredItem<Item> EMERALD_POLISHED = ITEMS.register("emerald_polished",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_POLISHED = ITEMS.register("diamond_polished",
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

    // TOOL
    public static final DeferredItem<SwordItem> PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PALLADIUM, 3, -2.4F))
            )
    );
    public static final DeferredItem<PickaxeItem> PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PALLADIUM, 1, -2.8F))
            )
    );
    public static final DeferredItem<AxeItem> PALLADIUM_AXE = ITEMS.register("palladium_axe",
            () -> new AxeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PALLADIUM, 5, -3))
            )
    );
    public static final DeferredItem<ShovelItem> PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PALLADIUM, 1.5F, -3))
            )
    );
    public static final DeferredItem<HoeItem> PALLADIUM_HOE = ITEMS.register("palladium_hoe",
            () -> new HoeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PALLADIUM, -3, 0))
            )
    );

    // ARMOR
    public static final DeferredItem<ArmorItem> PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(35))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(35))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(35))
            )
    );
    public static final DeferredItem<ArmorItem> PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties()
                            .durability(ArmorItem.Type.BOOTS.getDurability(35))
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
