package blares.report;

import blares.report.command.ReportCommand;
import blares.report.listener.PlayerChatEvent;
import blares.report.listener.PlayerInventoryClickEvent;
import blares.report.util.OtherMap;
import org.bukkit.plugin.java.JavaPlugin;

public class Report extends JavaPlugin {

    private OtherMap otherMap;

    public static Report instance;

    public static boolean used;

    @Override
    public void onEnable() {
        getCommand("report").setExecutor(new ReportCommand());

        getServer().getPluginManager().registerEvents(new PlayerInventoryClickEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerChatEvent(), this);

        otherMap = new OtherMap();

        instance = this;

        used = false;
    }

    public OtherMap getOtherMap() {
        return otherMap;
    }

}
