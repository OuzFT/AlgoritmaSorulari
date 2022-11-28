package com.oguzfurkantoprak;

public class Main {

	
	public static void nemGoster(INemOlcer nemOlcer) { // önce interface ismini sonra da herhangi bir değişken ismi yazıyoruz
		System.out.println(nemOlcer.nemOlc());			
	}
	
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + " " + tarihSaatGosterenCihaz.saatGoster());
	}
	
	
	public static void main(String[] args) {
		Arzum arzum = new Arzum();
//		System.out.println(arzum.sıcakligiOlc());
		
		   		//Bir interface adıyla ona referans oluşturabiliriz.
		//ITermometre termometre = new Arzum();
				//bunu sağlayan ArzumSicaklikOlcer sınıfının ITermometre interface'ini implement etmesi
		//termometre = new Sinbo(); // bunu yapabiliriz => Polymorphism burada interface ile yapılıyor. Önceki derslerde inheritance ile yaptık 
	
		Sinbo sinbo = new Sinbo();
		Main.nemGoster(arzum);
		
		Main.nemGoster(arzum); // POLYMORPHISM
		Main.nemGoster(sinbo); // POLYMORPHISM
		
		//-----
		System.out.println("--------------------");
		Main.tarihSaatGoster(arzum);
		// Main.tarihSaatGoster(sinbo); // sinbo ITarihSaatGoster interface'ini implement etmediği için hata verir
		Casio casio = new Casio();
		Main.tarihSaatGoster(casio);
		
	}

}
