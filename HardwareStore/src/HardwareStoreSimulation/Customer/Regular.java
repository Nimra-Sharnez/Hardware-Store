package HardwareStoreSimulation.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Regular extends Customer{
	
    List<Integer> givenList = Arrays.asList(3, 4, 5);
    List<Integer> outTools = Arrays.asList(1, 2, 3);
    
    Random rand = new Random();
    int time = givenList.get(rand.nextInt(givenList.size()));
    int out = outTools.get(rand.nextInt(outTools.size()));
    
	  public Regular(String name) {
	      super(name);
	      this.type = "Regular";
	      this.checkoutTime = time;
	      this.toolsOut = out;
	  }
	  
	}

