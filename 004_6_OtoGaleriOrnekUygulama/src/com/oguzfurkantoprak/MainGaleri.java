package com.oguzfurkantoprak;

public class MainGaleri {

	public static void main(String[] args) {
		
		//1. oto galeri nesnemiz:
		OtoGaleri kardeslerOtomotivGaleri = new OtoGaleri("Kardesler Otomotiv Galeri",5);
		
		Otomobil otomobil1 = new Otomobil("Opel","Corsa",2018, 12400, new Motor(1000,"WER12345", 7), 40);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil1);
		
		Otomobil otomobil2 = new Otomobil("Opel","Astra",2019, 15000, new Motor(1400,"GHT12345", 8), 45);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil2);
		
		Otomobil otomobil3 = new Otomobil("Audi","A2",2016, 11000, new Motor(1300,"SDG12345", 6), 40);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil3);
		
		Otomobil otomobil4 = new Otomobil("BMW","5.20",2018, 12000, new Motor(1800,"GJT12345", 8), 55);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil4);
		
		Otomobil otomobil5 = new Otomobil("BMW","3.20",2019, 13000, new Motor(1600,"ERT12345", 9), 50);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil5);
		
		Otomobil otomobil6 = new Otomobil("Ford","Fiesta",2011, 132000, new Motor(1600,"GHM12345", 6), 60);
		kardeslerOtomotivGaleri.galeriyeOtomobilEkle(otomobil6);
		
		kardeslerOtomotivGaleri.galeridekiOtomobilleriListele();
		
		System.out.println("Galerideki otomobil sayısı: " + kardeslerOtomotivGaleri.getGaleridekiOtomobilSayisi());
		
		System.out.println("İlk otomobil markası: " + kardeslerOtomotivGaleri.getOtomobilDizisi()[0].getMarka() +
				" /Motor Bilgileri: " + kardeslerOtomotivGaleri.getOtomobilDizisi()[0].getAracinMotoru().getAllMotorBilgileri());
		//kardeslerOtomotivGaleri nesnesinin içinde tutulan dizinin(otomobil dizisi) ilk elemanı olan otomobil nesnesinden
		//
		
		
		//2. oto galeri nesnemiz:
		OtoGaleri galeriMahmut = new OtoGaleri("Galeri Mahmut",100);
		Otomobil otomobil7 = new Otomobil("Fiat","Egea",2018, 12400, new Motor(1000,"WRU12345", 6), 40);
		galeriMahmut.galeriyeOtomobilEkle(otomobil7);
		Otomobil otomobil8 = new Otomobil("Renault","Clio",2020, 900, new Motor(1000,"HGT12345", 6), 40);
		galeriMahmut.galeriyeOtomobilEkle(otomobil8);
		
		galeriMahmut.galeridekiOtomobilleriListele();
		
		Otomobil otomobil9 = new Otomobil("Tofaş","Şahin",1999, 543400, new Motor(1000,"LKQ12345", 5), 40);
		galeriMahmut.galeriyeOtomobilEkle(otomobil9);
		
		galeriMahmut.galeridekiOtomobilleriListele();
		
		
		//Search örneği: !!
		System.out.println("\n\nSearch sonuçları: ****** ");
		Otomobil[] sonuclarDizi = kardeslerOtomotivGaleri.search("Opel");
		for (int i = 0; i < sonuclarDizi.length; i++) {
			System.out.println(sonuclarDizi[i].getAllOtomobilBilgileri());
		}
		System.out.println("\n\nForEach yapısı ile yapalım bir de... ");
		//for each yapısı dizilerde kullanılır!! bununla aynısını yapalım yukarıdakinin;
		//önce tip yazılır sonra değişken(referans) atanır : sonra da dizi adı yazılır for içine;
		for (Otomobil tempOtomobil : sonuclarDizi ) {
			System.out.println(tempOtomobil.getAllOtomobilBilgileri());
		}
		
		
		
	}

}
