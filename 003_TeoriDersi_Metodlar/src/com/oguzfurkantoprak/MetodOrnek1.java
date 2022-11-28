package com.oguzfurkantoprak;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnek1 {

	// Örnek metod1:
	// random sayı üreten bir static metod yazalım:
	public static int randomNumberGenerator() {
		Random random = new Random(); // random sayı üretme
		int result = random.nextInt(100); // import java.util.Random; import etti otomatik// 100e kadar sayı üretir
		return result;
	}
	
	
	// Örnek metod2:
	//Yukarıdaki metodu 1den bizim istediğimiz (parametre olarak girilen) sayıya kadar olan bir random sayı üretsin
	public static int randomNumberGenerator(int limit) { // parametre aldığı için metod overloading yapılabilir aynı isimle!
		Random random = new Random(); 
		int result = random.nextInt(1,limit); 
		return result;
	}
	
	
	//Soru:
	//Alt limiti ve üst limiti kullanıcıdan alan bir random sayı üreten  metod yazınız:!!!!!
	
	public static int randomNumberGenerator2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("alt limiti giriniz: ");
		int altLimit = scan.nextInt();
		System.out.println("üst limiti giriniz: ");
		int üstLimit = scan.nextInt();
		
		Random random = new Random(); 
		int result = random.nextInt(altLimit,üstLimit); 
		return result;
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Random bir sayı: " + MetodOrnek1.randomNumberGenerator());
		
		System.out.println("üst limit 100 olan random bir sayı: " + MetodOrnek1.randomNumberGenerator(1000));
		
		System.out.println("Alt limiti ve üst limiti kullanıcıdan alan bir random sayı üretildi: "+ MetodOrnek1.randomNumberGenerator2());
		
	}

}
