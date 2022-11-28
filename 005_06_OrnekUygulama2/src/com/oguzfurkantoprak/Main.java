package com.oguzfurkantoprak;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//1. sınıfımızı oluşturalım öğrenci kaydedelim;
		Sinif sinif1 = new Sinif("1D", "Zemin Kat 103 nolu oda");
		sinif1.sinifaOgrenciEkle("Kaan","Gök",800,0);
		sinif1.sinifaOgrenciEkle("Tahsin","Yanar",801,0);	
		sinif1.siniftakiOgrencilerinListesiniYazdir();
		
		//2. sınıfımızı oluşturalım öğrenci kaydedelim;
		Sinif sinif2 = new Sinif("1C", "Zemin Kat 102 nolu oda");
		sinif2.sinifaOgrenciEkle("Ali","Kaya",700,0);
		sinif2.sinifaOgrenciEkle("Turan","Alp",701,0);	
		sinif2.sinifaOgrenciEkle("Ahmet","Barış",702,0);
		sinif2.siniftakiOgrencilerinListesiniYazdir();
		
		Okul okul1 = new Okul ("Atatürk İlkokulu", "Falan filan sokak mahalle Ankara");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);	
		okul1.siniflariYazdir();
		
		okul1.okuldakiOgrencileriYazdır();
		okul1.okuldakiOgrencileriYazdırForEach();
		
		
		//toString konusu:!!
		Ogrenci ogr = new Ogrenci("John","Nash",300,0);
		System.out.println(ogr);// ram'deki heapteki adresi verir
		//Java otomatik olarak toString koyuyor yukarıdakine. System.out.println(ogr.toString());
		//tüm sınıfların atası olan obbject sınıfındaki toString metodunu çağırır.
		//istediğimizi yazmak için toString metodunu override etmeliyiz Ogrenci sınıfında...
		System.out.println(ogr);
		
		
	}

}
