package gun3Odev1;

public class BaseClassManager {
	public void add(BaseClass user) {
		System.out.println("Kullan�c� eklendi : "+ user.getFirstName()+" "+ user.getLastName().toUpperCase());
		System.out.println("*************************************");
	}

}
