package untitled.EntityLimit;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

	public final class rgs extends JavaPlugin implements Listener {
	    @EventHandler
	    public void playerInteract(PlayerInteractEvent event){
	        Player player = event.getPlayer();
	        Action action = event.getAction();
	    if(action.equals(Action.RIGHT_CLICK_BLOCK)){
	        Block b = event.getClickedBlock();
	        if (b.getType().equals(Material.SIGN) || b.getType().equals(Material.SIGN_POST) || b.getType().equals(Material.WALL_SIGN)){
	            Sign sign = (Sign) b.getState();
	            if (sign.getLine(0).equals("[sell]")){
	                    sign.setLine(0, ChatColor.DARK_RED + "[sell]");
	                    sign.setLine(1, player.getName());
	                    sign.setLine(2, "0");
	                    sign.setLine(3, ChatColor.DARK_RED + "a");

	    	    }
	    	}
	    
	    }
	    }
	    
	
}