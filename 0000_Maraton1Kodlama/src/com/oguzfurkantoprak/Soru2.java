package com.oguzfurkantoprak;

public class Soru2 {

	public static void tekrarEdenSayi(int array[]) {

		boolean found = false;
		int count = 0;
		int element = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (found) {
				break;
			}
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					if (found) {
						count++;
					} else {
						element = array[i];
						found = true;
						count = 2;
					}
				}
			}
		}
		System.out.println("İlk Tekrar eden "+ element + " sayısı tüm dizide "+ count + " defa tekrar etti");
	}

	// 2. ÇÖZÜM:
	public static void tekrarEdenSayi2(int array[]) {
		int tekrarSayisi = 0;
		boolean kontrol = false;
		
		for (int i = 0; i < array.length; i++) {
			tekrarSayisi = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					tekrarSayisi++;
				}
			}
			if(tekrarSayisi>1) {
				System.out.println(array[i] + " sayısı " + tekrarSayisi + " kez tekrar etmiştir.");
				kontrol = true;
				break;
			}
		}
		if (kontrol == false) {
			System.out.println("Tekrar eden sayı bulunamadı.");
		}
		
	}
	

	public static void main(String[] args) {

		int array[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		tekrarEdenSayi(array);
		System.out.println("Çözüm 2 sonuç:");
		tekrarEdenSayi2(array);

	}

}
