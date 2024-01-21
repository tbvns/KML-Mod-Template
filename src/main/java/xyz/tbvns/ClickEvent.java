package xyz.tbvns;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import xyz.prismenetwork.kelpmodloader.Item.ItemUtils;
import xyz.prismenetwork.kelpmodloader.Item.ModdedItem;

import java.util.EventListener;

public class ClickEvent implements Listener {
    @EventHandler
    public void clickEvent(PlayerInteractEvent event) {
        if (event.hasItem()) {
            if (ItemUtils.isModed(event.getItem())) {
                ModdedItem item = ItemUtils.getModedItem(event.getItem());
                event.getPlayer().sendMessage("You used the modded item " + item.Name);
            }
        }

    }
}
