package gun3Odev1;

public class InstructorManager extends BaseClassManager{

	@Override
	public void add(BaseClass user) {
		System.out.println("E�itmen eklendi : "+ user.getFirstName()+" "+user.getLastName().toUpperCase());
		System.out.println("*****************************");
	}
}
