package POJOpackage;

public class Customer {

	String customerFirstName;
	String customerLastName;
	String accountID;
	String id;	
	CustomerAddress[] address;
	//CustomerAddress address;
	

	/*public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}*/

	public CustomerAddress[] getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress[] address) {
		this.address = address;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCustomerAddress(CustomerAddress address2) {
		// TODO Auto-generated method stub
		
	}

}
