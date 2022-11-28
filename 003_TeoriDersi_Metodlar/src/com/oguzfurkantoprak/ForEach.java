package com.oguzfurkantoprak;

public class ForEach {

	public static int w;
	
	public static void main(String[] args) {
		
		//ORNEK1:
		int[] dizi = {1, 24, 123, 23, 556, 111, 234, 63};
		
		// köşeli parantez kullanmadan dizi içinde iteration yapmamızı sağlar.
		for (int sayi : dizi) {
			System.out.println(sayi);
		}
		
		//ORNEK2:
		
		String[] isimlerDizi = {"ali","veli","osman","ayşe"};
		for(String isim : isimlerDizi) {
			System.out.println(isim);
		}
		//Scope konusu:
		//yukarıdaki örnekte isim değişkeni sadece for döngüsü içinde tanımlıdır.
		
		//Ornek scope:
		int x=5;
		if(x>3) {
			String ifade ="sayı üçten büyük";
			System.out.println(ifade);
		}
		//System.out.println(ifade); ifade scope dışıdır!
		
		
		//Başka bir konu:
		//int z; //z  initialized edilmemiş, böyle yazılırsa ata verir.
		int z= 0; //initialized edildi!(ilk değer atandı)
		int y = z * 2;
		
		//static üye değişkenlerini java kendisi program çalıştığında initialize eder
		//yani ilk değeri kendisi atar. TEKRAR ET BURAYI!!!
		
		z=ForEach.w * 2;
		System.out.println(z);
	}

}
