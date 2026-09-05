package nl.jessedezwart.ghastminingspeedfix;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@Mod(GhastMiningSpeedFix.MODID)
public class GhastMiningSpeedFix {
    public static final String MODID = "ghastminingspeedfix";

    private static final ResourceLocation HAPPY_GHAST = ResourceLocation.fromNamespaceAndPath("minecraft", "happy_ghast");

    public GhastMiningSpeedFix(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @EventBusSubscriber(modid = MODID)
    public static class Handler {
        @SubscribeEvent
        public static void onBreakSpeed(PlayerEvent.BreakSpeed event) {
            Entity vehicle = event.getEntity().getVehicle();
            if (vehicle == null || !HAPPY_GHAST.equals(BuiltInRegistries.ENTITY_TYPE.getKey(vehicle.getType()))) {
                return;
            }
            event.setNewSpeed((float) (event.getNewSpeed() * Config.MINING_SPEED_MULTIPLIER.get()));
        }
    }
}
