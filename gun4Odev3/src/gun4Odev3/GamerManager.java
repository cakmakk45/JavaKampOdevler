package gun4Odev3;

public class GamerManager {
	public void register(Gamer gamer) {
		System.out.println("Kay�t Ba�ar�l� : "+ gamer.getFirstName()+ " "+gamer.getLastName().toUpperCase());
		
	}
	public void update(Gamer gamer) {
		System.out.println("Bilgiler G�ncellendi");
		System.out.println("*********************");
		System.out.println("Kullan�c� Ad� soyad� : "+ gamer.getFirstName()+" "+gamer.getLastName().toUpperCase());
		System.out.println("Kullan�c� Do�um y�l� :"+gamer.getBirthYear());
		System.out.println("Kullanc� Tc No :"+ gamer.getNationalIdentty());
	}
	public void delete(Gamer gamer) {
		System.out.println("Silme ba�ar�l� : "+ gamer.getFirstName()+" "+gamer.getLastName().toUpperCase());
	}

}
