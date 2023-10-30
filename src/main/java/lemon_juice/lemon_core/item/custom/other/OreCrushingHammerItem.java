package lemon_juice.lemon_core.item.custom.other;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreCrushingHammerItem extends Item {

    public OreCrushingHammerItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(itemStack.getItem());
    }
}
