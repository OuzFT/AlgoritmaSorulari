package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		/*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        1. Ay Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
      */
		
		Scanner input = new Scanner(System.in);
		System.out.println("yılın kaçıncı ayında doğdunuz?");		
		int ay = input.nextInt();
		System.out.println("ayın kaçıncı günü doğdunuz?");		
		int gun = input.nextInt();
		
		switch (ay) {
		case 1:
			if(gun<=21)
				System.out.println("oğlak");
			else if(gun>21 && gun<31)
				System.out.println("kova");
			else
				System.out.println("1-31 arası bir gün değeri girin");
			break;

		default:
			System.out.println("1-12 arası ay değeri girin");
			break;
		}

	}

}
