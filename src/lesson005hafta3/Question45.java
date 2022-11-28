package lesson005hafta3;

public class Question45 {

	public static void main(String[] args) {

		int[] sayilar = { 0, 120, 5, 11 };

		// bu sayı çifttir ve bu sayı tektir şeklinde çıktı alan ve.
		// dizideki tüm sayıların toplamını veren program

		// 0 sayısı çifttir
		// 120 sayısı çifttir
		// 5 sayısı tektir
		// ......

		// toplam --> toplamDeğeri

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir");
			} else {
				System.out.println(sayilar[i] + " sayısı tektir");
			}
		}
		System.out.println("toplam: " + toplam);
	}

}