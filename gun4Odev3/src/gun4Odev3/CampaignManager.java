package gun4Odev3;

public class CampaignManager {
	public void add(Campaign campaign) {
		System.out.println("Yeni Kampanya sisteme eklendi :" + campaign.getCampaignName());
	}
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi : " + campaign.getCampaignName());
	}
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi :" +campaign.getCampaignName());
		System.out.println("Kampanyan�n yeni bilgileri :");
		System.out.println("Kampanyan�n Ad� : "+ campaign.getCampaignName());
		System.out.println("Kampanya Miktar� : "+campaign.getCampaignAmount());
	}

}
