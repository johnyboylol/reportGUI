package blares.report.listener;

import blares.report.Report;
import blares.report.command.ReportCommand;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerChatEvent implements Listener {

    @EventHandler
    public void onPlayerChatEvent( org.bukkit.event.player.PlayerChatEvent event ) {
        if(Report.instance.getOtherMap().getBooleanPlayer(event.getPlayer().getName())) {
            String reason = event.getMessage();

            Report.instance.getOtherMap().removePlayer(event.getPlayer().getName());

            ReportCommand.reporter.report(reason);

            event.setCancelled(true);

            Report.used = false;

            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
        }
    }

}
