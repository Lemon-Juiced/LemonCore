package lemon_juice.lemon_core.register;

import lemon_juice.lemon_core.block.ModBlocks;
import lemon_juice.lemon_core.block.custom.GemBlock;
import lemon_juice.lemon_core.item.ModItems;
import lemon_juice.lemon_core.item.custom.gem.FragmentItem;
import lemon_juice.lemon_core.item.custom.gem.GemDustItem;
import lemon_juice.lemon_core.item.custom.gem.GemItem;
import lemon_juice.lemon_core.item.custom.metal.MetalDustItem;
import lemon_juice.lemon_core.item.custom.other.CoalCokeItem;
import lemon_juice.lemon_core.register.util.BlockRegister;
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
     * @param modID The id of the mod for integration tooltip
     */
    public void registerGemGroup(String name, String modID){
        registerGemGroup(name, modID, false);
    }

    /**
     * Registers the group of resources related to a gem
     * Includes: Gem, Fragment, and Block
     *
     * @param name The name of the gem
     * @param modID The id of the mod for integration tooltip
     * @param isGlowing true if the group is glowing, false otherwise
     */
    public void registerGemGroup(String name, String modID, boolean isGlowing){
        if(name.equals("coal_coke")) registerCoalCoke(name, modID);
        else {
            ModItems.ITEMS.register(name, () -> new GemItem(new Item.Properties(), modID, isGlowing));
            ModItems.ITEMS.register(name + "_fragment", () -> new FragmentItem(new Item.Properties(), modID, isGlowing));
            ModItems.ITEMS.register(name + "_dust", () -> new GemDustItem(new Item.Properties(), modID, isGlowing));

            if(!isGlowing) ModBlocks.registerBlock(name + "_block", modID, () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
            else BlockRegister.registerGlowingBlock(name + "_block", modID, () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

        }
    }

    public void registerCoalCoke(String name, String modID){
        ModItems.ITEMS.register(name, () -> new CoalCokeItem(new Item.Properties(), modID));
        BlockRegister.registerCoalCokeBlock(name + "_block", modID, () -> new GemBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    }
}
