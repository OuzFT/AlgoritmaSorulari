package com.oguzfurkantoprak;

public class Main {

	public static void main(String[] args) {
		
		Anahtar anahtar1 = new Anahtar(); // Anahhtar classından/sınıfından anahtar1 anahtar2 gibi objeler(nesneler) türetelim (new)
		anahtar1.renk = "Kırmızı";
		anahtar1.ad = "Babamın anahtarı";
		anahtar1.no = 101;
		
		Anahtar anahtar2 = new Anahtar();
		anahtar2.renk = "Mavi";
		anahtar2.ad = "Annemin anahtarı";
		anahtar2.no = 102;
		
		Anahtar anahtar3 = new Anahtar();
		anahtar3.renk = "Bordo";
		anahtar3.ad = "Kardeşimin anahtarı";
		anahtar3.no = 103;
		
//		System.out.println(anahtar1.ad + " " + anahtar1.renk + " " + anahtar1.no);
//		System.out.println(anahtar2.ad + " " + anahtar2.renk + " " + anahtar2.no);
//		System.out.println(anahtar3.ad + " " + anahtar3.renk + " " + anahtar3.no);
//		
//		System.out.println(Anahtar.uzunluk); // static üye değişkenleri (ClassAdı.değişkenAdı) şeklinde yazıyorduk,unutma!
		
//		anahtar1.bilgileriEkranaYaz();
//		anahtar2.bilgileriEkranaYaz();
//		anahtar3.bilgileriEkranaYaz();

		Anahtar[] anahtarDizisi = { anahtar1, anahtar2, anahtar3}; //String dizisi gibi bir anahtar dizisi
		for(int i=0;i<anahtarDizisi.length;i++) {
			anahtarDizisi[i].bilgileriEkranaYaz();
		}
			
		Anahtar.uzunluguEkranaYaz(); // classadı.static metod adı
		anahtar1.uzunluguEkranaYaz(); // uyarı vermesinin sebebi uzunluk değişkeninin sınıfa ait static bir değer olması.
										// Yani tüm anahtarlar için aynıdır.
		
		
	}

}
