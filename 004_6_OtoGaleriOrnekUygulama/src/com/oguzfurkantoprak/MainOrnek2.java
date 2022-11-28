package com.oguzfurkantoprak;

public class MainOrnek2 {

	public static void main(String[] args) {
		
		// ----------------------- YAKIT TÜKETİMİ ÇALIŞMASI-------------------
		Otomobil oto1 = new Otomobil("Nissan","Juke",2005,200000,new Motor(1500,"12354356", 10),50,50);
		
		System.out.println("Aracı sürmeden önceki yakıt: "+ oto1.getDepodakiYakit());
		
		oto1.araciSur(200);
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		oto1.araciSur(100);
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		oto1.araciSur(300);
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		//Aracımı fulliyorum;
		oto1.setDepodakiYakit(50);
		
		oto1.araciSur(100);
		System.out.println(oto1.getAllOtomobilBilgileri());
		
		// ---- 2. otomobil nesnesini türetelim: ------
		
		Otomobil oto2 = new Otomobil("Nissan","Qashqai",2015,100000,new Motor(1500,"12354376", 10),40);
		oto2.setDepodakiYakit(50);
		System.out.println(oto2.getAllOtomobilBilgileri());
		oto2.araciSur(100);
		System.out.println(oto2.getAllOtomobilBilgileri());
		
		
		
	}

}
