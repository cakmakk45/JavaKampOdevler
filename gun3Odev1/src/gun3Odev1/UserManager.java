package gun3Odev1;

public class UserManager extends BaseClassManager{

	@Override
	public void add(BaseClass user) {
		System.out.println("Kullan�c� Eklendi :"+user.getFirstName()+" "+user.getLastName().toUpperCase());
		System.out.println("*************************");
	}
	public void Login(User user) {
		System.out.println("Giri� Yap�ld� : "+ user.getEmail());
	}
	public void Logout(User user) {
		System.out.println("��k�� Yap�ld� : "+ user.getEmail());
	}
}
