package lesson005hafta3;

public class Question47 {

	public static void main(String[] args) {

		// bir dizide en büyük ikinci sayıyı bulan program
		
		/*
		int[] sayilar = { 1258, 1258, 5, 85, -256, 16, 0, 36, 81, 14 };

		int enBuyuk = sayilar[0];
		int ikinci = sayilar[1];

		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = sayilar[i];

			} else if (sayilar[i] > ikinci) {
				ikinci = sayilar[i];
			}
		}
		System.out.println(" ikinci sayı " + ikinci);
		*/
		
		// ÖDEV:
		// ödev iki tane aynı enbüyük sayı girdiğimizde doğru çıktı almamız lazım
		
		// ÇÖZÜM:
		int[] sayilar = { 1258, 1258, 1258, 85, 85, -256, 16, 0, 36, 81, 14 };

		int enBuyuk = Integer.MIN_VALUE;
		int ikinci = Integer.MIN_VALUE;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {
				ikinci = enBuyuk;
				enBuyuk = sayilar[i];

			} else if (sayilar[i] != enBuyuk && sayilar[i] > ikinci) {
				ikinci = sayilar[i];
			}
		}
		System.out.println(" ikinci sayı: " + ikinci);
		System.out.println(" En Büyük sayı: " + enBuyuk);
	}

}