package lemon_juice.lemon_core.item.custom.blockitem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GlowingBlockItem extends BlockItem {
    String modID;

    public GlowingBlockItem(Block block, String modID, Properties properties) {
        super(block, properties);
        this.modID = modID;
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }
}
