package lemon_juice.lemon_core.item.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class FireproofBlockItem extends BlockItem {
    public FireproofBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
