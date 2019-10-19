package HardwareStoreSimulation.Customer;

public class Business extends Customer {

	public Business(String name) {
		super(name);
		this.type = "Business";
		this.checkoutTime = 7;
		this.toolsOut = 3;
	}
}
