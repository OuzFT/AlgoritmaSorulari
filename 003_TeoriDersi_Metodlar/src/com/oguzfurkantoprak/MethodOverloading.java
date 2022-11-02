package com.oguzfurkantoprak;

public class MethodOverloading {

	
	//örnek metod:
	
	public static int topla(int sayi1, int  sayi2) {
		int sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	// Aynı isimde ve aynı tip ve sayıda parametreleri olan 2 metod aynı sınıf içinde bulunamaz.
	
	public static double topla(double sayi1, double sayi2) {
		double sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	// Aşağıdaki kullanımlar hata vermez ama yanlıştır
	public static void musteriKaydet() {}
	public static void Save() {}
	public static void satisKaydet() {}
	//...
	
	// Aşağıdaki kullanım doğrudur:(overloading yaparak)
	public static void Save(Musteri musteri) {}
	public static void Save(Stok stok) {}
	public static void Save(Satis satis) {}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
