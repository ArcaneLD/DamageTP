package fr.arcane.damagetp;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World.Environment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class DamageListener implements Listener {

	@EventHandler
	public void onPlayerDamage(EntityDamageEvent e) {
	
	if(e.getEntityType() == EntityType.PLAYER) {
		
		
		Player p = (Player) e.getEntity();
		
		if(p.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE) == true) {
			return;
			
		}
			
		

		if(p.isBlocking()) {
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&6[DamageTP] &r&aTu as bloqu� un &r&4&lDegat !"));
			return;
		}
		if(e.getCause() == DamageCause.FIRE_TICK) {
			return;
		}
		
		
		if(p.getWorld().getEnvironment() == Environment.NORMAL) {
			
		
		double x = new Random().nextInt(30000) - 15000;
		double z = new Random().nextInt(30000) - 15000;
		
		Location locxz = new Location(p.getWorld(), x, 70, z);
		
		Location finalloc = new Location(p.getWorld(), x, locxz.getWorld().getHighestBlockYAt(locxz) + 2, z);
		
		p.teleport(finalloc);
		
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&6[DamageTP] &r&aTu as pris un &r&4&lDegat &r&aalors tu as ete teleporte aleatoirement !"));
		}
		
		if(p.getWorld().getEnvironment() == Environment.NETHER) {
			
			double x = new Random().nextInt(1000) - 500;
			double z = new Random().nextInt(1000) - 500;
			
			Location locxz = new Location(p.getWorld(), x, 70, z);
			
			
			p.teleport(locxz);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 25));
			
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&6[DamageTP] &r&aTu as pris un &r&4&lDegat &r&aalors tu as ete teleporte aleatoirement !"));
		}
			
		if(p.getWorld().getEnvironment() == Environment.THE_END) {
			
			double x = new Random().nextInt(50) - 25;
			double z = new Random().nextInt(50) - 25;
			
			Location locxz = new Location(p.getWorld(), x, 70, z);
			Location finalloc = new Location(p.getWorld(), x, locxz.getWorld().getHighestBlockYAt(locxz) + 2, z);
			
			p.teleport(finalloc);
			p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 25));
			
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[DamageTP] &r&aTu as pris un &r&4&lDegat &r&aalors tu as ete teleporte aleatoirement !"));
			
		}
			
		
	
	}
	
}
	
}
