package HardwareStoreSimulation.Tool.Decorators;

import HardwareStoreSimulation.Tool.Tool;

public class ExtensionCord extends Addon{
	Tool tool; //instantiate ExtensionCord with reference to Tool.

	public ExtensionCord(Tool tool) {
		this.tool = tool;
	}
	
	public String desc() {
		return tool.desc() + ", with ExtensionCord";
	}
	
	public double cost() {
		return tool.cost() + 1.0;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}

}