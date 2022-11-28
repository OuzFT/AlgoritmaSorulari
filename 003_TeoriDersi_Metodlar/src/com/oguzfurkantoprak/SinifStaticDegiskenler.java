package com.oguzfurkantoprak;

import com.alikayaornek.YardimciSinif;

public class SinifStaticDegiskenler {

	// bunlara sınıfların üye değişkenleri denir:
	public static final int dunyaninYaricapi = 6371; // km
	public static int x = 5;
	protected static int CAP = 2222; //km.
	public static int aktifKullaniciSayisi = 0;
	
	public static void main(String[] args) {
		// Javada global değişken yoktur.
		// ancak her sınıfın üye değişkenleri vardır.
		// siz bunları public ve static yaparsanıız herkes bunları kullanabilir.
		// tıpkı global değişkenler gibidir ama adı global değişken değildir.

		SinifStaticDegiskenler.x++;
		SinifStaticDegiskenler.x = 3;
		int x=7;
		System.out.println("***: "+ SinifStaticDegiskenler.x);
		System.out.println("***: "+ x);
		
		System.out.println(SinifStaticDegiskenler.dunyaninYaricapi); // teamül: classadı.değişkenadı`
		
		System.out.println(com.alikayaornek.YardimciSinif.mesafe());
		System.out.println(SinifStaticDegiskenler.CAP);
		System.out.println(CAP);// aynı sınıfta olduğumuz için bööyle de yazılır.
		
		YardimciSinif.kullaniciSayisiArtir();
		System.out.println(aktifKullaniciSayisi);
		
		
		// KURAL:
		//
		//Static olmayan metodları static metodlar içinde direk çağıramazsınız !
		//main metodu bir static metoddur.
		//SinifStaticDegiskenler.staticOlmayanMetod(); // çağıramıyoruz hata veriyor
		
		
	}
	
	public void staticOlmayanMetod () {
		System.out.println("static olmayan üye metoddur bu. static metod içine direk çağıramazsın!");
	}

}
