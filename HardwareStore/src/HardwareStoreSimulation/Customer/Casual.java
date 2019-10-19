package HardwareStoreSimulation.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Casual extends Customer {
    List<Integer> givenList = Arrays.asList(1, 2);

    
    Random rand = new Random();
    int time = givenList.get(rand.nextInt(givenList.size()));
    int out = givenList.get(rand.nextInt(givenList.size()));
    
	public Casual(String name) {
		super(name);
		this.type= "Casual";
		this.checkoutTime = time; // time * tool.price = how much pay upfront
		this.toolsOut = out; 
		
	}
}
