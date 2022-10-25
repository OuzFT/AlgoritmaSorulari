package lesson001;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// girilen isim soyisim değerini "hello(isim) (soyisim)" şeklinde yazdıran program
		
		Scanner input = new Scanner(System.in);
		System.out.println("İsim giriniz");
		String isim = input.next();
		System.out.println("Soyisim giriniz");
		String soyisim = input.next();

		System.out.println("hello "+ isim +" "+ soyisim);
	}

}
