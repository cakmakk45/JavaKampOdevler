package gun5Odev1;

import java.util.ArrayList;
import java.util.Scanner;

import gun5Odev1.business.concretes.UserManager;
import gun5Odev1.core.googleAuthManagerAdapter.GoogleAuthManagerAdapter;
import gun5Odev1.dataAccess.concretes.InMemoryUserDao;
import gun5Odev1.entities.concretes.User;
import gun5Odev1.googleAuth.googleAuthManager.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("1 - Giri� yap \n2 - Kay�t Ol");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
		int selection = scanner.nextInt();
		if(selection == 1) {
			
			
			System.out.println("1 - Google \n2 - Mail & Password");
			Scanner sc = new Scanner(System.in);
			System.out.println("Giri� y�ntemi se�iniz : ");
			int selection2 = sc.nextInt();
			if(selection2 == 1) {
				User user = new User();
				user.setEmail("cakmakkadriye45@gmail.com");
				User user2 = new User();
				user2.setEmail("cakmakkadriye45@gmail.com");
				user2.setPassword("123456");
				
				UserManager userManager = new UserManager(new GoogleAuthManagerAdapter(new GoogleAuthManager()));
				userManager.login(user);
				userManager.login(user2);
			}else if(selection2 == 2) {
				User user = new User();
				user.setEmail("cakmakkadriye45@gmail.com");
				User user2 = new User();
				user2.setEmail("cakmakkadriye45@gmail.com");
				user2.setPassword("123456");
				
				ArrayList<User> users = new ArrayList<>();
				UserManager userManager = new UserManager(new InMemoryUserDao(users));
				userManager.login(user);
				userManager.login(user2);
			}
		}
		else if(selection == 2) {
			
			ArrayList<User> users = new ArrayList<>();
			UserManager userManager = new UserManager(new InMemoryUserDao(users));
			User user = new User(2, "Kadriye", "�akmak", "cakmakkadriye45@gmail.com", "115566");
			User user2 = new User(2, "Melike", "�ztekin", "cakmakkadriye45@gmail.com", "115566");
			userManager.register(user);
			userManager.register(user2);
		}
		

	}

}
