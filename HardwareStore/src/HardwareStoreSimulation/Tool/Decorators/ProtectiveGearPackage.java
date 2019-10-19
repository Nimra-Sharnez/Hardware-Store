package HardwareStoreSimulation.Tool.Decorators;

import HardwareStoreSimulation.Tool.Tool;

public class ProtectiveGearPackage extends Addon {

	Tool tool;
	
	public ProtectiveGearPackage(Tool tool) {
		this.tool = tool;
	}
	
	public String desc() {
		return tool.desc() + ", with ProtectiveGearPackage";
	}
	
	public double cost() {
		return tool.cost() + 7.0;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}
}
