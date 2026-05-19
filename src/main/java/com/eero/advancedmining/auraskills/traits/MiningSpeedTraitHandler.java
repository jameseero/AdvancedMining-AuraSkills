package com.eero.advancedmining.auraskills.traits;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

// Minimal placeholder handler to avoid direct AuraSkills API dependency for handlers
public class MiningSpeedTraitHandler {
    private final JavaPlugin plugin;

    public MiningSpeedTraitHandler(JavaPlugin plugin) {
        this.plugin = plugin;
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