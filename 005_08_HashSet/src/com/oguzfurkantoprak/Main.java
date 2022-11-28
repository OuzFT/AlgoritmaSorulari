package com.oguzfurkantoprak;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		//HashSet'ler Java'da elemanlara çok hızlı bir şekilde erişebilmek amacıyla kullanılan veri yapılarıdır(data structures).
		//Bunun nedeni setlerdeki elemanlara erişilirken hash kodlarının kullanılmasıdır.
		//Hashcode sayesinde herhangi bir input elemanı unique(benzersiz) olarak identify eder, tanımlar. 
		//HashFunction ile kod hesaplar.
		//HashSet aynı elemanları barındıramaz. Dezeavantajı budur.!!!!!!
		
		HashSet<String> hashSet = new HashSet<String>(); // yapısı ArrayList'e benzer.
		hashSet.add("Kuş");
		hashSet.add("Kedi");
		hashSet.add("Köpek");
		
		for (String s : hashSet) {
			System.out.println(s);
		}
		
		//Aşağıdaki ifadeyi içinde milyonlarca kayıt olan bir ArrayList'e yapmaya kalkarsanız 
		//HashSet'e göre çok uzun süre alır.
		//HashSet ile çok kısa sürede aradığınız değere ulaşırsınız!!!
		if(hashSet.contains("Kuş"))
			System.out.println("Kuş set içinde mevcut.");
		else
			System.out.println("Kuş set içinde yok.");
		
		//ArrayList ile benzerini yapalım------
		//Milyonlarca kayıt olsaydı aşağıdaki işlem yukarıdakine göre çok uzun zaman alırdı.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kuş");
		
		if(list.contains("Kuş"))
			System.out.println("Kuş set içinde mevcut.");
		else
			System.out.println("Kuş set içinde yok.");
		
		
		//hashSet2'nin hashSet'ten farkını bulalım!!!!!
		HashSet<String> hashSet2 = new HashSet<String>();
		hashSet2.add("Kaplan");
		hashSet2.add("Kedi");
		hashSet2.add("Aslan");
		
		//Fark bulma:
		//1.adım:
		HashSet<String> fark = new HashSet<String>(hashSet2); // hashSet2'yi kopyalar fark'a
		//2.adım:
		fark.removeAll(hashSet); // hashSet içindekileri çıkartmaya yarar .removeAll()
		System.out.println(fark);
		
		
		

	}

}
