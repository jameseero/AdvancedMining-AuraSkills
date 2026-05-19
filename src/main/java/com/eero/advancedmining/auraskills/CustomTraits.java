package com.eero.advancedmining.auraskills;

import dev.aurelium.auraskills.api.registry.NamespacedId;
import dev.aurelium.auraskills.api.trait.CustomTrait;

public class CustomTraits {

    public static final CustomTrait MINING_POWER = CustomTrait
            .builder(NamespacedId.of("advancedmining", "mining_power"))
            .displayName("Mining Power")
            .build();
    public static final CustomTrait MINING_SPEED = CustomTrait
            .builder(NamespacedId.of("advancedmining", "mining_speed"))
            .displayName("Mining Speed")
            .build();
}