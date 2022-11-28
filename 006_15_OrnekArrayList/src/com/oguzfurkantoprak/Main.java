package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Ogrenci> list1 = new ArrayList<Ogrenci>();
		list1.add(new Ogrenci("Ali","Kaya",100));
		list1.add(new Ogrenci("Veli","Kaya",101));
		list1.add(new Ogrenci("Ahmet","Kaya",102));
		//for içerisinde list1'i gezerken silme işlemi yaparsak hata alırız. Bunun için silinecekleri ayrı bir array olarak tutup döngüden sonra silmeliyiz.
		
		List<Ogrenci> silinecekList = new ArrayList<Ogrenci>();
		
		for (Ogrenci ogr : list1) {
			if(ogr.getId() >= 101) 
			{
				//list1.remove(ogr);  bu hataya sebep olur.
				silinecekList.add(ogr); //silinecekleri ayrı bir array'e atıyoruz..
			}
				
		}
		for (Ogrenci ogrenci : silinecekList) {
			list1.remove(ogrenci);
		}
		System.out.println("\n\nSon hali list1: \n");
		System.out.println(list1);
	}

}
