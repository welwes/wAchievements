package ua.welwes.wachievements;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;
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

    private void hideAdvancementsFor(World world) {
        world.setGameRuleValue("announceAdvancements", "false");
        getLogger().info("Achievements are now hidden for world '" + world.getName() + "'.");
    }

    /* Hide advancements for new worlds */
    @EventHandler(priority = EventPriority.MONITOR)
    public void onWorldLoad(WorldLoadEvent event) {
        hideAdvancementsFor(event.getWorld());
    }
}
