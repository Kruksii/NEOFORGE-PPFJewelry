package net.kruksi.ppfjewelry.items;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 5000), 1.0f)
            .build();
    public static final FoodProperties SAPHIR_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 250), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 7000), 1.0f)
            .build();
    public static final FoodProperties PALLADIUM_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 150), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 3500), 1.0f)
            .build();
}
