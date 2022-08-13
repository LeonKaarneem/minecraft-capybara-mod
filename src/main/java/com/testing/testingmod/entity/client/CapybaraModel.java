package com.testing.testingmod.entity.client;

import com.testing.testingmod.Main;
import com.testing.testingmod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CapybaraModel extends AnimatedGeoModel<CapybaraEntity> {
    @Override
    public ResourceLocation getModelResource(CapybaraEntity object) {
        return new ResourceLocation(Main.MODID, "geo/capybara.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CapybaraEntity object) {
        return new ResourceLocation(Main.MODID, "textures/entity/capybara/capybara.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CapybaraEntity animatable) {
        return new ResourceLocation(Main.MODID, "animations/capybara.animation.json");
    }
}
