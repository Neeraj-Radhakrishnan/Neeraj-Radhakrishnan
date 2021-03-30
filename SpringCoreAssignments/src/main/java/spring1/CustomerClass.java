package spring1;

public class CustomerClass {
	private String customerId, customerName, customerContact; 
	private AddressClass customerAddress; // note this always.. u have defined the data type in address class no need to define it again
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContanct) {
		this.customerContact = customerContanct;
	}
	public AddressClass getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress( AddressClass customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void display() {
		System.out.println("Customer ID : " +getCustomerId());
		System.out.println("Customer Name : " +getCustomerName());
		System.out.println("Customer Contact : " +getCustomerContact());
		System.out.println("Customer Address : "
				+ "\n Street : "+ getCustomerAddress().getStreet()+ 
				" \n City : " + getCustomerAddress().getCity()+
				" \n State : " + getCustomerAddress().getState()+
				" \n Zipcode : " + getCustomerAddress().getZip()+
				" \n Country : " + getCustomerAddress().getCountry());// we can use customerAddress instead of getCustomerAddress
	}

}
