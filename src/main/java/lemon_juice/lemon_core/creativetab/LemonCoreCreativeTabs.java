package lemon_juice.lemon_core.creativetab;

import lemon_juice.item.custom.OreCrushingHammerItem;
import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.block.LemonCoreBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.LemonCoreItems;
import lemon_juice.lemon_core.item.custom.gem.GemDustItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static lemon_juice.lemon_core.creativetab.util.CreativeTabUtils.getFirstItem;

public class LemonCoreCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LemonCore.MOD_ID);

    public static String gemTabType = "gem";
    public static String metalTabType = "metal";
    public static String vanillaPlusTabType = "vanilla_plus";
    public static String otherTabType = "other";

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_CORE_GEMS_TAB = CREATIVE_MODE_TABS.register("lemon_core_gems", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_gems"))
            .icon(() -> new ItemStack(getFirstItem(gemTabType)))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_CORE_METALS_TAB = CREATIVE_MODE_TABS.register("lemon_core_metals", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_metals"))
            .icon(() -> new ItemStack(getFirstItem(metalTabType)))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_CORE_VANILLA_PLUS_TAB = CREATIVE_MODE_TABS.register("lemon_core_vanilla_plus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_vanilla_plus"))
            .icon(() -> new ItemStack(getFirstItem(vanillaPlusTabType)))
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_CORE_OTHER_TAB = CREATIVE_MODE_TABS.register("lemon_core_other", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_core_other"))
            .icon(() -> new ItemStack(getFirstItem(otherTabType)))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == LEMON_CORE_GEMS_TAB.get()){
            /* Items */
            // Gems
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if(item.get() instanceof GemItem)
                    event.accept(item.get());
            }
            // Fragments
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof FragmentItem fragmentItem)
                    if (!fragmentItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }
            // Dusts
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof GemDustItem gemDustItem)
                    if (!gemDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }

            event.accept(new ItemStack(LemonCoreItems.GRAINS_OF_INFINITY.get()));
            event.accept(new ItemStack(LemonCoreItems.COLORLESS_XYCHRONITE_CRYSTAL.get()));

            /* Blocks */
            // Gems
            for (DeferredHolder<Block, ? extends Block> block : LemonCoreBlocks.BLOCKS.getEntries()) {
                if (block.get() instanceof GemBlock)
                    event.accept(block.get());
            }
        }

        if(event.getTab() == LEMON_CORE_METALS_TAB.get()){
            /* Items */
            // Ingots
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof IngotItem)
                    event.accept(item.get());
            }
            // Nuggets
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof NuggetItem nuggetItem)
                    if (!nuggetItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }
            // Dusts
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof MetalDustItem metalDustItem)
                    if (!metalDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }

            /* Blocks */
            // Ingots
            for (DeferredHolder<Block, ? extends Block> block : LemonCoreBlocks.BLOCKS.getEntries()) {
                if (block.get() instanceof MetalBlock)
                    event.accept(block.get());
            }
        }

        if(event.getTab() == LEMON_CORE_VANILLA_PLUS_TAB.get()){
            // Other
            event.accept(new ItemStack(LemonCoreItems.COPPER_NUGGET.get()));
            event.accept(new ItemStack(LemonCoreItems.NETHERITE_NUGGET.get()));
            event.accept(new ItemStack(LemonCoreItems.IRON_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.GOLD_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.COPPER_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.NETHERITE_DUST.get()));

            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof FragmentItem fragmentItem)
                    if (fragmentItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }

            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) {
                if (item.get() instanceof GemDustItem gemDustItem)
                    if (gemDustItem.getModID().equals("Vanilla"))
                        event.accept(item.get());
            }

            event.accept(new ItemStack(LemonCoreItems.GRAIN_OF_GLOWSTONE_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.GRAIN_OF_REDSTONE_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.OBSIDIAN_SHARD.get()));
            event.accept(new ItemStack(LemonCoreItems.OBSIDIAN_DUST.get()));
            event.accept(new ItemStack(LemonCoreItems.TINY_CHARCOAL.get()));
            event.accept(new ItemStack(LemonCoreItems.TINY_COAL.get()));
        }

        if(event.getTab() == LEMON_CORE_OTHER_TAB.get()){
            // Ore Crushing Hammers
            for (DeferredHolder<Item, ? extends Item> item: LemonCoreItems.ITEMS.getEntries()) if(item.get() instanceof OreCrushingHammerItem) event.accept(item.get());
        }

    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
