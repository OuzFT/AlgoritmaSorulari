package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		ogrenciler.add(new Ogrenci("Ali", 100));
		ogrenciler.add(new Ogrenci("Veli", 101));
		ogrenciler.add(new Ogrenci("Ayşe", 102));
		ogrenciler.add(new Ogrenci("Furkan", 103));
		ogrenciler.add(new Ogrenci("Oğuz", 104));
		
		
		
		// Stream : Akış
		// ogrenciler ArrayList'i üzerinden işlem yapmamızı sağlar. Bir nevi akış oluşturur.
		
		// aşağıdaki for each kullanımıyla ogrenciler arraylisti toString metodu ile yazdırılır...
//		for (Ogrenci ogr : ogrenciler) {
//			System.out.println(ogr);
//		}
		
		// Bir de StreamAPI'sinde foreach metodu var bunları karıştırma!!!
//		 ogrenciler.stream(); // yazdığımızda kaynağı ArrayList collection'ından ogrenciler listesi olan bir akış oluşturur!!
		// Aşağıdaki kullanım lambda functions kullanımıdır.
		// okun "->" solundaki ogrenci parametre
		// okun "->" sağındaki ise o parametrenin çalışacağı metoddur
		// ArrayListin akışı içindeki her bir ogrenci parametresini sağdaki metodda kullanır. Ogrenci diye bir tip yazmaya gerek yok bu kullanımda
		ogrenciler.stream().forEach( ogrenci -> System.out.println(ogrenci));
		ogrenciler.stream().forEach( x -> System.out.println(x));
		
		// Bu kullanım ile metod yazarak ArrayList'teki tüm nesneleri metodda tek tek sırayla kullanırız.
		System.out.println("\n\n---------------------");
		ogrenciler.stream().forEach( ogrenci -> {
			System.out.println("Öğrenci bilgisi: ");
			System.out.println(ogrenci);
			System.out.println("--------");
		});	
		
		
		Ogrenci o = new Ogrenci("Ahmet", 105);
		o.printSinavNotu();
		
		// SINAV NOTLARI:
		ogrenciler.stream().forEach(ogrenci -> ogrenci.printSinavNotu());
		
		// bu kodun daha da kısa hali aşağıdaki gibidir. Aşağıdakinin adı " Method Reference" denir. .forEach( sınıf adı :: method adı)
		System.out.println("\n\n---------------------\n\n");
		ogrenciler.stream().forEach(Ogrenci :: printSinavNotu);
		// :: manası bu Ogrenci sınıfı içindeki printSinavNotu metodunu çağır demek .forEach( sınıf adı :: method adı)
		
		// stream api'de çok fazla metod var bunlar aşağıdaki linkte, en çok kullanılanları aşağıda...
		 	// https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
		// stream api'nin en çok kullanılan metodlarından biri 
		// filter() metodu...
		long id102DenBuyukCount = ogrenciler.stream().filter(ogr -> ogr.getId()>102).count(); // DİKKAT!!!!
		System.out.println("count : " + id102DenBuyukCount);
		
		// collect() metodu...
		// collect metodu ile filtre sonuçlarını liste haline çevirme:
		List<Ogrenci> filtrelenmisListe = ogrenciler.stream().filter(ogrenci -> ogrenci.getId()>102).collect(Collectors.toList());
		// .collect(Collectors.toList());  bunu ezberle!!!
		System.out.println("\n\n---------------------");
		System.out.println(filtrelenmisListe);
		
		
		// map'leme işlemi ile yeni nesneler oluşturma ( Stream API ile)
		// listedeki parametrelerde değişiklik yapılacaksa bu kullanılır!
		// aşağıda ad ve id alan constructor'ı method olarak kullanarak id'leri 100 ile çarpıp yeni nesneler oluşturduk ve collect ile bunları yeni bir listeye attık.
		List<Ogrenci> mappedList = ogrenciler.stream().map(ogr -> new Ogrenci( ogr.getAd(), ogr.getId()*100 ) ).collect(Collectors.toList());
		System.out.println(mappedList);
		
		// şimdi Map classından bir nesne oluşturalım. ( Öğrenci sınıfından istediğimiz değerleri alarak)
		// ArrayList içindeki nesnelerin istenen değerlerini(id ve ad) alıp yeni bir HashMap oluşturduk aşağıda...
		// Mesela ArrayList'ten en hızlı nasıl değer sorgusu yaparız ? ArrayList'i HashMap'e çevirerek...
		Map<Integer, String> ogrenciMap = ogrenciler.stream().collect(Collectors.toMap(ogr -> ogr.getId(), ogr -> ogr.getAd()));
		
		// Yukarıdaki Map içeriğini ekrana yazdıralım:
		System.out.println("\n\n---------------------");
		ogrenciMap.forEach((key,value) -> System.out.println(key + "  " + value)); // HashMap'leri bu şekilde de yazdırabiliriz!!!! 
		
		System.out.println(ogrenciMap.containsKey(100)); // true / hızlı sorgu yaparız HashMap'lerde
		String s = ogrenciMap.get(102);
		System.out.println(s);
		
	}

}
