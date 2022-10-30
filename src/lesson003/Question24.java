package lesson003;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// girilen sayının basamaklarını toplayan program: (do-while kullan)
		
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");
		int sayi = input.nextInt();
		int kalan = 0;
		int toplam = 0;
		
		do {
			kalan= sayi%10;
			sayi= sayi/10;
			toplam +=kalan;
		} while  (sayi!=0); //sayi 0 değilse bu scope sürekli çalışır. scope: do içerisi
		System.out.println("basamakların toplamı: "+ toplam);

	}

}
