package gun4Odev2;

public class Main {

	public static void main(String[] args) {
	
		Customer melike= new Customer(1,"Melike","�ztekin",1996, "156561635565");
		Customer kadriye= new Customer(2,"kadriye","�akmak",1998,"47002570308");
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.Save(kadriye);
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		starbucksCustomerManager.Save(kadriye);
		

	}

}
