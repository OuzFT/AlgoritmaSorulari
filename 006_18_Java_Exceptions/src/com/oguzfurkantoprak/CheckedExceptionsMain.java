package com.oguzfurkantoprak;

public class CheckedExceptionsMain {

	public static void main(String[] args) {
		
		// Checked exceptionlar Exception sınıfından türerler
		// Bu tarz exceptionlar program compile edilirken yakalanması ve handle edilmesi gereken durumlardır.
		// Bu tarz exceptionlar try-catch blokları içinde throws keywordu kullanarak handle edilmelidir.
		// Aksi halde compile hatası alırsınız
		// NOT: Checked Exceptionlar Runtime Exceptionlardan türemez
		// Compile sırasında görürüz bu exceptionları!
		
		// Checked Exception ÖRN: Thread.sleep();
		System.out.println("1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("2");

	}

}
