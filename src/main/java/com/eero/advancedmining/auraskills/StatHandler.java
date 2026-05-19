package com.eero.advancedmining.auraskills;

import com.eero.advancedmining.AdvancedMining;
import com.eero.advancedmining.auraskills.CustomTraits;
import dev.aurelium.auraskills.api.user.SkillsUser;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public final class StatHandler {
    private StatHandler() {}

    public static int calculateMiningPower(Player player, @Nullable SkillsUser user) {
        if (user == null) return 0;
        try {
            return (int) user.getEffectiveTraitLevel(CustomTraits.MINING_POWER);
        } catch (Exception e) {
            AdvancedMining.getInstance().getLogger().fine(
                    "Failed to get mining power for " + player.getName() + ": " + e.getMessage()
            );
            return 0;
        }
    }

    public static double calculateMiningSpeed(Player player, @Nullable SkillsUser user) {
        if (user == null) return 0.0;
        try {
            return user.getEffectiveTraitLevel(CustomTraits.MINING_SPEED);
        } catch (Exception e) {
            AdvancedMining.getInstance().getLogger().fine(
                    "Failed to get mining speed for " + player.getName() + ": " + e.getMessage()
            );
            return 0.0;
        }
    }
}