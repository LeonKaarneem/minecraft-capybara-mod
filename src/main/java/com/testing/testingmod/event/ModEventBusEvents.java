package com.testing.testingmod.event;

import com.testing.testingmod.Main;
import com.testing.testingmod.entity.ModEntityTypes;
import com.testing.testingmod.entity.custom.CapybaraEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.CAPYBARA.get(), CapybaraEntity.setAttributes());
    }
}
