package zucan.lightblocks;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zucan.lightblocks.registry.BlocksRegistry;
import zucan.lightblocks.registry.ItemsRegistry;

public class LightBlocks implements ModInitializer {

    public static final String MOD_ID = "lightblocks";
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        BlocksRegistry.init();
        ItemsRegistry.init();

        LOGGER.info("[LightBlocks] Initialized.");
    }
}
