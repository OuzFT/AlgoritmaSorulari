package com.oguzfurkantoprak;

public class Anahtar {

	//özellik / üye değişken
	public static final int uzunluk = 10;
	//static üye değişkenler sınıfa aittir, final olduğu zaman da değiştirilemez
	public String renk;//static olmayan üye değişken
	public String ad; // String de bir public final class/ ilkel veri tipi değil / ilkel veri tipleri nesne değil
	public int no;
	
	
	//(üye) metod
	public void bilgileriEkranaYaz() { // static yazsaydık o sınıfa ait bir metod olurdu. Bu static değil
		//static olmayan üye metodları o classtan türeyen nesneler kullanabiilir.
		System.out.println("No: " + no + " Ad: " + ad + " Renk: " + renk);
	}
	//Bu üye değişken için metod çalıştırmak istersek çalıştırmak istediğimiz metodu, üye değişkeni atadığımız classta yazmalıyız.
	
	
	public static void uzunluguEkranaYaz() { 
		//System.out.println(renk); // bu metod sınıfa özggüdür static olduğu için. o yüzden static olmayan üye değişken kullanılamaz(renk)
		// renk nesneye yönelik bir özellik, classa özgü yazılamaz!! 
		// Static metodlar ve üye değişkenler nesneye yöneliktir. Staticler sınıfa özgüdür.
		System.out.println(uzunluk); // uzunluk static bir üye değişken olduğu için classa özgü kullanılabilir. 
		//Çünkü o classtan(anahtar kalıbı örneği) türetilen tüm nesneler için ortaktır statik üye değişkenler
	}
	
	
}
