package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// girilen 2 sayıdan hangisinin büyük olduğunu bulan program
				
				Scanner input = new Scanner(System.in);
				System.out.println("1.sayıyı giriniz");
				int sayi1 = input.nextInt();
				System.out.println("2.sayıyı giriniz");
				int sayi2 = input.nextInt();
				
				if (sayi1 > sayi2) {
					System.out.println("en büyük sayı:" + sayi1);
			}
				else if (sayi1==sayi2) {
					
					System.out.println("sayılar eşittir");
				}
				else 
					System.out.println("en büyük sayı:" + sayi2);
		 }
 }