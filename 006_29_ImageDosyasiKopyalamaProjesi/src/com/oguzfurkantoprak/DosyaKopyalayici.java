package com.oguzfurkantoprak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DosyaKopyalayici {
	
	
	public static ArrayList<Integer> dosyaIcerigiByteList = new ArrayList<Integer>();
	
	
	public static void dosyaOku(String dosyaAdi) {
		// FileInputStream binary olarak dosyaları okur ve yazar!
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream(dosyaAdi);
			
			int okunan;
			while ((okunan = fileInputStream.read()) != -1) // sonuna kadar read ettiğimizi okunan'a atıyoruz 
			{ 
				dosyaIcerigiByteList.add(okunan); // okunana attığımız byte değerlerini integer olarak ArrayListimize ekliyoruz.
			}
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya okuma sırasında hata oluştu!");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
		} finally {
			if (fileInputStream != null)
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}
	}
	
	
	
	private static void kopyala(String dosyaIsmi) {
		
		FileOutputStream fileOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream(dosyaIsmi);
			
			for (int deger : dosyaIcerigiByteList) {
				fileOutputStream.write(deger);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı!");
		} catch (IOException e) {
			System.out.println("Dosya yazarken hata oluştu!");
		} catch (Exception e) {
			System.out.println("Bilinmeyen bir hata oluştu!");
		} finally {
			if (fileOutputStream != null)
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println("Dosya kapatılırken hata oluştu!");
				}
		}
		
	}
	

	
	public static void main(String[] args) {
		
		DosyaKopyalayici.dosyaOku("C:\\test\\r2d2.jpg");
		DosyaKopyalayici.kopyala("C:\\test\\r2d2_kopya1.jpg");
		DosyaKopyalayici.kopyala("C:\\test\\r2d2_kopya2.jpg");
		DosyaKopyalayici.kopyala("C:\\test\\r2d2_kopya3.jpg");
		
	}




	

}
