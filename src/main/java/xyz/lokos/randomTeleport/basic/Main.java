package xyz.lokos.randomTeleport.basic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.lokos.randomTeleport.helpers.LoggerHelpers;
import xyz.lokos.randomTeleport.helpers.config.Config;
import xyz.lokos.randomTeleport.listeners.PlayerInteractListeners;
import xyz.lokos.randomTeleport.registry.Registry;

import java.util.logging.Level;

/**
 * Autor: Bartłomiej Motłoch - "Lokos"
 * Data stworzenia: 23.12.2022
 */

@Getter
public final class Main extends JavaPlugin {

    public static Main instanceMain;

    private Gson gson;
    private Gson gsonWithoutStyle;
    private Config customConfig;

    @Override
    public void onEnable() {

        LoggerHelpers.success("Enable success plugins");

        instanceMain = this;

        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.gsonWithoutStyle = new GsonBuilder().create();

        this.customConfig = new Config().init(this.getDataFolder());

        LoggerHelpers.info(Level.INFO, "Enable success registry");
        new Registry(this).registerListener(
                new PlayerInteractListeners()
        );

    }

    @Override
    public void onDisable() {
        LoggerHelpers.info(Level.INFO, "Disable success plugins");
    }
}
