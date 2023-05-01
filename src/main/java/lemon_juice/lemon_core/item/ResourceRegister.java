package lemon_juice.lemon_core.item;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.custom.FragmentItem;
import lemon_juice.lemon_core.item.custom.GemItem;
import lemon_juice.lemon_core.item.custom.IngotItem;
import lemon_juice.lemon_core.item.custom.NuggetItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

/**
 * Registers a group of items for a given resource
 */
public class ResourceRegister {

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     *
     * @param name The name of the metal
     */
    public void registerMetalGroup(String name){
        ModItems.ITEMS.register(name + "_ingot", () -> new IngotItem(new Item.Properties()));
        ModItems.ITEMS.register(name + "_nugget", () -> new NuggetItem(new Item.Properties(), false));
        ModBlocks.registerBlock(name + "_block", () -> new MetalBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }

    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, and Block
     *
     * @param name The name of the gem
     */
    public void registerGemGroup(String name){
        ModItems.ITEMS.register(name, () -> new GemItem(new Item.Properties()));
        ModItems.ITEMS.register(name + "_fragment", () -> new FragmentItem(new Item.Properties()));
        ModBlocks.registerBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }
}
