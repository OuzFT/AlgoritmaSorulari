package com.oguzfurkantoprak;



public class MainOrnek2 {

	public static void main(String[] args) {
		
		// ----------------- YAKIT TÜKETİMİ ÇALIŞMASI -------------------
		
		Otomobil oto1 = new Otomobil("Nissan", "Juke", 2005, 200000, new Motor(1500, "12345678", 10), 50, 50);
		
		// Aracı süremden önceki depodaki yakıt:
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		oto1.araciSur(200);
		
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		oto1.araciSur(100);

		System.out.println(oto1.getAllOtomobilBilgileri());
		
		oto1.araciSur(300);
		
		// Aracımı fulliyorum:
		oto1.setDepodakiYakit(70);
		oto1.araciSur(300);
		
		
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		// --  2.otomobil:
		// 
		Otomobil oto2 = new Otomobil("Nissan", "Qashkai", 2015, 100000, new Motor(1500, "12345679", 10), 40);
		oto2.setDepodakiYakit(50);
		System.out.println(oto2.getAllOtomobilBilgileri());
		oto2.araciSur(100);
		System.out.println(oto2.getAllOtomobilBilgileri());
		
	}
	
	

}
