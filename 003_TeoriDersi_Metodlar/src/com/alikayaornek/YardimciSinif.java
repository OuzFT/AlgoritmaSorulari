package com.alikayaornek;

import com.oguzfurkantoprak.SinifStaticDegiskenler;

public class YardimciSinif {
	
	public static void helloYardimci() {
		System.out.println("Hello from Yardımcı");
	}

	
	private static void merhaba() {
		System.out.println(" bu metod private  olduğu için diğer paketlerde çağıramayız");
	}
	
	
	public static void main(String[] args) {
		com.alikayaornek.YardimciSinif.merhaba();
		//
		com.alikayaornek.YardimciSinif2.helloYardimci2();//uzun kullanımı
		YardimciSinif2.helloYardimci2();// kısa kullanımı: aynı paketteler o yüzden com.alikayaornek. yazmaya gerek yok
		
	}
	
	public static  int mesafe() {
		
		SinifStaticDegiskenler.x++;
		int  mesafe = com.oguzfurkantoprak.SinifStaticDegiskenler.dunyaninYaricapi * com.oguzfurkantoprak.SinifStaticDegiskenler.x;
		return mesafe;
	}
	
	public static void kullaniciSayisiArtir() {
		SinifStaticDegiskenler.aktifKullaniciSayisi++;
		System.out.println(SinifStaticDegiskenler.aktifKullaniciSayisi++);
		return;
	}
	
}
