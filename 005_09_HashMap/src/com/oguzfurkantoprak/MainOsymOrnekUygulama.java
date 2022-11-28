package com.oguzfurkantoprak;

import java.util.HashMap;

public class MainOsymOrnekUygulama {

	public static void main(String[] args) {
		//constructor ile OgrenciOsymSonuc tipinde nesneler oluşturalım:
		OgrenciOsymSonuc ogrenci1Sonuc = new OgrenciOsymSonuc("Ali","Özkan",88,46,67);
		OgrenciOsymSonuc ogrenci2Sonuc = new OgrenciOsymSonuc("Zeynep","Kara",58,46,67);
		OgrenciOsymSonuc ogrenci3Sonuc = new OgrenciOsymSonuc("Ayşe","Derin",28,36,47);
		OgrenciOsymSonuc ogrenci4Sonuc = new OgrenciOsymSonuc("Yalın","Yakar",68,46,77);
		
		//key: Integer(TC kimlik no)   ->   value: OgrenciOsymSonuc
		HashMap<Integer, OgrenciOsymSonuc> hashMap = new HashMap<Integer, OgrenciOsymSonuc>();
		hashMap.put(6657423, ogrenci1Sonuc);
		hashMap.put(1234455, ogrenci2Sonuc);
		hashMap.put(6634532, ogrenci3Sonuc);
		hashMap.put(1243342, ogrenci4Sonuc);
		
		//Sorgu yazıyoruz:
		//
		OgrenciOsymSonuc sonuc = hashMap.get(6657423);
		System.out.println(sonuc); // sonuc.toString() de yazılabilir aynı şey. toString oluşturduk OgrenciOsymSonuc sınıfında
		
		sonuc = hashMap.get(1234455);
		System.out.println(sonuc);
		
	}

}
