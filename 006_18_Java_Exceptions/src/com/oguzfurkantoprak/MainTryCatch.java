package com.oguzfurkantoprak;

import java.util.Scanner;

// TRY - CATCH BLOKLARI

/*
	try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
*/

public class MainTryCatch {

	public static void main(String[] args) {

		// 1. BÖLÜM:
		// program ilk hatayı alınca hatayı yazdırır ve 2. hataya gelmeden çıkar.

//		int x = 20 / 0;

//		int[] arr = {1, 2, 3, 4};
//		System.out.println(arr[7]);

		// 2. BÖLÜM:
		// catch(exception e) => Bütün exceptionları yakalarsını.

		try {
			int x = 20 / 0;
		} catch (Exception e) {
			System.out.println("Sıfıra bölme olmaz!!");
		}

		try {
			int x = 20 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme olmaz!!");
			// Cihaz hata log dosyasına kayıt atabilir --> XXYY numaralı cihazdan hatalı
			// veri geliyor diye
		}

		// 3. BÖLÜM:
		// Aşağıdaki örnekte try-catch ile exception'ı yakalıyoruz ve program kontrolsüz
		// şekilde sonlanmıyor.
		System.out.println("3.bölüm:");
		int[] arr = { 1, 2, 3, 4 };
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırdışına çıkılıyor!!");
		}
		System.out.println("Program hatayı yakalar yazdırır ve devam eder crash etmeden.");

		// 4. BÖLÜM:
		// Aldığınız Exception'ın detayını öğrenmek için printStackTrace() metodunu
		// kullanın.
		System.out.println("4.bölüm:");
		int[] arr2 = { 1, 2, 3, 4 };
		try {
			System.out.println(arr2[7]);
		} catch (ArrayIndexOutOfBoundsException e) { // compiler hatayı yakalar e adında bir nesne türetir.
			System.out.println("Array'in sınırdışına çıkılıyor!!");
			// e.printStackTrace();
			String logaYazilacakMesaj = e.toString();
			// System.out.println(logaYazilacakMesaj);
		}

		System.out.println("e.printStackTrace(); ile hatanın detayını yazdırırız, program devam eder..");

		// 5. BÖLÜM:
		// birden çok exception yakalama
		System.out.println("5.bölüm:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir bölen sayı giriniz:");
		int bolen = scanner.nextInt();

		try {
			int sayi = 20 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırdışına çıkılıyor!!");
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası!!");
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu");
			e.printStackTrace();
		}
		System.out.println("İlk hatayı yakalar ve try-catch'ten çıkar ama program çalışmaya devam eder"); // DİKKAT
																											// Sınav
																											// sorusu!
		System.out.println("program halen çalışıyor...");

		
		// 6. BÖLÜM:
		//
		System.out.println("6.bölüm:");
		
		System.out.println("Bir bölen sayı giriniz tekrar:");
		bolen = scanner.nextInt();
		String s = null;
		
		try {
			int sayi = 20 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[0]);
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırdışına çıkılıyor!!");
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası!!");
			
		// Birden fazla exception yakalarken bildiklerimizi yazarız ve sona bilmediğimiz exceptioınlar için bir catch blok daha yazarız aşağıdaki gibi	
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu");
			//e.printStackTrace();
		}
	
		System.out.println("program halen çalışıyor...");

		
		// 7. BÖLÜM:
		//System.out.println("7.bölüm:");
//		System.out.println("Bir bölen sayı giriniz tekrar:");
//		bolen = scanner.nextInt();
//		s = null;
//		
//		try {
//			int sayi = 20 / bolen;
//			int[] array = { 1, 2, 3, 4 };
//			System.out.println(array[0]);
//			System.out.println(s.length());
//		} catch (Exception e) { // exception catch bloğu başa yazılmaz, yoksa diğer exceptionlara ulaşılmaz. exception sınıfı bütün exceptionları kapsar
//			System.out.println("Tahmin edilemeyen bir hata oluştu");
//			//e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array'in sınırdışına çıkılıyor!!");
//		} catch (ArithmeticException e) {
//			System.out.println("Sıfıra bölme hatası!!");
//			
//		// Birden fazla exception yakalarken bildiklerimizi yazarız ve sona bilmediğimiz exceptioınlar için bir catch blok daha yazarız aşağıdaki gibi	
//		} 
//	
//		System.out.println("program halen çalışıyor...");

		
		// 8. BÖLÜM:
		System.out.println("\n8.bölüm:");
		bolen = 1;
		s = "test";
		
		try {
			int sayi = 20 / bolen;
			int[] array = { 1, 2, 3, 4 };
			System.out.println(array[0]);
			System.out.println(s.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'in sınırdışına çıkılıyor!!");
		} catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası!!");
		} catch (Exception e) {
			System.out.println("Tahmin edilemeyen bir hata oluştu");
		}
		// Hatalı işlem yoksa catchlere girmez try bloktan çıkar ve programa devam eder...
		System.out.println("program halen çalışıyor...");
		
		
		
	}

}
