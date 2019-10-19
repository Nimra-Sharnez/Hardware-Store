package HardwareStoreSimulation;


import HardwareStoreSimulation.Customer.Business;

import HardwareStoreSimulation.Customer.Casual;
import HardwareStoreSimulation.Customer.Customer;
import HardwareStoreSimulation.Customer.Regular;
import HardwareStoreSimulation.Tool.ConcreteTool;
import HardwareStoreSimulation.Tool.PaintingTool;
import HardwareStoreSimulation.Tool.PlumbingTool;
import HardwareStoreSimulation.Tool.Tool;
import HardwareStoreSimulation.Tool.WoodworkTool;
import HardwareStoreSimulation.Tool.YardworkTool;
import HardwareStoreSimulation.Tool.Decorators.AccessoryKit;
import HardwareStoreSimulation.Tool.Decorators.ExtensionCord;
import HardwareStoreSimulation.Tool.Decorators.ProtectiveGearPackage;
import java.util.*;
public class Store extends HardwareStore{
	
	@Override
	protected
	Tool createTool(String item) {
		
		if (item.equals("paint")) {
			return new PaintingTool();
		}
		else if (item.equals("wood")) {
			return new WoodworkTool();
		}
		else if (item.equals("yard")) {
			return new YardworkTool();
		}
		else if (item.equals("plumbing")) {
			return new PlumbingTool();
		}	
		else if (item.equals("concrete")) {
			return new ConcreteTool();
		}	
		else return null;
		

	}
	
	@Override
	public String toString(ArrayList<Tool> list) {
	    String result = ", ";
	    for (int i = 0; i < list.size(); i++) {
	        result += " " + list.get(i);
	    }
	    return result;
	}

