package com.oguzfurkantoprak;

import java.util.Scanner;

public class Main {

	public static void hizKontrol(int hiz) throws AsiriHizException {
		// !!!! Başlığa "throws AsiriHizException" decleration eklenmezse hata verir CHECKED exceptionlarda!!
		
		if (hiz >150) {
			throw new AsiriHizException("Çoook Aşırı hız yapılmak isteniyor!!");
		}
		else if (hiz > 120) {
			throw new AsiriHizException("Aşırı hız yapılmak isteniyor!!");
		} else
			System.out.println("İyi yolculuklar...");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();

		try {
			Main.hizKontrol(hiz); // try catch bloğa yamazsak kırmızıyla hata verir solda!!
		} catch (AsiriHizException e) {
			e.printStackTrace(); // AsiriHizException' ın super classındaki mesajı yazdırır.
			System.out.println(e.getMessage()); // hizKontrol(hiz) metodundaki mesajı yazdırır.
		}
	}

}
