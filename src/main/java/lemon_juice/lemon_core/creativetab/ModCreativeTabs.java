package lemon_juice.lemon_core.creativetab;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.gem.GemDustItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
import lemon_juice.lemon_core.item.custom.other.CoalCokeItem;
import lemon_juice.lemon_core.item.custom.other.OreCrushingHammerItem;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import lemon_juice.lemon_core.item.custom.metal.IngotItem;
import lemon_juice.lemon_core.item.custom.metal.NuggetItem;
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

import static lemon_juice.lemon_core.creativetab.util.CreativeTabUtils.getFirstItem;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LemonCore.MOD_ID);

    public static String gemTabType = "gem";
    public static String metalTabType = "metal";
    public static String vanillaPlusTabType = "vanilla_plus";
    public static String otherTabType = "other";

    public static final RegistryObject<CreativeModeTab> LEMON_CORE_GEMS_TAB = CREATIVE_MODE_TABS.register("lemon_core_gemss", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_gems"))
            .icon(() -> new ItemStack(getFirstItem(gemTabType)))
            .build());

    public static final RegistryObject<CreativeModeTab> LEMON_CORE_METALS_TAB = CREATIVE_MODE_TABS.register("lemon_core_metals", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_metals"))
            .icon(() -> new ItemStack(getFirstItem(metalTabType)))
            .build());

    public static final RegistryObject<CreativeModeTab> LEMON_CORE_VANILLA_PLUS_TAB = CREATIVE_MODE_TABS.register("lemon_core_vanilla_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_vanilla_plus"))
            .icon(() -> new ItemStack(getFirstItem(vanillaPlusTabType)))
            .build());

    public static final RegistryObject<CreativeModeTab> LEMON_CORE_OTHER_TAB = CREATIVE_MODE_TABS.register("lemon_core_other", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_other"))
            .icon(() -> new ItemStack(getFirstItem(otherTabType)))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == LEMON_CORE_GEMS_TAB.get()){
            /* Items */
            // Gems
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof GemItem)
                    event.accept(item.get());
            // Fragments
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof FragmentItem fragmentItem)
                    if(!fragmentItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            // Dusts
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof GemDustItem gemDustItem)
                    if(!gemDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());

            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof CoalCokeItem)
                    event.accept(item.get());

            event.accept(new ItemStack(ModItems.GRAINS_OF_INFINITY.get()));
            event.accept(new ItemStack(ModItems.COLORLESS_XYCHRONITE_CRYSTAL.get()));

            /* Blocks */
            // Gems
            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof GemBlock)
                    event.accept(block.get());
        }

        if(event.getTab() == LEMON_CORE_METALS_TAB.get()){
            /* Items */
            // Ingots
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof IngotItem)
                    event.accept(item.get());
            // Nuggets
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof NuggetItem nuggetItem)
                    if(!nuggetItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            // Dusts
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof MetalDustItem metalDustItem)
                    if(!metalDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());

            /* Blocks */
            // Ingots
            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof MetalBlock)
                    event.accept(block.get());
        }

        if(event.getTab() == LEMON_CORE_VANILLA_PLUS_TAB.get()){
            // Other
            event.accept(new ItemStack(ModItems.COPPER_NUGGET.get()));
            event.accept(new ItemStack(ModItems.NETHERITE_NUGGET.get()));
            event.accept(new ItemStack(ModItems.IRON_DUST.get()));
            event.accept(new ItemStack(ModItems.GOLD_DUST.get()));
            event.accept(new ItemStack(ModItems.COPPER_DUST.get()));
            event.accept(new ItemStack(ModItems.NETHERITE_DUST.get()));

            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof FragmentItem fragmentItem)
                    if(fragmentItem.getModID().equals("Vanilla"))
                        event.accept(item.get());

            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries())
                if(item.get() instanceof GemDustItem gemDustItem)
                    if(gemDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());

            event.accept(new ItemStack(ModItems.GRAIN_OF_GLOWSTONE_DUST.get()));
            event.accept(new ItemStack(ModItems.GRAIN_OF_REDSTONE_DUST.get()));
            event.accept(new ItemStack(ModItems.OBSIDIAN_SHARD.get()));
            event.accept(new ItemStack(ModItems.OBSIDIAN_DUST.get()));
            event.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
            event.accept(new ItemStack(ModItems.TINY_COAL.get()));
        }

        if(event.getTab() == LEMON_CORE_OTHER_TAB.get()){
            // Ore Crushing Hammers
            for(RegistryObject<Item> item : ModItems.ITEMS.getEntries()) if(item.get() instanceof OreCrushingHammerItem) event.accept(item.get());
        }

    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}