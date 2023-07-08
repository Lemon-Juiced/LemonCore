package lemon_juice.lemon_core.item.custom.blockitem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class GlowingBlockItem extends BlockItem {
    public GlowingBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
