package gun4Odev2;

public class NeroCustomerManager extends BaseCustomerManager  {
	public void Save(Customer customer) {
		System.out.println("Nero kullan�c�s� veri taban�na kaydedildi :" + customer.getFirstName() + " " + customer.getLastName());
	}

}
