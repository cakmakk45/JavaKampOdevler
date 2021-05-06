package gun5Odev1.dataAccess.concretes;

import java.util.ArrayList;

import gun5Odev1.dataAccess.abstracts.UserDao;
import gun5Odev1.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	private ArrayList<User>users;
	
	public InMemoryUserDao(ArrayList<User>users) {
		this.users = users;
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println("Kullan�c� eklendi :" + user.getEmail());
		
	
	}

	@Override
	public void login(User user) {
		System.out.println("Giri� Ba�ar�l� "+ user.getEmail());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(" Kullan�c� Silme i�lemi ba�ar�l� : " + user.getEmail());
		
	}

	@Override
	public User getByMail(String mail) {
		for(User user: users) {
			if(user.getEmail().equals(mail)) {
				return user;
			}
			
		}
		return null;
	}

}
