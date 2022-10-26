package Homeworks;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// 1- toplama , 2-çıkarma, 3-çarpma, 4-bölme, kullanıcıdan 2 sayı al ve 1-4 arası seçim yaparak işlem yaptır

		Scanner input = new Scanner(System.in);
		System.out.println("2 tane sayı giriniz");
		int sayi1 = input.nextInt();
		int sayi2 = input.nextInt();
		System.out.println("Hangi işlemi yapmak istersiniz?; 1- toplama , 2-çıkarma, 3-çarpma, 4-bölme");
		int islem = input.nextInt();
		
		if (islem==1) {
			System.out.println("Girilen sayıların toplamı: " + (1L*sayi1*sayi2));
		}
		else if (islem==2) {
			System.out.println("Girilen sayıların farkı: " + (sayi1-sayi2));
		}
		else if (islem==3) {
			System.out.println("Girilen sayıların çarpımı: " + (1L*sayi1*sayi2));
		}
		else if (islem==4) {
			System.out.println("Girilen sayıların oranı: " + (1D*sayi1/sayi2));
		}
		else
			System.err.println("HATA! 1- toplama , 2-çıkarma, 3-çarpma, 4-bölme dışında sayı girdiniz!");
	}

}
