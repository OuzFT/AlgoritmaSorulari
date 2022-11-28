package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOgrenci {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		//   abstract class: soyut sınıf(new yapılamaz)     /    concrete class: somut class(new yapılabilir)
		list.add("Opel");
		list.add("Audi");
		list.add("VW");
		list.add("Renault");
		System.out.println(list);
		
		//Collections sınıfı:
		//
		//Collections sınıfı bir UTILITY sınıfıdır(yardımcı metodlar içeren sınıf)
		//(Yani collection framework kullanırken bize yardımcı olabilecek metodları barındırır.)
		Collections.sort(list);  //Baş harfe göre sıralar
		System.out.println(list);
		
		//Şimdi kendi sınıfımızdan nesneleri kullanarak listeyi dolduralım ve sıralamaya çalışalım:
		//Ogrenci sınıfından liste oluşturalım
		List<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
		Ogrenci ogrenci1 = new Ogrenci("Ali", 1234);
		ogrenciler.add(ogrenci1);
		ogrenciler.add(new Ogrenci("Ayşe",1345));
		ogrenciler.add(new Ogrenci("Metehan",900));
		ogrenciler.add(new Ogrenci("İrfan",1870));
		
		System.out.println(ogrenciler); //toString ile listeyi ekleme sırasına göre yazdırır.
		Collections.sort(ogrenciler); // Hata verir sebebi bu sınıfın Comparable olmaması.
		//sıralayabilmek için compareTo sınıfını implement eden bir sınıfa ihtiyaç var.
		System.out.println("*********");
		System.out.println(ogrenciler); // sort ettiğimiz için sıralı yazdırır.
		
		//Şimdi de nesnelerimizi compare edelim..
		Ogrenci ogr1 = new Ogrenci("Ahmet", 1789);
		Ogrenci ogr2 = new Ogrenci("Veli", 1900);
		System.out.println(ogr1.compareTo(ogr2)); // idleri kıyaslar, küçük olduğu için -1 döner
		
		
		
	}

}
