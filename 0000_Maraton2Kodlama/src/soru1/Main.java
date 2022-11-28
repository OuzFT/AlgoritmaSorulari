package soru1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		
		Map<String, Kisi> kisiMap = readFromFile("rehber.txt");

		Scanner scanner= new Scanner(System.in);
		System.out.println("ad soyad giriniz:");
		String adSoyad = scanner.nextLine();
		if(kisiMap.containsKey(adSoyad)) {
			System.out.println(kisiMap.get(adSoyad));
		}
		else {
			System.out.println("Kişi bulunmamaktadır.");
		}
			
		
//		System.out.println("---------");
//		for (Map.Entry<String, Kisi> entry : kisiMap.entrySet()){
//			System.out.println("Anahtar: "+ entry.getKey()+ " Değer: " + entry.getValue());
//		}

	}
	
	public static Map<String, Kisi> readFromFile(String txt) {
		
		Map<String, Kisi> kisiMap = new HashMap<String, Kisi>();
		
		try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(txt)))) {

			// scanner.hasNextLine => okunacak satır kaldıysa true olur aksi halde false olur
			// Bunu bir while döngüsü içinde kullanarak tüm satırları okuyabiliriz.
			while (scanner.hasNextLine()) {
				String okunanSatir = scanner.nextLine();

				String[] arr = okunanSatir.split(";"); 
				Kisi kisi = new Kisi(arr[0], arr[1], arr[2]);
				kisiMap.put(kisi.getAdSoyad(), kisi);

			}

		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadı");
		}

		return kisiMap;
	}


}
