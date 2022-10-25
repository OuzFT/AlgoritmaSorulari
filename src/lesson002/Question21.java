package lesson002;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Girilen sayının asal sayı olup olmadığını bulan program
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");		
		int n = input.nextInt();
		int asalDegil=1;
		
		for(int i=2;i<n;i++) {
		    if(n%i==0)
			  asalDegil = 0;
		}		
	
	if(asalDegil==0) 
		System.out.println("Asal degildir");
	else 
		System.out.println("sayı asaldır");
}
}