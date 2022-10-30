package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// taban sayısı alıcaz, üs sayısı alıcaz=>  taban üzeri üs hesaplayan program - while kullan
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir taban sayı giriniz");
		int taban = input.nextInt();
		System.out.println("Bir üs sayı giriniz");
		int us = input.nextInt();
		
		int index =1;
		int sonuc =1;
		
		while (index<=us) {
			
			sonuc *= taban;
			index++;
		}
		System.out.println(taban + "^"+ us+ " : "+ sonuc);

	}

}
