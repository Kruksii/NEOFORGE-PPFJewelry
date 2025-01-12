package net.kruksi.ppfjewelry.items;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.3f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 110), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2500), 1.0f)
            .build();
    public static final FoodProperties SAPHIR_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.3f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 110), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2500), 1.0f)
            .build();
}
