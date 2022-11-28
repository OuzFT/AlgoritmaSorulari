package com.oguzfurkantoprak;

// JJava anonymous inner class is  an inner class without name and for which only a single object is created.
//
// Anonymous inner class'lar ne zaman faydalıdırlar? 
// Bir sınıfın bir metodunu override edip tek bir nesne oluşturmak istediğimiz zaman kullanabiliriz.

public class Main {

	public static void main(String[] args) {
		
		// Anonymous Inner Class:
		Insan vejeteryanInsan = new Insan() 
		{
			public void yemekYe() {
				System.out.println("Sadece sebze ye");
			};
		};
		
		vejeteryanInsan.yemekYe();
		Insan insan = new Insan();
		insan.yemekYe();
		

	}

}
