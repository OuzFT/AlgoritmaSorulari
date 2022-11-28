package com.oguzfurkantoprak;

public class EnumOrnek1 {

	
	enum Size {
		LOW,
		MEDIUM,
		HIGH
	}
	
	enum Mevsimler {
		ILKBAHAR,
		YAZ,
		SONBAHAR,
		KIS
	}
	
	
	//enum'lar bizi aşağıdaki şekilde static final değerleri tek tek yazmaktan kurtarır.
	//enum değerleri public static ve final'dır
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	
	public static void ekranaYaz(Mevsimler m) {
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		
		//Enum'lar değişmeyecek olan sabit değerlerdir
		//Enum'lardan nesne türetilemez.
		Size size = Size.HIGH;
		size = Size.MEDIUM;
		System.out.println(size);
		
		for (Size s : Size.values()) {
			System.out.println(s);
		}
		
		//enum'lar ne zaman kullanılır?
		//Değişmez değerleriniz varsa kullanabilirsiniz.
		//Mesela ilkbahar yaz kış vs mevsimlerde
		
		Size beden = size.MEDIUM;
		if (beden == Size.MEDIUM) {
			System.out.println("Orta - M beden");
		}
		
		EnumOrnek1.ekranaYaz(Mevsimler.SONBAHAR); // enum'ları parametre olarak da alabiliriz.
	}
	
	
}
