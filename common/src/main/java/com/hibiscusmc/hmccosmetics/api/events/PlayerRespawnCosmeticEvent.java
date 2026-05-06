package com.hibiscusmc.hmccosmetics.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a cosmetic is respawned internally for
 * some reason, for example: player teleporting, portaling or changing pose.
 */
public class PlayerRespawnCosmeticEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    public PlayerRespawnCosmeticEvent(@NotNull Player who) {
        super(who);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static @NotNull HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
