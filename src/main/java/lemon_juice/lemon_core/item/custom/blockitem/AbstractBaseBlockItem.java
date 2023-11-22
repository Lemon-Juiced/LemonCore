package lemon_juice.lemon_core.item.custom.blockitem;

import lemon_juice.data_type.DataTable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractBaseBlockItem extends BlockItem {
    int isBurnable;
    boolean isFireproof;
    boolean isGlowing;
    String modID;

    public AbstractBaseBlockItem(Block block, Properties properties, DataTable table) {
        super(block, properties);
        this.isBurnable = table.getIsBurnable();
        this.isFireproof = table.getIsFireproof();
        this.isGlowing = table.getIsGlowing();
        this.modID = table.getModID();
    }

    // Only effects burnable items
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return isBurnable * 9; //Multiply by 9 for blocks
    }

    // Only effects fireproof items
    @Override
    public boolean isFireResistant() {
        return isFireproof;
    }

    // Only effects glowing items
    @Override
    public boolean isFoil(ItemStack itemStack) {
        return isGlowing;
    }

    // Only effects Lemon Core items
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        String xModID = " x " + modID;
        components.add(Component.translatable("tooltip.lemon_core.integration").append(xModID));
    }

    public String getModID() {
        return modID;
    }
}
