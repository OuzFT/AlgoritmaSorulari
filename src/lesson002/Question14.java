package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// girilen 3 sayıyı büyükten küçüğe sıralayan program
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz");
		int sayi1 = input.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		int sayi2 = input.nextInt();
		
		System.out.println("3. sayıyı giriniz");
		int sayi3 = input.nextInt();
		
		/* 1. çözüm:
		if (sayi1>sayi2 && sayi2>sayi3) 
			System.out.println("1>2>3. sayı");
		
		else if (sayi2>sayi1 && sayi1>sayi3) 
			System.out.println("2>1>3.sayı");
		//... 6 kere kıyas yap else if içerisinde 
	
		else
			System.out.println("sayılar eşittir ");
		*/
		
		// 2. çözüm:
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			if(sayi2>sayi3)
				System.out.println("1>2>3. sayı");
			else
				System.out.println("1>3>2. sayı");
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			if(sayi1>sayi3)
				System.out.println("2>1>3. sayı");
			else
				System.out.println("2>3>1. sayı");
		}
			else {
				if(sayi1>sayi2)
					System.out.println("3>1>2. sayı");
				else
					System.out.println("3>2>1. sayı");
			
			//25.10.2022 01:26:00 tekrar dinle!
			
			
			
		}
		
		
	}

}
