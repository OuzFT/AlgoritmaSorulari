package lesson009hafta3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Question65 {
	
			//dizi öğelerini tersten yazdırma
			//tersCevir metotu --> parametre olarak in[] tipinfde
			
			//	int[] dizi = {10, 20, 30, 40, 50};
			
			//50 40 30 20 10
			//tersCevir(dizi);
			
			//Bunun kullanıcıdan istediğimiz versiyonu
	
	public static void tersCevir(int[] dizi) {
		int[] tersDizi = new int[dizi.length];
		for (int i = 0; i < dizi.length; i++) {
			tersDizi[dizi.length - i - 1] = dizi[i];
		}
		for (int tersSayilar : tersDizi) {
			System.out.print(tersSayilar + " ");
		}
	}

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dizi uzunluğunu giriniz: ");
		int uzunluk = scanner.nextInt();

		int[] dizi = new int[uzunluk];

		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Bir sayı giriniz: ");
			dizi[i] = scanner.nextInt();
		}
		System.out.println("Yeni dizi: " + Arrays.toString(dizi));

		tersCevir(dizi);

	}

}
