package gun5Odev1.googleAuth.googleAuthManager;

import gun5Odev1.entities.concretes.User;

public class GoogleAuthManager {

	public void register(User user) {
		System.out.println("Kullan�c� google ile eklendi : "+ user.getName()+" "+user.getSurname().toUpperCase());
	}
	
	public void login(User user) {
		System.out.println("Kullan�c� google ile giri� yapt� : "+ user.getEmail());
	}
}
