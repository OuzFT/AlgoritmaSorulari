package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// verilen kelimenin içinde kaç tane e olduğunu bulan program / for loop kullan
		
		/*
		String kelime = "eeeaaooe";

		int sayac = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'e') {
				sayac ++;
			}
		}
		System.out.println(sayac);
		*/
		
		//girilen kelimenin içinde kaç tane girilen harf olduğunu bulan program / for loop kullan
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String word = scan.next();
        System.out.println("Girilen kelimede hangi harften kaç tane olduğunu bulayım?");
        String letter = scan.next();
        
        
        int sayac = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter.charAt(0)) {
				sayac ++;
			}
		}
		System.out.println(sayac);
		
	}
}
