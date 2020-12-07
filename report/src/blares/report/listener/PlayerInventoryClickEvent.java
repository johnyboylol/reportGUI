package blares.report.listener;

import blares.report.Report;
import blares.report.command.ReportCommand;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerInventoryClickEvent implements Listener {

    @EventHandler
    public void onPlayerInventoryClickEvent( InventoryClickEvent event ) {
        if(event.getInventory().getName().equalsIgnoreCase("Report GUI")) {
            Player playerForSound = (Player) event.getWhoClicked();
            playerForSound.playSound(playerForSound.getLocation(), Sound.NOTE_PIANO, 4, 4);
            if(event.getSlot() == 4) {
                Report.instance.getOtherMap().setOtherMap(event.getWhoClicked().getName(), true);
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GOLD + "please type in chat what you are reporting this player for");

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
            }
            if(event.getSlot() == 0) {
                ReportCommand.reporter.report("Fly");

                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
            if(event.getSlot() == 1) {
                ReportCommand.reporter.report("Kill Aura");

                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
            if(event.getSlot() == 2) {
                ReportCommand.reporter.report("Auto Clicker");

                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
            if(event.getSlot() == 8) {
                ReportCommand.reporter.report("Speed");

                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
            if(event.getSlot() == 7) {
                ReportCommand.reporter.report("Anti Knockback");

                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
            if(event.getSlot() == 6) {
                ReportCommand.reporter.report("Reach");
                Report.used = false;

                event.setCancelled(true);
                event.getWhoClicked().closeInventory();
                event.getWhoClicked().sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.GREEN + "Thank you for submitting your report!");
            }
        }
    }

}
