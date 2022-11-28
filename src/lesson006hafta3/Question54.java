package lesson006hafta3;

import java.util.Scanner;

public class Question54 {

	public static void main(String[] args) {
		// Girilen kelimede türkçe karakter var ise bunu ingilizce karaktere çeviren
		// program

		// çağlaİ
		// caglaI

		// replace
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bi kelime giriniz");
		String metin = scanner.nextLine();

		for (int i = 0; i < turkceKarakter.length; i++) {
			metin = metin.replace(turkceKarakter[i], ingilizceKarakter[i]);
		}
		System.out.println(metin);
	}
}