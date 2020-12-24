package com.pepe.ppnorain.ppnorain;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PpNoRain extends JavaPlugin implements Listener {
    public static boolean toggleRain = true;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this,this);
        getCommand("norain").setExecutor(new togglerain());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event){
        if (event.toWeatherState()){
            event.setCancelled(toggleRain);
        }
        toggleRain = true;
    }
}
