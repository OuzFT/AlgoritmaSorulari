package com.oguzfurkantoprak;

import java.util.Scanner;

public class Soru3 {


	public static int karakterSayici(String x, char y) {
		String ss = String.valueOf(y);
		int sayac = 0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)== ss.charAt(0)) {
				sayac++;
			}
		}
		
		return(sayac);	
	}
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir cümle giriniz:");
		String str = input.nextLine();
		System.out.println("Giridiğiniz cümle: " + str);
		
		System.out.println("Cümlede sayılacak harfi giriniz:");
		char harf = input.next().charAt(0);
		System.out.println("Girdiğiniz harf:" + harf);

		System.out.println("girdiğiniz cümlede girdiğiniz harften " + karakterSayici(str,harf) + " adet vardır.");
	}

}
