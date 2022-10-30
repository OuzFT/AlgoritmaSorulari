package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// girilen sayının faktöriyelini hesaplayan programı while ile yapın
		
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz");
		int sayi = input.nextInt();
		
		//çözüm1
		int fakt=1;
		while(sayi>0) {
			fakt*=sayi;
			sayi--;
		}
		System.out.println("sayının faktoriyeli: " + fakt);
		
		//çözüm2:
		/*
		 int i=1;
		 int fakt=1;
		 while(i<=sayi) {
			fakt*=i;
			i++;
		}
		System.out.println("sayının faktoriyeli: " + fakt);		  
		 */
		
	}

}
