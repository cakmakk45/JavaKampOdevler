package gun4Odev3;

public class SellManager {
	public void sell(Gamer gamer, Game game) {
		Sell sell = new Sell(1,gamer.getFirstName()+""+gamer.getLastName().toUpperCase(),game.getName());
		System.out.println(game.getName()+ "�simli oyun "+ gamer.getFirstName() + " "+ gamer.getLastName().toUpperCase()+" taraf�ndan "+ "%" + game.getCampaignAmount()+" indirimle"+game.getPriceBeforeCampaign()
		+" Tl kar��l���nda sar�n al�nd�. ");
		
		System.out.println("Sat�� bilgileri");
		System.out.println("*****************");
		System.out.println("Sat�� Id : "+ sell.getId());
		System.out.println("Sat�lan oyun :" + sell.getGameName());
		System.out.println("Sat�n Alan : "+ sell.getGamerName());
	}

}
