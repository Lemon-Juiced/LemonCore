package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.MetalBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.metal.IngotItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
import lemon_juice.lemon_core.item.custom.metal.NuggetItem;
import lemon_juice.lemon_core.register.util.BlockRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MetalResourceRegister {

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     * Assumes the item is not fireproof
     *
     * @param name The name of the metal
     * @param modID The id of the mod for integration tooltip
     */
    public void registerMetalGroup(String name, String modID){
        registerMetalGroup(name, modID, false);
    }

    /**
     * Registers the group of resources related to a metal
     * Includes: Ingot, Nugget, and Block
     *
     * @param name The name of the metal
     * @param modID The id of the mod for integration tooltip
     * @param isFireproof true if the group is fireproof, false otherwise
     */
    public void registerMetalGroup(String name, String modID, boolean isFireproof){
        ModItems.ITEMS.register(name + "_ingot", () -> new IngotItem(new Item.Properties(), modID, isFireproof));
        ModItems.ITEMS.register(name + "_nugget", () -> new NuggetItem(new Item.Properties(), modID, isFireproof));
        ModItems.ITEMS.register(name + "_dust", () -> new MetalDustItem(new Item.Properties(), modID, isFireproof));

        if(!isFireproof) ModBlocks.registerBlock(name + "_block", modID, () -> new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        else BlockRegister.registerFireproofBlock(name + "_block", modID, () -> new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }

}
