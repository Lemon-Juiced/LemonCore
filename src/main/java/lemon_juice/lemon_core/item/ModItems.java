package lemon_juice.lemon_core.item;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.data_type.DataTable;
import lemon_juice.lemon_core.item.custom.AbstractBaseItem;
import lemon_juice.lemon_core.item.custom.gem.GemDustItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
import lemon_juice.lemon_core.item.custom.other.OreCrushingHammerItem;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.metal.NuggetItem;
import lemon_juice.lemon_core.register.GemResourceRegister;
import lemon_juice.lemon_core.register.MetalResourceRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LemonCore.MOD_ID);

    /***** Gems *****/
    /*** Gems ***/
    // Vanilla Compat (Fragments)
    public static final RegistryObject<Item> AMETHYST_FRAGMENT = ITEMS.register("amethyst_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT = ITEMS.register("diamond_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> EMERALD_FRAGMENT = ITEMS.register("emerald_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> ENDER_PEARL_FRAGMENT = ITEMS.register("ender_pearl_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT = ITEMS.register("lapis_lazuli_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> NETHER_QUARTZ_FRAGMENT = ITEMS.register("nether_quartz_fragment", () -> new FragmentItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    // Vanilla Compat (Dusts)
    public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> ENDER_PEARL_DUST = ITEMS.register("ender_pearl_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> LAPIS_LAZULI_DUST = ITEMS.register("lapis_lazuli_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> NETHER_QUARTZ_DUST = ITEMS.register("nether_quartz_dust", () -> new GemDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));

    /***** Metals ****/
    // Vanilla Compat (Nuggets)
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new NuggetItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new NuggetItem(new Item.Properties(), new DataTable(false, 0, true, false, "Vanilla")));
    // Vanilla Compat (Dusts)
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new MetalDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new MetalDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new MetalDustItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust", () -> new MetalDustItem(new Item.Properties(), new DataTable(false, 0, true, false, "Vanilla")));

    /***** Other ******/
    // Vanilla Compat
    public static final RegistryObject<Item> GRAIN_OF_GLOWSTONE_DUST = ITEMS.register("grain_of_glowstone_dust", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> GRAIN_OF_REDSTONE_DUST = ITEMS.register("grain_of_redstone_dust", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> OBSIDIAN_DUST = ITEMS.register("obsidian_dust", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Vanilla")));
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 200, false, false, "Vanilla")));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 200, false, false, "Vanilla")));
    // Ender IO Compat
    public static final RegistryObject<Item> GRAINS_OF_INFINITY  = ITEMS.register("grains_of_infinity", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Ender IO")));
    // Xychron Compat
    public static final RegistryObject<Item> COLORLESS_XYCHRONITE_CRYSTAL  = ITEMS.register("colorless_xychronite_crystal", () -> new AbstractBaseItem(new Item.Properties(), new DataTable(false, 0, false, false, "Xychron")));

    /***** Ore Crushing Hammers ******/
    public static final RegistryObject<Item> WOODEN_ORE_CRUSHING_HAMMER = ITEMS.register("wooden_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));
    public static final RegistryObject<Item> STONE_ORE_CRUSHING_HAMMER = ITEMS.register("stone_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_CRUSHING_HAMMER = ITEMS.register("iron_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_ORE_CRUSHING_HAMMER = ITEMS.register("golden_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_CRUSHING_HAMMER = ITEMS.register("diamond_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ORE_CRUSHING_HAMMER = ITEMS.register("netherite_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        // Create a ResourceRegisters
        GemResourceRegister gemResourceRegister = new GemResourceRegister();
        MetalResourceRegister metalResourceRegister = new MetalResourceRegister();

        // Run metalResourceRegister on all Metals
        /* Metals */
        metalResourceRegister.registerMetalGroup("aluminum", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("blutonium", new DataTable(false, 0, false, false, "Bigger Reactors/Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("calorite", new DataTable(false, 0, false, false, "Ad Astra"));
        metalResourceRegister.registerMetalGroup("cobalt", new DataTable(false, 0, false, false, "Tinkers Construct"));
        metalResourceRegister.registerMetalGroup("cyanite", new DataTable(false, 0, false, false, "Bigger Reactors / Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("desh", new DataTable(false, 0, false, false, "Ad Astra"));
        metalResourceRegister.registerMetalGroup("graphite", new DataTable(false, 0, false, false, "Bigger Reactors / Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("insanite", new DataTable(false, 0, false, false, "Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("lead", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("ludicrite", new DataTable(false, 0, false, false,  "Bigger Reactors / Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("magnetite", new DataTable(false, 0, false, false, "Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("manganese", new DataTable(false, 0, false, false, "Better Steel"));
        metalResourceRegister.registerMetalGroup("nickel", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("osmium", new DataTable(false, 0, false, false, "Mekanism"));
        metalResourceRegister.registerMetalGroup("ostrum", new DataTable(false, 0, false, false, "Ad Astra"));
        metalResourceRegister.registerMetalGroup("platinum", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("ridiculite", new DataTable(false, 0, false, false, "Extreme Reactors"));
        metalResourceRegister.registerMetalGroup("silver", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("tin", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("tungsten", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("uranium", new DataTable(false, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("zinc", new DataTable(false, 0, false, false, "Create"));
        /* Alloys */
        metalResourceRegister.registerMetalGroup("brass", new DataTable(true, 0, false, false, "Create"));
        metalResourceRegister.registerMetalGroup("bronze", new DataTable(true, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("conductive_alloy", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("constantan", new DataTable(true, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("copper_alloy", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("dark_steel", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("electrum", new DataTable(true, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("end_steel", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("enderium", new DataTable(true, 0, false, false, "Thermal Series"));
        metalResourceRegister.registerMetalGroup("energetic_alloy", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("invar", new DataTable(true, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("lumium", new DataTable(true, 0, false, false, "Thermal Series"));
        metalResourceRegister.registerMetalGroup("manyullyn", new DataTable(true, 0, false, false, "Tinkers Construct"));
        metalResourceRegister.registerMetalGroup("necronite", new DataTable(true, 0, true, false, "Scalar Utils 5"));
        metalResourceRegister.registerMetalGroup("pulsating_alloy", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("redstone_alloy", new DataTable(true, 0, false, false, "Ender IO"));
        metalResourceRegister.registerMetalGroup("refined_iron", new DataTable(true, 0, false, false, "Refined Storage"));
        metalResourceRegister.registerMetalGroup("rose_gold", new DataTable(true, 0, false, false, "Thermal Series"));
        metalResourceRegister.registerMetalGroup("signalum", new DataTable(true, 0, false, false, "Thermal Series"));
        metalResourceRegister.registerMetalGroup("soularium",new DataTable(true, 0, false, false,  "Ender IO"));
        metalResourceRegister.registerMetalGroup("steel", new DataTable(true, 0, false, false, "Forge"));
        metalResourceRegister.registerMetalGroup("vibrant_alloy", new DataTable(true, 0, false, false, "Ender IO"));

        // Run gemResourceRegister on all Gems
        gemResourceRegister.registerGemGroup("anglesite", new DataTable(false, 0, false, false, "Extreme Reactors"));
        gemResourceRegister.registerGemGroup("apatite", new DataTable(false, 0, false, false, "Forge"));
        gemResourceRegister.registerGemGroup("benitoite", new DataTable(false, 0, false, false,"Extreme Reactors"));
        gemResourceRegister.registerGemGroup("certus_quartz", new DataTable(false, 0, false, false,"Applied Energistics 2"));
        gemResourceRegister.registerGemGroup("charged_certus_quartz", new DataTable(false, 0, false, true,"Applied Energistics 2"));
        gemResourceRegister.registerGemGroup("cinnabar", new DataTable(false, 0, false, false,"Thermal Series"));
        gemResourceRegister.registerGemGroup("coal_coke", new DataTable(false, 3200, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("dimensional_shard", new DataTable(false, 0, false, false,"RFTools"));
        gemResourceRegister.registerGemGroup("ender_crystal", new DataTable(false, 0, false, false,"Ender IO"));
        gemResourceRegister.registerGemGroup("fluix_crystal", new DataTable(false, 0, false, false,"Applied Energistics 2"));
        gemResourceRegister.registerGemGroup("niter", new DataTable(false, 0, false, false,"Thermal Series"));
        gemResourceRegister.registerGemGroup("peridot", new DataTable(false, 0, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("prescient_crystal", new DataTable(false, 0, false, false,"Ender IO"));
        gemResourceRegister.registerGemGroup("pulsating_crystal", new DataTable(false, 0, false, false,"Ender IO"));
        gemResourceRegister.registerGemGroup("rose_quartz", new DataTable(false, 0, false, false,"Create"));
        gemResourceRegister.registerGemGroup("ruby", new DataTable(false, 0, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("sapphire", new DataTable(false, 0, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("silicon", new DataTable(false, 0, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("sulfur", new DataTable(false, 0, false, false,"Forge"));
        gemResourceRegister.registerGemGroup("umbralite", new DataTable(false, 0, true, false,"Scalar Utils 5: Arsenal Addon"));
        gemResourceRegister.registerGemGroup("vibrant_crystal", new DataTable(false, 0, false, false,"Ender IO"));

        // Register Everything Not Done Through ResourceRegister
        ITEMS.register(eventBus);
    }
}
