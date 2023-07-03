package io.github.virtualvulpes.command_hider;

import org.bukkit.plugin.java.JavaPlugin;

public final class CommandHider extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
