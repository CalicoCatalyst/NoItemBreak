package net.insxnity.noitembreak;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class NoItemBreak extends JavaPlugin implements Listener {
	
	public Plugin plugin = null;
	public Configuration config = null;
	
	@Override
	public void onEnable() {
		this.plugin = this;
		this.config = new Configuration(plugin, "config.yml");
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=false)
	public void onItemDamage(PlayerItemDamageEvent event) {
		if (config.hasPermission(event.getPlayer())) {
			event.setCancelled(true);
			event.getItem().setDurability((short)0);
		}
	}
	  
	@EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=false)
	public void onBlockBreak(BlockBreakEvent event) {
		if (config.hasPermission(event.getPlayer())) {
			event.getPlayer().getItemInHand().setDurability((short)0);
		}
	}
	  
	@Override
	public void onDisable() {
		this.plugin = null;
		this.config = null;
	}

}
