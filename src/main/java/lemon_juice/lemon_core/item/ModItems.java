package lemon_juice.lemon_core.item;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.custom.other.OreCrushingHammerItem;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.metal.NuggetItem;
import lemon_juice.lemon_core.item.custom.other.AbstractTinyCoalItem;
import lemon_juice.lemon_core.item.custom.other.IntegrationTooltipItem;
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
    // Vanilla Additions
    public static final RegistryObject<Item> AMETHYST_FRAGMENT  = ITEMS.register("amethyst_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla",false));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT  = ITEMS.register("diamond_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla",false));
    public static final RegistryObject<Item> EMERALD_FRAGMENT  = ITEMS.register("emerald_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla",false));
    public static final RegistryObject<Item> ENDER_PEARL_FRAGMENT  = ITEMS.register("ender_pearl_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla",false));
    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT  = ITEMS.register("lapis_lazuli_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla",false));
    public static final RegistryObject<Item> NETHER_QUARTZ_FRAGMENT  = ITEMS.register("nether_quartz_fragment", () -> new FragmentItem(new Item.Properties(), "Vanilla", false));

    /***** Metals ****/
    // Vanilla Additions
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new NuggetItem(new Item.Properties(), "Vanilla", false));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new NuggetItem(new Item.Properties(), "Vanilla", true));

    /***** Other ******/
    // Vanilla Additions
    public static final RegistryObject<Item> GRAIN_OF_GLOWSTONE_DUST = ITEMS.register("grain_of_glowstone_dust", () -> new IntegrationTooltipItem(new Item.Properties(), "Vanilla"));
    public static final RegistryObject<Item> GRAIN_OF_REDSTONE_DUST = ITEMS.register("grain_of_redstone_dust", () -> new IntegrationTooltipItem(new Item.Properties(), "Vanilla"));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () -> new IntegrationTooltipItem(new Item.Properties(), "Vanilla"));
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractTinyCoalItem(new Item.Properties(), "Vanilla"));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractTinyCoalItem(new Item.Properties(), "Vanilla"));
    // Xychron Compat
    public static final RegistryObject<Item> COLORLESS_XYCHRONITE_CRYSTAL  = ITEMS.register("colorless_xychronite_crystal", () -> new IntegrationTooltipItem(new Item.Properties(), "Xychron"));


    /***** Ore Crushing Hammers - Added In A Later Update ******/
    public static final RegistryObject<Item> WOODEN_ORE_CRUSHING_HAMMER = ITEMS.register("wooden_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "wood"));
    public static final RegistryObject<Item> STONE_ORE_CRUSHING_HAMMER = ITEMS.register("stone_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "stone"));
    public static final RegistryObject<Item> IRON_ORE_CRUSHING_HAMMER = ITEMS.register("iron_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "iron"));
    public static final RegistryObject<Item> GOLDEN_ORE_CRUSHING_HAMMER = ITEMS.register("golden_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "gold"));
    public static final RegistryObject<Item> DIAMOND_ORE_CRUSHING_HAMMER = ITEMS.register("diamond_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "diamond"));
    public static final RegistryObject<Item> NETHERITE_ORE_CRUSHING_HAMMER = ITEMS.register("netherite_ore_crushing_hammer", () -> new OreCrushingHammerItem(new Item.Properties(), "netherite"));


    public static void register(IEventBus eventBus){
        // Create a ResourceRegisters
        GemResourceRegister gemResourceRegister = new GemResourceRegister();
        MetalResourceRegister metalResourceRegister = new MetalResourceRegister();

        // Run metalResourceRegister on all Metals
        /* Metals */
        metalResourceRegister.registerMetalGroup("aluminum", "Forge");
        metalResourceRegister.registerMetalGroup("cobalt", "Forge");
        metalResourceRegister.registerMetalGroup("lead", "Forge");
        metalResourceRegister.registerMetalGroup("manganese", "Better Steel");
        metalResourceRegister.registerMetalGroup("nickel", "Forge");
        metalResourceRegister.registerMetalGroup("osmium", "Mekanism");
        metalResourceRegister.registerMetalGroup("silver", "Forge");
        metalResourceRegister.registerMetalGroup("tin", "Forge");
        metalResourceRegister.registerMetalGroup("uranium", "Forge");
        metalResourceRegister.registerMetalGroup("zinc", "Create");
        /* Alloys */
        metalResourceRegister.registerMetalGroup("brass", "Create");
        metalResourceRegister.registerMetalGroup("bronze", "Forge");
        metalResourceRegister.registerMetalGroup("constantan", "Forge");
        metalResourceRegister.registerMetalGroup("electrum", "Forge");
        metalResourceRegister.registerMetalGroup("invar", "Forge");
        metalResourceRegister.registerMetalGroup("necronite", "Scalar Utils 5", true);
        metalResourceRegister.registerMetalGroup("refined_iron", "Refined Storage");
        metalResourceRegister.registerMetalGroup("steel", "Forge");

        // Run gemResourceRegister on all Gems
        gemResourceRegister.registerGemGroup("apatite", "Forge");
        gemResourceRegister.registerGemGroup("certus_quartz", "Applied Energistics 2");
        gemResourceRegister.registerGemGroup("charged_certus_quartz", "Applied Energistics 2");
        gemResourceRegister.registerGemGroup("dimensional_shard", "RFTools");
        gemResourceRegister.registerGemGroup("fluix_crystal", "Applied Energistics 2");
        gemResourceRegister.registerGemGroup("peridot", "Forge");
        gemResourceRegister.registerGemGroup("rose_quartz", "Create");
        gemResourceRegister.registerGemGroup("ruby", "Forge");
        gemResourceRegister.registerGemGroup("sapphire", "Forge");
        gemResourceRegister.registerGemGroup("silicon", "Forge");
        gemResourceRegister.registerGemGroup("sulfur", "Forge");

        // Register Everything Not Done Through ResourceRegister
        ITEMS.register(eventBus);
    }
}
