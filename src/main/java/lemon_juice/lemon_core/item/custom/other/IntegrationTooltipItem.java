package lemon_juice.lemon_core.item.custom.other;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class IntegrationTooltipItem extends Item {
    String modID;

    public IntegrationTooltipItem(Properties properties, String modID) {
        super(properties);
        this.modID = modID;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.lemon_core.integration").append(" x " + modID));
    }
}
