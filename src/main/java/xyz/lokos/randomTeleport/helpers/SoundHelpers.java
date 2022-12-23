package xyz.lokos.randomTeleport.helpers;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SoundHelpers {

    public static void createSoundConstant(Player player, Sound sound) {
        player.playSound(player.getLocation(), sound, 1, 1);
    }
}
