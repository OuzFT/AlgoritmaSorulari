package lesson009hafta3;

import java.util.Scanner;

public class Question64 {

	//double kullan böyle küçük projelerde double float farketmez ama double ile saçma sapan bir şey girerse o riski kaldırmış olursun.
	
		private static void puanHesapla(double vizeNotu , double finalNotu) {
			double puan = (double) (vizeNotu*0.4 + finalNotu*0.6);
			if (puan>=60) {
				System.out.println("Geçti");
			}
			else if (puan>=50) {
				System.out.println("Şartlı geçti");
			}else
				System.out.println("Kaldı");
			
		}	
		
		
		public static void main(String[] args) {

			//Bir öğrencinin vize ve final notlarını girdiği ve ortalamsasının hesaplandığı program
			//Vize notunun %40 final %60
			//puanHesapla --> parametre vize ve final notlarını alacak
			//öğrencinin not ortalaması 60 ın üzerindeyse geçti, 50-60 arasındaysa şartlı geçti, 50 düşükse dersten kaldı
	        //mesaj oalrak bunlar konsolda gösterilecek
			

			Scanner scanner = new Scanner(System.in);
			System.out.println("Vize notunu giriniz: ");
			double vizeNotu = scanner.nextInt();
			System.out.println("Final notunu giriniz: ");
			double finalNotu = scanner.nextInt();

			puanHesapla(vizeNotu, finalNotu);
			
		}

	}