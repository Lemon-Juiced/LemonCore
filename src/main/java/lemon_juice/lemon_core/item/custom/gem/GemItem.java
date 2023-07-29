package lemon_juice.lemon_core.item.custom.gem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SimpleFoiledItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemItem extends SimpleFoiledItem {
    boolean isGlowing;
    String modID;

    public GemItem(Properties properties, String modID, boolean isGlowing) {
        super(properties);
        this.isGlowing = isGlowing;
        this.modID = modID;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }

    public String getModID() {
        return modID;
    }
}
