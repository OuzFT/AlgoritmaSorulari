package lesson003;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// girilen sayının 5in kuvveti olup olmadığını bulan proıgram 5 ^n - while
		// kullan

		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");
		double sayi = input.nextDouble();

		boolean kontrol = true;

		if (sayi == 0)
			System.out.println("0'dan farklı bir sayı giriniz");
		else {
			while (kontrol == true) {     //while (kontrol) bu şekilde de olur
				if (sayi % 5 == 0) {
					sayi /= 5;
					if (sayi == 1) {
						System.out.println("5in kuvvetidir");
						kontrol = false;
					}
				} else {
					System.out.println("5in kuvveti değildir");
					kontrol = false;
				}
			}
		}
	}
}
