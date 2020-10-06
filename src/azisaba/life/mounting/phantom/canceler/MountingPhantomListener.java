package azisaba.life.mounting.phantom.canceler;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.spigotmc.event.entity.EntityMountEvent;

public class MountingPhantomListener implements Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void on(EntityMountEvent event) {
        if (event.getEntity().getType() == EntityType.PLAYER && event.getMount().getType() == EntityType.PHANTOM) event.setCancelled(true);
    }

}
