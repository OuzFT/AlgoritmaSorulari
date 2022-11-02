package com.alikayaornek;

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
	
	
	
}
