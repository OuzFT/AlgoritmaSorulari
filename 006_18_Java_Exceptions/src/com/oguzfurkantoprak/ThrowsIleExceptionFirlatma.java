package com.oguzfurkantoprak;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma {

	// parametre olarak gelen hız değeri 120den büyükse exception fırlatacağız.
	// Kendimiz de exception atabiliriz.
	public static void hizKontrol(int hiz) throws SQLException { // Dikkat!!

		if (hiz > 120) {
			throw new SQLException(); // SQLException bir checked exception olduğu için metoda extradan throws
										// yazmamız gerekir!!
//			System.out.println("Buraya yazdığım çıkmaz, exception fırlattığımız için unreachable code hatası verir");
		} else {
			System.out.println("İyi yolculuklar...");
			// Arabanın hızını ayarla
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();
		try {
			ThrowsIleExceptionFirlatma.hizKontrol(hiz);
		} catch (SQLException e) {
			System.out.println("Çok hızlısın  lütfen hızını azalt");
			//e.printStackTrace();
		}
		
	}

}
