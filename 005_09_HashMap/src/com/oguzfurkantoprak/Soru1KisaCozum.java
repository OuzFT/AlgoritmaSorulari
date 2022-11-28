package com.oguzfurkantoprak;

import java.util.HashMap;

public class Soru1KisaCozum {

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
	//KISA ÇÖZÜM:
	public static void enCokTekrarEdenKarakteriBul(String metin)
    {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        char c = 0;
        int max = 0;
        
        
        for(int i=0; i<metin.length();i++)
        {
            char ch = metin.charAt(i);
            
            if (hashMap.containsKey(ch))
            {
                int tekrarSayisi = hashMap.get(ch) + 1;   //  "Herkese merhaba iyi çalışmalar";
                if (tekrarSayisi > max)                    // H: 1   e: 2 r: 1 k :1  s: 1     max = 2   c = 'e'
                {
                    c = ch;
                    max = tekrarSayisi;
                }
                hashMap.replace(ch, tekrarSayisi);
            }
            else
            {
                hashMap.put(ch, 1);
            }
        }
                
        System.out.println("En çok tekrar eden karakter: " + c + " tekrar sayısı: " + max);
    }
	
	public static void main(String[] args) {
		
		String metin = "Herkese merhaba iyi çalışmalar";
		Soru1KisaCozum.harfSayisiniBul(metin);
		Soru1KisaCozum.enCokTekrarEdenKarakteriBul(metin);
	}

}
