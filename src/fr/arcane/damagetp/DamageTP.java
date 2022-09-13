package fr.arcane.damagetp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class DamageTP extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("[DamageTP] Loaded.");
		
		Bukkit.getServer().getPluginManager().registerEvents(new DamageListener(), (Plugin) this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("[DamageTP] Unloaded.");
		
	}
	
}
