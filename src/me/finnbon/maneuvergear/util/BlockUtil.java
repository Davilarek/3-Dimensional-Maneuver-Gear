package me.finnbon.maneuvergear.util;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * A class used for generic {@link Block} methods
 */
public class BlockUtil {
	
	private static final List<Material> NON_SOLID = Arrays.asList(Material.AIR,
			Material.BROWN_MUSHROOM,
			Material.BREWING_STAND,
			Material.COCOA,
			Material.DEAD_BUSH,
			Material.DETECTOR_RAIL,
			Material.END_PORTAL,
			Material.END_ROD,
			Material.FIRE,
			Material.LAVA,
			Material.LEVER,
			Material.GRASS,
			Material.MELON_STEM,
			Material.NETHER_WART,
			Material.POWERED_RAIL,
			Material.PUMPKIN_STEM,
			Material.RAIL,
			Material.REDSTONE_TORCH,
			Material.REDSTONE_WIRE,
			Material.RED_MUSHROOM,
			Material.SNOW,
			Material.STONE_BUTTON,
			Material.TORCH,
			Material.TRIPWIRE,
			Material.TRIPWIRE_HOOK,
			Material.VINE,
			Material.WATER,
			Material.COBWEB);
	
	public static boolean isSolid(Block block) {
		return !NON_SOLID.contains(block.getType());
	}
	
}