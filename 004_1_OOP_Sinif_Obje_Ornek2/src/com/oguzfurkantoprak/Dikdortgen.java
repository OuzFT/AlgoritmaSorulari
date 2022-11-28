package com.oguzfurkantoprak;

public class Dikdortgen {

	
	public int kisaKenar;
	public int uzunKenar;
	
	/**
	 * Bu metod dikdörtgenin alanını hesaplar ve tamsayı cinsinden döndürür
	 * @param sayilar int türünde araya vigül koyarak giriniz.//detay bilgi (@param)
	 */
	public int alanHesapla() {
		return(kisaKenar*uzunKenar);
	}
	
	
	public static void main(String[] args) {
		
		Dikdortgen dikdortgen1 = new Dikdortgen();
		dikdortgen1.kisaKenar = 10;
		dikdortgen1.uzunKenar = 20;
		System.out.println(dikdortgen1.alanHesapla());
		
		Dikdortgen dikdortgen2;
		dikdortgen2 = new Dikdortgen();
		//ya da  Dikdortgen dikdortgen2 = new Dikdortgen();
		dikdortgen2.kisaKenar = 5;
		dikdortgen2.uzunKenar = 10;
		System.out.println(dikdortgen2.alanHesapla());
		
		
	}

}
