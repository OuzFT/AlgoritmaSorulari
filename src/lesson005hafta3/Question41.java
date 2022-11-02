package lesson005hafta3;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		// Bizden bir kelime istenilcek (java)
        // hangi harfi değiştirmek istediğimizi sorcak (b)
        // eğer değiştirmek istediğimiz kelimeda yoksa,
        // döngü başa saracak ve tekrar kelime isteyecek eğer
        // varsa harfimiz değişecek
        // ve yeni kelimemiz ekrana basılcak
        
        //java
        // değiştirmek istediğiniz harf --> a
        //neyle değiştirmek istediğimiz harf --> b
        //jbvb
		
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime giriniz: ");
		String kelime=input.nextLine();
		System.out.println("Değiştirmek istediğiniz harfi girin");
		String harf=input.next(); 
		System.out.println("Yerine geçecek harfi giriniz");
		String harf2=input.next();
		
		int i=0;
		int kelimeUzunlugu = kelime.length();

		while (i<kelimeUzunlugu) {
			string rWord= kelime.replace(harf, harf2)
		}

	}

}
