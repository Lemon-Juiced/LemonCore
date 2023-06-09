package lemon_juice.lemon_core.creativetab;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.f_279569_, LemonCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEMON_CORE_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core"))
            .icon(() -> new ItemStack(getFirstItem()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == LEMON_CORE_TAB.get()){
            /* Items */
            // Ingots
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                if(item.get() instanceof IngotItem) event.accept(item.get());
            }
            // Nuggets
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                if(item.get() instanceof NuggetItem) event.accept(item.get());
            }

            // Gems
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                if(item.get() instanceof GemItem) event.accept(item.get());
            }

            // Fragments
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                if(item.get() instanceof FragmentItem) event.accept(item.get());
            }

            // Other
            event.accept(new ItemStack(ModItems.GRAIN_OF_GLOWSTONE_DUST.get()));
            event.accept(new ItemStack(ModItems.GRAIN_OF_REDSTONE_DUST.get()));
            event.accept(new ItemStack(ModItems.OBSIDIAN_SHARD.get()));
            event.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
            event.accept(new ItemStack(ModItems.TINY_COAL.get()));

            // Ore Crushing Hammers
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                if(item.get() instanceof OreCrushingHammerItem) event.accept(item.get());
            }

            /* Blocks */
            // Ingots
            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                if(block.get() instanceof MetalBlock) event.accept(block.get());
            }
            // Gems
            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                if(block.get() instanceof GemBlock) event.accept(block.get());
            }
        }
    }

    /******************************** Util ********************************/
    public static Item getFirstItem(){
        Item tabItem = null;
        for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()){
            if(item.get() instanceof IngotItem) {
                tabItem = item.get();
                break;
            }
        }

        return tabItem;
    }

    /******************************** Registry ********************************/

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
