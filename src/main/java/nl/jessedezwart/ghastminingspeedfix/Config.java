package nl.jessedezwart.ghastminingspeedfix;

import net.neoforged.neoforge.common.ModConfigSpec;

public final class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.DoubleValue MINING_SPEED_MULTIPLIER = BUILDER
            .comment("Mining speed multiplier applied while riding a ghast.",
                     "Vanilla divides mining speed by 5 while airborne, so 5.0 cancels that penalty out.")
            .defineInRange("miningSpeedMultiplier", 5.0D, 0.0D, 1000.0D);

    public static final ModConfigSpec SPEC = BUILDER.build();

    private Config() {
    }
}
