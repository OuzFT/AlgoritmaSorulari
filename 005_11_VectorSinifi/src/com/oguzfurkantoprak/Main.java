package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		//Multi-threading applicationlarda ArrayListler safe kabul edilmez.
		//Multi-threading uygulamalarda ArrayList yerine Vector sınıfı tercih edilmelidir.
		// Vectorlerin dezavantajı ise ArrayList'e göre daha yavaş çalışırlar.
		
		Vector<String> vector = new Vector<String>();
		vector.add("Kedi");
		vector.add("Köpek");
		vector.add("Aslan");
		vector.add("Kuş");
		
		for (String s : vector) {
			System.out.println(s);
		}
		
		System.out.println(vector.get(1));
		
		//Iterator kullanımı: ( çok kullanılmıyor ama bil)
		System.out.println();
		ListIterator<String> iterator = vector.listIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