	public static void main(String[] args) {
		
		//creating instance of store
		HardwareStore bobsStore = new Store(); 
		
		//4 Regular
		Customer Brad = new Regular("Brad");
		Customer Paul = new Regular("Paul");
		Customer Larry = new Regular("Larry");
		Customer Santos = new Regular("Santos");
		//4 Business
		Customer Rhonda = new Business("Rhonda");
		Customer Harry = new Business("Harry");
		Customer Florence = new Business("Florence");
		Customer Gary = new Business("Gary");
		//4 Casual
		Customer Kevin = new Casual("Kevin");
		Customer Dan = new Casual("Dan");
		Customer Norman = new Casual("Norman");
		Customer Zach = new Casual("Zach");

		ArrayList<Tool> Inventory = new ArrayList<Tool>();
		//5 Painting Tools
		Tool p0 = bobsStore.orderTool("paint");
		p0.toolName = p0.toolDesc + " 1";
		Inventory.add(p0);
		Tool p1 = bobsStore.orderTool("paint");
		p1.toolName = p1.toolDesc + " 2";
		Inventory.add(p1);
		Tool p2 = bobsStore.orderTool("paint");
		p2.toolName = p2.toolDesc + " 3";
		Inventory.add(p2);
		Tool p3 = bobsStore.orderTool("paint");
		p3.toolName = p3.toolDesc + " 4";
		Inventory.add(p3);
		Tool p4 = bobsStore.orderTool("paint");
		p4.toolName = p4.toolDesc + " 5";
		Inventory.add(p4);
		
		//4 Woodworking Tools
		Tool w0 = bobsStore.orderTool("wood");
		w0.toolName = w0.toolDesc + " 1";
		Inventory.add(w0);
		Tool w1 = bobsStore.orderTool("wood");
		w1.toolName = w1.toolDesc + " 2";
		Inventory.add(w1);
		Tool w2 = bobsStore.orderTool("wood");
		w2.toolName = w2.toolDesc + " 3";
		Inventory.add(w2);
		Tool w3 = bobsStore.orderTool("wood");
		w3.toolName = w3.toolDesc + " 4";
		Inventory.add(w3);
		
		//5 Yardworking Tools
		Tool y0 = bobsStore.orderTool("yard");
		y0.toolName = y0.toolDesc + " 1";
		Inventory.add(y0);
		Tool y1 = bobsStore.orderTool("yard");
		y1.toolName = y1.toolDesc + " 2";
		Inventory.add(y1);
		Tool y2 = bobsStore.orderTool("yard");
		y2.toolName = y2.toolDesc + " 3";
		Inventory.add(y2);
		Tool y3 = bobsStore.orderTool("yard");
		y3.toolName = y3.toolDesc + " 4";
		Inventory.add(y3);
		Tool y4 = bobsStore.orderTool("yard");
		y4.toolName = y4.toolDesc + " 5";
		Inventory.add(y4);
		
		//5 Plumbing Tools
		Tool pl0 = bobsStore.orderTool("plumbing");
		pl0.toolName = pl0.toolDesc + " 1";
		Inventory.add(pl0);	
		Tool pl1 = bobsStore.orderTool("plumbing");
		pl1.toolName = pl1.toolDesc + " 2";
		Inventory.add(pl1);	
		Tool pl2 = bobsStore.orderTool("plumbing");
		pl2.toolName = pl2.toolDesc + " 3";
		Inventory.add(pl2);	
		Tool pl3 = bobsStore.orderTool("plumbing");
		pl3.toolName = pl3.toolDesc + " 4";
		Inventory.add(pl3);
		Tool pl4 = bobsStore.orderTool("plumbing");
		pl4.toolName = pl4.toolDesc + " 5";
		Inventory.add(pl4);
		
		//5 Concrete Tools
		Tool c0 = bobsStore.orderTool("concrete");
		c0.toolName = c0.toolDesc + " 1";
		Inventory.add(c0);
		Tool c1 = bobsStore.orderTool("concrete");
		c1.toolName = c1.toolDesc + " 2";
		Inventory.add(c1);
		Tool c2 = bobsStore.orderTool("concrete");
		c2.toolName = c2.toolDesc + " 3";
		Inventory.add(c2);
		Tool c3 = bobsStore.orderTool("concrete");
		c3.toolName = c3.toolDesc + " 4";
		Inventory.add(c3);
		Tool c4 = bobsStore.orderTool("concrete");
		c4.toolName = c4.toolDesc + " 5";
		Inventory.add(c4);
		
//		//Customer Carts
//		ArrayList<Tool> Bcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Pcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Lcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Scart = new ArrayList<Tool> ();
//		ArrayList<Tool> Rcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Hcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Fcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Gcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Kcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Dcart = new ArrayList<Tool> ();
//		ArrayList<Tool> Ncart = new ArrayList<Tool> ();
//		ArrayList<Tool> Zcart = new ArrayList<Tool> ();
		
		//Checked Out Hash Map 
		HashMap<Customer, ArrayList<Tool>> Out = new HashMap<>();
		Out.put(Brad, new ArrayList<Tool>());
		Out.put(Paul, new ArrayList<Tool>());
		Out.put(Larry, new ArrayList<Tool>());
		Out.put(Santos, new ArrayList<Tool>());
		Out.put(Rhonda, new ArrayList<Tool>());
		Out.put(Harry, new ArrayList<Tool>());
		Out.put(Florence, new ArrayList<Tool>());
		Out.put(Gary, new ArrayList<Tool>());
		Out.put(Kevin,  new ArrayList<Tool>());
		Out.put(Dan, new ArrayList<Tool>());
		Out.put(Norman, new ArrayList<Tool>());
		Out.put(Zach, new ArrayList<Tool>());
		
		ArrayList<Integer> checkout = new ArrayList<Integer>();
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		checkout.add(0);
		
		//Brad.getCheckoutTime();
		//checkout.add(0, 0);
		
		
//		List<Customer> names = new ArrayList<Customer>(Out.keySet());
		
		Random r = new Random();
////////////////////////////////////////////////////////////////////////////////////////
		
		//Instantiating Information Generator
		InfoGenerator generate = new InfoGenerator();
		
		//each day a random customer visits the store
		for (int days = 1; days<=35; days++) { 
			
			

			
			
			int counter12 = 0;
			for (Customer key : Out.keySet()) {
				System.out.println("ACTIVE RENTALS: " + key.getCustomerName() + " checked out: " + Out.get(key) + " checked out.");
				
				if (checkout.get(counter12).equals(0)) { //has no checkout time
					
					
					if (!Out.get(key).isEmpty()) { //does cart have items?

						
						for (int k=0; k<Out.get(key).size(); k++) {
							System.out.println();
							System.out.println( Out.get(key).get(k).toolName + " was returned.");
							System.out.println();
							
							//
						}
						generate.ret(Out.get(key), Inventory);
						Out.put(key,new ArrayList<Tool>());
					}
					
					
				}
			counter12++;	
			}
			System.out.println();
			System.out.println("Store Inventory: " + Inventory.size() + " items: " + Inventory);
			System.out.println();
			//DECREMENT EVERY ONE EVERYDAY
			
			for (int h=0; h<checkout.size(); h++) {
				if (checkout.get(h).equals(0)) {
					
				}
				else {
					int curr = checkout.get(h);
					curr = curr-1;
					checkout.add(h, curr);
					checkout.remove(h+1);
				}
			}
			
			
			System.out.println("Day " + days);
			System.out.println();
			
		
		if (Inventory.size()>3) { //if there are more than 3 tools
		Customer customer = new Customer("Abu");	
		ArrayList<Tool> cart = new ArrayList<Tool>();
		//random cart
		int keyC=0;
		int r1 = r.nextInt(Out.size());
		Out.get(r1);
		for (Customer key : Out.keySet()) {
			//System.out.println(key.getCustomerName());
			if(keyC == r1) {
				
				customer = key;
				
				
			}
			

				keyC++;
			}
		//System.out.println("R1: " + r1 + customer.getCustomerName());
		cart = Out.get(customer);
		
		

		
		cart = generate.cart(customer, Inventory); 
		
		
		Out.put(customer,cart);
		
		
		
		
		int item = cart.size()-1;
		int checkoutt = customer.getCheckoutTime();
		
		if(checkout.get(r1).equals(0)) { //if they don't have a checkouttime
			
		
			checkout.add(r1, checkoutt);	
			checkout.remove(r1+1);
		
		}
	
		else { //if they already have checkouttime so do nothing
			
			checkoutt = checkout.get(r1);
			
		
		}
		
		
		
		int r2 = new Random().nextInt(8);
		
		String info = generate.info(cart.get(item), r2, checkoutt); 
		

	System.out.println(customer.getCustomerType() + ": " + customer.getCustomerName() + " is renting '"  
		+ cart.get(item).toolName + "'. " + " The daily rate is: $" 
		+ cart.get(item).cost() + ". The Store made " + info);
	System.out.println();
	//System.out.println(cart);
	
	
		

	



		
		
//		System.out.println(customer.getCustomerType() + ": " + customer.getCustomerName() + " is returning '" +
//		cart.get(item).toolName + "'. ");
//		cart = generate.ret(cart, Inventory);
//		


}


		
	






	
		else {
			//System.out.println("Inventory Size: " + Inventory.size());
		}




}
}
}


