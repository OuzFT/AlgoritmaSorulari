package com.oguzfurkantoprak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class MainDosyadanOkuma {

	public static void dosyadanTekbirByteOkuma() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya.txt");

			char c = (char) fileInputStream.read(); // 1 byte'ı int olarak okur. Bunu char'a cast ederek çeviririz.
			System.out.println(c);
			char c2 = (char) fileInputStream.read();
			System.out.println(c2);
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			System.out.println((char) fileInputStream.read());
			int okunan = fileInputStream.read(); // dosyanın sonuna ulaşıldığında read() -1 döner!
			System.out.println(okunan);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}

	}

	public static void dosyaninOrtasindanByteOkuma() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("dosya3.txt");

			fileInputStream.skip(8);
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());
			System.out.print((char) fileInputStream.read());

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}
	}

	public static void dosyaninTumunuOkuma() {

		FileInputStream fileInputStream = null;

		int okunan;
		String s = "";

		try {

			fileInputStream = new FileInputStream("dosya4.txt");

			while ((okunan = fileInputStream.read()) != -1) { // Dikkat!! atama ve kontrol bir arada. read bize int
																// değer verir.
				s = s + (char) okunan; // okunan int değerini ASCI'den char'a çeviriyoruz (char) ile. DİKKAT!!!!
			}

			System.out.println(s);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma hatası!");
		}
	}

	// 1.ÇÖZÜM
	private static void dosyaninBelirtilenKisminiOku(int n, int m) {
		FileInputStream fileInputStream = null;
		try {
			int okunan = 0;
			String metin = "";
			fileInputStream = new FileInputStream("dosya5.txt");
			fileInputStream.skip(n);
			for (int i = n; i < m + n; i++) {
				okunan = fileInputStream.read();
				metin = metin + (char) okunan;

			}
			System.out.println(metin);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}

	}

	// 2.ÇÖZÜM
	private static void dosyaninBelirtilenKisminiOku2(int n, int m) {
		FileInputStream fileInputStream = null;

		int okunan;
		String s = "";

		try {

			fileInputStream = new FileInputStream("dosya5.txt");
			fileInputStream.skip(n);
			int sayac = 0;
			while ((okunan = fileInputStream.read()) != -1) 
			{ 
				s = s + (char) okunan; 
				sayac++;
				
				if (sayac == m)
					break;
			}

			System.out.println(s);

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		}finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}

	}

	public static void main(String[] args) {

//		MainDosyadanOkuma.dosyadanTekbirByteOkuma();
//		MainDosyadanOkuma.dosyaninOrtasindanByteOkuma();
//		MainDosyadanOkuma.dosyaninTumunuOkuma();

		// Soru:
		// Bir metod yazınız. Bir dosyanın n. karakterinden başlayıp, m tane karakter
		// okusun ve ekrana yazsın
//		MainDosyadanOkuma.dosyaninBelirtilenKisminiOku(7, 8);
		MainDosyadanOkuma.dosyaninBelirtilenKisminiOku2(7, 8);
		System.out.println("\n\nHoşçakalın");
	}

}