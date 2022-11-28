package com.oguzfurkantoprak;

import java.util.Scanner;

public class Main {

	public static void hizKontrol (int hiz) {
		if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor!!");
		}
		else
			System.out.println("İyi yolculuklar...");
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();
		
		try { // try blok içinde yazmazsak program exception yer ve crash eder, devam etmez.
			Main.hizKontrol(hiz);
		} catch (Exception e) { // exception yerine AsiriHizException da yazabiliriz.
			e.printStackTrace(); // AsiriHizException' ın super classındaki mesajı yazdırır.
			System.out.println(e.getMessage()); // hizKontrol(hiz) metodundaki mesajı yazdırır.
		}
		

	}

}
