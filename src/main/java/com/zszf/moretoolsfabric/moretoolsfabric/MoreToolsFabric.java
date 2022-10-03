package com.zszf.moretoolsfabric.moretoolsfabric;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreToolsFabric implements ModInitializer {
    public static final Logger logger = LogManager.getLogger();
    public void onInitialize() {
        logger.info("Enable MoreToolsFabric!");
    }
}
