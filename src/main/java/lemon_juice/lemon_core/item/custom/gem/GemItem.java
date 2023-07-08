package lemon_juice.lemon_core.item.custom.gem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GemItem extends Item {
    boolean isGlowing = false;

    public GemItem(Properties properties, boolean isGlowing) {
        super(properties);
        this.isGlowing = isGlowing;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }
}
