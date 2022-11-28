package com.oguzfurkantoprak;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// HashMap'ler key value pair'ler (anahtar-değer) çifti olarak tutulurlar.
		//Key --> Value
		//HashMap içindeki elemanları sıralı şekilde tutmaz!(ArrayList ve LinkedList aksine)
		//HashMap içindeki elemanları hashleyerek random sırada tutar.+
		//HashMap'lar List'lere göre random access(rastgele erişim). tıpkı HashSet'ler gibi hızlıdır.
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "Opel");
		hashMap.put(20, "Audi");
		hashMap.put(30, "VW");
		hashMap.put(40, "BMW");
		hashMap.put(50, "Renault");
		
		System.out.println(hashMap); 
		// Sıralaması olmaz, sıraya ihtiyacımız olmayan random access kullanılacak yerlerde HashMap kullanılır.
		
		//Aynı Key'e(anahtara) başka  değer eklerseniz üzerine yazarsınız.
		hashMap.put(40, "Fiat");
		System.out.println(hashMap); 
		System.out.println(hashMap.get(20)); 
		
		if (hashMap.containsKey(70))
			System.out.println("mevcut");
		else
			System.out.println("mevcut değil");
		
		//HASHMAP İÇERİĞİNİ BASTIRMAK:
		//------------------------------
		//1. Yol: //BU YOLU KULLAN!!
		for(Integer key : hashMap.keySet()) { // HashMapin anahtarları bir set içinde barınır. hashMap.keySet()
			System.out.println("Key: " + key + " Value: " + hashMap.get(key));
			//String s = hashMap.get(key);
			//if(s.equals("Opel"))......
				
		}
		//---------------
		//2. Yol: //BİL AMA EZBERLEME!!!?????????????????
		//HashMap'i Set'e dönüştürür ve loop ederiz.
		System.out.println("---------");
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
			System.out.println("Anahtar: "+ entry.getKey()+ " Değer: " + entry.getValue());
		}
		
		
		//Önemli birkaç metod:
		//
		//containsKey() metodu:
		if(hashMap.containsKey(30))
			System.out.println("anahtar mevcut");
		else
			System.out.println("anahtar mecut değil");
		//---------------
		//containsValue() metodu:
		if(hashMap.containsValue("Renault"))
			System.out.println("değer mevcut");
		else
			System.out.println("değer mecut değil");
		//---------------
		
		//hashMap.get(value) diye değere erişemeyiz bunun için mutlaka anahtar olmalı
		//key'den value'ya gidebiliriz. Value'dan Key'e gidemeyiz.
		//hashMap.get(20);
		
		
		
		
		
	}

}
