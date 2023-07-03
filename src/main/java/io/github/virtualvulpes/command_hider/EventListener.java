package io.github.virtualvulpes.command_hider;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

public class EventListener implements Listener
{
//    FileConfiguration config;
//
//    public EventListener(final FileConfiguration config) {
//        this.config = config;
//    }
//
//    @EventHandler
//    public void onPlayerTab(final PlayerCommandSendEvent event) {
//        final Player player = event.getPlayer();
//        if (player.isOp()) {
//            return;
//        }
//        event.getCommands().removeAll(event.getCommands()); //clear all commands
//        final LuckPerms api = LuckPermsProvider.get();
//        final User user = api.getUserManager().getUser(player.getUniqueId());
//        final List<String> ranks = (List<String>)this.config.getStringList("Ranks");
//        for (int i = 0; i < ranks.size(); ++i) {
//            if (user.getPrimaryGroup().equals(ranks.get(i))) {
//                for (int j = 0; j <= i; ++j) {
//                    event.getCommands().addAll(this.config.getStringList((String)ranks.get(j)));
//                }
//            }
//        }
//    }

    @EventHandler
    public void onPlayerTab(final PlayerCommandSendEvent event) {
        final Player player = event.getPlayer();
        if (player.isOp()) {
            return;
        }
        event.getCommands().removeAll(event.getCommands()); //clear all commands
    }
}