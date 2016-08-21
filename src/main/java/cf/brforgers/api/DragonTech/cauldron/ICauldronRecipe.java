package cf.brforgers.api.DragonTech.cauldron;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;

public interface ICauldronRecipe extends IForgeRegistryEntry<ICauldronRecipe> {
    boolean isValidInput(World world, BlockPos pos, ItemStack heldItem, EnumHand hand, int essentiaLevel);

    ItemStack getOutput(World world, BlockPos pos, ItemStack heldItem, EnumHand hand, int essentiaLevel);

    int getEssentiaCost(World world, BlockPos pos, ItemStack heldItem, EnumHand hand, int essentiaLevel);

    int getItemCost(World world, BlockPos pos, ItemStack heldItem, EnumHand hand, int essentiaLevel);
}