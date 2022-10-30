package lesson004;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// Kullanıcıdan kelime alınacak bunun harflerinin kaçıncı indexe hangi harf geliyor yazdır alt alta.
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String word = scan.next();
        
		for(int i=0;i<word.length();i++) {
			System.out.println(i+". index: "+word.charAt(i));	
		}
		System.out.println("kelimedeki harf sayısı: "+word.length());
		

	}

}
