package com.oguzfurkantoprak;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ogrenci ogrenci1 = new Ogrenci ("Ahmet","Emre",450,0);
		Ogrenci ogrenci2 = new Ogrenci ("Ali","Kaya",451,0);
		Ogrenci ogrenci3 = new Ogrenci ("Zeynep","Su",452,0);
		Ogrenci ogrenci4 = new Ogrenci ("Fatma","Çelik",453,0);
		
		Sinif sinif1 = new Sinif("1A", "Zemin Kat 100 nolu oda", new ArrayList<Ogrenci>());
		sinif1.getOgrencilerArrayList().add(ogrenci1);
		sinif1.getOgrencilerArrayList().add(ogrenci2);
		sinif1.getOgrencilerArrayList().add(ogrenci3);
		sinif1.getOgrencilerArrayList().add(ogrenci4);
		
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		//2. sınıfımızı oluşturalım öğrenci kaydedelim;
		ArrayList<Ogrenci> ogrencilerList = new ArrayList<Ogrenci>();
		Ogrenci ogrenci5 = new Ogrenci ("Fatoş","Emre",550,0);
		Ogrenci ogrenci6 = new Ogrenci ("Semih","Kaya",551,0);
		Ogrenci ogrenci7 = new Ogrenci ("Alper","Su",552,0);
		ogrencilerList.add(ogrenci5);	
		ogrencilerList.add(ogrenci6);
		ogrencilerList.add(ogrenci7);
		Sinif sinif2 = new Sinif("1B", "Zemin Kat 101 nolu oda", ogrencilerList);
		
		sinif2.siniftakiOgrencilerinListesiniYazdir();
		
		//3. sınıfımızı oluşturalım öğrenci kaydedelim;
		Ogrenci ogrenci8 = new Ogrenci ("Umut","Alp",650,0);
		Ogrenci ogrenci9 = new Ogrenci ("Oğuz","Şahin",651,0);
		Sinif sinif3 = new Sinif("1C", "Zemin Kat 102 nolu oda");
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		
		sinif3.siniftakiOgrencilerinListesiniYazdir();
		
		//4. sınıfımızı oluşturalım öğrenci kaydedelim;
		Sinif sinif4 = new Sinif("1D", "Zemin Kat 103 nolu oda");
		sinif4.sinifaOgrenciEkle("Kaan","Gök",800,0);
		sinif4.sinifaOgrenciEkle("Tahsin","Yanar",801,0);
		
		sinif4.siniftakiOgrencilerinListesiniYazdir();
		
	}

}
