package prog1_4_5;

public class Customer {

	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	
	
	
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	}
	
	





	public String getFirstName() {
		return firstName;
	}







	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}







	public String getLastName() {
		return lastName;
	}







	public void setLastName(String lastName) {
		this.lastName = lastName;
	}







	public String getSocSecurityNum() {
		return socSecurityNum;
	}







	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}







	public Address getBillingAddress() {
		return billingAddress;
	}







	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}







	public Address getShippingAddress() {
		return shippingAddress;
	}







	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}







	@Override
	public String toString() {
		return  "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
	}







	public static void main(String[] args) {
		Customer  c1= new Customer("a1","b1","332-221-1111");
		Address c1Add =new Address("beijing street","Beijing","Beijing","52557");
		c1.setBillingAddress(c1Add);
		c1.setShippingAddress(c1Add);
		
		Customer  c2= new Customer("a2","b2","332-221-2222");
		Address c2Add = new Address("Chicago street","Chicago","Illinois","32557");
		c2.setBillingAddress(c2Add);
		c2.setShippingAddress(c2Add);
		
		Customer  c3= new Customer("a3","b3","332-221-3333");
		Address c3Add= new Address("NewYork street","NewYork","New York","12557");
		c3.setBillingAddress(c3Add);
		c3.setShippingAddress(c3Add);
		
		Customer[] cs= new Customer[3];
		cs[0]=c1;cs[1]=c2;cs[2]=c3;
		
		for(Customer c: cs) if(c.getBillingAddress().getCity()=="Chicago") System.out.println(c);
		

	}

}
