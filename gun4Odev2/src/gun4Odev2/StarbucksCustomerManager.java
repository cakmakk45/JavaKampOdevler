package gun4Odev2;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Starbucks kullan�c�s� veritaban�na kaydoldu : "+ customer.getFirstName());
			return;
		}else{
			System.out.println("Kullan�c� do�rulama i�lemi ba�ar�s�z");
		}
		
	}

}
