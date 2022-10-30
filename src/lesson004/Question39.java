package lesson004;

import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// Girilen kelimenin her harfini önce büyük sonra küçük harfe çevir
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String word = scan.next();
        word=word.toUpperCase();
        System.out.println(word);
        
        word=word.toLowerCase();
        System.out.println(word);
	}

}
