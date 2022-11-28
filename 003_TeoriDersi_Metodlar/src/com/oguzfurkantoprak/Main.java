package com.oguzfurkantoprak;

import com.alikayaornek.YardimciSinif;
import com.alikayaornek.YardimciSinif2;

public class Main {

	// Metodlar/fonksiyonlar

	// public => Access modifier (Erişim belirleyici):
	// public: bütün packageların kullanımına açık
	// protected: sadece aynı package içi kullanıma açık
	// private: sadece bulunduğu sınıf içi kullanıma açık

	//static => (zorunlu değil) static olduğu zaman nesneden bağımsız sınıfla alakalı. 
	//Static metodların hepsi program çalışır çalışmaz adreslenir. Static olmazsa idi memorydeki adresi nesne oluşunca oluşacaktı
	
	//final => (zorunlu değil) metodun başına gelirse override edilemez anlamına gelir.(OOP'da göreceğiz.)
	//sınıfın başına gelirse o sınıftan sınıf türetilemez anlamına gelir.
	//final keywordunu daha çok değişkenlerde kullanırız.
	final static double PI = 3.14;
	
	//return type: zorunludur. Hiçbir şey return etmeyecekseniz void yazmalısınız!!! int dönecekse int yazılmalı vs...
	
	//son olarak metod ismi yazılır (helloWorld):
	//() parantezler içine istersen parametre yazabbilirsin opsiyonel. bu örnekte parametre yok.
	// metodumuz {} içerisine yazılmalıdır.
	
	//sonuç olarak aşağıdaki gibi bir kombinasyon çıkar metod yazılır.
	public static final void helloWorld() {
		System.out.println("hello world");
	}

	//örnek metod: // metodlar main metodun içine yazılmaz!!
	private static int kareAl(int sayi) {
		int sonuc; // sonuc lokal bir değişkendir.Sadece metodun içinde görünür.
		sonuc =sayi*sayi;
		return sonuc;
	}
	
	//dikdörtgenin alanını hesaplayan metod:
	private static int dikdortgenAlanHesapla (int kisaKenar,int uzunKenar) {
		int alan = kisaKenar * uzunKenar;
		return alan;
	}
	
	public static void main(String[] args) {

		helloWorld(); // Metod çağırımı/kullanımı denir.
		Main.helloWorld(); //static metodlar bu şekilde de çağırılabilir.
		
		// helloYardimci(); aynı package içinde olmadığı için alikayanın metodunu çağıramıyoruz.
		

		//import etmeden şöyle çağırabiliriz: farklı paketteki static metodların kullanımı: 1. yol	
		com.alikayaornek.YardimciSinif.helloYardimci();
		
		// ya da o paketteki o classı import ederiz: 2. yol 
		YardimciSinif.helloYardimci();
		
		
		// YardimciSinif.merhaba(); // görememe sebebi merhaba metodunun private olmasıdır.
		
		//------------
		//metod kullanımı:
		//1. kullanım:
		int karesi;
		karesi = Main.kareAl(5); //kareAl(5); diye de yazabiliriz. Neden main. yazdık: sınıf ismi: static method 
		System.out.println(karesi);
		
		//2. kullanım:	
		System.out.println(Main.kareAl(5));
		
		//dikdörtgenin alanını hesapla;
		System.out.println(dikdortgenAlanHesapla(5,10));
	}

}
