package HardwareStoreSimulation.Tool.Decorators;

import HardwareStoreSimulation.Tool.Tool;

public class AccessoryKit extends Addon {
	Tool tool;

	public AccessoryKit(Tool tool) {
		this.tool = tool;
	}
	
	public String desc() {
		return tool.desc() + ", with AccessoryKit";
	}
	
	public double cost() {
		return tool.cost() + 10.0;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
}
