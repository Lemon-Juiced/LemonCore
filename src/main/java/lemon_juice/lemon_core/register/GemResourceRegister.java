package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.FragmentItem;
import lemon_juice.lemon_core.item.custom.GemItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class GemResourceRegister {
    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, and Block
     *
     * @param name The name of the gem
     */
    public void registerGemGroup(String name){
        ModItems.ITEMS.register(name, () -> new GemItem(new Item.Properties()));
        ModItems.ITEMS.register(name + "_fragment", () -> new FragmentItem(new Item.Properties()));
        ModBlocks.registerBlock(name + "_block", () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }
}
