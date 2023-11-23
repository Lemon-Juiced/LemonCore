package lemon_juice.lemon_core;

import lemon_juice.lemon_core.block.LemonCoreBlocks;
import lemon_juice.lemon_core.creativetab.LemonCoreCreativeTabs;
import lemon_juice.lemon_core.item.LemonCoreItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LemonCore.MOD_ID)
public class LemonCore {
    public static final String MOD_ID = "lemon_core";

    public LemonCore() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items
        LemonCoreItems.register(modEventBus);
        LemonCoreBlocks.register(modEventBus);

        // Register Creative Tab
        LemonCoreCreativeTabs.register(modEventBus);
        modEventBus.addListener(LemonCoreCreativeTabs::registerTabs);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
