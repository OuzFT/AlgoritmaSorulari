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

		Mudur mudur = new Mudur("Ali","Kaya","1234567899",44,20000,3,5554443322L,"İnşaat Emlak Müdürü",12345L);
		System.out.println(mudur.getAd() + "  " + mudur.getSoyad());
		
		
	}

}
