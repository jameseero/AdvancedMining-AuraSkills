package com.eero.advancedmining.auraskills.traits;

import com.eero.advancedmining.auraskills.CustomTraits;
import dev.aurelium.auraskills.api.AuraSkillsApi;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

// Minimal placeholder handler to avoid direct AuraSkills API dependency for handlers
public class MiningSpeedTraitHandler implements dev.aurelium.auraskills.api.trait.TraitHandler{
    private final JavaPlugin plugin;
    private final AuraSkillsApi aura;

    public MiningSpeedTraitHandler(AuraSkillsApi aura, JavaPlugin plugin) {
        this.plugin = plugin;
        this.aura = aura;
    }

    @Override
    public dev.aurelium.auraskills.api.trait.Trait[] getTraits() {
        return new dev.aurelium.auraskills.api.trait.Trait[]{CustomTraits.MINING_SPEED};
    }

    public double getBaseLevel(Player player) {
        // Base mining speed is managed externally; default to 0 here.
        return 0.0;
    }

    public String getMenuDisplay(double value, Locale locale) {
        // Format with one decimal place (mining speed can be fractional)
        return String.format("%.1f", value);
    }

    public boolean displayMatchesValue() {
        return true;
    }
}