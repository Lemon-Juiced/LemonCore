package lemon_juice.lemon_core.item;

import lemon_juice.lemon_core.LemonCore;
import lemon_juice.lemon_core.item.custom.FragmentItem;
import lemon_juice.lemon_core.item.custom.NuggetItem;
import lemon_juice.lemon_core.item.custom.OreCrushingHammerItem;
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
    public static final RegistryObject<Item> AMETHYST_FRAGMENT  = ITEMS.register("amethyst_fragment", () -> new FragmentItem(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_FRAGMENT  = ITEMS.register("diamond_fragment", () -> new FragmentItem(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_FRAGMENT  = ITEMS.register("emerald_fragment", () -> new FragmentItem(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LAZULI_FRAGMENT  = ITEMS.register("lapis_lazuli_fragment", () -> new FragmentItem(new Item.Properties()));
    public static final RegistryObject<Item> NETHER_QUARTZ_FRAGMENT  = ITEMS.register("nether_quartz_fragment", () -> new FragmentItem(new Item.Properties()));

    /***** Metals ****/
    // Vanilla Additions
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new NuggetItem(new Item.Properties(), false));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget", () -> new NuggetItem(new Item.Properties(), true));

    /***** Other ******/
    public static final RegistryObject<Item> GRAIN_OF_GLOWSTONE_DUST = ITEMS.register("grain_of_glowstone_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAIN_OF_REDSTONE_DUST = ITEMS.register("grain_of_redstone_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractTinyCoalItem(new Item.Properties()));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractTinyCoalItem(new Item.Properties()));

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

        // Run resourceRegister on all Metals
        metalResourceRegister.registerMetalGroup("aluminum");
        metalResourceRegister.registerMetalGroup("cobalt");
        metalResourceRegister.registerMetalGroup("lead");
        metalResourceRegister.registerMetalGroup("manganese");
        metalResourceRegister.registerMetalGroup("necronite", true);
        metalResourceRegister.registerMetalGroup("nickel");
        metalResourceRegister.registerMetalGroup("osmium");
        metalResourceRegister.registerMetalGroup("silver");
        metalResourceRegister.registerMetalGroup("tin");
        metalResourceRegister.registerMetalGroup("uranium");
        metalResourceRegister.registerMetalGroup("zinc");
        metalResourceRegister.registerMetalGroup("brass");
        metalResourceRegister.registerMetalGroup("bronze");
        metalResourceRegister.registerMetalGroup("constantan");
        metalResourceRegister.registerMetalGroup("electrum");
        metalResourceRegister.registerMetalGroup("invar");
        metalResourceRegister.registerMetalGroup("steel");

        // Run resourceRegister on all Gems
        gemResourceRegister.registerGemGroup("apatite");
        gemResourceRegister.registerGemGroup("peridot");
        gemResourceRegister.registerGemGroup("rose_quartz");
        gemResourceRegister.registerGemGroup("ruby");
        gemResourceRegister.registerGemGroup("sapphire");
        gemResourceRegister.registerGemGroup("silicon");

        // Register Everything Not Done Through ResourceRegister
        ITEMS.register(eventBus);
    }
}
