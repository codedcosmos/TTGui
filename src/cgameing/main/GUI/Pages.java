package cgameing.main.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Pages {
	
	public static GUI plugin;
	
	public static void TNTRunPage(Player p, GUI plugin) {
		
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
            //YOUR MESSAGE TO SAY AFTER THEY SAY STUFF
            }
        }, 5000); //5000 MEANS WAIT 5 SECCONDS BEFORE RUNNING THE CODE ABOVE
		
		ItemStack exit = new ItemStack(Material.BARRIER);
		ItemMeta metaexit = exit.getItemMeta();
		metaexit.setDisplayName(ChatColor.RED + "Exit Menu");
		exit.setItemMeta(metaexit);
		
		ItemStack arenasand = new ItemStack(Material.TNT);
		ItemMeta metaarenasand = arenasand.getItemMeta();
		metaarenasand.setDisplayName(ChatColor.RED + "Sand Arena");
		arenasand.setItemMeta(metaarenasand);
		
		ItemStack arenatower = new ItemStack(Material.TNT);
		ItemMeta metaarenatower = arenatower.getItemMeta();
		metaarenatower.setDisplayName(ChatColor.RED + "Tower Arena");
		arenatower.setItemMeta(metaarenatower);
		
		Inventory inv = Bukkit.createInventory(null, (9*4), ChatColor.RED + "TNTRun: Choose a arena");
		
		inv.setItem(8, exit);
		inv.setItem(22, arenasand);
		inv.setItem(23, arenatower);
		
		p.openInventory(inv);
	}
	
	public static void MobArenaPage(Player p, GUI plugin) {
		
		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            @Override
            public void run() {
            //YOUR MESSAGE TO SAY AFTER THEY SAY STUFF
            }
        }, 5000); //5000 MEANS WAIT 5 SECCONDS BEFORE RUNNING THE CODE ABOVE
		
		ItemStack exit = new ItemStack(Material.BARRIER);
		ItemMeta metaexit = exit.getItemMeta();
		metaexit.setDisplayName(ChatColor.RED + "Exit Menu");
		exit.setItemMeta(metaexit);
		
		ItemStack arenasand = new ItemStack(Material.SAND);
		ItemMeta metaarenasand = arenasand.getItemMeta();
		metaarenasand.setDisplayName(ChatColor.YELLOW + "Sand Arena");
		arenasand.setItemMeta(metaarenasand);
		
		Inventory inv = Bukkit.createInventory(null, (9*4), ChatColor.YELLOW + "Mob Arena: Choose a arena");
		
		inv.setItem(8, exit);
		inv.setItem(22, arenasand);
		
		p.openInventory(inv);
	}
}
