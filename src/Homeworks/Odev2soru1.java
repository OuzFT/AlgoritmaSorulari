package Homeworks;

import java.util.Scanner;

public class Odev2soru1 {

	public static void main(String[] args) {
		//kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
		
		// eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
		
		//eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
		
		//replace("ilk index", "@")
		//charAt()
		//kelime.startsWith("a")
		//length()
		//********************************************
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("kelime giriniz");
		String kelime = scanner.nextLine();
		
		if((kelime.startsWith("a")) == true) {
			System.out.println(kelime.charAt(kelime.length()-1));	
		}
		else if ((kelime.startsWith("b")) == true) {
			System.out.println(kelime.replace("b", "@"));
		}
		else
			System.out.println(kelime.charAt(0));		

	}

}
