package lemon_juice.lemon_core;

import lemon_juice.lemon_core.block.LemonCoreBlocks;
import lemon_juice.lemon_core.creativetab.LemonCoreCreativeTabs;
import lemon_juice.lemon_core.item.LemonCoreItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(LemonCore.MOD_ID)
public class LemonCore {
    public static final String MOD_ID = "lemon_core";

    public LemonCore(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        LemonCoreItems.register(modEventBus);
        LemonCoreBlocks.register(modEventBus);

        // Register Creative Tab
        LemonCoreCreativeTabs.register(modEventBus);
        modEventBus.addListener(LemonCoreCreativeTabs::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
