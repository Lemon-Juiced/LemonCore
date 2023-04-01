package lemon_juice.lemon_core.item;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.custom.FireproofItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LemonCore.MOD_ID);

    /***** Gems *****/
    /*** Gems ***/
    // Gems
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON  = ITEMS.register("silicon", () -> new Item(new Item.Properties()));
    // Fragments
    public static final RegistryObject<Item> PERIDOT_FRAGMENT = ITEMS.register("peridot_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_FRAGMENT = ITEMS.register("ruby_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_FRAGMENT  = ITEMS.register("sapphire_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_FRAGMENT  = ITEMS.register("silicon_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_FRAGMENT  = ITEMS.register("amethyst_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT  = ITEMS.register("diamond_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_FRAGMENT  = ITEMS.register("emerald_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT  = ITEMS.register("lapis_lazuli_fragment", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_FRAGMENT  = ITEMS.register("nether_quartz_fragment", () -> new Item(new Item.Properties()));

    /***** Metals ****/
    /*** Ingots ***/
    // Base
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    // Alloys
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONSTANTAN_INGOT = ITEMS.register("constantan_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));

    /*** Nuggets ***/
    // Base
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    // Alloys
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONSTANTAN_NUGGET = ITEMS.register("constantan_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    // Vanilla Additions
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new FireproofItem(new Item.Properties()));

    /***** Other ******/
    public static final RegistryObject<Item> GRAIN_OF_GLOWSTONE_DUST = ITEMS.register("grain_of_glowstone_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAIN_OF_REDSTONE_DUST = ITEMS.register("grain_of_redstone_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractTinyCoalItem(new Item.Properties()));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractTinyCoalItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
