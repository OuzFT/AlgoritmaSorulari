package com.oguzfurkantoprak;

import java.util.HashMap;

public class Soru1 {

	// ÇOK ÖNEMLİ / SINAVLARDA SORULUR
	// Static bir metod yazın.
	// Bir string içindeki karakterlerin sayısını bulan ve ekrana yadıran bir metod yazın.
	// Ayrı bir metod yazıp en çok tekrar eden harfi bulun.
	
	public static void harfSayisiniBul(String metin) {
		//İpucu   ->    Key: karakter   -    Value: karakterin tekrar sayısı(count)
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < metin.length(); i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))
			{
				hashMap.replace(ch, hashMap.get(ch)+1); // put ile de yapılır üzerine yazar: hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
				
		}
		System.out.println(hashMap);
		
	}
	//UZUN ÇÖZÜM:
	public static void enCokTekrarEdenKarakteriBul(String metin) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < metin.length(); i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))
			{
				hashMap.replace(ch, hashMap.get(ch)+1); // put ile de yapılır üzerine yazar: hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
				
		}
		int max = Integer.MIN_VALUE;
		char k = '.';
		for(Character ch : hashMap.keySet()) {
			if(hashMap.get(ch)>max) {
				max = hashMap.get(ch);
				k = ch;
			}
		}
		System.out.println(String.valueOf(k)+ " " + max);
	}
	
	public static void main(String[] args) {
		
		String metin = "Herkese merhaba iyi çalışmalar";
		Soru1.harfSayisiniBul(metin);
		Soru1.enCokTekrarEdenKarakteriBul(metin);
	}

}
