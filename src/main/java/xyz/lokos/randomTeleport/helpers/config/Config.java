package xyz.lokos.randomTeleport.helpers.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bukkit.Material;
import org.bukkit.Sound;
import xyz.lokos.randomTeleport.basic.Main;
import xyz.lokos.randomTeleport.helpers.variables.SystemRandomTeleportVariables;

import java.io.*;

@Data
@EqualsAndHashCode
public class Config {

    public static Config instancConfig;

    private SystemRandomTeleportVariables systemRandomTeleport= new SystemRandomTeleportVariables(
            5000,
            -5000,
            5000,
            -5000,
            Material.JUKEBOX,
            "&aZmienisz mnie w config.json",
            Sound.ENTITY_EXPERIENCE_ORB_PICKUP
            );

    public Config init(File directory) {
        instancConfig = this;
        try {
            if (!directory.exists())
                //noinspection ResultOfMethodCallIgnored
                directory.mkdir();
            final File configFile = new File(directory, "config.json");
            if (!configFile.exists()) {
                String json = Main.instanceMain.getGson().toJson(instancConfig);
                FileWriter writer = new FileWriter(configFile);
                writer.write(json);
                writer.close();
                return instancConfig;
            }
            BufferedReader reader = new BufferedReader(new FileReader(configFile));
            instancConfig = Main.instanceMain.getGson().fromJson(reader, Config.class);
        } catch (IOException ignored) {
        }
        return instancConfig;
    }
}
