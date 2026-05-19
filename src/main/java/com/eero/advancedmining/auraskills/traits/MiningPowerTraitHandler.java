package com.eero.advancedmining.auraskills.traits;

import com.eero.advancedmining.auraskills.CustomTraits;
import dev.aurelium.auraskills.api.AuraSkillsApi;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

// Minimal placeholder handler to avoid direct AuraSkills API dependency for handlers
public class MiningPowerTraitHandler implements dev.aurelium.auraskills.api.trait.TraitHandler {
    private final JavaPlugin plugin;
    private final AuraSkillsApi aura;

    public MiningPowerTraitHandler(AuraSkillsApi aura, JavaPlugin plugin) {
        this.aura = aura;
        this.plugin = plugin;
    }

    @Override
    public dev.aurelium.auraskills.api.trait.Trait[] getTraits() {
        return new dev.aurelium.auraskills.api.trait.Trait[]{CustomTraits.MINING_POWER};
    }

    public double getBaseLevel(Player player) {
        // Mining power base is 0; this trait is influenced by tools or stats.
        return 0.0;
    }

    public void onReload(Player player) {
        // No-op for now.
    }

    public String getMenuDisplay(double value, Locale locale) {
        // Format as whole number (mining power is for tier levels)
        return String.format("%.0f", value);
    }

    public boolean displayMatchesValue() {
        return true;
    }
}