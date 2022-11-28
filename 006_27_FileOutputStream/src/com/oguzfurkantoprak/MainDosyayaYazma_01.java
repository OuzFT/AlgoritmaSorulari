package com.oguzfurkantoprak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_01 {

	public static void main(String[] args) {
		
		// IO Stream bir dosyadan okumak veya yazmak için kullanılır.
		// Java yazılımlarına bytelar (0 ve 1) olarak aktığı yapılardır.
		// I/O Stream verilerin bir input ve output yoluyla (genelde dış bir kaynaktan) 
		// InputStream:
		// Bu stream sınıfı veri okumak için 2 metod kullanır: Read() , Close()
		// Read() verileri byte olarak okur(binary), okunacak veri yoksa -1 döner.
		// Mesela Scanner sc = new Scanner(System.in);  buradaki system.in: Standart input Stream => klavye 
		// Byte akışı için(Stream) InputStream abstract sınıfından türeyen bir alt sınıf kullanılır
		//
		// OutputStream:
		// System.out : Standart Output Stream (Direk Konsola yazar)
		// Byte akışı için(Stream) OutputStream abstract sınıfından türeyen bir alt sınıf kullanılır
		// Bu stream sınıfı veri yazabilmek için 3 metod kullanır: write(), flush(), close()
		// write() ile byte'lar halinde yazarız. Close ile OutputStream'i kapatırız.
		// Stream API ile alakası yok Stream API Java 8 ile geldi
		
		// InputStream (abstract class) => FileInputStream türer..
		// OutputStream (abstract class) => FileOutputStream türer..
		FileOutputStream fileOutputStream = null; // nesne referansını oluşturduk
		
		// DOSYA AÇMAK İÇİN:
		// 1. Yol: 
		// Açacağım dosyayı bir File nesnesi olarak oluşturabiliriz.
		
//		File file = new File("dosya.txt");
//		fileOutputStream = new FileOutputStream(file);
		
		try {
//			fileOutputStream = new FileOutputStream("dosya.txt"); // checked exception olduğu için hata verir sol tarafta, try catch bloğu içine yamalıyız.
			// bu şekilde dosya  varsa içeriğini siler ve yeniden yazar
			fileOutputStream = new FileOutputStream("C:\\test\\dosya.txt");
			
			fileOutputStream.write(74); // J harfini yazar
			fileOutputStream.write(65); // A
			fileOutputStream.write(86); // V
			fileOutputStream.write(65); // A
			fileOutputStream.write(10); // new line
			fileOutputStream.write(74); // J harfini yazar
			fileOutputStream.write(65); // A
			fileOutputStream.write(86); // V
			fileOutputStream.write(65); // A
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya/dizin bulunamadı");
		} catch (IOException e) {
			System.out.println("Dosya yazma hatası");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oldu");
		}
		finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılması sırasında exception aldık!");
				}
			}
		}
		
		
		System.out.println("program devam ediyor..");
		

	}

}
