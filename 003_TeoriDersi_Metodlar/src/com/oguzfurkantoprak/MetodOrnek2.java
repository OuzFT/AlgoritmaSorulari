package com.oguzfurkantoprak;

public class MetodOrnek2 {

	private static int diziTopla(int[] dizi) {
		int toplam = 0;

		for (int i = 0; i < dizi.length; i++)
			toplam += dizi[i];
		return toplam;
	}

	private static void test(int x) {
		x = 200;
		
	}
	
	private static int test2(int x) {
		x = 200;
		return x;
	}

	
	private static void arrayIcreigiDegistir(int dizi[]) { // int[] dizi bu kullanım daha yaygın, ikisi de olur
	dizi[0]=100;
	}
	
	
	public static void main(String[] args) {

		// örnek1:
		int[] array = { 5, 10, 15, 20 };
		System.out.println(diziTopla(array));

		// örnek2:
		int sayi = 1;
		test(sayi);
		System.out.println(sayi); // 1 yazdırır, 200 değil!!!!

		// örnek3:
		int sayi2 = 1;
		sayi2 = test2(sayi2);
		System.out.println(sayi2); //200 yazdırır!!
		
		// örnek4:
		arrayIcreigiDegistir(array);
		System.out.println(array[0]); // 100 yazdırır!! dizi ve stringlerde böyle tutulur(ram içinde heap'te) ilkel tiplerde böyle değil , örnek yukarıda.
		
	}

}
