package com.oguzfurkantoprak;

public class MainOrnek2 {

	public static void main(String[] args) {

		// --------
		// Polymorphism:
		//		
		// Muhendis muh = new Muhendis("Ahmet", "Emre", "11", 0, 10000, 0, 0, "Makine Müh.");
		
		Personel p;
		p = new  Mudur("Zeynep", "Emre", "11", 0, 30000, 0, 0, "Yazılım Müdürü", 1112233L);
		System.out.println(p.getZamKatSayisi());
		
		
		p = new Muhendis("Ahmet", "Emre", "11", 0, 10000, 0, 0, "Makine Müh.");
		System.out.println(p.getZamKatSayisi());

	}

}
