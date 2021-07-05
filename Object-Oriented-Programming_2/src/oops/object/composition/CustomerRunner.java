package oops.object.composition;

public class CustomerRunner {

	//To understand object composition
	
	public static void main(String[] args) {
		Address homeAddress=new Address("Parappukkara","Thrissur","680312");
		Customer customer=new Customer("Resh",homeAddress);
		Address workAddress=new Address("Kochi","Ernakulam","680310");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
