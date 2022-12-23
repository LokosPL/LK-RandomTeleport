package xyz.lokos.randomTeleport.registry;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public record Registry(Plugin plugin) {

    public void registerListener(Listener... listeners) {
        final PluginManager pluginManager = plugin.getServer().getPluginManager();
        for (Listener listener : listeners)
            pluginManager.registerEvents(listener, plugin);
    }
}
