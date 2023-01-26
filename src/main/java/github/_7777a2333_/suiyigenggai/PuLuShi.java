package github._7777a2333_.suiyigenggai;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PuLuShi implements ModInitializer {

	public static final Block PuLuShi = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
	@Override
	public void onInitialize() {
		Registry.register( Registry.BLOCK, new Identifier("suiyigenggai", "pu_lu_shi"), PuLuShi);
		Registry.register( Registry.ITEM, new Identifier("suiyigenggai", "pu_lu_shi"), new BlockItem(PuLuShi, new FabricItemSettings()));
	}
}