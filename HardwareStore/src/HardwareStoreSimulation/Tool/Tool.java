package HardwareStoreSimulation.Tool;


//The product of the factory; Tool!
//defined as an abstract class with some implementations that could be overridden
public abstract class Tool {

    public String toolName;
    public String toolDesc = "Unknown Tool";

    public String desc() {
    	return toolDesc;
    }
	public abstract double cost();
	public abstract int id();
	
	






}
