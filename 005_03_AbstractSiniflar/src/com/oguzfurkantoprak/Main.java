package com.oguzfurkantoprak;

public class Main {

	
	public static void hayvani3KezKonustur(Hayvan h) { // static yaptık main classta olduğumuz için yoksa nesne türetmemiz gerekirdi
		h.sesCikar();
		h.sesCikar();
		h.sesCikar();
	}
	
	public static void hayvani2KezBesle(Hayvan hayvan) {
		hayvan.yemekYe();
		hayvan.yemekYe();
	}
	
	
	public static void main(String[] args) {
		
//		Hayvan hayvan = new Hayvan("hayvan adı", 5,50);
//		hayvan.sesCikar();
		//yukarıdakini istemiyoruz böyle bir nesne türetmemizin anlamı yok. 
		//Bu yüzden bu sınıf abstract/soyut sınıf olmalı.
		//Hayvan sınıfını türetmemizin amacı ortak özellikleri ata sınıfta toplamak (inheritance)
		//Abstract sınıftan new ile nesne oluturamayız!!!!!
		
		Kopek kopek = new Kopek("Karabaş", 5, 42);
		System.out.println(kopek.getAd()+" "+kopek.getKilosu()+" "+kopek.getUzunlugu());
//		kopek.sesCikar();
		
		Hayvan hayvan; // hayvan tipinde nesne referansı oluşturabiliriz!
		//hayvan = new Hayvan ("ewrse",2,3);
		// new ile türetme hata verir nesne referansı tanımladık yukarıda ama nesne oluşturamayız soyut sınıflarda
		hayvan = new Kedi("Tekir",3,33); // ama bu değişkenle/nesne referansıyla polymorphism yapabiliriz!
		hayvan = new Kus("Çıtır",1,12);
		
		Main.hayvani3KezKonustur(hayvan); // polymorphism uygulayabiliriz.
		Main.hayvani3KezKonustur(kopek); 
		// hayvanın alt sınıfı tipinde bir değişken göndererek polymorphism uygulayabiliriz.		
		Main.hayvani2KezBesle(kopek);
		
		Kedi kedi = new Kedi("Sylvester", 3, 34);
		Main.hayvani2KezBesle(kedi);
		
		
		
			
	}

}
