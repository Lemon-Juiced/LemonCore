package lemon_juice.lemon_core.item.custom.other;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class OreCrushingHammerItem extends Item {
    private final String tier;

    public OreCrushingHammerItem(Properties properties, String tier) {
        super(properties);
        this.tier = tier;
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
        return itemStack;
    }
}
