package com.oguzfurkantoprak;

public class Main {

	// Inherıtance:
	//
	// Inheritance bir sınıfın üst sınıftan miras almasına denir. Miras aldığı zaman 
	// alt sınıf üst sınıfın özellikleirini tıpkı kendisindeymişcesine kullanabilir. 
	
	// Alt sınıf türetme hiyerarşik bir yapıda olur.
	// Bir alt sınıfın türetildiği sınıf, o alt sınıfın üst-sınıfıdır.
	// Java'da bir alt sınıfın ancak bir tane üst sınıfı olabilir. (Diğer dillerde bu farklılık gösterebilir). 
	// Üst sınıfa ata(parent) alt sınıfa ise çocuk (child) denir.	
	
	public static void main(String[] args) {


		Mudur mudur = new Mudur("Ali", "Kaya", "1234567899", 44, 20000, 3, 5553344555L, "İnşaat Emlak Müdürü", 12345L);
		System.out.println(mudur.getAd() + "   " + mudur.getSoyad());
		
		Sekreter s = new Sekreter("Ayşe", "Zehra", "11111", 30, 12000, 5, 5553344333L, 3123334433L, 3123323344L);
		System.out.println(s.getAd() + "   " + s.getSoyad() + "   " +  s.getTel1SeriNo());
		
		System.out.println(s.getZamKatSayisi());
		
		System.out.println(mudur.getZamKatSayisi());
		
		
	}

}
