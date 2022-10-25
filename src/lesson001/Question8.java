package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// girilen tl değerini usdye çeviren proggram 1 usd = 18.25

		Scanner input = new Scanner(System.in);
		System.out.println("TL değeri giriniz");
		Float Tl = input.nextFloat();
		Float Usd = Tl * 18.25f; // sağ tarafı int alacağı için sonuna f eklemeyi unutma
		System.out.println("Dolar olarak değeri: " + Usd);
		
	}

}
