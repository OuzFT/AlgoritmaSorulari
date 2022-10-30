package Homeworks;

import java.util.Scanner;

public class GurayHocaOdev2Soru1 {

	public static void main(String[] args) {
		// Soru1;
		// Kullanıcının girdiği bir tamsayıyı(int) ters çeviren ve görüntüleyen bir
		// uygulama yazın.
		// (Not= String ve char kullanarak yapınız)
		// Örnek 1234 => 4321

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayi = input.nextInt();
		String ss = String.valueOf(sayi);
		System.out.println("Girdiğiniz sayı: " + ss);

		int i = ss.length() - 1;

		for (; i >= 0; i--) {
			char ters = ss.charAt(i);
			System.out.print("Girdiğiniz sayının tersten yazımı: " + ters);

		}

	}

}
