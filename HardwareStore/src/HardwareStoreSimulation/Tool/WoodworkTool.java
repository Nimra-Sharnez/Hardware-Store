package HardwareStoreSimulation.Tool;

public class WoodworkTool extends Tool{

	
    public WoodworkTool() {
        toolDesc = "WoodworkTool";

    }
    
    public double cost() {
    	return 8.00;
    }

    public int id() {
    	return 2;
    }
}