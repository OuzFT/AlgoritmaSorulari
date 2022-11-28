package lesson017hafta6_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

			// 2 tane set oluşturalım
			// tekrar edenler ve
			// tekrar etmeyenler
			// kullanıcdan bir kelime alcaz
			// eğer tekrar eden harf varsa tekrar edenlere atalım
			// ve tekrar etmeyenlerden çıkaralım
			// ve tekrar edenleri ve etmeyenleri yazdıralım
			//tekrarEtmeyenler --> j , v
			//tekrar eden --> a
	
	public static void main(String[] args) {
		System.out.println("Bir kelime Giriniz:");
		Scanner scanner = new Scanner(System.in);
		String kelime = scanner.nextLine();

		Set<Character> tekrarEden = new HashSet<Character>();
		Set<Character> tekrarEtmeyen = new HashSet<Character>();
		
		Set<Character> deneme = new HashSet<Character>();
		
		
		for (int i = 0; i < kelime.length(); i++) { // BURASI KARIŞIK!!!
			if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) { 
				// add ve contains metodları boolean döndürür burada
				//sets never contain duplicate elements. 
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}

		System.out.println("TekrarEdenler");
		for (Character character : tekrarEden) {
			System.out.print(character + " ,");
		}
		System.out.println();
		System.out.println("Tekrar Etmeyenler");
		for (Character character : tekrarEtmeyen) {
			System.out.print(character + " ,");
		}

		
	}
	/* 2. ÇÖZÜM:
	Scanner scanner = new Scanner(System.in);
    System.out.println("Bir kelime giriniz.");
    String kelime = scanner.nextLine();
    
    HashSet<Character> tekrarEdenler = new HashSet<Character>();
    HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();
            
    
    for (int i = 0; i < kelime.length(); i++) {
        for (int j = i+1; j < kelime.length(); j++) {
            if(kelime.charAt(i)== kelime.charAt(j)) {
                tekrarEdenler.add(kelime.charAt(i));
            }
        }
        if(!tekrarEdenler.contains(kelime.charAt(i))) {
            tekrarEtmeyenler.add(kelime.charAt(i));
        }
    }
    System.out.println(tekrarEdenler);
    System.out.println(tekrarEtmeyenler);
*/
}