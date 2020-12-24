package com.pepe.ppnorain.ppnorain;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class togglerain implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("ppNoRain.toggle")){
            PpNoRain.toggleRain = false;
            sender.sendMessage(ChatColor.DARK_AQUA + "[ppNoRain] - Rain Disabled!");
        }else{
            sender.sendMessage(ChatColor.DARK_RED +"You're not allowed to use this command!");
        }
        return false;
    }
}
