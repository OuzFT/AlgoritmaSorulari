package com.oguzfurkantoprak;

public class MainGaleri {

	public static void main(String[] args) {
		

		// 1. OtoGaleri nesnemiz:
		//
		OtoGaleri kardeslerOtomotivGaleri = new OtoGaleri("Kardeşler Otomotiv Galeri", 5); 
		
		Otomobil otomobil1 = new Otomobil("Opel", "Corsa", 2018, 124000, new Motor(1000,"WGMOP123", 7), 40);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil1);		
				
		Otomobil otomobil2 = new Otomobil("Opel", "Astra", 2019, 114000, new Motor(1400,"WGMOP124", 9), 50);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil2);

		Otomobil otomobil3 = new Otomobil("Audi", "A2", 2019, 114000, new Motor(1400,"WGMOP125", 8), 50);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil3);

		Otomobil otomobil4 = new Otomobil("Audi", "Q3", 2018, 114000, new Motor(1500,"QGMOP125", 8), 55);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil4);
		
		Otomobil otomobil5 = new Otomobil("BMW", "5.20", 2019, 144000, new Motor(1500,"QGMOP127", 8), 70);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil5);
		
		Otomobil otomobil6 = new Otomobil("BMW", "3.20", 2018, 144000, new Motor(1500,"QG4OP127", 8), 55);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil6);
		
		kardeslerOtomotivGaleri.galeridekiOtomobilleriListele();
//		System.out.println("Galierdeki otomobil sayısı: " + kardeslerOtomotivGaleri.getGaleridekiOtomobilSayisi());
		
//		System.out.println("İlk otomobil marka: " + kardeslerOtomotivGaleri.getOtomobilDizisi()[0].getMarka() +
//							" motor bilgileri: " + kardeslerOtomotivGaleri.getOtomobilDizisi()[0].getAracinMotoru().getAllMotorBilgileri());
		
		
		
		// 2. OtoGaleri nesnemiz:
		//
		OtoGaleri galeriMahmut = new OtoGaleri("Galeri Mahmut", 100);
		Otomobil otomobil7 = new Otomobil("Fiat", "Agea", 2018, 114000, new Motor(1000,"WGMYP123", 8), 45);
		Otomobil otomobil8 = new Otomobil("Renault", "Clio", 2020, 74000, new Motor(1000,"WGMCP123", 5), 55);

		galeriMahmut.galeriyeOtomobilEkle(otomobil7);
		galeriMahmut.galeriyeOtomobilEkle(otomobil8);
		galeriMahmut.galeridekiOtomobilleriListele();
		
		
		Otomobil otomobil9 = new Otomobil("Tofaş", "Şahin", 1999, 574000, new Motor(1000,"YGMCP123", 5), 50);
		galeriMahmut.galeriyeOtomobilEkle(otomobil9);
		galeriMahmut.galeridekiOtomobilleriListele();
		
		
		
		// Search ....
		System.out.println("\n **** Search sonuçları **** \n");
		Otomobil[] sonuclarDizi = kardeslerOtomotivGaleri.search("audi");
		for (int i=0;i<sonuclarDizi.length;i++) {
			System.out.println(sonuclarDizi[i].getAllOtomobilBilgileri());
		}
		
		// { Audi A2, Audi Q3 }
//		for (Otomobil tempOtomobil : sonuclarDizi) {
//			System.out.println(tempOtomobil.getAllOtomobilBilgileri());
//		}
		
		
		// findCount
		System.out.println(kardeslerOtomotivGaleri.getGaleriAdi() + " galerisinde opel marka otomobilden : " + kardeslerOtomotivGaleri.findCount("opel") + " adet mevcut.");
		System.out.println(kardeslerOtomotivGaleri.getGaleriAdi() + " galerisinde opel marka otomobilden : " + kardeslerOtomotivGaleri.findCount("bmw") + " adet mevcut.");
		System.out.println(galeriMahmut.getGaleriAdi() + " galerisinde Fiat marka otomobilden : " + galeriMahmut.findCount("fiat") + " adet mevcut.");
		
		
	}

}
