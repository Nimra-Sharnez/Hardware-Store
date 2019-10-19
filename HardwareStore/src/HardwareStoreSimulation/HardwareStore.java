package HardwareStoreSimulation;


import java.util.ArrayList;

import HardwareStoreSimulation.Tool.Tool;

//the client of factory, goes through Simple Hardware Factory to get instance of tool
public abstract class HardwareStore { 
	
	public Tool orderTool(String type) { //has no idea what type of tool we are creating
		Tool tool;
		
		tool = createTool(type);
		
		return tool;
	}
	protected abstract Tool createTool(String type); //all resp. for instantiating Tools has been moved into a method that acts as a factory
	public String toString(ArrayList<Tool> list) {
		// TODO Auto-generated method stub
		return null;
	}
}