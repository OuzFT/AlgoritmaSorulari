package com.oguzfurkantoprak;

import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsIleExceptionFirlatma2 {

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

	//Main metod başlığında throws ile exception atması, API olarak bizim kodumuzu 
	//kullanacak kişinin yakalaması içindir.
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hızı giriniz: ");
		int hiz = sc.nextInt();
		
		ThrowsIleExceptionFirlatma2.hizKontrol(hiz);
		
		
	}

}
