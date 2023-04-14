package org.pedro.cubebox;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlaceListener implements Listener {

    private final Material[] BLOCK_TYPES_TO_CANCEL = {
            Material.CANDLE,
            Material.WHITE_CANDLE,
            Material.ORANGE_CANDLE,
            Material.MAGENTA_CANDLE,
            Material.LIGHT_BLUE_CANDLE,
            Material.YELLOW_CANDLE,
            Material.LIME_CANDLE,
            Material.PINK_CANDLE,
            Material.GRAY_CANDLE,
            Material.LIGHT_GRAY_CANDLE,
            Material.CYAN_CANDLE,
            Material.PURPLE_CANDLE,
            Material.BLUE_CANDLE,
            Material.BROWN_CANDLE,
            Material.GREEN_CANDLE,
            Material.RED_CANDLE,
            Material.BLACK_CANDLE,
            Material.OAK_SAPLING,
            Material.SPRUCE_SAPLING,
            Material.BIRCH_SAPLING,
            Material.JUNGLE_SAPLING,
            Material.ACACIA_SAPLING,
            Material.DARK_OAK_SAPLING,
            Material.BAMBOO_SAPLING,
            Material.SUGAR_CANE,
            Material.GRASS,
            Material.SEAGRASS,
            Material.TALL_SEAGRASS,
            Material.TUBE_CORAL,
            Material.BRAIN_CORAL,
            Material.BUBBLE_CORAL,
            Material.FIRE_CORAL,
            Material.HORN_CORAL,
            Material.DEAD_TUBE_CORAL,
            Material.DEAD_BRAIN_CORAL,
            Material.DEAD_BUBBLE_CORAL,
            Material.DEAD_FIRE_CORAL,
            Material.DEAD_HORN_CORAL,
            Material.ROSE_BUSH,
            Material.PEONY,
            Material.RED_TULIP,
            Material.ORANGE_TULIP,
            Material.WHITE_TULIP,
            Material.PINK_TULIP,
            Material.ALLIUM,
            Material.AZURE_BLUET,
            Material.OXEYE_DAISY,
            Material.SUNFLOWER,
            Material.LILAC,
            Material.LARGE_FERN,
            Material.ROSE_BUSH,
            Material.PEONY,
            Material.RED_TULIP,
            Material.ORANGE_TULIP,
            Material.WHITE_TULIP,
            Material.PINK_TULIP,
            Material.ALLIUM,
            Material.AZURE_BLUET,
            Material.OXEYE_DAISY,
            Material.SUNFLOWER,
            Material.LILAC,
            Material.LARGE_FERN
    };

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Material blockType = event.getBlockPlaced().getType();
        for (Material typeToCancel : BLOCK_TYPES_TO_CANCEL) {
            if (blockType == typeToCancel) {
                event.setCancelled(true);
                break;
            }
        }
    }

}
