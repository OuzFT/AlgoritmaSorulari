package lesson002;

import java.util.Scanner;

public class Quesstion16 {

	public static void main(String[] args) {
		// girilen sayı için çarpım tablosunu yazdır
		
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");		
		int n = input.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i +"=" + (i*n));
			
		}

	}

}
