package lemon_juice.lemon_core.item.custom.blockitem;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireproofBlockItem extends BlockItem {
    String modID;

    public FireproofBlockItem(Block block, String modID, Properties properties) {
        super(block, properties);
        this.modID = modID;
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.lemon_core.integration").append(" " + modID));
    }
}
