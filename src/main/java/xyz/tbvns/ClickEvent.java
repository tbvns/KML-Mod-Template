package xyz.tbvns;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import xyz.prismenetwork.kelpmodloader.Block.ModdedBlock;
import xyz.prismenetwork.kelpmodloader.Item.ModdedItem;
import xyz.prismenetwork.kelpmodloader.ModsAPI.ItemUtils;

import java.util.EventListener;

public class ClickEvent implements Listener {
    @EventHandler
    public void clickEvent(PlayerInteractEvent event) {
        if (event.hasItem()) {
            System.out.println(ItemUtils.isModed(event.getItem()));
            if (ItemUtils.isModed(event.getItem())) {
                ModdedItem item = ItemUtils.getModedItem(event.getItem());
                ModdedBlock block = ItemUtils.getModedBlockFromItem(event.getItem());
                if (item != null) {
                    event.getPlayer().sendMessage("You used the modded item " + item.Name);
                } else if (block != null) {
                    event.getPlayer().sendMessage("You used the modded block " + block.name);
                }
            }
        }

    }
}
