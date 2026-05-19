package com.eero.advancedmining.auraskills;

import dev.aurelium.auraskills.api.item.ItemContext;
import dev.aurelium.auraskills.api.registry.NamespacedId;
import dev.aurelium.auraskills.api.stat.CustomStat;

public class CustomStats {

    public static final CustomStat MINING_POWER = CustomStat
            .builder(NamespacedId.of("advancedmining", "mining_power"))
            .displayName("Mining Power")
            .description("Allows breaking tougher blocks")
            .color("<gold>")  // Use MiniMessage format
            .symbol("⛏")
            .trait(CustomTraits.MINING_POWER, 1.0)
            .item(ItemContext.builder()
                    .material("pink_stained_glass_pane")
                    .group("lower")  // This must match a group in AuraSkills/menus/stats.yml
                    .order(5)
                    .build())
            .build();

    public static final CustomStat MINING_SPEED = CustomStat
            .builder(NamespacedId.of("advancedmining", "mining_speed"))
            .displayName("Mining Speed")
            .description("Increases mining speed")
            .color("<yellow>")  // Use MiniMessage format
            .symbol("⚡")
            .trait(CustomTraits.MINING_SPEED, 1.0)
            .item(ItemContext.builder()
                    .material("brown_stained_glass_pane")
                    .group("lower")  // This must match a group in AuraSkills/menus/stats.yml
                    .order(6)
                    .build())
            .build();
}