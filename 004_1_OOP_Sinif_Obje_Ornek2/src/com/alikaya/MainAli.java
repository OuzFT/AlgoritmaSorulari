package com.alikaya;

public class MainAli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParalelKenar paralelKenar = new ParalelKenar();
		paralelKenar.kenarKisa = 20;
		paralelKenar.kenarUzun = 30;
		// paralelKenar.isim = "jj"; ===> hata verir çünkü isim değişkeni private'tır.farklı sınıflardan erişilemez
		
		Ucgen ucgen1 = new Ucgen();
		ucgen1.kenar1 = 3;
		ucgen1.kenar2 = 3;
		ucgen1.kenar3 = 3;
		ucgen1.kenarlariUzat(5);
		System.out.println("kenar 1 : 2 : 3 : "+ ucgen1.kenar1 + ucgen1.kenar2 + ucgen1.kenar3);
		
		
		Ucgen ikizKenarUcgen = new Ucgen();
		
		Daire daire = new Daire();
		daire.yaricap = 20;
		// daire.cap = 10; // cap private olduğu için sınıfa özgüdür başka sınıfta görünmez. hata verir.
		
	}

}
