package lemon_juice.lemon_core.item.custom.gem;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SimpleFoiledItem;

public class GemItem extends SimpleFoiledItem {
    boolean isGlowing;

    public GemItem(Properties properties, boolean isGlowing) {
        super(properties);
        this.isGlowing = isGlowing;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }
}
