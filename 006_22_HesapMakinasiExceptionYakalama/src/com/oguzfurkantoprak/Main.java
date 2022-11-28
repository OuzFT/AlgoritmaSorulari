package com.oguzfurkantoprak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("1. sayıyı giriniz:");
			int sayi1 = scan.nextInt();
			System.out.println("2. sayıyı giriniz:");
			int sayi2 = scan.nextInt();

			System.out.println("****** İŞLEM SEÇİNİZ ******");
			System.out.println("1. Toplama");
			System.out.println("2. Çıkarma");
			System.out.println("3. Çarpma");
			System.out.println("4. Bölme");

			int secim = 0;
			secim = scan.nextInt();

			if (secim == 1) {
				System.out.println(" Toplama işleminin sonucu:" + (sayi1 + sayi2));
			} else if (secim == 2) {
				System.out.println(" Çıkarma işleminin sonucu:" + (sayi1 - sayi2));
			} else if (secim == 3) { // DİKKAT!!!
				if (sayi1 > 10000 && sayi2 > 10000) {
					throw new CarpmaLimitException();
					// hata verir başlığa throws CarpmaLimitException eklersek handle edilmiş olmaz!! Bunun için aşağıda bir catch blok daha oluşturmalıyız!
				}
				System.out.println(" Çarpma işleminin sonucu:" + (sayi1 * sayi2));
			} else if (secim == 4) {
				System.out.println(" Bölme işleminin sonucu:" + (sayi1 / sayi2));
			}

		} catch (ArithmeticException e) {
			System.out.println("Bir sayı 0'a bölünemez!! ");
		} catch (InputMismatchException e) {
			System.out.println("Lütfen inputları doğru formatta giriniz!!");
		} catch (CarpmaLimitException e) {
			e.printStackTrace(); // CarpmaLimitException sınıfında override edilmiş halini yazdırır
		} catch (Exception e) {
			e.printStackTrace(); // CarpmaLimitException sınıfında override edilmiş halini yazdırır
		}
		// catch blok sayesinde  programımız crash etmeden uyarı vererek programa devam eder...
		
		System.out.println("Program try blok dışında çalışmaya devam eder.");

	}

}
