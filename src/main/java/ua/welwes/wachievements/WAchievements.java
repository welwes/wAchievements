package ua.welwes.wachievements;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WAchievements extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("wAchievements включён.");
        getLogger().info("Build b1.0 // sub in tg @welwesqq");
    }

    @Override
    public void onDisable() {
        getLogger().info("wAchievements выключен.");
        getLogger().info("Build b1.0 // sub in tg @welwesqq");
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerAdvancementDone(PlayerAdvancementDoneEvent event) {
        event.message(null);
    }
}
