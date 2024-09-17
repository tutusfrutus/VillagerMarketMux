package net.bestemor.villagermarket.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerUtils {

    public static double getDiscountForPlayer(Player player) {
        if (player.hasMetadata("MuxMCDiscount")) {
            double playerDiscount = player.getMetadata("MuxMCDiscount").getFirst().asDouble();
            Bukkit.getLogger().info("Discount = " + playerDiscount);
            return playerDiscount;
        }
        Bukkit.getLogger().info("No discount.");
        return 0.0;
    }
}