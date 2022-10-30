package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// kullanıcıdan sürekli sayı alıcaz ve 0'a basılınca bu alınan sayıların
		// çarpımını veren program
		// while kullan
		// ilk girilen sayının 0 olması durumunu da hazırla.

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = input.nextInt();

		int ilkDeger = 0;
		int carpim = 1;

		while (sayi != 0) {
			carpim *= sayi;
			System.out.println("Bir sayı giriniz");
			sayi = input.nextInt();
			ilkDeger = 1;
		}

		if (ilkDeger == 0) {
			System.out.println("programdan çıktınız");
		} else {
			System.out.println("girdiğiniz sayıların çarpımı: " + carpim);
		}

	}

}
