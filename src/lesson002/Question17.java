package lesson002;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		//girilen sayının faktöriyelini yazdır.
		
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");		
		int n = input.nextInt();
		int fak=1;
		for(int i=1;i<=n;i++) {
			fak=fak*i;			
		}
		
		System.out.println(n +"!" + "=" + fak);
	}

}
