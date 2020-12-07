package blares.report.command;

import blares.report.Report;
import blares.report.util.GuiItem;
import blares.report.util.Reporter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ReportCommand implements CommandExecutor {

    public static Reporter reporter;

    @Override
    public boolean onCommand( CommandSender sender, Command command, String Label, String[] args ) {
        if(sender instanceof Player) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.RED + "please enter a valid player name /report <playername>");
            } else {
                if(!Report.used) {
                    if (Bukkit.getPlayer(args[0]) != null) {
                        Inventory GUI = Bukkit.createInventory(null, 9, "Report GUI");
                        GUI.setItem(0, new GuiItem(ChatColor.DARK_BLUE + "Fly", Material.FEATHER).getGuiItem());
                        GUI.setItem(1, new GuiItem(ChatColor.DARK_RED + "Kill Aura", Material.DIAMOND_SWORD).getGuiItem());
                        GUI.setItem(2, new GuiItem(ChatColor.DARK_GRAY + "Auto Clicker", Material.IRON_INGOT).getGuiItem());
                        GUI.setItem(8, new GuiItem(ChatColor.DARK_AQUA + "Speed", Material.POTION).getGuiItem());
                        GUI.setItem(7, new GuiItem(ChatColor.DARK_GREEN + "Anti Knockback", Material.STICK).getGuiItem());
                        GUI.setItem(6, new GuiItem(ChatColor.DARK_PURPLE + "Reach", Material.GOLD_SWORD).getGuiItem());
                        GUI.setItem(4, new GuiItem(ChatColor.GOLD + "Other", Material.BOOK_AND_QUILL).getGuiItem());

                        ((Player) sender).openInventory(GUI);

                        Report.used = true;

                        ((Player) sender).playSound(((Player) sender).getLocation(), Sound.NOTE_BASS, 3, 3);

                        reporter = new Reporter(sender.getName(), args[0]);
                    } else if (Bukkit.getPlayer(args[0]) == null) {
                        sender.sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.RED + "that player is not online!");
                    }
                } else if(Report.used) {
                    sender.sendMessage(ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.DARK_AQUA + "Report" + ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.RED + "please try this command again in a minute");
                }
            }
        }
        return true;
    }

}
