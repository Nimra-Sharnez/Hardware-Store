package HardwareStoreSimulation;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import HardwareStoreSimulation.Customer.Customer;
import HardwareStoreSimulation.Tool.Tool;
import HardwareStoreSimulation.Tool.Decorators.AccessoryKit;
import HardwareStoreSimulation.Tool.Decorators.ExtensionCord;
import HardwareStoreSimulation.Tool.Decorators.ProtectiveGearPackage;

public class InfoGenerator {

	
	
	//RETURNS THE INFO
	public static String info(Tool tool, int ext, int days) {
		//ext is the number of extensions they want to add	
		//need to make a way to add 0->6 extensions added to cost
		
		Tool t= tool;
		
		
		double cost = t.cost();
		String desc = t.desc();
		
		if (ext == 0) {
			
		}
		else if (ext == 1) {
			t = new AccessoryKit(t);
		}
		else if (ext == 2) {
			t = new AccessoryKit(t);
			t = new ExtensionCord(t);
		}
		else if (ext == 3) {
			t = new AccessoryKit(t);
			t = new ExtensionCord(t);
			t = new ProtectiveGearPackage(t);
		}
		else if (ext == 4) {
			t = new ExtensionCord(t);
		}
		else if (ext == 5) {
			t = new ExtensionCord(t);
			t = new ProtectiveGearPackage(t);
		}
		else if (ext == 6) {
			t = new ProtectiveGearPackage(t);
		}
		else if (ext == 7) {
			t = new AccessoryKit(t);
			t = new ProtectiveGearPackage(t);
		}
		else {
			
		}
		
		cost = t.cost();
		desc = t.desc();

		return cost*days + " dollars for " + desc + " today because it is rented out for " + days + " days.";
		
	}
	
	//Removes a tool out of inventory, puts into shopper's cart, update inventory
	public ArrayList<Tool> cart(Customer c, ArrayList<Tool> Inventory){
		
		ArrayList<Tool> cart = new ArrayList<Tool>(); //empty cart

	    Random rand = new Random();

	    //randomly pick item from inventory 0 ->24
	    int n = rand.nextInt(Inventory.size());
    	
	    
	    //add item to cart
	    cart.add(Inventory.get(n));
		//remove item from inventory
	    Inventory.remove(n);
	    
	    

		return cart;
		
	}
	
	//Removes tool from cart and puts back in inventory, update cart and inventory
	public ArrayList<Tool> ret(ArrayList<Tool> cart, ArrayList<Tool> Inventory){
		

		for (int i=0; i<cart.size(); i++) {
			Inventory.add(cart.get(i));
		}
		
		cart = new ArrayList<Tool>();
		return cart;
		
	}
	
	//finds Customer associated with cart
	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
		
	}
	
	
	

	
	

}
