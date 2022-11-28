package com.oguzfurkantoprak;

public class Kutu {

	public int hacim;
	
	
	public void degistir(int sayi) {
		sayi = sayi * sayi;
	}
	
	
	public static void degistir(Kutu kutu123) { // kutu123 adı önemli değil
		kutu123.hacim = kutu123.hacim * kutu123.hacim;
	}
	
	
	
	public static void main(String[] args) {
		
		Kutu kutu1 = new Kutu();
		kutu1.hacim = 10;
		
		Kutu kutu2 = null; // null yazmamız lazım initilized ediyoruz.
		
		if(kutu1 == kutu2) 
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor.");
		else
			System.out.println("kutu1 ve kutu2 aynı nesneyi göstermiyor.");
			
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("***********************");
		
		kutu2 = kutu1;
		if(kutu1 == kutu2) 
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor.");
		else
			System.out.println("kutu1 ve kutu2 aynı nesneyi göstermiyor.");
			
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("***********************");
		
		kutu2 = new Kutu();
		kutu2.hacim = 10; // kutu 1 ve 2 aynı hacimde olsa da farklı nesnelerdir. Adresleri farklıdır.
		
		if(kutu1 == kutu2) 
			System.out.println("kutu1 ve kutu2 aynı nesneyi gösteriyor.");
		else
			System.out.println("kutu1 ve kutu2 aynı nesneyi göstermiyor.");
			
		System.out.println(kutu1);
		System.out.println(kutu2);
		System.out.println("***********************");
		
		Kutu kutu3;
		kutu3 = kutu2; // üst satırda null yazmadık ama kutu2yi atadığımız için bir nevi init etmiş olduk.
		if(kutu3 == kutu2) 
			System.out.println("kutu3 ve kutu2 aynı nesneyi gösteriyor.");
		else
			System.out.println("kutu3 ve kutu2 aynı nesneyi göstermiyor.");
			
		System.out.println(kutu3);
		System.out.println(kutu2);
		System.out.println("***********************");
		
		//SORU:
		
		kutu3.hacim = 500;
		System.out.println(kutu2.hacim); // kutu3 ile kutu2 heap'te aynı adreste olduğu için birini değiştirince diğeri de değişir. //500
		
		//HATIRLATMA:
		int x = 30;
		int y;
		y = x;
		y++;
		System.out.println(x); // x değişmedi= 30 => x ve y stack'te ayrı ayrı yer tutar ilkel veri tipi olduğu için
		// HEAP STACK nedir araştır farkını!!
		
		// aşağıdaki olayı anlamadım!!// SINAVDA SORULUR!! 8 kasım 03:00:00 tekrar dinle buraları!
		Kutu k = new Kutu();
		int s = 5;
		k.degistir(s);
		System.out.println(s);
		
		k.hacim = 100;
		Kutu.degistir(k);
		System.out.println(k.hacim);
		
	}

}
