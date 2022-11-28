package com.oguzfurkantoprak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainDosyayaYazma_03 {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream = null; // nesne referansını oluşturduk
		
		// DOSYA AÇMAK İÇİN:
		// 1. Yol: 
		// Açacağım dosyayı bir File nesnesi olarak oluşturabiliriz.
		
//		File file = new File("dosya.txt");
//		fileOutputStream = new FileOutputStream(file);
		
		try {
			fileOutputStream = new FileOutputStream("dosya.txt"); // checked exception olduğu için hata verir sol tarafta, try catch bloğu içine yazmalıyız.
			// bu şekilde dosya  varsa içeriğini siler ve yeniden yazar
			
			// Dosyaya byte array yazdırma:
			byte[] array = {74, 65, 86, 65};
			fileOutputStream.write(array);
			
			
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
