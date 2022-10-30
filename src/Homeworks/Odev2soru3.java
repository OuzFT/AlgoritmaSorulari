package Homeworks;

import java.util.Scanner;

public class Odev2soru3 {

	public static void main(String[] args) {
		// Tahmin oyunu
		// rastGele bir sayı oluşturcaz
		// rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		// tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım
		// sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
		// Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .

		// while ile çözüm

		Scanner scanner = new Scanner(System.in);
		int rastgeleSayi = (int) (Math.random() * 100);
		System.out.println("Bir sayı tahmin edin");
		int sayi = scanner.nextInt();

		int sayac = 1;

		while (sayi != rastgeleSayi) {

			if (sayi > rastgeleSayi) {
				System.out.println("Daha küçük bir sayı tahmin et");
				sayac++;
			} else {
				System.out.println("Daha büyük bir sayı tahmin et");
				sayac++;
			}
			System.out.println("Yeni tahmininiz nedir?");
			sayi = scanner.nextInt();
			
			if(sayi==rastgeleSayi)
				System.out.println(sayac+". denemede doğru tahminde bulundunuz.");
		}

	}

}
