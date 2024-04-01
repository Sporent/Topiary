package net.sporent.topiary.item;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class TopiaryFoodComponents {
    public static final FoodComponent BEANS = new FoodComponent.Builder()
            .snack()
            .hunger(1000)
            .saturationModifier(10.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10000, 255), 1f)
            .build();
}
