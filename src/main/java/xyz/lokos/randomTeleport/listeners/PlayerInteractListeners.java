package xyz.lokos.randomTeleport.listeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import xyz.lokos.randomTeleport.helpers.ColorHelpers;
import xyz.lokos.randomTeleport.helpers.RandomHelpers;
import xyz.lokos.randomTeleport.helpers.SoundHelpers;
import xyz.lokos.randomTeleport.helpers.config.Config;

public class PlayerInteractListeners implements Listener {

    @EventHandler
    public boolean interactEvenetRandomTeleport(PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        final Block block = event.getClickedBlock();
        if (block == null) return false;
        if (block.getType() != Config.instancConfig.getSystemRandomTeleport().getRandomTeleportMaterialClick()) return false;
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            final double x = RandomHelpers.getRandomDouble(Config.instancConfig.getSystemRandomTeleport().getRandomTeleportXx(), Config.instancConfig.getSystemRandomTeleport().getRandomTeleportX()), z = RandomHelpers.getRandomDouble(Config.instancConfig.getSystemRandomTeleport().getRandomTeleportZz(), Config.instancConfig.getSystemRandomTeleport().getRandomTeleportZ()), y = player.getWorld().getHighestBlockYAt((int) +x, (int) z) + 0.5;
            player.teleport(new Location(player.getWorld(), x, y, z));
            player.sendMessage(ColorHelpers.color(Config.instancConfig.getSystemRandomTeleport().getRandomTeleportMessage()));
            SoundHelpers.createSoundConstant(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP);
            return false;
        }
        return false;
    }
}
