package com.oguzfurkantoprak;

import java.util.Random;
import java.util.Scanner;

public class MetodOrnek3 {
	
	//DİKKAT ÖNEMLİ!!
	//Rastgele 7nin katı olan  10 tane tamsayı üreten bir metod yazınız.
	// üst limiti parametre olarak kullanıcıdan alın. (scanner main methodda olsun)
	
	
	public static int[] randomDiziUret(int ustLimit) {
		
		Random random = new Random(); 		
		int[] random10= new int[10];	
		for(int i=0;i<10;i++)
			random10[i]= (random.nextInt(ustLimit) / 7) * 7;

		return random10;	
	} 
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("üst limit giriniz: ");
		int limit = scanner.nextInt();
		
		int[] dizi = randomDiziUret(limit);
		
		for(int sayi: dizi) { // foreach  kullanımı
			System.out.println(sayi);
		}

	}

}
