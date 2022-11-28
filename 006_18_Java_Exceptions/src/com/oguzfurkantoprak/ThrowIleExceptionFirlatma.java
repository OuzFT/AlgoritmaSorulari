package com.oguzfurkantoprak;

import java.util.Scanner;

public class ThrowIleExceptionFirlatma {

	//parametre olarak gelen hız değeri 120den büyükse exception fırlatacağız. Kendimiz de exception atabiliriz.
	public static void hizKontrol(int hiz) {
		
		if (hiz > 120) {
			throw new ArithmeticException(); // DİKKAT!!
		}
		else {
			System.out.println("İyi yolculuklar...");
			// Arabanın hızını ayarla
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();

		try {
			ThrowIleExceptionFirlatma.hizKontrol(hiz);
		} catch (Exception e) {
			System.out.println("Çok hızlı gidiyorsunuz, lütfen hızınızı azaltın");
		}
		
		System.out.println("Program devam ediyor...");
		
		
	}

}
