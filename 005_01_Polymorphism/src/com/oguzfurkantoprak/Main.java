package com.oguzfurkantoprak;

public class Main {

	
	// POLYMORPHISM (ÇOK BİÇİMLİLİK)
	//
	// Bir nesne referansının(değişkeninin) farklı nesneler gibi davranabilmesidir.
	
	public static void yeniMaasiHesapla(Personel personel)
	{
		// tüm child sınıflar için tek tek metod yazmak yerine ata sınıf için yazarak hepsi için yapmış oluruz.
		System.out.println(personel.getZamKatSayisi() * personel.getMaas());
	}
	
	
	// --------
//	
//	public static void yeniMaasiHesapla(Muhendis muhendis) {		
//		System.out.println(muhendis.getZamKatSayisi() * muhendis.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(Mudur mudur) {		
//		System.out.println(mudur.getZamKatSayisi() * mudur.getMaas());
//	}
//	
//	public static void yeniMaasiHesapla(Sekreter sekreter) {		
//		System.out.println(sekreter.getZamKatSayisi() * sekreter.getMaas());				
//	}
//
//	public static void yeniMaasiHesapla(DaireBaskani daireBaskani) {		
//		System.out.println(daireBaskani.getZamKatSayisi() * daireBaskani.getMaas());				
//	}
//
//	public static void yeniMaasiHesapla(IdariMemur idariMemur) {		
//		System.out.println(idariMemur.getZamKatSayisi() * idariMemur.getMaas());				
//	}
	
	
	
	public static void main(String[] args) {
		
//		Muhendis m = new Muhendis("Ahmet", "Emre", "11", 0, 10000, 0, 0, "Makine Müh.");
//		Main.yeniMaasiHesapla(m);
//		
//		Sekreter s = new Sekreter("Zeynep", "Emre", "11", 0, 10000, 0, 0, 111L, 222L);
//		Main.yeniMaasiHesapla(s);
		
		// --------
		// Polymorphism:
		//
		Mudur mudur = new Mudur("Zeynep", "Emre", "11", 0, 30000, 0, 0, "Yazılım Müdürü", 1112233L);
		Main.yeniMaasiHesapla(mudur);
		
		Muhendis muh = new Muhendis("Ahmet", "Emre", "11", 0, 10000, 0, 0, "Makine Müh.");
		Main.yeniMaasiHesapla(muh);
		
		Sekreter s = new Sekreter("Zeynep", "Emre", "11", 0, 10000, 0, 0, 111L, 222L);
		Main.yeniMaasiHesapla(s);
		
		// Polymorphism için ust sınıftan türemesi lazım kullanılacak olan nesne değişkeninin
		// Aksi takdirde çalışmaz.
		GenelMudur genelMudur = new GenelMudur("Kazım", "Taş", "2233", 0, 45000, 0, 0);
//		Main.yeniMaasiHesapla(genelMudur);  => Çalışmaz, çünkü GenelMudur sınıfı Personel sınıfından türetilmemiştir !
	}

}
