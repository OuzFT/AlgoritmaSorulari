package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Kullanıcıdan 2 sayı al ve bunların çarpımını yazdır

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz");
		int a = input.nextInt();
				
		System.out.println("2. sayıyı giriniz");
		int b = input.nextInt();
		
		int carpim = a * b;
		
		System.out.println("Çarpım: "+ carpim);
	}

}
