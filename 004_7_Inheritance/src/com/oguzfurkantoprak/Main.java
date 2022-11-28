package com.oguzfurkantoprak;

public class Main {

	// Inherıtance:
	//
	// Inheritance bir sınıfın üst sınıftan miras almasına denir. Miras aldığı zaman 
	// alt sınıf üst sınıfın özellikleirini tıpkı kendisindeymişcesine kullanabilir. 
	
	// Alt sınıf türetme hiyerarşik bir yapıda olur.
	// Bir alt sınıfın türetildiği sınıf, o alt sınıfın üst sınıfıdır.
	// Javada bir alt sınıfın ancak 1 tane üst sınıfı olabilir.(Diğer dillerde bu farklılık gösterebilir.)
	//Javada multiple inheritance yoktur extend ile yapılmaz.
	// Üst sınıfa ata ya da parent, alt sınıfa ise çocuk, oğul ya da child denir.
	
	public static void main(String[] args) {

//		Muhendis muhendis1 = new Muhendis();
//		muhendis1.setAd("Ali");
//		muhendis1.setSoyad("Kaya");
//		muhendis1.setTcKimlikNo("12345678911");
//		muhendis1.setUzmanlikAlani("Elektrik-Elektronik Müh.");
//	
//		System.out.println(muhendis1.getAd() + "  " + muhendis1.getSoyad() + " " + muhendis1.getUzmanlikAlani());
//
//		
//		Mudur mudur = new Mudur();
//		mudur.setAd("Ahmet");
//		
//		IdariMemur idariMemur = new IdariMemur();
//		idariMemur.setAd("Ayşe");
//		idariMemur.setGorevi("D.Başkanı sekreteri");
//		idariMemur.setCepTelNo(5075557788L);
//		
//		Personel personel = new Personel();
//		personel.setAd("Cem");
		
		
		Muhendis m = new Muhendis(); // Muhendisin içindeki default constructor (görünmeyen)
									 // içindeki super(); çağrısı ile üst sınıftaki constructor metodu çağrılır.
		
		//Aynı durum Sekreter için de geçerli:
		System.out.println("--------------");
		Sekreter s = new Sekreter(5552223344L); // Mutlaka üst sınıfın constructor'ı çağırılır. super();
		
		System.out.println("--------------");
		Sekreter s2 = new Sekreter();
		
		
	}

}
