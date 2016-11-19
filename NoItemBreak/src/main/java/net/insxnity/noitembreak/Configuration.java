package net.insxnity.noitembreak;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import net.insxnity.api.data.storage.config.YamlConfigFile;

public class Configuration extends YamlConfigFile {
	
	private static String permission = "permission";

	public Configuration(Plugin plugin, String fileName) {
		super(plugin, fileName);
	}
	
	public Boolean hasPermission(Player player) {
		return (player.hasPermission(getData().getString(permission)));
	}
	
	

}
