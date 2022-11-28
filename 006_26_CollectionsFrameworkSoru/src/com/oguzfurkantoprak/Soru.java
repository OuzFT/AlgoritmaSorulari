package com.oguzfurkantoprak;

import java.util.HashSet;
import java.util.Set;

public class Soru {

	//1.ÇÖZÜM:
	private static void tekrarEdenKarakteriBul(String s) {
		
		Set<Character> hashSet = new HashSet<Character>();
	
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(hashSet.contains(c)) {
				System.out.println("Tekrar eden karakter: " + c);
				return;
			} else {
				hashSet.add(c);
			}
		}
		System.out.println("Tekrar eden karakter bulunammadı.");
	}
	
	
	public static void main(String[] args) {
		
		// ("ABADDETUJDFAGG") ilk tekrar eden karakteri bulun.
		// Koşullar:
		// Tek for dngüsü kullanabilirsin.
		// Collections framework'ünden yararlan.
//		tekrarEdenKarakteriBul("ABBCDEFDGF"); => B 
//		tekrarEdenKarakteriBul("ABCCAEAFDGF"); => C
		//HashSet aynı elemanları barındıramaz!!!
		
		String str = ("ABBCDEFDGF");
		tekrarEdenKarakteriBul(str);
		
		//2.ÇÖZÜM:
//		HashSet<Character> chars = new HashSet<>();
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (chars.add(str.charAt(i))) {
//			}
//			else {
//				System.out.println(str.charAt(i));
//				break;
//			}
//		}
		
		

	}

}
