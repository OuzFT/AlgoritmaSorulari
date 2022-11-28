package com.oguzfurkantoprak;

import java.util.Scanner;

import com.oguzfurkantoprak.controller.OgrenciController;
import com.oguzfurkantoprak.controller.OgretmenController;

public class Main {

	public static void main(String[] args) {
		OgrenciController ogrenciController = new OgrenciController();
		OgretmenController ogretmenController = new OgretmenController();

//		ogrenciController.ogrenciEkleme();
//		ogrenciController.ogrenciEkleme();
//		ogrenciController.ogrenciListesiniGoster();
//		
//		ogrenciController.ogrenciBul();
//		
//		ogrenciController.ogrenciSil();
//		
//		ogrenciController.ogrenciListesiniGoster();

		int secim = 0;
		do {
			System.out.println("\n******** OKUL BİLGİ SİSTEMİ ********");
			System.out.println("1. Öğrenci ekleme.");
			System.out.println("2. Öğrenci silme.");
			System.out.println("3. Öğrenci bilgileri güncelleme.");
			System.out.println("4. Öğrenci arama.");
			System.out.println("5. Öğrenci listesi görüntüleme.");

			System.out.println("6. Öğretmen ekleme.");
			System.out.println("7. Öğretmen silme.");
			System.out.println("8. Öğretmen bilgileri güncelleme.");
			System.out.println("9. Öğretmen listesi görüntüleme.");
			System.out.println("10. Öğretmen listesi görüntüleme.");

			System.out.println("11. ÇIKIŞ");

			Scanner scanner = new Scanner(System.in);
			secim = scanner.nextInt();

			switch (secim) {
			case 1: {
				ogrenciController.ogrenciEkleme();
				break;
			}

			case 2: {
				ogrenciController.ogrenciSil();
				break;
			}
			case 3: {
				ogrenciController.ogrenciGuncelle();
				break;
			}
			case 4: {
				ogrenciController.ogrenciBul();
				break;
			}
			case 5: {
				ogrenciController.ogrenciListesiniGoster();
				break;
			}
			case 6: {
				ogretmenController.ogretmenEkleme();
				break;
			}

			case 7: {
				ogretmenController.ogretmenSil();
				break;
			}
			case 8: {
				ogretmenController.ogretmenGuncelle();
				break;
			}
			case 9: {
				ogretmenController.ogretmenBul();
				break;
			}
			case 10: {
				ogretmenController.ogretmenListesiniGoster();
				break;
			}

			default:
				break;
			}

		} while (secim != 11);

		ogretmenController.ogretmenEkleme();
		ogretmenController.ogretmenEkleme();
		ogretmenController.ogretmenListesiniGoster();
		ogretmenController.ogretmenSil();
		ogretmenController.ogretmenListesiniGoster();

	}

}
