package gun3Odev1;

public class StudentManager extends BaseClassManager {

	@Override
	public void add(BaseClass user) {
		System.out.println("��renci Eklendi : "+ user.getFirstName()+" "+ user.getLastName().toUpperCase());
		System.out.println("**************");
	}
}
