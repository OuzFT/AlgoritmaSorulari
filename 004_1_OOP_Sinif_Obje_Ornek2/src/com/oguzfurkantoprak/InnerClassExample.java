package com.oguzfurkantoprak;


//Bir sınıfı private tanımlayabiliriz ancak bu private sınıf mutlaka bir inner sınıf veya nested sınıf olmak zorundadır.
//Bir private sınıfı ayrı bir top level sınıf olarak tanımlayamayız. Çünkü bu şekilde anlamsız olur meaningless olur.


//inner classları araştır tekrar et!!!!!

public class InnerClassExample {
	
	private class TestSinifi {
		
		public void test() {    // static metodun static olmayandan ana farkı staticler sınıfa özgüdür static olmayan nesneye özgüdür.
								// static ile nesne üretmeye gerek yoktur. Staticler nesne oluşturmadan kullanılabilir. (Anahtarların uzunluğu) 
								// Nonstaticlerde nesne oluşturmamız gerekir. (Anahtarın rengi)
			System.out.println("test");
		}
		
	}
	

	public static void main(String[] args) {
		
		InnerClassExample innerClassExample = new InnerClassExample();
		InnerClassExample.TestSinifi testSinifi = innerClassExample.new TestSinifi();
		testSinifi.test();
	}

}
