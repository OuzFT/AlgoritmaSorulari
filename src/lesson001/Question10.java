package lesson001;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// girilen 3 sayıdan en büyük olanı yadıran program
		
		Scanner input = new Scanner(System.in);
		System.out.println("3 tane sayı giriniz");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();
		int sayi3 = input.nextInt();
		
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;			
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("en büyük sayı: "+ enBuyuk);
		

	}

}
