package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	
	public static void printArrayList(List<Kisi> list) { //Dikkat: List interface'ini kullan böylece linked veya array list kullanabiliriz.
		System.out.println("****-----****");
		for (Kisi k : list) {
			System.out.println("Ad: " + k.getAd()+" Soyad: " + k.getSoyad());
		}
	}
	//aşağıdaki parametre olan List'e ArrayList de gönderebilirim LinkedList de. BKZ: Polymorphism, interface üzerinden
	public static void printArrayList(List<String> list, int x) { // Yukaridaki ile aynı parametreleri alınca metod overload edemiyoruz
		System.out.println("****-----****");					  // O yüzden int x ekledik.
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	//Interface'ler tasarım detaylarını kullanıcıdan soyutlar.
	public static List<String> listeOlustur() {
//		List<String> lst = new ArrayList<String>(); // ArrayList ile implement edebiliriz.
//		lst.add("Ali");
//		lst.add("Veli");
		
		List<String> lst = new LinkedList<String>(); // LinkedList ile de implement edebiliriz.
		lst.add("Ali");
		lst.add("Veli");
		
		return lst; //String tipleri içeren List döner
	}
	
	//ArrayList de yapabilirdik;
//	public static ArrayList<String> listeOlustur() {
//		ArrayList<String> lst = new ArrayList<String>();
//		lst.add("Ali");
//		lst.add("Veli");
//		return lst;
//	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars);
		
		System.out.println("\n\n********");
		for (String car : cars) {
			System.out.println(car);		
		}
		
		System.out.println("\n\n********");
		for (int i = 0; i < cars.size(); i++) { // DİKKAT
			System.out.println(cars.get(i)); // DİKKAT
		}
		
		//--------------------------------
		
		ArrayList<Integer> arrList = new ArrayList<Integer>(); // int kullanamayız. 
		//ArrayListlerde primitive veri tipi tutamayız, nesneler tutabiliriz. Integer burada wrapper sınıf! int ise ilkel tip
		arrList.add(3);
		arrList.add(7);
		System.out.println(arrList);
		
		// ------------ ArrayListler içinde kendi oluşturduğumuz nesnelerimizin kullanımı: ---------
		
		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Mac");
		k2.setSoyad("Donavan");
		Kisi k3 = new Kisi("Robert", "Bruce");
		//list adında bir ArrayList oluşturalım;
		ArrayList<Kisi> list = new ArrayList<Kisi>();
		list.add(k1);
		list.add(k2);
		list.add(k3);		
		Main.printArrayList(list);
				
		//Remove 1. yöntem:
		list.remove(k2);
		//System.out.println(list); objelerde böyle yazdıramayız diğerlerini(String Integer vs..) böyle yazdırabiliriz.				
		Main.printArrayList(list);
				
		//Remove 2. yöntem:
		list.remove(1);
		Main.printArrayList(list);
		
		//Farklı bir tanımlama şekli:
		List<Kisi> list2 = new ArrayList<Kisi>();
		//List interfaceini implement eden ArrayList sınıfından new'leyebilirim , üretebilirim
		// interfaceler new'lenemez interfaceleri implement eden classlar new'lenebilir.
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);
		
		
		//ArrayList Araya eleman ekleme: ------------
		List<String> l = Main.listeOlustur();
		Main.printArrayList(l, 0);
		l.add(1, "Ayşe");
		Main.printArrayList(l, 0);
		
		//ArrayList'lerde indexleme mekanizması olduğu için çok hızlı biçimde istenen elemanı getirir.
		//Ancak aralara eleman ekleme veya çıkartma zordur zaman alır. Tek tek elemanların yerini shift eder.
		//ArrayList allow fast random read access, so you can grab any element in constant time.
		//But adding or removing from anywere but the end requires shifting all the latter elements over
		//either to make an opening or fill the gap.
		
		//LINKED LIST
		// Önceki ve sonraki indexi tutar bu yüzden aralara ekleme çıkarma yapmak çok kolaydır.
		// Ancak belirli indexteki elemana erişim hızı ArrayListe göre yavaştır!
		System.out.println("\n\n********");
		List<String> linkedList = new LinkedList<String>();
		//ArrayList de LinkedList de "List" interface'ini implement eder.
		linkedList.add("John");
		linkedList.add("Smith");
		
//		for (String s : linkedList) {
//			System.out.println(s);
//		}
		Main.printArrayList(linkedList, 0);
		
		System.out.println(linkedList.get(0));
		
		linkedList.add(1,"Robbert");
		Main.printArrayList(linkedList, 0);
		
		//--------------
		List<String> listeClient = Main.listeOlustur();
		System.out.println(listeClient);
		
	}

}
