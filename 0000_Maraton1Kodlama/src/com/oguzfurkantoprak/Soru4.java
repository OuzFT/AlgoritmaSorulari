package com.oguzfurkantoprak;

import java.util.Scanner;

public class Soru4 {


	public static void main(String[] args) {
		
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("* * * * * * * * * * * * * * *  * ");
			System.out.println("*     Geometrik Hesaplayıcı    * ");
			System.out.println("* * * * * * * * * * * * * * *  * ");
			System.out.println("1. Kare alan hesaplama");
			System.out.println("2. Kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire Çevre hesaplama");
			System.out.println("7. Çıkış");
			
			Scanner input = new Scanner(System.in);
			int secim = input.nextInt();
	
			switch (secim) {
			
			case 1:
				System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
				int kenar1 = input.nextInt();
				int alan = kenar1*kenar1;
				System.out.println("Karenin alanı: " + alan);
				
				break;
				
			case 2:
				System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
				int kenar2 = input.nextInt();
				int cevre = kenar2*4;
				System.out.println("Karenin çevresi: " + cevre);
				break;	
				
			case 3:
				System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar = input.nextInt();
				System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
				int kisaKenar = input.nextInt();
				int alan2 = uzunKenar*kisaKenar;
				System.out.println("Dikdörtgenin alanı: " + alan2);
				break;	
				
			case 4:
				System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
				int uzunKenar2 = input.nextInt();
				System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
				int kisaKenar2 = input.nextInt();
				int cevre2 = (uzunKenar2+kisaKenar2)*2;
				System.out.println("Dikdörtgenin çevresi: " + cevre2);
				break;
				
			case 5:
				System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
				double yaricap = input.nextDouble();
				double alan3 = Math.PI * yaricap * yaricap;
				break;
			case 6:
				System.out.println("Dairenin yarıçap uzunluğunu giriniz: ");
				double yaricap2 = input.nextDouble();
				double cevre3 = Math.PI * 2 * yaricap2;
				break;
			case 7:
				System.out.println("Programdan çıkılıyor...");
				flag = false;
				break;
			default:
				System.out.println("1-7 arası değer girin");
				break;
			}
			
		}
		
	}

}
