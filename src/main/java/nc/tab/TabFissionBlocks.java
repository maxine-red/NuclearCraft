package nc.tab;

import nc.init.NCBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabFissionBlocks extends CreativeTabs {

	public TabFissionBlocks() {
		super("nuclearcraftFissionBlocks");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(NCBlocks.fission_controller_new_active);
	}
}