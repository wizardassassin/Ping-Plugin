package com.wizard_assassin.ping_plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onLoad() {
        this.getLogger().info("Loading...");
        this.saveDefaultConfig();
        this.reloadConfig();
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Starting...");

        Bukkit.getPluginManager().registerEvents(new PingAFK(this), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Stopping...");
    }
}
