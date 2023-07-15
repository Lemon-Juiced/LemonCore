package lemon_juice.lemon_core.item.custom.gem;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SimpleFoiledItem;

public class FragmentItem extends SimpleFoiledItem {
    boolean isGlowing;

    public FragmentItem(Properties properties, boolean isGlowing) {
        super(properties);
        this.isGlowing = isGlowing;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }
}
