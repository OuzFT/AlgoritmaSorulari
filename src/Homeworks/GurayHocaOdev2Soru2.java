package Homeworks;

import java.util.Scanner;

public class GurayHocaOdev2Soru2 {

	public static void main(String[] args) {
		// String metin = "Bugün Java ile string konusunu işleyeceğiz";
		// Verilmiş olsun.Metin değişkeninin içinde "i harfinin geçtiği yerlerin
		// indeksini bir while loop ve indexOf metodlarını
		// kullanarak ekrana çıktı yazdıran bir program yazın.
		// Çıktı şu şekilde olmalı
		// i harfinin geçtiği yerler : 11,18,31,40
		
		
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
			
		System.out.print("i harfinin geçtiği yerler: ");
		
		int	i =0;
		while (i < metin.length()) {
			int k = metin.indexOf(('i') , i) ;  
			if (i == k) {
			System.out.print(k+",");
			i++;
			}
			else
				i++;
			}
		
	}

}
