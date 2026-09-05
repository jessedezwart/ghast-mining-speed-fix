package nl.jessedezwart.ghastminingspeedfix;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(GhastMiningSpeedFix.MODID)
public class GhastMiningSpeedFix {
    public static final String MODID = "ghastminingspeedfix";
    public static final Logger LOGGER = LogUtils.getLogger();

    public GhastMiningSpeedFix(IEventBus modEventBus, ModContainer modContainer) {
    }
}
