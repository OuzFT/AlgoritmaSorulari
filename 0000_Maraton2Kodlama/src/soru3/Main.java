package soru3;

public class Main {

	public static void main(String[] args) {


		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		Aslan aslan1 = new Aslan("Simba", 100, 120, true);
		Yilan yilan1 = new Yilan("Terminator",40, 225, true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan1);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan1);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50, false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 220, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kertilenkele", 2, 35, false));
		System.out.println("\n-+--+--+-+-+-+-+-+-");
		hayvanatBahcesi.hayvanSesCikar(yilan1);
		hayvanatBahcesi.hayvanSesCikar(aslan1);
		System.out.println("\n-+--+--+-+-+-+-+-+-");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Kertilenkele");
		
		
		
		
	}

}
