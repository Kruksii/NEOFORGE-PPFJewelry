package net.kruksi.ppfjewelry.items;

import net.kruksi.ppfjewelry.util.ModTag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier PALLADIUM = new SimpleTier(
            ModTag.Blocks.INCORRECT_FOR_PALLADIUM_TOOL,
            1796,
            8.5f,
            3.5f,
            13,
            () -> Ingredient.of(ModItems.PALLADIUM_INGOT)
    );
}
