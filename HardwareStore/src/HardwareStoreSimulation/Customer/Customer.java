package HardwareStoreSimulation.Customer;


public class Customer {
	
    protected String name;
	protected String type;
    protected int checkoutTime;
    protected int toolsOut;
	
    public Customer(String name) {
        this.name = name;
    }
    public String getCustomerName() {
        return this.name;
    }
      public String getCustomerType() {
        return this.type;
    }
      
      public int getCheckoutTime() {
    	  return this.checkoutTime;
      }
      
      public int toolsOut() {
    	  return this.toolsOut;
      }
}
