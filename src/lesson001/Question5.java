package lesson001;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğu biliniyor
		//girilen ürünün ham fiyatını bulan program
		//değişkan isimleri --> camelCase
		//sınıf isimleri --> PascalCase
		
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Satış fiyatını giriniz");
		int satisFiyati = input.nextInt();

		float vergisizFiyat = satisFiyati* 0.82f;
		float hamFiyat = vergisizFiyat* 0.75f;
		

				System.out.println("Ham Fiyat: "+ hamFiyat);

	}

}
