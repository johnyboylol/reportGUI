package blares.report.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Reporter {

    private String reporter;
    private String reported;

    public Reporter(String reporter, String reported) {
        this.reporter = reporter;
        this.reported = reported;
    }

    public void report(String reason) {
        for(Player players : Bukkit.getOnlinePlayers()) {
            if(players.isOp()) {
                players.sendMessage(ChatColor.DARK_AQUA + "Gui report incoming:");
                players.sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + reporter + ChatColor.RED + " has reported " + ChatColor.DARK_RED + reported + ChatColor.RED + " for " + reason);
            }
        }
        System.out.println(reporter + " has reported " + reported + " for " + reason);
    }

}
