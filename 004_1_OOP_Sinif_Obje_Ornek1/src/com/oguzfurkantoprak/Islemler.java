package com.oguzfurkantoprak;

public class Islemler {
	//özellikler veya üye değişkenler:
	public int sayi1;
	public int sayi2;
	
	
	public static int topla(int x, int y) { //public static üye metod(sınıfa ait)
		
		int z= x+y;
		return z;
	}
	
	
	public int topla() {
		return(sayi1 + sayi2);
	}
	
	
	public double topla(double... sayilar) { //VarArgs
		double toplam = 0;
		for(double sayi : sayilar) {
			toplam+=sayi;			
		}
		return toplam;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Islemler.topla(3, 2));
		
		Islemler islemler = new Islemler();
		islemler.sayi1 = 10;
		islemler.sayi2 = 20;
		System.out.println(islemler.topla());
		
		Islemler islemler2 = new Islemler();
		islemler.sayi1 = 4;
		islemler.sayi2 = 5;
		System.out.println(islemler2.topla());
		
		//System.out.println(islmeler3.topla(2.1 , 3.7, 4.0)); //islmeler3 yazmaya yetişmedi: 01:58:00 - 4kasım cuma
		
		
		
	}

}
