package com.oguzfurkantoprak;

public class Main {

	
	public void hayvani3KezKonustur(Hayvan h) // nonstatic method ile de yapalım. parametre olarak ata sınıfı almalı.
	{
		System.out.println("\n ---- Hayvan 3 kez konusuyor ----");
		h.sesCikar();
		h.sesCikar();
		h.sesCikar();
	}
	
	
	public static void main(String[] args) { 
		
		Kedi tekir = new Kedi("Tekir", 3, 30);
		//method overriding ile sesCikar metodunu kullanalım...
		System.out.println(tekir.getAd());
		tekir.sesCikar();
		
		Kopek karabas = new Kopek("Karabas", 7, 70);
		karabas.sesCikar();
		
		Kus tweety = new Kus("Tweety", 1, 10);
		tweety.sesCikar();
		
		
		// Polymorphism ile sesCikar metodunu kullanalım...
		//
		Hayvan hayvan;
		hayvan = new Kedi("Sylvester", 4, 52);
		
		System.out.print("\nSylvester ses çıkarıyor: ");
		hayvan.sesCikar();
		
		hayvan = new Kopek("Lassie", 5, 71);
		System.out.print("\nLassie ses çıkarıyor: ");
		hayvan.sesCikar();
		
		
		Main main = new Main(); // en yukarıdaki nonstatic methodu(hayvani3KezKonustur) çağırmak için main sınıfından nesne türetmeliyiz.
		main.hayvani3KezKonustur(tekir);
		main.hayvani3KezKonustur(karabas);
		main.hayvani3KezKonustur(tweety);
		
	}

	
	

	
}
