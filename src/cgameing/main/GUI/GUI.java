package cgameing.main.GUI;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public class GUI extends JavaPlugin implements Listener {
	
	public boolean respawnMinigame = true;
	
	public boolean allowJumpPads = true;
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		System.out.println("apples");
		logger.info(pdfFile.getMain() + " "+ pdfFile.getVersion() + " has been enabled.");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getMain() + " "+ pdfFile.getVersion() + " has been disabled.");
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
	  if(!event.getPlayer().hasPlayedBefore()) {
	    event.getPlayer().sendMessage("Message Here");
	    boolean player,hasMusicDisk = true;
	  }
	}	
	
	@EventHandler(priority = EventPriority.LOW)
    public void onLogin(PlayerLoginEvent event) {
    	System.out.println("Welcome back???");
        event.getPlayer().sendMessage("Welcome Back");
    }
	
    @EventHandler(priority = EventPriority.HIGH)
	public void onPlayerInteract(PlayerInteractEvent e) {
		 
    	if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        Block b = e.getClickedBlock();
	        if ((b.getType() == Material.SIGN_POST) || (b.getType() == Material.WALL_SIGN)) {
	        	Sign s = (Sign)b.getState();
	            Player p = e.getPlayer();
	            if (s.getLine(0).equalsIgnoreCase("[Reload]")) {
		            if (s.getLine(1).equalsIgnoreCase("..Sign..")) {
		            	if (p.isOp()) {
		        			p.chat("/r"); 
		            	}
		            }
	            }
	            if (s.getLine(0).equalsIgnoreCase("[TerraTerma]")) {
	            	if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        			
	        			
	        			ItemStack skyblock = new ItemStack(Material.FEATHER);
	        			ItemMeta metaskyblock = skyblock.getItemMeta();
	        			metaskyblock.setDisplayName(ChatColor.AQUA + "Skyblock");
	        			skyblock.setItemMeta(metaskyblock);
	        			
	        			ItemStack survival = new ItemStack(Material.GRASS);
	        			ItemMeta metasurvival = survival.getItemMeta();
	        			metasurvival.setDisplayName(ChatColor.GREEN + "Survival");
	        			survival.setItemMeta(metasurvival);
	        			
	        			ItemStack creative = new ItemStack(Material.DIAMOND);
	        			ItemMeta metacreative = creative.getItemMeta();
	        			metacreative.setDisplayName(ChatColor.AQUA + "Creative");
	        			creative.setItemMeta(metacreative);
	        			
	        			ItemStack factions = new ItemStack(Material.DIAMOND_SWORD);
	        			ItemMeta metafactions = factions.getItemMeta();
	        			metafactions.setDisplayName(ChatColor.RED + "Factions");
	        			factions.setItemMeta(metafactions);
	        			
	        			ItemStack shop = new ItemStack(Material.CHEST);
	        			ItemMeta metashop = shop.getItemMeta();
	        			metashop.setDisplayName(ChatColor.BLUE + "Spawn Shop");
	        			shop.setItemMeta(metashop);
	        			
	        			ItemStack spawn = new ItemStack(Material.NETHER_STAR);
	        			ItemMeta metaspawn = spawn.getItemMeta();
	        			metaspawn.setDisplayName(ChatColor.LIGHT_PURPLE + "Spawn");
	        			spawn.setItemMeta(metaspawn);
	        			
	        			ItemStack desert = new ItemStack(Material.SAND);
	        			ItemMeta metadesert = desert.getItemMeta();
	        			metadesert.setDisplayName(ChatColor.YELLOW + "Desert");
	        			desert.setItemMeta(metadesert);
	        			
	        			ItemStack exit = new ItemStack(Material.BARRIER);
	        			ItemMeta metaexit = exit.getItemMeta();
	        			metaexit.setDisplayName(ChatColor.RED + "Exit Menu");
	        			exit.setItemMeta(metaexit);
	        			
	        			//Page 4
	        			
	        			ItemStack paintball = new ItemStack(Material.SNOW_BALL);
	        			ItemMeta metapaintball = paintball.getItemMeta();
	        			metapaintball.setDisplayName(ChatColor.WHITE + "Paintball");
	        			paintball.setItemMeta(metapaintball);
	        			
	        			ItemStack mobarena = new ItemStack(Material.MONSTER_EGG);
	        			ItemMeta metamobarena = mobarena.getItemMeta();
	        			mobarena.setDurability((short)50);
	        			metamobarena.setDisplayName(ChatColor.RED + "Mob arena");
	        			mobarena.setItemMeta(metamobarena);
	        			
	        			ItemStack tntrun = new ItemStack(Material.TNT);
	        			ItemMeta metatntrun = tntrun.getItemMeta();
	        			metatntrun.setDisplayName(ChatColor.RED + "TNTRun");
	        			tntrun.setDurability((short)50);
	        			tntrun.setItemMeta(metatntrun);
	        			
	        			Inventory inv = Bukkit.createInventory(null, (9*4), ChatColor.GREEN + "TerraTerma Warpgate");
	        			
	        			
	        			//First Line 0
	        			inv.setItem(0, spawn);
	        			inv.setItem(1, survival);
	        			inv.setItem(2, skyblock);
	        			inv.setItem(3, creative);
	        			inv.setItem(4, factions);
	        			inv.setItem(5, shop);
	        			inv.setItem(6, desert);
	        			//Empty space
	        			inv.setItem(8, exit);
	        			
	        			//Second line 9
	        			
	        			//Third 18
	        			
	        			//Forth 27
	        			inv.setItem(27, paintball);
	        			inv.setItem(28, mobarena);
	        			inv.setItem(29, tntrun);
	        			
	        			e.getPlayer().openInventory(inv);
	        			
	        		}
	            }
	        }
    	}
	}
    
    @EventHandler
    public void onClick(InventoryClickEvent e) {
    	Player p = (Player) e.getWhoClicked();
    	
    	if (e.getInventory().getTitle().equals(ChatColor.GREEN + "TerraTerma Warpgate")) {
    		if (e.getSlot() == 0) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to spawn");
    			p.chat("/spawn"); 
    			p.closeInventory();
        		
    		} else if (e.getSlot() == 1) {
    			
        		e.setCancelled(true);
        		p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to survival");
        		p.chat("/warp survival"); 
        		p.closeInventory();
        		
    		} else if (e.getSlot() == 2) {
    			
        		e.setCancelled(true);
        		p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to skyblock");
        		p.chat("/island"); 
        		p.closeInventory();
        		
    		} else if (e.getSlot() == 3) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to creative");
    			p.chat("/warp creative"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 4) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to factions");
    			p.chat("/warp factions"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 5) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to shop");
    			p.chat("/warp shop"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 6) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Warping to the desert");
    			p.chat("/warp desert"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 7) {
    			
    			return;
    			
    		} else if (e.getSlot() == 8) {
    			
    			//Exit code
    			e.setCancelled(true);
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 27) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Joining Paintball arena");
    			p.chat("/pb join"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 28) {
    			
    			e.setCancelled(true);
    			p.closeInventory();
    			Pages.MobArenaPage(p, this);
    			
    		} else if (e.getSlot() == 29) {
    			
    			e.setCancelled(true);
    			p.closeInventory();
    			Pages.TNTRunPage(p, this);
    			
    		} else return;
    		
    		
    	} else if (e.getInventory().getTitle().equals(ChatColor.RED + "TNTRun: Choose a arena")) {
    		
    		
    		if (e.getSlot() == 8) {
    			
    			//Exit code
    			e.setCancelled(true);
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 22) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.RED + "TerraCore: Joining TNTRun 1");
    			p.chat("/tr join sand"); 
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 23) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.RED + "TerraCore: Joining TNTRun 2");
    			p.chat("/tr join tower"); 
    			p.closeInventory();
    			
    		} else return;
    		
    		
    		
    	} else if (e.getInventory().getTitle().equals(ChatColor.YELLOW + "Mob Arena: Choose a arena")) {
    		
    		
    		if (e.getSlot() == 8) {
    			
    			//Exit code
    			e.setCancelled(true);
    			p.closeInventory();
    			
    		} else if (e.getSlot() == 22) {
    			
    			e.setCancelled(true);
    			p.sendMessage(ChatColor.GREEN + "TerraCore: Joining The arena");
    			p.chat("/ma join sand"); 
    			p.closeInventory();
    			
    		} else return;
    	}
    }
    
    @EventHandler
    public void onMove(PlayerMoveEvent event) {
    	Player p = event.getPlayer();
    	
    	 Material plate = p.getLocation().getBlock().getType();
    	 Material block = p.getLocation().subtract(0, 1, 0).getBlock().getType();
    	 
    	 if(block == Material.EMERALD_BLOCK) {
        	 if(plate == Material.IRON_PLATE) {
        		 if (allowJumpPads) {
            		 System.out.println("true");
         		    Vector vector = p.getEyeLocation().getDirection();
         		    vector.multiply(1.1F);
         		    vector.setY(1.2);
         		    p.setVelocity(vector);
        		 }
        	 }
    	 }
    }
 

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("boostpads")) { // If the player typed /basic then do the following...
			Player p = ((Player) sender).getPlayer();
			if (p.isOp()) {
				if (allowJumpPads) {
					allowJumpPads = false;
					p.sendMessage(ChatColor.RED + "TerraCore: Disabled Jump Pads"); 
					return true;
				} else {
					allowJumpPads = true;
					p.sendMessage(ChatColor.GREEN + "TerraCore: Enabled Jump Pads"); 
					return true;
				}
			} else {
				p.sendMessage(ChatColor.GREEN + "TerraCore: You need to be op to run this command"); 
				return false;
			}
		} 

		
		return false;
		
	}
	
	
}
