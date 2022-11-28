package com.oguzfurkantoprak;

public class Main {

	// NOT: 
		//
		// Bir abstract sınıftan inherit edildiği zaman(miras alındığı zaman), mutlaka o abstract sınıfın içindeki 
		//abstract metodları alt sınıflarda override + implement etmek zorundasınız!!!!!!
			
	public static void main(String[] args) {
		
		//Personel p = new Personel("Ali", "Öz", "111", 22, 8000, 1, 5554321122L);
		// abstract sınıf olduğu için bu sınıftan yukarıdaki gibi new ile nesne türetemeyiz.
		Mudur m = new Mudur("Ali", "Öz", "111", 22, 8000, 1, 5554321122L,"İdari Müdür",22233L);
		
		System.out.println(m.getZamKatSayisi());
		System.out.println(m.personelKimlikBilgileriniGetir());
		
		Sekreter sek = new Sekreter("Zeynep", "Kaya", "1234", 30, 10000, 2, 444L, 4567L, 4056L);
		System.out.println(sek.personelKimlikBilgileriniGetir());
		
		//Final sınıflara örnek:
		//
		//Javanın içinde ggelen Math sınıfı final bir sınıftır. Bu sınıftan yeni sınıf türetilemez.
		//Math sınıfının içine Java koyulması gereken tüm fonksiyon ve üyeleri eklemiş ve 
		//bu sınıftan yeni bir sınıf türetilip yeni özellikler eklenmemesi için sınıfı final yapmış.
		System.out.println(Math.PI);
		//String sınıfı da finaldır.
		
		
	}

}
