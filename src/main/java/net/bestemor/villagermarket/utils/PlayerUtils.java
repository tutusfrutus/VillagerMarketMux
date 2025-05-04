package net.bestemor.villagermarket.utils;

import org.bukkit.entity.Player;

public class PlayerUtils {

    public static double getDiscountForPlayer(Player player) {
        if (player.hasMetadata("MuxMCDiscount")) {
            return player.getMetadata("MuxMCDiscount").getFirst().asDouble();
        }
        return 0.0;
    }
}